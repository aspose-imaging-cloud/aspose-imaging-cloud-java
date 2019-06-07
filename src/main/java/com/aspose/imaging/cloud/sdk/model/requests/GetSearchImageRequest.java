/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetSearchImageRequest.java">
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
* Class that holds parameters for GetSearchImage request invocation.
**/   
public class GetSearchImageRequest
{
    /**
    * Initializes a new instance of the GetSearchImageRequest class.   
    * @param searchContextId Search context identifier.
    * @param imageId Image identifier.
    * @param folder Folder.
    * @param storage Storage
    **/
    public GetSearchImageRequest(String searchContextId, String imageId, String folder, String storage)             
    {
        this.searchContextId = searchContextId;
        this.imageId = imageId;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Search context identifier.
    **/
    public String searchContextId;

    /**
    * Image identifier.
    **/
    public String imageId;

    /**
    * Folder.
    **/
    public String folder;

    /**
    * Storage
    **/
    public String storage;
}