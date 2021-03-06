/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ModifyEmfRequest.java">
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
* Class that holds parameters for ModifyEmf request invocation.
**/   
public class ModifyEmfRequest
{
    /**
    * Initializes a new instance of the ModifyEmfRequest class.   
    * @param name Filename of image.
    * @param bkColor Color of the background.
    * @param pageWidth Width of the page.
    * @param pageHeight Height of the page.
    * @param borderX Border width.
    * @param borderY Border height.
    * @param fromScratch Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    * @param format Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public ModifyEmfRequest(String name, String bkColor, Integer pageWidth, Integer pageHeight, Integer borderX, Integer borderY, Boolean fromScratch, String folder, String storage, String format)             
    {
        this.name = name;
        this.bkColor = bkColor;
        this.pageWidth = pageWidth;
        this.pageHeight = pageHeight;
        this.borderX = borderX;
        this.borderY = borderY;
        this.fromScratch = fromScratch;
        this.folder = folder;
        this.storage = storage;
        this.format = format;
    }
        
    /**
    * Filename of image.
    **/
    public String name;

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
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;

    /**
    * Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public String format;
}
