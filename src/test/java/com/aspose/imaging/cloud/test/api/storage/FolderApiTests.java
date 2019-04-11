/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FolderApiTests.java">
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

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.CopyFolderRequest;
import com.aspose.imaging.cloud.sdk.model.requests.CreateFolderRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteFolderRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetFilesListRequest;
import com.aspose.imaging.cloud.sdk.model.requests.MoveFolderRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ObjectExistsRequest;

/**
 * Specific folder API tests for Storage.
 */
public class FolderApiTests extends StorageApiTester {

    @Test
    public void createFolderTest() throws Exception {
        String folder = getTempFolder() + "/DummyFolder";
        try {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

            ImagingApi.createFolder(new CreateFolderRequest(folder, TestStorage));
            Assert.assertTrue(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
        } finally {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
        }
    }

    @Test
    public void copyFolderTest() throws Exception {
        String folder = getTempFolder() + "/Storage";
        try {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

            ImagingApi.copyFolder(new CopyFolderRequest(OriginalDataFolder, folder, TestStorage, TestStorage));
            Assert.assertTrue(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
            List<StorageFile> originalFiles = ImagingApi
                    .getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue();
            List<StorageFile> copiedFiles = ImagingApi.getFilesList(new GetFilesListRequest(folder, TestStorage))
                    .getValue();
            Assert.assertTrue(originalFiles.size() > 0);
            Assert.assertTrue(copiedFiles.size() > 0);
            Assert.assertEquals(originalFiles.size(), copiedFiles.size());
            int count = originalFiles.size();
            for (int x = 0; x < count; x++) {
                Assert.assertEquals(originalFiles.get(x).isIsFolder(), copiedFiles.get(x).isIsFolder());
                Assert.assertEquals(originalFiles.get(x).getName(), copiedFiles.get(x).getName());
                Assert.assertEquals(originalFiles.get(x).getSize(), copiedFiles.get(x).getSize());
            }
        } finally {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
        }
    }

    @Test
    public void moveFolderTest() throws Exception {
        String tmpFolder = getTempFolder() + "/Temp";
        String folder = getTempFolder() + "/Storage";
        try {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            if (ImagingApi.objectExists(new ObjectExistsRequest(tmpFolder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(tmpFolder, TestStorage, true));
            }

            Assert.assertFalse(
                    ImagingApi.objectExists(new ObjectExistsRequest(tmpFolder, TestStorage, null)).isExists());
            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

            ImagingApi.copyFolder(new CopyFolderRequest(OriginalDataFolder, tmpFolder, TestStorage, TestStorage));
            Assert.assertTrue(
                    ImagingApi.objectExists(new ObjectExistsRequest(tmpFolder, TestStorage, null)).isExists());

            ImagingApi.moveFolder(new MoveFolderRequest(tmpFolder, folder, TestStorage, TestStorage));
            Assert.assertFalse(
                    ImagingApi.objectExists(new ObjectExistsRequest(tmpFolder, TestStorage, null)).isExists());
            Assert.assertTrue(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

            List<StorageFile> originalFiles = ImagingApi
                    .getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue();
            List<StorageFile> copiedFiles = ImagingApi.getFilesList(new GetFilesListRequest(folder, TestStorage))
                    .getValue();
            Assert.assertTrue(originalFiles.size() > 0);
            Assert.assertTrue(copiedFiles.size() > 0);
            Assert.assertEquals(originalFiles.size(), copiedFiles.size());
            int count = originalFiles.size();
            for (int x = 0; x < count; x++) {
                Assert.assertEquals(originalFiles.get(x).isIsFolder(), copiedFiles.get(x).isIsFolder());
                Assert.assertEquals(originalFiles.get(x).getName(), copiedFiles.get(x).getName());
                Assert.assertEquals(originalFiles.get(x).getSize(), copiedFiles.get(x).getSize());
            }
        } finally {
            if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
                ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
            }

            Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
        }
    }

    @Test
    public void filesListTest() throws Exception {
        List<StorageFile> files = ImagingApi.getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage))
                .getValue();
        Assert.assertEquals(3, files.size());
        StorageFile folder1 = getFileWithName(files, "Folder1");
        Assert.assertNotNull(folder1);
        Assert.assertTrue(folder1.isIsFolder());
        Assert.assertTrue(StringUtils.strip(folder1.getPath(), "/").endsWith(folder1.getName()));
        StorageFile folder2 = getFileWithName(files, "Folder2");
        Assert.assertNotNull(folder2);
        Assert.assertTrue(folder2.isIsFolder());
        Assert.assertTrue(StringUtils.strip(folder2.getPath(), "/").endsWith(folder2.getName()));
        StorageFile storageFile = getFileWithName(files, "Storage.txt");
        Assert.assertNotNull(storageFile);
        Assert.assertFalse(storageFile.isIsFolder());
        Assert.assertTrue(StringUtils.strip(storageFile.getPath(), "/").endsWith(storageFile.getName()));
        Assert.assertEquals(storageFile.getSize(),
                new Long((long) (StringUtils.strip(storageFile.getPath(), "/").length())));

        files = ImagingApi
                .getFilesList(new GetFilesListRequest(OriginalDataFolder + "/" + folder1.getName(), TestStorage))
                .getValue();
        Assert.assertEquals(1, files.size());
        StorageFile folder1File = getFileWithName(files, "Folder1.txt");
        Assert.assertNotNull(folder1File);
        Assert.assertFalse(folder1File.isIsFolder());
        Assert.assertTrue(StringUtils.strip(folder1File.getPath(), "/").endsWith(folder1File.getName()));
        Assert.assertEquals(folder1File.getSize(),
                new Long((long) (StringUtils.strip(folder1File.getPath(), "/").length())));

        files = ImagingApi
                .getFilesList(new GetFilesListRequest(OriginalDataFolder + "/" + folder2.getName(), TestStorage))
                .getValue();
        Assert.assertEquals(2, files.size());
        StorageFile folder2File = getFileWithName(files, "Folder2.txt");
        Assert.assertNotNull(folder2File);
        Assert.assertFalse(folder2File.isIsFolder());
        Assert.assertTrue(StringUtils.strip(folder2File.getPath(), "/").endsWith(folder2File.getName()));
        Assert.assertEquals(folder2File.getSize(),
                new Long((long) (StringUtils.strip(folder1File.getPath(), "/").length())));
        StorageFile folder3 = getFileWithName(files, "Folder3");
        Assert.assertNotNull(folder3);
        Assert.assertTrue(folder3.isIsFolder());
        Assert.assertTrue(StringUtils.strip(folder3.getPath(), "/").endsWith(folder3.getName()));

        files = ImagingApi
                .getFilesList(new GetFilesListRequest(
                        OriginalDataFolder + "/" + folder2.getName() + "/" + folder3.getName(), TestStorage))
                .getValue();
        Assert.assertEquals(1, files.size());
        StorageFile folder3File = getFileWithName(files, "Folder3.txt");
        Assert.assertNotNull(folder3File);
        Assert.assertFalse(folder3File.isIsFolder());

        Assert.assertTrue(StringUtils.strip(folder3File.getPath(), "/").endsWith(folder3File.getName()));
        Assert.assertEquals(folder3File.getSize(),
                new Long((long) (StringUtils.strip(folder3File.getPath(), "/").length())));
    }

}