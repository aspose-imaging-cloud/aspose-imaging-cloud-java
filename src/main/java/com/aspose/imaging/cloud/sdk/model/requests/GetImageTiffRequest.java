/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageTiffRequest.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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
* Class that holds parameters for getImageTiff request invocation.
**/   
public class GetImageTiffRequest
{
	/**
	* Initializes a new instance of the GetImageTiffRequest class.   
    * @param name Filename of image.
    * @param compression Compression.
    * @param resolutionUnit New resolution unit.
    * @param bitDepth Bit depth.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param horizontalResolution New horizontal resolution.
    * @param verticalResolution New verstical resolution.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
	**/
    public GetImageTiffRequest(String name, String compression, String resolutionUnit, Integer bitDepth, Boolean fromScratch, Double horizontalResolution, Double verticalResolution, String outPath, String folder, String storage)             
    {
        this.name = name;
        this.compression = compression;
        this.resolutionUnit = resolutionUnit;
        this.bitDepth = bitDepth;
        this.fromScratch = fromScratch;
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
        this.outPath = outPath;
        this.folder = folder;
        this.storage = storage;
    }
		
    /**
    * Filename of image.
    **/
    public String name;

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
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
