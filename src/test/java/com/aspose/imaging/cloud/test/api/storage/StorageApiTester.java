/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageApiTester.java">
*   Copyright (c) 2019  Aspose Pty Ltd.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.imaging.cloud.test.api.storage;

import java.util.List;

import com.aspose.imaging.cloud.sdk.model.FileVersion;
import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.test.base.ApiTester;

/**
 * Storage API tester.
 */
public class StorageApiTester extends ApiTester {

    protected final static String OriginalDataFolder = ApiTester.OriginalDataFolder + "/Storage";

    protected final static String CloudTestFolderPrefix = "ImagingStorageCloudTestDotNet";
    
    protected StorageFile getFileWithName(List<StorageFile> files, String name) {
        StorageFile result = null;

        for (StorageFile file : files) {
            if (file.getName().equals(name)) {
                result = file;
                break;
            }
        }

        return result;
    }
    
    protected FileVersion getFileVersion(List<FileVersion> versions, Boolean recent) {
        FileVersion result = null;

        for (FileVersion version : versions) {
            if (version.isIsLatest() == recent) {
                result = version;
                break;
            }
        }

        return result;
    }
}
