/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateJPEG2000Image.java">
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


public class UpdateJPEG2000Image extends ImagingBase {

    /*
     * Update parameters of existing JPEG2000 image. The image is saved in the cloud.
     */
    public void modifyJPEG2000FromStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.jp2";

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
            String codec = "jp2";
            String comment = "Aspose";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyJpeg2000Request modifyJpeg2000Request = new ModifyJpeg2000Request(fileName, comment, codec,
                                                                                fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyJpeg2000(modifyJpeg2000Request);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.jp2");
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
    * Update parameters of existing JPEG2000 image, and upload The image is saved in the cloud.
    */
    public void modifyJPEG2000AndUploadToStorage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String fileName = "Sample.jp2";

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
            String codec = "jp2";
            String comment = "Aspose";
            Boolean fromScratch = null;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            ModifyJpeg2000Request modifyJpeg2000Request = new ModifyJpeg2000Request(fileName, comment, codec,
                    fromScratch, folder, storage);

            byte[] updatedImage = imagingApi.modifyJpeg2000(modifyJpeg2000Request);

            // Upload updated image to cloud storage
            String outPath = "Sample_out.jp2";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing JPEG2000 image. Image data is passed in a request stream.
     */
    public void createModifiedJPEG2000FromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.jp2");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String codec = "jp2";
            String comment = "Aspose";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            CreateModifiedJpeg2000Request modifiedJpeg2000Request = new CreateModifiedJpeg2000Request(imageData, comment, codec,
                                                                                        fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.createModifiedJpeg2000(modifiedJpeg2000Request);

            // Save updated image to local storage
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(DATA_PATH + "Sample_out.jp2");
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
