/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ResizeImage.java">
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


public class ResizeImage extends ImagingBase {

    /*
     * Resize an image.
     */
    public void resizeImageFromStorage() {
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
            // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Resize
            // for possible output formats.
            String format = "gif";
            Integer newWidth = 100;
            Integer newHeight = 150;
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            ResizeImageRequest resizeImageRequest = new ResizeImageRequest(fileName, format, newWidth,
                                                                                newHeight, folder, storage);

            byte[] updatedImage = imagingApi.resizeImage(resizeImageRequest);

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
     * Resize an image, and upload updated image to Cloud Storage.
     */
    public void resizeImageAndUploadToStorage() {
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
            // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Resize
            // for possible output formats.
            String format = "gif";
            Integer newWidth = 100;
            Integer newHeight = 150;
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            ResizeImageRequest resizeImageRequest = new ResizeImageRequest(fileName, format, newWidth, newHeight,
                                                                                                    folder, storage);

            byte[] updatedImage = imagingApi.resizeImage(resizeImageRequest);

            // Upload updated image to cloud storage
            String outPath = "Sample_out.gif";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Resize an existing image. Image data is passed in request stream.
     */
    public void createResizedImageFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            // Input formats could be one of the following:
            // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG and SVG
            File file = new File(DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "gif";
            Integer newWidth = 100;
            Integer newHeight = 150;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            CreateResizedImageRequest resizedImageRequest = new CreateResizedImageRequest(imageData, format, newWidth,
                                                                                        newHeight, outPath, storage);

            byte[] updatedImage = imagingApi.createResizedImage(resizedImageRequest);

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