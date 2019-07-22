/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateWmfImage.java">
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


public class UpdateWmfImage extends ImagingBase {

    /*
     * Process existing WMF image using given parameters. The image is saved in the cloud.
     */
    public void modifyWMFFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.wmf";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            }  finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }
            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            Boolean fromScratch = null;
            String outPath = null;  // Path to updated file (if this is empty, response contains streamed image).
            // Folder with image to process. The value is null because the file is saved at the root of the storage
            String folder = null;
            String storage = null; // We are using default Cloud Storage
            String exportFormat = "png";

            ModifyWmfRequest modifyWmfRequest = new ModifyWmfRequest(fileName, bkColor, pageWidth, pageHeight,
                                                                    borderX, borderY, fromScratch, folder,
                                                                                                storage, exportFormat);

            byte[] updatedImage = imagingApi.modifyWmf(modifyWmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "WMFToPNG_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Process existing WMF image using given parameters, and upload updated image to cloud storage.
     */
    public void modifyWMFAndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.wmf";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            }  finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }
            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            Boolean fromScratch = null;
            // Folder with image to process. The value is null because the file is saved at the root of the storage
            String folder = null;
            String storage = null; // We are using default Cloud Storage
            String exportFormat = "png";

            ModifyWmfRequest modifyWmfRequest = new ModifyWmfRequest(fileName, bkColor, pageWidth, pageHeight,
                    borderX, borderY, fromScratch, folder,
                    storage, exportFormat);

            byte[] updatedImage = imagingApi.modifyWmf(modifyWmfRequest);

            // Upload updated image to cloud storage
            String outPath = "WMFToPNG_out.png";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Process existing WMF image using given parameters. Image data is passed in a request stream.
     */
    public void createModifiedWMFImageFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.wmf");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage
            String exportFormat = "png";

            CreateModifiedWmfRequest modifiedWmfRequest = new CreateModifiedWmfRequest(imageData, bkColor, pageWidth,
                                                                pageHeight, borderX, borderY, fromScratch, outPath,
                                                                                                storage, exportFormat);

            byte[] updatedImage = imagingApi.createModifiedWmf(modifiedWmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "WMFToPNG_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
