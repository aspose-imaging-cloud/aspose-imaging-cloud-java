/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateModifiedWmfRequest.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
* Class that holds parameters for CreateModifiedWmf request invocation.
**/   
public class CreateModifiedWmfRequest
{
    /**
    * Initializes a new instance of the CreateModifiedWmfRequest class.   
    * @param imageData Input image
    * @param bkColor Color of the background.
    * @param pageWidth Width of the page.
    * @param pageHeight Height of the page.
    * @param borderX Border width.
    * @param borderY Border height.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
    * @param format Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public CreateModifiedWmfRequest(byte[] imageData, String bkColor, Integer pageWidth, Integer pageHeight, Integer borderX, Integer borderY, Boolean fromScratch, String outPath, String storage, String format)             
    {
        this.imageData = imageData;
        this.bkColor = bkColor;
        this.pageWidth = pageWidth;
        this.pageHeight = pageHeight;
        this.borderX = borderX;
        this.borderY = borderY;
        this.fromScratch = fromScratch;
        this.outPath = outPath;
        this.storage = storage;
        this.format = format;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Color of the background.
    **/
    public String bkColor;

    /**
    * Width of the page.
    **/
    public Integer pageWidth;

    /**
    * Height of the page.
    **/
    public Integer pageHeight;

    /**
    * Border width.
    **/
    public Integer borderX;

    /**
    * Border height.
    **/
    public Integer borderY;

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

    /**
    * Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public String format;
}
