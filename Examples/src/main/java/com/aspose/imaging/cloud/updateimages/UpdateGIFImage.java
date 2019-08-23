/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateGIFImage.java">
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


public class UpdateGIFImage extends ImagingBase {

    /*
     * Update parameters of existing GIF image. The image is saved in the cloud.
     */
    public void modifyGIFFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.gif";

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
            Integer backgroundColorIndex = 5;
            Integer colorResolution = 4;
            Boolean hasTrailer = true;
            Boolean interlaced = false;
            Boolean isPaletteSorted = true;
            Integer pixelAspectRatio = 4;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyGifRequest modifyGifRequest = new ModifyGifRequest(fileName, backgroundColorIndex,
                                                            colorResolution, hasTrailer, interlaced, isPaletteSorted,
                                                            pixelAspectRatio, fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyGif(modifyGifRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.gif");
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
     * Update parameters of a GIF image, and upload updated image to Cloud Storage.
     */
    public void modifyGIFAndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.gif";

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
            Integer backgroundColorIndex = 5;
            Integer colorResolution = 4;
            Boolean hasTrailer = true;
            Boolean interlaced = false;
            Boolean isPaletteSorted = true;
            Integer pixelAspectRatio = 4;
            Boolean fromScratch = null;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyGifRequest modifyGifRequest = new ModifyGifRequest(fileName, backgroundColorIndex,
                    colorResolution, hasTrailer, interlaced, isPaletteSorted,
                    pixelAspectRatio, fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyGif(modifyGifRequest);

            // Upload updated image to cloud storage
            String outPath = "Sample_out.gif";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of GIF image. Image data is passed in a request stream.
     */
    public void updateParametersOfGIFImageInRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.gif");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer backgroundColorIndex = 5;
            Integer colorResolution = 4;
            Boolean hasTrailer = true;
            Boolean interlaced = false;
            Boolean isPaletteSorted = true;
            Integer pixelAspectRatio = 4;
            Boolean fromScratch = null;
            String outPath = null;
            String storage = null; // We are using default Cloud Storage

            CreateModifiedGifRequest modifiedGifRequest = new CreateModifiedGifRequest(imageData, backgroundColorIndex,
                                            colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio,
                                                                                        fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.createModifiedGif(modifiedGifRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.gif");
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
