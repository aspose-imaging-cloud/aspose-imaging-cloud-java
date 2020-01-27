/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CropImageRequest.java">
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

import com.aspose.imaging.cloud.sdk.model.*;

/**
* Class that holds parameters for CropImage request invocation.
**/   
public class CropImageRequest
{
    /**
    * Initializes a new instance of the CropImageRequest class.   
    * @param name Filename of an image.
    * @param x X position of start point for cropping rectangle.
    * @param y Y position of start point for cropping rectangle.
    * @param width Width of cropping rectangle
    * @param height Height of cropping rectangle.
    * @param format Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public CropImageRequest(String name, Integer x, Integer y, Integer width, Integer height, String format, String folder, String storage)             
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.format = format;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Filename of an image.
    **/
    public String name;

    /**
    * X position of start point for cropping rectangle.
    **/
    public Integer x;

    /**
    * Y position of start point for cropping rectangle.
    **/
    public Integer y;

    /**
    * Width of cropping rectangle
    **/
    public Integer width;

    /**
    * Height of cropping rectangle.
    **/
    public Integer height;

    /**
    * Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public String format;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
