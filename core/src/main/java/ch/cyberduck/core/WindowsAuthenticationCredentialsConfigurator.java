package ch.cyberduck.core;

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

import org.apache.commons.lang3.StringUtils;
import org.apache.http.impl.auth.win.CurrentWindowsCredentials;
import org.apache.http.impl.client.WinHttpClients;

public class WindowsAuthenticationCredentialsConfigurator implements CredentialsConfigurator {

    @Override
    public Credentials configure(final Host host) {
        if(WinHttpClients.isWinAuthAvailable()) {
            final Credentials credentials = new Credentials(host.getCredentials());
            final String current = CurrentWindowsCredentials.getCurrentUsername();
            if(StringUtils.isNotBlank(current)) {
                credentials.setUsername(current);
            }
            credentials.setPassword(StringUtils.EMPTY);
            return credentials;
        }
        return host.getCredentials();
    }

    @Override
    public void reload() {
        //
    }
}
