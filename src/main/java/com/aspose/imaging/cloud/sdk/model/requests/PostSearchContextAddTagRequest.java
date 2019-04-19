/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostSearchContextAddTagRequest.java">
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
* Class that holds parameters for PostSearchContextAddTag request invocation.
**/   
public class PostSearchContextAddTagRequest
{
    /**
    * Initializes a new instance of the PostSearchContextAddTagRequest class.   
    * @param imageData Input image
    * @param searchContextId The search context identifier.
    * @param tagName The tag.
    * @param folder The folder.
    * @param storage The storage.
    **/
    public PostSearchContextAddTagRequest(byte[] imageData, String searchContextId, String tagName, String folder, String storage)             
    {
        this.imageData = imageData;
        this.searchContextId = searchContextId;
        this.tagName = tagName;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * The search context identifier.
    **/
    public String searchContextId;

    /**
    * The tag.
    **/
    public String tagName;

    /**
    * The folder.
    **/
    public String folder;

    /**
    * The storage.
    **/
    public String storage;
}
