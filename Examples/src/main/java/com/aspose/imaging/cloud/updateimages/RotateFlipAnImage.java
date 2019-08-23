/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RotateFlipAnImage.java">
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


public class RotateFlipAnImage extends ImagingBase {

    /*
     * Rotate and/or flip an image.
     */
    public void rotateFlipImageFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Input formats could be one of the following:
        // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG and SVG
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
            // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-RotateFlip
            // for possible output formats.
            String format = "gif";
            String method = "Rotate90FlipX"; // RotateFlip method
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            RotateFlipImageRequest getImageRotateFlipRequest = new RotateFlipImageRequest(fileName, format,
                                                                                method, folder, storage);

            byte[] updatedImage = imagingApi.rotateFlipImage(getImageRotateFlipRequest);

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
     * Rotate and/or flip an image, and upload updated image to Cloud Storage.
     */
    public void rotateFlipImageAndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Input formats could be one of the following:
        // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG and SVG
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
            // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-RotateFlip
            // for possible output formats.
            String format = "gif";
            String method = "Rotate90FlipX"; // RotateFlip method
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            RotateFlipImageRequest getImageRotateFlipRequest = new RotateFlipImageRequest(fileName, format,
                    method, folder, storage);

            byte[] updatedImage = imagingApi.rotateFlipImage(getImageRotateFlipRequest);

            // Upload updated image to cloud storage
            String outPath = "Sample_out." + format;
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Rotate and/or flip an existing image. Image data is passed in request stream.
     */
    public void createRotateFlippedImageFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "gif";
            String method = "Rotate90FlipX"; // RotateFlip method
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            CreateRotateFlippedImageRequest rotateFlippedImageRequest = new CreateRotateFlippedImageRequest(imageData, format,
                                                                                            method, outPath, storage);

            byte[] updatedImage = imagingApi.createRotateFlippedImage(rotateFlippedImageRequest);

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
