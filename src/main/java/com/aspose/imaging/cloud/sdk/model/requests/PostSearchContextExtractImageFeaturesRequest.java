/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostSearchContextExtractImageFeaturesRequest.java">
*   Copyright (c) 2019 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.imaging.cloud.sdk.model.requests;

/**
* Class that holds parameters for PostSearchContextExtractImageFeatures request invocation.
**/   
public class PostSearchContextExtractImageFeaturesRequest
{
    /**
    * Initializes a new instance of the PostSearchContextExtractImageFeaturesRequest class.   
    * @param searchContextId The search context identifier.
    * @param imageData Input image
    * @param imageId The image identifier.
    * @param imagesFolder Images folder.
    * @param folder The folder.
    * @param storage The storage.
    **/
    public PostSearchContextExtractImageFeaturesRequest(String searchContextId, byte[] imageData, String imageId, String imagesFolder, String folder, String storage)             
    {
        this.searchContextId = searchContextId;
        this.imageData = imageData;
        this.imageId = imageId;
        this.imagesFolder = imagesFolder;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * The search context identifier.
    **/
    public String searchContextId;

    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * The image identifier.
    **/
    public String imageId;

    /**
    * Images folder.
    **/
    public String imagesFolder;

    /**
    * The folder.
    **/
    public String folder;

    /**
    * The storage.
    **/
    public String storage;
}
