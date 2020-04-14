package ch.cyberduck.core.googlestorage;

/*
 * Copyright (c) 2002-2019 iterate GmbH. All rights reserved.
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
import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathContainerService;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.features.Move;
import ch.cyberduck.core.transfer.TransferStatus;

import java.io.IOException;

import com.google.api.services.storage.model.RewriteResponse;

public class GoogleStorageMoveFeature implements Move {

    private final PathContainerService containerService
        = new GoogleStoragePathContainerService();

    private final GoogleStorageSession session;

    private Delete delete;

    public GoogleStorageMoveFeature(final GoogleStorageSession session) {
        this.session = session;
        this.delete = new GoogleStorageDeleteFeature(session);
    }

    @Override
    public Path move(final Path source, final Path target, final TransferStatus status, final Delete.Callback callback, final ConnectionCallback connectionCallback) throws BackgroundException {
        try {
            String token = null;
            RewriteResponse response;
            do {
                response = session.getClient().objects().rewrite(containerService.getContainer(source).getName(), containerService.getKey(source),
                    containerService.getContainer(target).getName(), containerService.getKey(target),
                    session.getClient().objects().get(
                        containerService.getContainer(source).getName(), containerService.getKey(source)).execute()).setRewriteToken(token).execute();
                token = response.getRewriteToken();
            }
            while(!response.getDone());
            return new Path(target.getParent(), target.getName(), target.getType(),
                new GoogleStorageAttributesFinderFeature(session).toAttributes(response.getResource()));
        }
        catch(IOException e) {
            throw new GoogleStorageExceptionMappingService().map("Cannot copy {0}", e, source);
        }
    }

    @Override
    public boolean isRecursive(final Path source, final Path target) {
        return false;
    }

    @Override
    public boolean isSupported(final Path source, final Path target) {
        return !containerService.isContainer(source);
    }

}
