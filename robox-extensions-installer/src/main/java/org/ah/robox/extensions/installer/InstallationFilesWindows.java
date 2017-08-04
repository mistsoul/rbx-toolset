/*
 * This file is part of rbx-toolset.
 *
 * rbx-toolset is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * rbx-toolset is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with rbx-toolset.  If not, see <http://www.gnu.org/licenses/>.
 *
*/
package org.ah.robox.extensions.installer;

/**
*
* @author Daniel Sendula
*/
public enum InstallationFilesWindows implements InstallationFile {

    CuraEngine("Common/Cura/CuraEngine.exe", "windows%20scripts/CuraEngine.exe", false, false, true),
    CuraEngineCmd("Common/Cura/CuraEngine.cmd", "windows%20scripts/CuraEngine.cmd", false, false, true),
    Slic3rDir("Common/Slic3r", null, true, true, false),
    Slic3rConfigDir("Common/Slic3r/Config", null, true, true, false),
    Slic3rConfigFile("Common/Slic3r/Config/Robox_slic3r_config_bundle.ini", "slic3r/config/Robox_slic3r_config_bundle.ini", false, true, false),
    FlowJarFile("Common/robox-slicer-flow-1.0-SNAPSHOT.jar", "robox-slicer-flow-1.0-SNAPSHOT.jar", false, true, true);

    private String localPath;
    private String repoPath;
    private boolean isDir;
    private boolean delete;
    private boolean executable;

    InstallationFilesWindows(String localPath, String repoPath, boolean isDir, boolean delete, boolean executable) {
        this.localPath = localPath;
        this.repoPath = repoPath;
        this.isDir = isDir;
        this.delete = delete;
        this.executable = executable;
    }

    @Override
    public String getLocalPath() { return localPath; }

    @Override
    public String getRepoPath() { return repoPath; }

    @Override
    public boolean isDir() { return isDir; }

    @Override
    public boolean isDelete() { return delete; }

    @Override
    public boolean isExecutable() { return executable; }
}
