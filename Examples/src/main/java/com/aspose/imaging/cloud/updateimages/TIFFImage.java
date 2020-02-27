/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TIFFImage.java">
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


public class TIFFImage extends ImagingBase {

    /*
    * Update parameters of TIFF image. The image is saved in the cloud.
    */
    public void modifyTIFFFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.tiff";

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
            // Update parameters of TIFF image
            String compression = "adobedeflate";
            String resolutionUnit = "inch";
            int bitDepth = 1;
            double horizontalResolution = 150;
            double verticalResolution = 150;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyTiffRequest modifyTiffRequest = new ModifyTiffRequest(fileName, bitDepth, compression, resolutionUnit,
                            horizontalResolution, verticalResolution, fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyTiff(modifyTiffRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.tiff");
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
    * Update parameters of TIFF image, and upload updated image to cloud storage.
    */
    public void modifyTIFFAndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.tiff";

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
            // Update parameters of TIFF image
            String compression = "adobedeflate";
            String resolutionUnit = "inch";
            int bitDepth = 1;
            double horizontalResolution = 150;
            double verticalResolution = 150;
            Boolean fromScratch = null;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyTiffRequest modifyTiffRequest = new ModifyTiffRequest(fileName, bitDepth, compression, resolutionUnit,
                    horizontalResolution, verticalResolution, fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyTiff(modifyTiffRequest);

            // Upload updated image to cloud storage
            String outPath = "Sample_out.gif";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of TIFF image. Image data is passed in a request stream.
     */
    public void createModifiedTIFFFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String compression = "adobedeflate";
            String resolutionUnit = "inch";
            int bitDepth = 1;
            double horizontalResolution = 150;
            double verticalResolution = 150;
            Boolean fromScratch = null;
            String outPath = null;
            String storage = null; // We are using default Cloud Storage
            String folder = null; // Input file is saved at the root of the storage

            CreateModifiedTiffRequest modifiedTiffRequest = new CreateModifiedTiffRequest(imageData, bitDepth, compression,
                                    resolutionUnit, horizontalResolution, verticalResolution, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.createModifiedTiff(modifiedTiffRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.tiff");
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
    * Update parameters of TIFF image according to fax parameters.
    */
    public void convertTIFFToFaxFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.tiff";

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
            // Update TIFF Image parameters according to fax parameters
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ConvertTiffToFaxRequest tiffToFaxRequest = new ConvertTiffToFaxRequest(fileName, storage, folder);

            byte[] updatedImage = imagingApi.convertTiffToFax(tiffToFaxRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.tiff");
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
    * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
    */
    public void appendTIFFFromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.tiff"; // Original image file name
        String appendFileName = "Memorandum.tif"; // Image file name to be appended to original one

        try {
            // Upload original image file to cloud storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
                FilesUploadResult inputFileResult = imagingApi.uploadFile(uploadFileRequest);
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }
            // Upload file be appended to cloud storage
            File appendFile = new File(DATA_PATH + appendFileName);
            FileInputStream appendFileImageStream = new FileInputStream(appendFile);

            byte[] appendFileImage = IOUtils.toByteArray(appendFileImageStream);

            UploadFileRequest uploadAppendFileRequest = new UploadFileRequest(appendFileName, appendFileImage, null);
            FilesUploadResult appendFileResult = imagingApi.uploadFile(uploadAppendFileRequest);

            // Update TIFF Image parameters according to fax parameters
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            AppendTiffRequest request = new AppendTiffRequest(fileName, appendFileName, storage, folder);
            imagingApi.appendTiff(request);

            // Download updated file to local storage
            DownloadFileRequest downloadFileRequest = new DownloadFileRequest(fileName, storage, null);
            byte[] updatedImage = imagingApi.downloadFile(downloadFileRequest);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.tiff");
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
