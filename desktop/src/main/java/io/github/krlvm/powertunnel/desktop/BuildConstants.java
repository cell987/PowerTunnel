/*
 * This file is part of PowerTunnel.
 *
 * PowerTunnel is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PowerTunnel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PowerTunnel.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.krlvm.powertunnel.desktop;

public class BuildConstants {
    public static final String NAME = "PowerTunnel";
    public static final String DESCRIPTION = "Powerful and extensible proxy server";
    public static final String REPO = "https://github.com/krlvm/PowerTunnel/tree/next";
    public static final String VERSION = "2.0-rc2";
    public static final int VERSION_CODE = 96;

    public static boolean IS_RELEASE = io.github.krlvm.powertunnel.BuildConstants.isReleaseVersion(VERSION);
    public static final boolean DEBUG = !IS_RELEASE;
}
