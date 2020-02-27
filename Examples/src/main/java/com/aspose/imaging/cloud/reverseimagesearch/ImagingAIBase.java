/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingAIBase.java">
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

import com.aspose.imaging.cloud.ImagingBase;
import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.ImageFeatures;
import com.aspose.imaging.cloud.sdk.model.SearchContextStatus;
import com.aspose.imaging.cloud.sdk.model.requests.*;

public class ImagingAIBase extends ImagingBase {

    protected String createImageSearch() {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String detector = null; // The image features detector. Default value is akaze.
        String matchingAlgorithm = null; // The matching algorithm. Default value is randomBinaryTree.
        String folder = null; // File will be saved at the root of the storage
        String storage = null; // We are using default Cloud Storage

        try {
            CreateImageSearchRequest createSearchContextRequest = new CreateImageSearchRequest(detector,
                   matchingAlgorithm, folder, storage);

            SearchContextStatus status = imagingApi.createImageSearch(createSearchContextRequest);
            return status.getId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Delete the search context
    protected void deleteImageSearch(String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String folder = null; // File is saved at the root of the storage
        String storage = null; // Default Cloud Storage is being used

        try {
            DeleteImageSearchRequest deleteSearchContextRequest = new DeleteImageSearchRequest(searchContextId,
                    folder, storage);
            imagingApi.deleteImageSearch(deleteSearchContextRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Gets the search context status
    protected String getImageSearchStatus(String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        String folder = null; // File is saved at the root of the storage
        String storage = null; // Default Cloud Storage is being used

        GetImageSearchStatusRequest searchContextStatusRequest = new GetImageSearchStatusRequest(searchContextId,
                folder, storage);
        try {
            SearchContextStatus status = imagingApi.getImageSearchStatus(searchContextStatusRequest);
            return status.getSearchStatus();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Extract images features and add them to search context.
    protected void createImageFeatures(String storageSourcePath, boolean isFolder, String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        CreateImageFeaturesRequest request = isFolder
        ? new CreateImageFeaturesRequest(searchContextId, null, null, storageSourcePath, null, null)
        : new CreateImageFeaturesRequest(searchContextId, null, storageSourcePath, null, null, null);

        try {
            imagingApi.createImageFeatures(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Gets image features from search context.
    protected void getImageFeatures(String imageName, String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        GetImageFeaturesRequest getImageFeaturesRequest =
                new GetImageFeaturesRequest(searchContextId, imageName, null, null);

        try {
            ImageFeatures imageFeatures = imagingApi.getImageFeatures(getImageFeaturesRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Deletes image features from search context.
    protected void deleteImageFeatures(String imageName, String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        DeleteImageFeaturesRequest deleteImageFeaturesRequest =
                new DeleteImageFeaturesRequest(searchContextId, imageName, null, null);
        try {
            imagingApi.deleteImageFeatures(deleteImageFeaturesRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Update images features in search context.
    protected void updateImageFeatures(String imageName, String searchContextId) {
        // Create ImagingApi instance
        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        UpdateImageFeaturesRequest updateImageFeaturesRequest =
                new UpdateImageFeaturesRequest(searchContextId, imageName, null, null, null);
        try {
            imagingApi.updateImageFeatures(updateImageFeaturesRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
