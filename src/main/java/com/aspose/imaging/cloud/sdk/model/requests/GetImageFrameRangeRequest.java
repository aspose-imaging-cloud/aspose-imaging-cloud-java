/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetImageFrameRangeRequest.java">
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
* Class that holds parameters for GetImageFrameRange request invocation.
**/   
public class GetImageFrameRangeRequest
{
    /**
    * Initializes a new instance of the GetImageFrameRangeRequest class.   
    * @param name Filename of image.
    * @param startFrameId Index of the first frame in range.
    * @param endFrameId Index of the last frame in range.
    * @param newWidth New width.
    * @param newHeight New height.
    * @param x X position of start point for cropping rectangle.
    * @param y Y position of start point for cropping rectangle.
    * @param rectWidth Width of cropping rectangle.
    * @param rectHeight Height of cropping rectangle.
    * @param rotateFlipMethod RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone.
    * @param saveOtherFrames If result will include all other frames or just a specified frame.
    * @param folder Folder with image to process.
    * @param storage Your Aspose Cloud Storage name.
    **/
    public GetImageFrameRangeRequest(String name, Integer startFrameId, Integer endFrameId, Integer newWidth, Integer newHeight, Integer x, Integer y, Integer rectWidth, Integer rectHeight, String rotateFlipMethod, Boolean saveOtherFrames, String folder, String storage)             
    {
        this.name = name;
        this.startFrameId = startFrameId;
        this.endFrameId = endFrameId;
        this.newWidth = newWidth;
        this.newHeight = newHeight;
        this.x = x;
        this.y = y;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.rotateFlipMethod = rotateFlipMethod;
        this.saveOtherFrames = saveOtherFrames;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Filename of image.
    **/
    public String name;

    /**
    * Index of the first frame in range.
    **/
    public Integer startFrameId;

    /**
    * Index of the last frame in range.
    **/
    public Integer endFrameId;

    /**
    * New width.
    **/
    public Integer newWidth;

    /**
    * New height.
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
    * If result will include all other frames or just a specified frame.
    **/
    public Boolean saveOtherFrames;

    /**
    * Folder with image to process.
    **/
    public String folder;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
