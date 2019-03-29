/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileApiTests.java">
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

import com.aspose.imaging.cloud.sdk.model.FileVersion;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.ObjectExist;
import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.CopyFileRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteFileRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteFolderRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DownloadFileRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetFileVersionsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetFilesListRequest;
import com.aspose.imaging.cloud.sdk.model.requests.MoveFileRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ObjectExistsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;

/**
 * Specific file API tests for Storage.
 */
public class FileApiTests extends StorageApiTester {
	@Test
	public void copyDownloadFileTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file = "Storage.txt";
		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file, folder + "/" + file, TestStorage,
					TestStorage, null));
			ObjectExist existResponse = ImagingApi
					.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null));
			Assert.assertNotNull(existResponse);
			Assert.assertFalse(existResponse.isIsFolder());
			Assert.assertTrue(existResponse.isExists());

			StorageFile originalFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue(), file);
			StorageFile copiedFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(folder, TestStorage)).getValue(), file);
			Assert.assertEquals(originalFileInfo.getSize(), copiedFileInfo.getSize());

			byte[] originalFile = ImagingApi
					.downloadFile(new DownloadFileRequest(OriginalDataFolder + "/" + file, TestStorage, null));
			byte[] copiedFile = ImagingApi
					.downloadFile(new DownloadFileRequest(folder + "/" + file, TestStorage, null));
			String originalString = new String(originalFile);
			String copiedString = new String(copiedFile);
			Assert.assertEquals(originalString, copiedString);
			Assert.assertEquals(originalString, StringUtils.strip(originalFileInfo.getPath(), "/"));
			Assert.assertEquals(originalString.replace(OriginalDataFolder, folder),
					StringUtils.strip(copiedFileInfo.getPath(), "/"));
		} finally {
			ImagingApi.deleteFile(new DeleteFileRequest(folder + "/" + file, TestStorage, null));
			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null))
					.isExists());

			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
		}
	}

	@Test
	public void moveFileTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file = "Storage.txt";
		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file, folder + "/" + file + ".copied",
					TestStorage, TestStorage, null));
			ObjectExist existResponse = ImagingApi
					.objectExists(new ObjectExistsRequest(folder + "/" + file + ".copied", TestStorage, null));
			Assert.assertNotNull(existResponse);
			Assert.assertFalse(existResponse.isIsFolder());
			Assert.assertTrue(existResponse.isExists());

			ImagingApi.moveFile(new MoveFileRequest(folder + "/" + file + ".copied", folder + "/" + file, TestStorage,
					TestStorage, null));
			Assert.assertFalse(
					ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file + ".copied", TestStorage, null))
							.isExists());
			existResponse = ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null));
			Assert.assertNotNull(existResponse);
			Assert.assertFalse(existResponse.isIsFolder());
			Assert.assertTrue(existResponse.isExists());

			StorageFile originalFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue(), file);
			StorageFile movedFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(folder, TestStorage)).getValue(), file);
			Assert.assertEquals(originalFileInfo.getSize(), movedFileInfo.getSize());

			byte[] originalFile = ImagingApi
					.downloadFile(new DownloadFileRequest(OriginalDataFolder + "/" + file, TestStorage, null));
			byte[] movedFile = ImagingApi.downloadFile(new DownloadFileRequest(folder + "/" + file, TestStorage, null));
			Assert.assertEquals(originalFile.length, movedFile.length);
			Assert.assertEquals(new Long((long) originalFile.length), originalFileInfo.getSize());
			String originalString = new String(originalFile);
			String movedString = new String(movedFile);
			Assert.assertEquals(originalString, movedString);
			Assert.assertEquals(originalString, StringUtils.strip(originalFileInfo.getPath(), "/"));
			Assert.assertEquals(originalString.replace(OriginalDataFolder, folder),
					StringUtils.strip(movedFileInfo.getPath(), "/"));
		} finally {
			ImagingApi.deleteFile(new DeleteFileRequest(folder + "/" + file, TestStorage, null));
			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null))
					.isExists());

			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
		}
	}

	@Test
	public void uploadFileTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file = "Storage.txt";
		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			byte[] originalFile = ImagingApi
					.downloadFile(new DownloadFileRequest(OriginalDataFolder + "/" + file, TestStorage, null));
			FilesUploadResult result = ImagingApi
					.uploadFile(new UploadFileRequest(folder + "/" + file, originalFile, TestStorage));
			Assert.assertNotNull(result);
			Assert.assertTrue(result.getErrors() == null || result.getErrors().size() == 0);
			Assert.assertNotNull(result.getUploaded());
			Assert.assertEquals(1, result.getUploaded().size());
			Assert.assertEquals(file, result.getUploaded().get(0));

			ObjectExist existResponse = ImagingApi
					.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null));
			Assert.assertNotNull(existResponse);
			Assert.assertFalse(existResponse.isIsFolder());
			Assert.assertTrue(existResponse.isExists());

			StorageFile originalFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue(), file);
			StorageFile uploadedFileInfo = getFileWithName(
					ImagingApi.getFilesList(new GetFilesListRequest(folder, TestStorage)).getValue(), file);
			Assert.assertEquals(originalFileInfo.getSize(), uploadedFileInfo.getSize());

			byte[] uploadedFile = ImagingApi
					.downloadFile(new DownloadFileRequest(folder + "/" + file, TestStorage, null));
			Assert.assertEquals(originalFile.length, uploadedFile.length);
			Assert.assertEquals(new Long((long) originalFile.length), originalFileInfo.getSize());
			String originalString = new String(originalFile);
			String uploadedString = new String(uploadedFile);
			Assert.assertEquals(originalString, uploadedString);
			Assert.assertEquals(originalString, StringUtils.strip(originalFileInfo.getPath(), "/"));
			Assert.assertEquals(originalString.replace(OriginalDataFolder, folder),
					StringUtils.strip(uploadedFileInfo.getPath(), "/"));

		} finally {
			ImagingApi.deleteFile(new DeleteFileRequest(folder + "/" + file, TestStorage, null));
			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file, TestStorage, null))
					.isExists());

			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());
		}
	}

	@Test
	public void fileVersionsCreateTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file1 = "Storage.txt";
		String file2 = "Folder1/Folder1.txt";

		Long file1Size = getFileWithName(
				ImagingApi.getFilesList(new GetFilesListRequest(OriginalDataFolder, TestStorage)).getValue(), file1)
						.getSize();
		Long file2Size = getFileWithName(ImagingApi
				.getFilesList(new GetFilesListRequest(OriginalDataFolder + "/Folder1", TestStorage)).getValue(),
				"Folder1.txt").getSize();

		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			List<FileVersion> versions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage)).getValue();
			Assert.assertEquals(2, versions.size());
			FileVersion recentVersion = getFileVersion(versions, true);
			FileVersion oldVersion = getFileVersion(versions, false);
			Long recentVersionSize = recentVersion.getSize();
			Long oldVersionSize = oldVersion.getSize();
			Assert.assertNotEquals(recentVersionSize, oldVersionSize);
			Assert.assertEquals(oldVersionSize, file1Size);
			Assert.assertEquals(recentVersionSize, file2Size);
		} finally {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}
		}
	}

	@Test
	public void fileVersionsDownloadTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file1 = "Storage.txt";
		String file2 = "Folder1/Folder1.txt";

		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			List<FileVersion> versions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage)).getValue();
			FileVersion recentVersion = getFileVersion(versions, true);
			FileVersion oldVersion = getFileVersion(versions, false);
			long recentVersionSize = recentVersion.getSize();
			long oldVersionSize = oldVersion.getSize();

			byte[] oldFile = ImagingApi.downloadFile(
					new DownloadFileRequest(folder + "/" + file1, TestStorage, oldVersion.getVersionId()));
			Assert.assertEquals(oldVersionSize, oldFile.length);

			byte[] recentFile = ImagingApi.downloadFile(
					new DownloadFileRequest(folder + "/" + file1, TestStorage, recentVersion.getVersionId()));
			Assert.assertEquals(recentVersionSize, recentFile.length);
		} finally {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}
		}
	}

	@Test
	public void fileVersionsCopyTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file1 = "Storage.txt";
		String file2 = "Folder1/Folder1.txt";

		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			List<FileVersion> versions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage)).getValue();
			FileVersion recentVersion = getFileVersion(versions, true);
			FileVersion oldVersion = getFileVersion(versions, false);

			ImagingApi.copyFile(new CopyFileRequest(folder + "/" + file1, folder + "/" + file1 + ".recent", TestStorage,
					TestStorage, recentVersion.getVersionId()));
			List<FileVersion> copiedVersions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1 + ".recent", TestStorage))
					.getValue();
			Assert.assertEquals(1, copiedVersions.size());
			Assert.assertTrue(copiedVersions.get(0).isIsLatest());
			Assert.assertEquals(recentVersion.getSize(), copiedVersions.get(0).getSize());

			ImagingApi.copyFile(new CopyFileRequest(folder + "/" + file1, folder + "/" + file1 + ".old", TestStorage,
					TestStorage, oldVersion.getVersionId()));
			copiedVersions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1 + ".old", TestStorage)).getValue();
			Assert.assertEquals(1, copiedVersions.size());
			Assert.assertTrue(copiedVersions.get(0).isIsLatest());
			Assert.assertEquals(oldVersion.getSize(), copiedVersions.get(0).getSize());
		} finally {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}
		}
	}

	@Test
	public void fileVersionsMoveTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file1 = "Storage.txt";
		String file2 = "Folder1/Folder1.txt";

		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			List<FileVersion> versions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage)).getValue();
			FileVersion recentVersion = getFileVersion(versions, true);

			ImagingApi.moveFile(new MoveFileRequest(folder + "/" + file1, folder + "/" + file1 + ".recent", TestStorage,
					TestStorage, recentVersion.getVersionId()));
			List<FileVersion> copiedVersions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1 + ".recent", TestStorage))
					.getValue();
			Assert.assertEquals(1, copiedVersions.size());
			Assert.assertTrue(copiedVersions.get(0).isIsLatest());
			Assert.assertEquals(recentVersion.getSize(), copiedVersions.get(0).getSize());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			versions = ImagingApi.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage))
					.getValue();
			FileVersion oldVersion = getFileVersion(versions, false);
			ImagingApi.moveFile(new MoveFileRequest(folder + "/" + file1, folder + "/" + file1 + ".old", TestStorage,
					TestStorage, oldVersion.getVersionId()));
			copiedVersions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1 + ".old", TestStorage)).getValue();
			Assert.assertEquals(1, copiedVersions.size());
			Assert.assertTrue(copiedVersions.get(0).isIsLatest());
			Assert.assertEquals(oldVersion.getSize(), copiedVersions.get(0).getSize());
		} finally {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}
		}
	}

	@Test
	public void fileVersionsDeleteTest() throws Exception {
		String folder = getTempFolder() + "/Storage";
		String file1 = "Storage.txt";
		String file2 = "Folder1/Folder1.txt";

		try {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}

			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists());

			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file1, folder + "/" + file1, TestStorage,
					TestStorage, null));
			ImagingApi.copyFile(new CopyFileRequest(OriginalDataFolder + "/" + file2, folder + "/" + file1, TestStorage,
					TestStorage, null));
			List<FileVersion> versions = ImagingApi
					.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage)).getValue();
			FileVersion recentVersion = getFileVersion(versions, true);
			FileVersion oldVersion = getFileVersion(versions, false);
			Assert.assertTrue(ImagingApi
					.objectExists(
							new ObjectExistsRequest(folder + "/" + file1, TestStorage, recentVersion.getVersionId()))
					.isExists());
			Assert.assertTrue(ImagingApi
					.objectExists(new ObjectExistsRequest(folder + "/" + file1, TestStorage, oldVersion.getVersionId()))
					.isExists());

			ImagingApi
					.deleteFile(new DeleteFileRequest(folder + "/" + file1, TestStorage, recentVersion.getVersionId()));
			versions = ImagingApi.getFileVersions(new GetFileVersionsRequest(folder + "/" + file1, TestStorage))
					.getValue();
			Assert.assertFalse(ImagingApi
					.objectExists(
							new ObjectExistsRequest(folder + "/" + file1, TestStorage, recentVersion.getVersionId()))
					.isExists());
			Assert.assertTrue(ImagingApi
					.objectExists(new ObjectExistsRequest(folder + "/" + file1, TestStorage, oldVersion.getVersionId()))
					.isExists());
			Assert.assertEquals(1, versions.size());
			Assert.assertEquals(oldVersion.getSize(), versions.get(0).getSize());

			ImagingApi.deleteFile(new DeleteFileRequest(folder + "/" + file1, TestStorage, oldVersion.getVersionId()));
			Assert.assertFalse(ImagingApi.objectExists(new ObjectExistsRequest(folder + "/" + file1, TestStorage, null))
					.isExists());
		} finally {
			if (ImagingApi.objectExists(new ObjectExistsRequest(folder, TestStorage, null)).isExists()) {
				ImagingApi.deleteFolder(new DeleteFolderRequest(folder, TestStorage, true));
			}
		}
	}
}
