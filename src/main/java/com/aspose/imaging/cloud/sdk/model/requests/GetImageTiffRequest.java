/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageTiffRequest.java">
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
* Class that holds parameters for GetImageTiff request invocation.
**/   
public class GetImageTiffRequest
{
    /**
    * Initializes a new instance of the GetImageTiffRequest class.   
    * @param name Filename of image.
    * @param bitDepth Bit depth.
    * @param compression Compression (none is default). Please, refer to https://apireference.aspose.com/net/imaging/aspose.imaging.fileformats.tiff.enums/tiffcompressions for all possible values.
    * @param resolutionUnit New resolution unit (none - the default one, inch or centimeter).
    * @param horizontalResolution New horizontal resolution.
    * @param verticalResolution New vertical resolution.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public GetImageTiffRequest(String name, Integer bitDepth, String compression, String resolutionUnit, Double horizontalResolution, Double verticalResolution, Boolean fromScratch, String folder, String storage)             
    {
        this.name = name;
        this.bitDepth = bitDepth;
        this.compression = compression;
        this.resolutionUnit = resolutionUnit;
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
        this.fromScratch = fromScratch;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Filename of image.
    **/
    public String name;

    /**
    * Bit depth.
    **/
    public Integer bitDepth;

    /**
    * Compression (none is default). Please, refer to https://apireference.aspose.com/net/imaging/aspose.imaging.fileformats.tiff.enums/tiffcompressions for all possible values.
    **/
    public String compression;

    /**
    * New resolution unit (none - the default one, inch or centimeter).
    **/
    public String resolutionUnit;

    /**
    * New horizontal resolution.
    **/
    public Double horizontalResolution;

    /**
    * New vertical resolution.
    **/
    public Double verticalResolution;

    /**
    * Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    **/
    public Boolean fromScratch;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
