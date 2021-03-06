/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CompareImagesRequest.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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

import com.aspose.imaging.cloud.sdk.model.*;

/**
* Class that holds parameters for CompareImages request invocation.
**/   
public class CompareImagesRequest
{
    /**
    * Initializes a new instance of the CompareImagesRequest class.   
    * @param searchContextId The search context identifier.
    * @param imageId1 The first image Id in storage.
    * @param imageData Input image
    * @param imageId2 The second image Id in storage or null (if image loading in request).
    * @param folder The folder.
    * @param storage The storage.
    **/
    public CompareImagesRequest(String searchContextId, String imageId1, byte[] imageData, String imageId2, String folder, String storage)             
    {
        this.searchContextId = searchContextId;
        this.imageId1 = imageId1;
        this.imageData = imageData;
        this.imageId2 = imageId2;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * The search context identifier.
    **/
    public String searchContextId;

    /**
    * The first image Id in storage.
    **/
    public String imageId1;

    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * The second image Id in storage or null (if image loading in request).
    **/
    public String imageId2;

    /**
    * The folder.
    **/
    public String folder;

    /**
    * The storage.
    **/
    public String storage;
}
