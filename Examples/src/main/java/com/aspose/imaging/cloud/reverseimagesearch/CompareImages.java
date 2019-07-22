/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CompareImages.java">
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
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.CompareImagesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;

public class CompareImages extends ImagingAIBase {

    /*
   ​ * Compare two images.
    */
    public void compareTwoImagesInSearchContext() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        String comparableImage = "ComparableImage.jpg";
        String comparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";

        try {
            // Upload both images to Cloud Storage
            String[] images = {comparableImage, comparingImageSimilarMore75};
            for (String imageName : images) {
                File inputFile = new File(DATA_PATH + imageName);
                FileInputStream localInputImageStream = new FileInputStream(inputFile);

                try {
                    byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                    UploadFileRequest uploadFileRequest = new UploadFileRequest(imageName, localInputImage, null);
                    FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
                } finally {
                    if (localInputImageStream != null) {
                        localInputImageStream.close();
                    }
                }
            }

            createImageFeatures(comparableImage, false, searchContextId);
            createImageFeatures(comparingImageSimilarMore75, false, searchContextId);

            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            SearchResultsSet searchResults = imagingApi.compareImages(
                    new CompareImagesRequest(
                            searchContextId, comparableImage, null, comparingImageSimilarMore75, folder, storage));
            Double similarity = searchResults.getResults().get(0).getSimilarity();
            System.out.println("Images Similarity: " + similarity.toString());

            // Delete the search context
            deleteImageSearch(searchContextId);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
   ​ * Compare two images.
    */
    public void compareLoadedImageToImageInSearchContext() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        String comparableImage = "ComparableImage.jpg";
        String comparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";

        try {
            // Upload local image to storage
            File inputFile = new File(DATA_PATH + comparableImage);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);
            try {
                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(comparableImage, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            } finally {
                if (localInputImageStream != null) {
                    localInputImageStream.close();
                }
            }

            createImageFeatures(comparableImage, false, searchContextId);

            File file = new File(DATA_PATH + comparingImageSimilarLess15);
            byte[] imageData = Files.readAllBytes(file.toPath());

            String folder = null; // Folder with images to process
            String storage = null; // We are using default Cloud Storage

            SearchResultsSet searchResults = imagingApi.compareImages(
                    new CompareImagesRequest(
                            searchContextId, comparableImage, imageData, null, folder, storage));
            Double similarity = searchResults.getResults().get(0).getSimilarity();
            System.out.println("Images Similarity: " + similarity.toString());

            // Delete the search context
            deleteImageSearch(searchContextId);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
