/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostImageCropRequest.java">
*   Copyright (c) 2018 Aspose Pty Ltd. All rights reserved.
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
* Class that holds parameters for PostImageCrop request invocation.
**/   
public class PostImageCropRequest
{
	/**
	* Initializes a new instance of the PostImageCropRequest class.   
    * @param imageData Input image
    * @param format Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
    * @param x X position of start point for cropping rectangle.
    * @param y Y position of start point for cropping rectangle.
    * @param width Width of cropping rectangle.
    * @param height Height of cropping rectangle.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
	**/
    public PostImageCropRequest(byte[] imageData, String format, Integer x, Integer y, Integer width, Integer height, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.format = format;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.outPath = outPath;
        this.storage = storage;
    }
		
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
    **/
    public String format;

    /**
    * X position of start point for cropping rectangle.
    **/
    public Integer x;

    /**
    * Y position of start point for cropping rectangle.
    **/
    public Integer y;

    /**
    * Width of cropping rectangle.
    **/
    public Integer width;

    /**
    * Height of cropping rectangle.
    **/
    public Integer height;

    /**
    * Path to updated file (if this is empty, response contains streamed image).
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
