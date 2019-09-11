/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateModifiedSvgRequest.java">
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
* Class that holds parameters for CreateModifiedSvg request invocation.
**/   
public class CreateModifiedSvgRequest
{
    /**
    * Initializes a new instance of the CreateModifiedSvgRequest class.   
    * @param imageData Input image
    * @param colorType Color type for SVG image. Only RGB is supported for now.
    * @param textAsShapes Whether text must be converted as shapes. true if all text is turned into SVG shapes in the convertion; otherwise, false
    * @param scaleX Scale X.
    * @param scaleY Scale Y.
    * @param pageWidth Width of the page.
    * @param pageHeight Height of the page.
    * @param borderX Border width. Only 0 is supported for now.
    * @param borderY Border height. Only 0 is supported for now.
    * @param bkColor Background color (Default is white).
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
    * @param format Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public CreateModifiedSvgRequest(byte[] imageData, String colorType, Boolean textAsShapes, Double scaleX, Double scaleY, Integer pageWidth, Integer pageHeight, Integer borderX, Integer borderY, String bkColor, Boolean fromScratch, String outPath, String storage, String format)             
    {
        this.imageData = imageData;
        this.colorType = colorType;
        this.textAsShapes = textAsShapes;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.pageWidth = pageWidth;
        this.pageHeight = pageHeight;
        this.borderX = borderX;
        this.borderY = borderY;
        this.bkColor = bkColor;
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
    * Color type for SVG image. Only RGB is supported for now.
    **/
    public String colorType;

    /**
    * Whether text must be converted as shapes. true if all text is turned into SVG shapes in the convertion; otherwise, false
    **/
    public Boolean textAsShapes;

    /**
    * Scale X.
    **/
    public Double scaleX;

    /**
    * Scale Y.
    **/
    public Double scaleY;

    /**
    * Width of the page.
    **/
    public Integer pageWidth;

    /**
    * Height of the page.
    **/
    public Integer pageHeight;

    /**
    * Border width. Only 0 is supported for now.
    **/
    public Integer borderX;

    /**
    * Border height. Only 0 is supported for now.
    **/
    public Integer borderY;

    /**
    * Background color (Default is white).
    **/
    public String bkColor;

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
