/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImagePropertiesRequest.java">
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
* Class that holds parameters for GetImageProperties request invocation.
**/   
public class GetImagePropertiesRequest
{
    /**
    * Initializes a new instance of the GetImagePropertiesRequest class.   
    * @param name Filename of an image.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public GetImagePropertiesRequest(String name, String folder, String storage)             
    {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Filename of an image.
    **/
    public String name;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
