/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageFramePropertiesRequest.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
* Class that holds parameters for GetImageFrameProperties request invocation.
**/   
public class GetImageFramePropertiesRequest
{
	/**
	* Initializes a new instance of the GetImageFramePropertiesRequest class.   
    * @param name Filename with image.
    * @param frameId Number of a frame.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
	**/
    public GetImageFramePropertiesRequest(String name, Integer frameId, String folder, String storage)             
    {
        this.name = name;
        this.frameId = frameId;
        this.folder = folder;
        this.storage = storage;
    }
		
    /**
    * Filename with image.
    **/
    public String name;

    /**
    * Number of a frame.
    **/
    public Integer frameId;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
