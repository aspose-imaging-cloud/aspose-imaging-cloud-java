/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateModifiedJpegRequest.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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

import com.aspose.imaging.cloud.sdk.model.*;

/**
* Class that holds parameters for CreateModifiedJpeg request invocation.
**/   
public class CreateModifiedJpegRequest
{
    /**
    * Initializes a new instance of the CreateModifiedJpegRequest class.   
    * @param imageData Input image
    * @param quality Quality of an image from 0 to 100. Default is 75.
    * @param compressionType Compression type: baseline (default), progressive, lossless or jpegls.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
    **/
    public CreateModifiedJpegRequest(byte[] imageData, Integer quality, String compressionType, Boolean fromScratch, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.quality = quality;
        this.compressionType = compressionType;
        this.fromScratch = fromScratch;
        this.outPath = outPath;
        this.storage = storage;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Quality of an image from 0 to 100. Default is 75.
    **/
    public Integer quality;

    /**
    * Compression type: baseline (default), progressive, lossless or jpegls.
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
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
