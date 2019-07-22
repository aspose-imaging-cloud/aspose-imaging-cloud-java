/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TIFFFrames.java">
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
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class TIFFFrames extends ImagingBase {

    /*
     * Get a frame from existing TIFF image.
     */
    public void getImageFrameFromStorage() {
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

            Integer frameId = 1; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            // Result will include just the specified frame
            Boolean saveOtherFrames = false;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                            x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get a frame from existing TIFF image, and upload the frame to Cloud Storage.
     */
    public void getImageFrameAndUploadToStorage() {
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

            Integer frameId = 1; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            // Result will include just the specified frame
            Boolean saveOtherFrames = false;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                    x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Upload updated image to cloud storage
            String outPath = "SingleFrame_out.tiff";
            UploadFileRequest uploadFileRequest = new UploadFileRequest(outPath, updatedImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Resize a TIFF frame.
     */
    public void resizeImageFrameFromStorage() {
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

            Integer frameId = 0; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 300;
            // Result will include just the specified frame
            Boolean saveOtherFrames = false;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                    null, null, null, null, null, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Crop a TIFF frame.
     */
    public void cropImageFrameFromStorage() {
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

            Integer frameId = 0; // Number of a frame
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            // Result will include just the specified frame
            Boolean saveOtherFrames = false;
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, null, null,
                    x, y, rectWidth, rectHeight, null, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * RotateFlip a TIFF frame.
     */
    public void rotateFlipImageFrameFromStorage() {
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

            Integer frameId = 0; // Number of a frame
            String rotateFlipMethod = "Rotate90FlipX";
            Boolean saveOtherFrames = false; // Result will include just the specified frame
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, null, null,
                    null, null, null, null, rotateFlipMethod, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Result will also include all other frames.
     */
    public void getAllImageFramesFromStorage() {
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
            Integer frameId = 1; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            Boolean saveOtherFrames = true; // Result will include all other frames
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                    x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "OtherFrames_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get a frame from existing TIFF image. Image is passed in a request stream.
     */
    public void createImageFrameFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer frameId = 1;
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            Boolean saveOtherFrames = false;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            CreateImageFrameRequest postImageFrameRequest = new CreateImageFrameRequest(imageData, frameId, newWidth,
                        newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, storage);

            byte[] updatedImage = imagingApi.createImageFrame(postImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get a frame properties of a TIFF image.
     */
    public void getImageFramePropertiesFromStorage() {
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
            Integer frameId = 1; // Number of a frame
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFramePropertiesRequest imageFramePropertiesRequest = new GetImageFramePropertiesRequest(fileName,
                                                                                                frameId, folder, storage);

            ImagingResponse imagingResponse = imagingApi.getImageFrameProperties(imageFramePropertiesRequest);
            System.out.println("Width: " + imagingResponse.getHeight() + " Height: " + imagingResponse.getWidth());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*
     * Get a frame properties of a TIFF image. Image data is passed in a request stream.
     */
    public void extractImageFramePropertiesFromRequestBody() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        try {
            File file = new File(DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer frameId = 1;

            ExtractImageFramePropertiesRequest imageFramePropertiesRequest = new ExtractImageFramePropertiesRequest(imageData,
                                                                                                                frameId);

            ImagingResponse imagingResponse = imagingApi.extractImageFrameProperties(imageFramePropertiesRequest);
            System.out.println("Width: " + imagingResponse.getHeight() + " Height: " + imagingResponse.getWidth());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
