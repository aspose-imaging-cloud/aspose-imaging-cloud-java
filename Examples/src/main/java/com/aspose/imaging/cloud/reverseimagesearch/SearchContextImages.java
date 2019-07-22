/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SearchContextImages.java">
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
import com.aspose.imaging.cloud.sdk.model.requests.AddSearchImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteSearchImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UpdateSearchImageRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class SearchContextImages extends ImagingAIBase {

    /*
     * Get image from search context
     */
    public void getSearchImage() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Create new search context
        String searchContextId = createImageSearch();

        try {
            String imageId = "WaterMark.bmp";
            String folder = null;
            String storage = null;

            GetSearchImageRequest request = new GetSearchImageRequest(searchContextId, imageId, folder, storage);
            byte[] retrievedImage = imagingApi.getSearchImage(request);

            // Save retrieved image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "Watermark_out.bmp");
            fos.write(retrievedImage);
            fos.close();

            // Delete the search context
            deleteImageSearch(searchContextId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Add image and images features to search context. Image data is passed in a request stream.
     */
     public void addSearchImage() {
         // Create ImagingApi instance
         ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

         // Create new search context
         String searchContextId = createImageSearch();

         try {
             String imageId = "WaterMark.bmp";
             String folder = null;
             String storage = null;

             // Input image
             File inputFile = new File(DATA_PATH + imageId);
             byte[] imageData = new byte[(int) inputFile.length()];
             FileInputStream inputStream = new FileInputStream(inputFile);
             inputStream.read(imageData);

             AddSearchImageRequest request =
                            new AddSearchImageRequest(searchContextId, imageId, imageData, folder, storage);
             imagingApi.addSearchImage(request);

             // Delete the search context
             deleteImageSearch(searchContextId);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

    /*
     * Delete image and images features from search context
     */
     public void deleteSearchImage() {
         // Create ImagingApi instance
         ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

         // Create new search context
         String searchContextId = createImageSearch();

         try {
             String imageId = "WaterMark.bmp";
             String folder = null;
             String storage = null;

             DeleteSearchImageRequest request =
                     new DeleteSearchImageRequest(searchContextId, imageId, folder, storage);

             imagingApi.deleteSearchImage(request);

             // Delete the search context
             deleteImageSearch(searchContextId);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

    /*
     * Update image and images features in search context. Image data is passed in a request stream.
     */
     public void updateSearchImage() {
         // Create ImagingApi instance
         ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

         // Create new search context
         String searchContextId = createImageSearch();

         try {
             String imageId = "WaterMark.bmp";
             byte[] imageData = null;
             String folder = null;
             String storage = null;

             UpdateSearchImageRequest request =
                            new UpdateSearchImageRequest(searchContextId, imageId, imageData, folder, storage);
             imagingApi.updateSearchImage(request);

             // Delete the search context
             deleteImageSearch(searchContextId);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

}
