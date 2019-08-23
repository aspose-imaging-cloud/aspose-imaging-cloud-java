/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdatePSDImage.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
package com.aspose.imaging.cloud.updateimages;

import com.aspose.imaging.cloud.ImagingBase;
import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdatePSDImage extends ImagingBase {

    /*
     * Update parameters of existing PSD image. The image is saved in the cloud.
     */
    public void modifyPSDFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.psd";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }
            int channelsCount = 3;
            String compressionMethod = "raw";
            Boolean fromScratch = null;
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            ModifyPsdRequest modifyPsdRequest = new ModifyPsdRequest(fileName, channelsCount, compressionMethod,
                                                                                fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyPsd(modifyPsdRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.psd");
                fos.write(updatedImage);
            } finally {
                if(fos != null) {
                    fos.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing PSD image, and upload updated image to cloud storage.
     */
    public void modifyPSDAndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.psd";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }
            int channelsCount = 3;
            String compressionMethod = "raw";
            Boolean fromScratch = null;
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            ModifyPsdRequest modifyPsdRequest = new ModifyPsdRequest(fileName, channelsCount, compressionMethod,
                    fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyPsd(modifyPsdRequest);

            // Upload updated image to cloud storage
            String outPath = "Sample_out.psd";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing PSD image. Image data is passed in a request stream.
     */
    public void createModifiedPSDFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            int channelsCount = 3;
            String compressionMethod = "raw";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            CreateModifiedPsdRequest modifiedPsdRequest = new CreateModifiedPsdRequest(imageData, channelsCount,
                                                                    compressionMethod, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.createModifiedPsd(modifiedPsdRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.psd");
                fos.write(updatedImage);
            } finally {
                if(fos != null) {
                    fos.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
