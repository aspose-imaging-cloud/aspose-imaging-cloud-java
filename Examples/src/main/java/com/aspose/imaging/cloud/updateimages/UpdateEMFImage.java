/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateEMFImage.java">
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
import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedEmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyEmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;


public class UpdateEMFImage extends ImagingBase {

    /*
     * Process existing EMF imaging using given parameters
     */
    public void modifyEMFFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.emf";

        try {
            // Upload local image to storage
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
            // Update EMF Image properties
            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            String format = "png";
            // Specifies where additional parameters we do not support should be taken from.
            // If this is true – they will be taken from default values for standard image,
            // if it is false – they will be saved from current image. Default is false.
            Boolean fromScratch = null;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // As we are using default Cloud Storage

            ModifyEmfRequest modifyEmfRequest = new ModifyEmfRequest(fileName, bkColor, pageWidth, pageHeight,
                                                        borderX, borderY, fromScratch, folder, storage, format);

            byte[] updatedImage = imagingApi.modifyEmf(modifyEmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SampleEMF_out.png");
            fos.write(updatedImage);
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Rasterize EMF image to PNG using given parameters. Image is passed in a request stream
     */
    public void createModifiedEMFFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.emf");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            String format = "png";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // As we are using default Cloud Storage

            CreateModifiedEmfRequest modifiedEmfRequest = new CreateModifiedEmfRequest(imageData, bkColor, pageWidth,
                                                    pageHeight, borderX, borderY, fromScratch, outPath, storage, format);

            byte[] updatedImage = imagingApi.createModifiedEmf(modifiedEmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SampleEMF_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
