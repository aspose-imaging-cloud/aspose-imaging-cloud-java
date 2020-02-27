/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FindImages.java">
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
import com.aspose.imaging.cloud.sdk.model.SearchResult;
import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.CreateImageTagRequest;
import com.aspose.imaging.cloud.sdk.model.requests.FindImagesByTagsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.FindSimilarImagesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FindImages extends ImagingAIBase {

    /*
     * Find similar images.
     */
    public void findSimilarImages() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        String imageToFind = "4.jpg";
        String ImagesPath = "FindSimilar/";

        String findImageId = ImagesPath + imageToFind;
        double similarityThreshold = 3; // The similarity threshold
        int maxCount = 3; // The maximum count
        String folder = null; // Path to input files
        String storage = null; // We are using default Cloud Storage

        try {
            // Upload images to Cloud Storage
            String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg",
                                                                                                "9.jpg", "10.jpg"};
            for (String imageName : images) {
                File inputFile = new File(DATA_PATH + imageName);
                FileInputStream localInputImageStream = new FileInputStream(inputFile);

                try {
                    byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                    UploadFileRequest uploadFileRequest = new UploadFileRequest(ImagesPath + imageName, localInputImage, null);
                    FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
                } finally {
                    if (localInputImageStream != null) {
                        localInputImageStream.close();
                    }
                }
            }

            createImageFeatures(ImagesPath.substring(0, ImagesPath.length()-1), true, searchContextId);

            SearchResultsSet searchResultsSet = imagingApi.findSimilarImages(
                    new FindSimilarImagesRequest(searchContextId, similarityThreshold, maxCount, null, findImageId,
                                                                                                    folder, storage));
            System.out.println("Results Count: " + searchResultsSet.getResults().size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Delete the search context
        deleteImageSearch(searchContextId);
    }

    /*
     * Find images by tags.
     */
    public void findImagesByTag() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        String imageToFindByTag = "ComparingImageSimilar75.jpg";
        String ImagesPath = "FindSimilar/";

        try {
            String fileName = imageToFindByTag;
            //FileStream inputImageStream = File.OpenRead(ImagingBase.PathToDataFiles + fileName);

            File file = new File(DATA_PATH + fileName);
            byte[] imageData = Files.readAllBytes(file.toPath());

            createImageFeatures(ImagesPath.substring(0, ImagesPath.length()-1), true, searchContextId);

            String tagName = "ImageTag";
            double similarityThreshold = 60;
            int maxCount = 5;
            String folder = null; // Path to input files
            String storage = null; // We are using default Cloud Storage

            imagingApi.createImageTag(
                    new CreateImageTagRequest(imageData, searchContextId, tagName, folder, storage));

            // Serialize search tags collection to JSON
            List<String> tagsList = new ArrayList<String>();
            tagsList.add(tagName);
            String tags = new Gson().toJson(tagsList);

            SearchResultsSet searchResultsSet = imagingApi.findImagesByTags(
                    new FindImagesByTagsRequest(tags, searchContextId, similarityThreshold, maxCount, folder, storage));

            // Process search results
            for (SearchResult searchResult : searchResultsSet.getResults()) {
                System.out.println("ImageName: " + searchResult.getImageId() + ", Similarity: " + searchResult.getSimilarity());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Delete the search context
        deleteImageSearch(searchContextId);
    }
}
