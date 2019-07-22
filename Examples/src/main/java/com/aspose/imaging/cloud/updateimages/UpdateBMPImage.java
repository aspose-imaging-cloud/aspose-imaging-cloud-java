/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateBMPImage.java">
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
import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdateBMPImage extends ImagingBase {

    /*
     * Update parameters of existing BMP image. The image is saved in the cloud.
     */
    public void modifyBMPFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "WaterMark.bmp";

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
            Integer bitsPerPixel = 32;
            Integer horizontalResolution = 300;
            Integer verticalResolution = 300;
            Boolean fromScratch = null;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyBmpRequest modifyBmpRequest = new ModifyBmpRequest(fileName, bitsPerPixel, horizontalResolution,
                                                                verticalResolution, fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyBmp(modifyBmpRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "Watermark_out.bmp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing BMP image. Image is passed in a request stream.
     */
    public void createModifiedBmpFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "WaterMark.bmp");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer bitsPerPixel = 32;
            Integer horizontalResolution = 300;
            Integer verticalResolution = 300;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            CreateModifiedBmpRequest createModifiedBmpRequest = new CreateModifiedBmpRequest(imageData, bitsPerPixel,
                                            horizontalResolution, verticalResolution, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.createModifiedBmp(createModifiedBmpRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "Watermark_out.bmp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
