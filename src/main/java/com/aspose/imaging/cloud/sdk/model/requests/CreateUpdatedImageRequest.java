/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateUpdatedImageRequest.java">
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
* Class that holds parameters for CreateUpdatedImage request invocation.
**/   
public class CreateUpdatedImageRequest
{
    /**
    * Initializes a new instance of the CreateUpdatedImageRequest class.   
    * @param imageData Input image
    * @param format Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    * @param newWidth New width of the scaled image.
    * @param newHeight New height of the scaled image.
    * @param x X position of start point for cropping rectangle.
    * @param y Y position of start point for cropping rectangle.
    * @param rectWidth Width of cropping rectangle.
    * @param rectHeight Height of cropping rectangle.
    * @param rotateFlipMethod RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone.
    * @param outPath Path to updated file (if this is empty, response contains streamed image).
    * @param storage Your Aspose Cloud Storage name.
    **/
    public CreateUpdatedImageRequest(byte[] imageData, String format, Integer newWidth, Integer newHeight, Integer x, Integer y, Integer rectWidth, Integer rectHeight, String rotateFlipMethod, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.format = format;
        this.newWidth = newWidth;
        this.newHeight = newHeight;
        this.x = x;
        this.y = y;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.rotateFlipMethod = rotateFlipMethod;
        this.outPath = outPath;
        this.storage = storage;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases.
    **/
    public String format;

    /**
    * New width of the scaled image.
    **/
    public Integer newWidth;

    /**
    * New height of the scaled image.
    **/
    public Integer newHeight;

    /**
    * X position of start point for cropping rectangle.
    **/
    public Integer x;

    /**
    * Y position of start point for cropping rectangle.
    **/
    public Integer y;

    /**
    * Width of cropping rectangle.
    **/
    public Integer rectWidth;

    /**
    * Height of cropping rectangle.
    **/
    public Integer rectHeight;

    /**
    * RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone.
    **/
    public String rotateFlipMethod;

    /**
    * Path to updated file (if this is empty, response contains streamed image).
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
