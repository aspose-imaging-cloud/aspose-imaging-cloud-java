/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ExamplesTests.java">
*   Copyright (c) 2019 Aspose Pty Ltd.
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

package com.aspose.imaging.cloud.test.api;

import com.aspose.imaging.cloud.test.base.ApiTester;
import com.aspose.imaging.cloud.sdk.invoker.Configuration;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * Tests that correspond with examples code.
 */
public class ExamplesTests extends ApiTester {

    /**
     * Save as from storage example test.
     * 
     * @throws Exception if the Api call fails
     */
    @Test
    public void saveAsFromStorageExampleTest() throws Exception {
        try {
            Configuration config = ImagingApi.Configuration;
            com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi = new com.aspose.imaging.cloud.sdk.api.ImagingApi(
                    config.AppKey, config.AppSid, config.getApiBaseUrl());

            // get local image
            File testFile = new File(getLocalTestFolder(), "test.png");
            FileInputStream localInputImageStream = new FileInputStream(testFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                // upload local image to storage
                UploadFileRequest uploadFileRequest = new UploadFileRequest("ExampleFolderNet/inputImage.png",
                        localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
                // inspect result.getErrors() list if there were any
                // inspect result.getUploaded() list for uploaded file names
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }

            // convert image from storage to JPEG and save it to storage
            // please, use outPath parameter for saving the result to storage
            GetImageSaveAsRequest getSaveToStorageRequest = new GetImageSaveAsRequest("inputImage.png", "jpg",
                    "ExampleFolderNet/resultImage.jpg", "ExampleFolderNet", null);

            imagingApi.getImageSaveAs(getSaveToStorageRequest);

            // download saved image from storage and process it
            byte[] savedFile = imagingApi
                    .downloadFile(new DownloadFileRequest("ExampleFolderNet/resultImage.jpg", null, null));

            // convert image from storage to JPEG and read it from resulting stream
            // please, set outPath parameter as null to return result in request stream
            // instead of saving to storage
            GetImageSaveAsRequest getSaveToStreamRequest = new GetImageSaveAsRequest("inputImage.png", "jpg", null,
                    "ExampleFolderNet", null);

            // process resulting image from response stream
            byte[] resultGetImageStream = imagingApi.getImageSaveAs(getSaveToStreamRequest);
        } finally {
            // remove files from storage
            ImagingApi.deleteFile(new DeleteFileRequest("ExampleFolderNet/inputImage.jpg", null, null));
            ImagingApi.deleteFile(new DeleteFileRequest("ExampleFolderNet/resultImage.png", null, null));
        }
    }

    /**
     * SaveAs as from stream example test.
     * 
     * @throws Exception if the Api call fails
     */
    @Test
    public void saveAsFromStreamExampleTest() throws Exception {
        try {
            Configuration config = ImagingApi.Configuration;
            com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi = new com.aspose.imaging.cloud.sdk.api.ImagingApi(
                    config.AppKey, config.AppSid, config.getApiBaseUrl());

            // get local image
            File testFile = new File(getLocalTestFolder(), "test.png");
            FileInputStream localInputImageStream = new FileInputStream(testFile);
            byte[] localInputImage;
            try {
                localInputImage = IOUtils.toByteArray(localInputImageStream);
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }

            // convert image from request stream to JPEG and save it to storage
            // please, use outPath parameter for saving the result to storage
            PostImageSaveAsRequest postSaveToStorageRequest = new PostImageSaveAsRequest(localInputImage, "jpg",
                    "ExampleFolderNet/resultImage.png", null);

            imagingApi.postImageSaveAs(postSaveToStorageRequest);

            // download saved image from storage and process it
            byte[] savedFile = imagingApi
                    .downloadFile(new DownloadFileRequest("ExampleFolderNet/resultImage.jpg", null, null));

            // convert image from request stream to JPEG and read it from resulting stream
            // please, set outPath parameter as null to return result in request stream
            // instead of saving to storage
            PostImageSaveAsRequest postSaveToStreamRequest = new PostImageSaveAsRequest(localInputImage, "jpg", null,
                    null);

            // process resulting image from response stream
            byte[] resultPostImageStream = imagingApi.postImageSaveAs(postSaveToStreamRequest);
        } finally {
            // remove file from storage
            ImagingApi.deleteFile(new DeleteFileRequest("ExampleFolderNet/resultImage.png", null, null));
        }
    }
}
