/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageWebPRequest.java">
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
* Class that holds parameters for GetImageWebP request invocation.
**/   
public class GetImageWebPRequest
{
	/**
	* Initializes a new instance of the GetImageWebPRequest class.   
    * @param name Filename of image.
    * @param lossLess If WEBP is lossless.
    * @param quality Quality.
    * @param animLoopCount The animation loop count.
    * @param animBackgroundColor Color of the animation background.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
	**/
    public GetImageWebPRequest(String name, Boolean lossLess, Integer quality, Integer animLoopCount, String animBackgroundColor, Boolean fromScratch, String outPath, String folder, String storage)             
    {
        this.name = name;
        this.lossLess = lossLess;
        this.quality = quality;
        this.animLoopCount = animLoopCount;
        this.animBackgroundColor = animBackgroundColor;
        this.fromScratch = fromScratch;
        this.outPath = outPath;
        this.folder = folder;
        this.storage = storage;
    }
		
    /**
    * Filename of image.
    **/
    public String name;

    /**
    * If WEBP is lossless.
    **/
    public Boolean lossLess;

    /**
    * Quality.
    **/
    public Integer quality;

    /**
    * The animation loop count.
    **/
    public Integer animLoopCount;

    /**
    * Color of the animation background.
    **/
    public String animBackgroundColor;

    /**
    * Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    **/
    public Boolean fromScratch;

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
