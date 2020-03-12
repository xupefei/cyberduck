package ch.cyberduck.core.openstack;

/*
 * Copyright (c) 2002-2020 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.ConnectionCallback;
import ch.cyberduck.core.DefaultIOExceptionMappingService;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathAttributes;
import ch.cyberduck.core.PathContainerService;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Copy;
import ch.cyberduck.core.io.Checksum;
import ch.cyberduck.core.io.HashAlgorithm;
import ch.cyberduck.core.transfer.TransferStatus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ch.iterate.openstack.swift.model.StorageObject;

public class SwiftLargeObjectCopyFeature implements Copy {

    private final PathContainerService containerService
        = new PathContainerService();

    private final SwiftSession session;
    private final SwiftRegionService regionService;
    private final SwiftSegmentService segmentService;
    private final SwiftObjectListService listService;

    public SwiftLargeObjectCopyFeature(final SwiftSession session) {
        this(session, new SwiftRegionService(session));
    }

    public SwiftLargeObjectCopyFeature(final SwiftSession session, final SwiftRegionService regionService) {
        this(session, regionService, new SwiftSegmentService(session));
    }

    public SwiftLargeObjectCopyFeature(final SwiftSession session, final SwiftRegionService regionService,
                                       final SwiftSegmentService segmentService) {
        this(session, regionService, segmentService, new SwiftObjectListService(session, regionService));
    }

    public SwiftLargeObjectCopyFeature(final SwiftSession session, final SwiftRegionService regionService,
                                       final SwiftSegmentService segmentService, final SwiftObjectListService listService) {
        this.session = session;
        this.regionService = regionService;
        this.segmentService = segmentService;
        this.listService = listService;
    }

    @Override
    public Path copy(final Path source, final Path target, final TransferStatus status, final ConnectionCallback callback) throws BackgroundException {
        return copy(source, segmentService.list(source), target, status, callback);
    }

    @Override
    public boolean isRecursive(final Path source, final Path target) {
        return false;
    }

    @Override
    public boolean isSupported(final Path source, final Path target) {
        return !containerService.isContainer(source) && !containerService.isContainer(target);
    }

    public Path copy(final Path source, final List<Path> sourceParts, final Path target, final TransferStatus status,
                     final ConnectionCallback callback) throws BackgroundException {
        final List<Path> completed = new ArrayList<>();
        final Path copySegmentsDirectory = segmentService.getSegmentsDirectory(target, status.getLength());
        for(final Path copyPart : sourceParts) {
            final Path destination = new Path(copySegmentsDirectory, copyPart.getName(), copyPart.getType());
            try {
                session.getClient().copyObject(regionService.lookup(copyPart),
                    containerService.getContainer(copyPart).getName(), containerService.getKey(copyPart),
                    containerService.getContainer(target).getName(), containerService.getKey(destination));

                // copy attributes from source. Should be same?
                destination.setAttributes(copyPart.attributes());
                completed.add(destination);
            }
            catch(IOException e) {
                throw new DefaultIOExceptionMappingService().map(e);
            }
        }
        final List<StorageObject> manifestObjects = new ArrayList<>();
        for(final Path part : completed) {
            final StorageObject model = new StorageObject(containerService.getKey(part));
            model.setSize(part.attributes().getSize());
            model.setMd5sum(part.attributes().getChecksum().hash);
            manifestObjects.add(model);
        }
        final String manifest = segmentService.manifest(containerService.getContainer(target).getName(), manifestObjects);
        final StorageObject stored = new StorageObject(containerService.getKey(target));
        try {
            final String checksum = session.getClient().createSLOManifestObject(regionService.lookup(
                containerService.getContainer(target)),
                containerService.getContainer(target).getName(),
                status.getMime(),
                containerService.getKey(target), manifest, Collections.emptyMap());
            // The value of the Content-Length header is the total size of all segment objects, and the value of the ETag header is calculated by taking
            // the ETag value of each segment, concatenating them together, and then returning the MD5 checksum of the result.
            stored.setMd5sum(checksum);
        }
        catch(IOException e) {
            throw new DefaultIOExceptionMappingService().map(e);
        }
        final PathAttributes attributes = new PathAttributes(source.attributes());
        attributes.setChecksum(new Checksum(HashAlgorithm.md5, stored.getMd5sum()));
        return new Path(target.getParent(), target.getName(), target.getType(), attributes);
    }
}