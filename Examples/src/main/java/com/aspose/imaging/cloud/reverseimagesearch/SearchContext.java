/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SearchContext.java">
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
package com.aspose.imaging.cloud.reverseimagesearch;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.*;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;

public class SearchContext extends ImagingAIBase {

    /*
     * Extract features from image without adding to search context.
     */
    public void extractImageFeatures() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

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

            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            ExtractImageFeaturesRequest extractImageFeaturesRequest =
                    new ExtractImageFeaturesRequest(searchContextId, fileName, null, folder, storage);

            ImageFeatures imageFeatures = imagingApi.extractImageFeatures(extractImageFeaturesRequest);
            System.out.println(imageFeatures);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Delete the search context
        deleteImageSearch(searchContextId);
    }

    /*
     * Add tag and reference image to search context. Image data is passed in a request stream.
     */
    public void createImageTag() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        try {
            String tag = "MyTag";
            String imageName = "aspose_logo.png";
            String folder = null; // File will be saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            // Load tag image as a stream
            File inputFile = new File(DATA_PATH + imageName);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            FileInputStream inputStream = new FileInputStream(inputFile);
            inputStream.read(inputBytes);

            imagingApi.createImageTag(
                    new CreateImageTagRequest(inputBytes, searchContextId, tag, folder, storage));

            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Delete the search context
        deleteImageSearch(searchContextId);
    }
}
