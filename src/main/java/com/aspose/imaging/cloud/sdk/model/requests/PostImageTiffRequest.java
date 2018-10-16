/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostImageTiffRequest.java">
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
* Class that holds parameters for PostImageTiff request invocation.
**/   
public class PostImageTiffRequest
{
	/**
	* Initializes a new instance of the PostImageTiffRequest class.   
    * @param imageData Input image
    * @param compression Compression.
    * @param resolutionUnit New resolution unit.
    * @param bitDepth Bit depth.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param horizontalResolution New horizontal resolution.
    * @param verticalResolution New verstical resolution.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
	**/
    public PostImageTiffRequest(byte[] imageData, String compression, String resolutionUnit, Integer bitDepth, Boolean fromScratch, Double horizontalResolution, Double verticalResolution, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.compression = compression;
        this.resolutionUnit = resolutionUnit;
        this.bitDepth = bitDepth;
        this.fromScratch = fromScratch;
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
        this.outPath = outPath;
        this.storage = storage;
    }
		
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Compression.
    **/
    public String compression;

    /**
    * New resolution unit.
    **/
    public String resolutionUnit;

    /**
    * Bit depth.
    **/
    public Integer bitDepth;

    /**
    * Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    **/
    public Boolean fromScratch;

    /**
    * New horizontal resolution.
    **/
    public Double horizontalResolution;

    /**
    * New verstical resolution.
    **/
    public Double verticalResolution;

    /**
    * Path to updated file (if this is empty, response contains streamed image).
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
