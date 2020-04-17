/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateDeskewedImageRequest.java">
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
* Class that holds parameters for CreateDeskewedImage request invocation.
**/   
public class CreateDeskewedImageRequest
{
    /**
    * Initializes a new instance of the CreateDeskewedImageRequest class.   
    * @param imageData Input image
    * @param resizeProportionally Resize proportionally
    * @param bkColor Background color
    * @param outPath Path to updated file (if this is empty, response contains streamed image)
    * @param storage Your Aspose Cloud Storage name.
    **/
    public CreateDeskewedImageRequest(byte[] imageData, Boolean resizeProportionally, String bkColor, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.resizeProportionally = resizeProportionally;
        this.bkColor = bkColor;
        this.outPath = outPath;
        this.storage = storage;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Resize proportionally
    **/
    public Boolean resizeProportionally;

    /**
    * Background color
    **/
    public String bkColor;

    /**
    * Path to updated file (if this is empty, response contains streamed image)
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
