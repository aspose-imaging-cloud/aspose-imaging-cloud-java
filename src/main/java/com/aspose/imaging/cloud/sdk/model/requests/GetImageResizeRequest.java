/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageResizeRequest.java">
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
* Class that holds parameters for GetImageResize request invocation.
**/   
public class GetImageResizeRequest
{
	/**
	* Initializes a new instance of the GetImageResizeRequest class.   
    * @param name Filename of an image.
    * @param format Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
    * @param newWidth New width.
    * @param newHeight New height.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
	**/
    public GetImageResizeRequest(String name, String format, Integer newWidth, Integer newHeight, String outPath, String folder, String storage)             
    {
        this.name = name;
        this.format = format;
        this.newWidth = newWidth;
        this.newHeight = newHeight;
        this.outPath = outPath;
        this.folder = folder;
        this.storage = storage;
    }
		
    /**
    * Filename of an image.
    **/
    public String name;

    /**
    * Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
    **/
    public String format;

    /**
    * New width.
    **/
    public Integer newWidth;

    /**
    * New height.
    **/
    public Integer newHeight;

    /**
    * Path to updated file (if this is empty, response contains streamed image).
    **/
    public String outPath;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
