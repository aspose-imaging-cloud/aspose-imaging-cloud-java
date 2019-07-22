/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FindDuplicateImages.java">
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
import com.aspose.imaging.cloud.sdk.model.ImageDuplicates;
import com.aspose.imaging.cloud.sdk.model.ImageDuplicatesSet;
import com.aspose.imaging.cloud.sdk.model.SearchResult;
import com.aspose.imaging.cloud.sdk.model.requests.FindImageDuplicatesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;

public class FindDuplicateImages extends ImagingAIBase {
    /*
     * Find duplicate images.
     */
    public void findImageDuplicates() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        String comparableImage = "ComparableImage.jpg";
        String comparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";
        String comparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";

        try {
            // Upload images to Cloud Storage
            String[] images = {comparableImage, comparingImageSimilarLess15, comparingImageSimilarMore75};
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
            createImageFeatures(comparingImageSimilarLess15, false, searchContextId);
            createImageFeatures(comparingImageSimilarMore75, false, searchContextId);

            Double similarityThreshold = 80.0; // The similarity threshold
            String folder = null; // Path to input files
            String storage = null; // We are using default Cloud Storage

            ImageDuplicatesSet result = imagingApi.findImageDuplicates(
                    new FindImageDuplicatesRequest(searchContextId, similarityThreshold, folder, storage));

            for (ImageDuplicates duplicates : result.getDuplicates())
            {
                System.out.println("Duplicates:");
                for (SearchResult duplicate : duplicates.getDuplicateImages())
                {
                    System.out.println("ImageName: " + duplicate.getImageId() +
                            ", Similarity: " + duplicate.getSimilarity());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
