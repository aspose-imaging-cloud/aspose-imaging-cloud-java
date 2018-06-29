/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostImageGifRequest.java">
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
* Class that holds parameters for postImageGif request invocation.
**/   
public class PostImageGifRequest
{
	/**
	* Initializes a new instance of the PostImageGifRequest class.   
    * @param imageData Input image
    * @param backgroundColorIndex Index of the background color.
    * @param colorResolution Color resolution.
    * @param hasTrailer Specifies if image has trailer.
    * @param interlaced Specifies if image is interlaced.
    * @param isPaletteSorted Specifies if palette is sorted.
    * @param pixelAspectRatio Pixel aspect ratio.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
	**/
    public PostImageGifRequest(byte[] imageData, Integer backgroundColorIndex, Integer colorResolution, Boolean hasTrailer, Boolean interlaced, Boolean isPaletteSorted, Integer pixelAspectRatio, Boolean fromScratch, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.backgroundColorIndex = backgroundColorIndex;
        this.colorResolution = colorResolution;
        this.hasTrailer = hasTrailer;
        this.interlaced = interlaced;
        this.isPaletteSorted = isPaletteSorted;
        this.pixelAspectRatio = pixelAspectRatio;
        this.fromScratch = fromScratch;
        this.outPath = outPath;
        this.storage = storage;
    }
		
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Index of the background color.
    **/
    public Integer backgroundColorIndex;

    /**
    * Color resolution.
    **/
    public Integer colorResolution;

    /**
    * Specifies if image has trailer.
    **/
    public Boolean hasTrailer;

    /**
    * Specifies if image is interlaced.
    **/
    public Boolean interlaced;

    /**
    * Specifies if palette is sorted.
    **/
    public Boolean isPaletteSorted;

    /**
    * Pixel aspect ratio.
    **/
    public Integer pixelAspectRatio;

    /**
    * Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    **/
    public Boolean fromScratch;

    /**
    * Path to updated file (if this is empty, response contains streamed image).
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
