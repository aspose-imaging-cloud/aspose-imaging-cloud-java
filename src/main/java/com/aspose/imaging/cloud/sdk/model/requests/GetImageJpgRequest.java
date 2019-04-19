/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageJpgRequest.java">
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
* Class that holds parameters for GetImageJpg request invocation.
**/   
public class GetImageJpgRequest
{
    /**
    * Initializes a new instance of the GetImageJpgRequest class.   
    * @param name Filename of image.
    * @param quality Quality of an image from 0 to 100. Default is 75.
    * @param compressionType Compression type.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public GetImageJpgRequest(String name, Integer quality, String compressionType, Boolean fromScratch, String outPath, String folder, String storage)             
    {
        this.name = name;
        this.quality = quality;
        this.compressionType = compressionType;
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
    * Quality of an image from 0 to 100. Default is 75.
    **/
    public Integer quality;

    /**
    * Compression type.
    **/
    public String compressionType;

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
