/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateObjectBoundsRequest.java">
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
* Class that holds parameters for CreateObjectBounds request invocation.
**/   
public class CreateObjectBoundsRequest
{
    /**
    * Initializes a new instance of the CreateObjectBoundsRequest class.   
    * @param imageData Input image
    * @param method Object detection method
    * @param threshold Object detection probability threshold in percents
    * @param includeLabel Draw detected objects labels
    * @param includeScore Draw detected objects scores
    * @param allowedLabels Comma-separated list of allowed labels
    * @param blockedLabels Comma-separated list of blocked labels
    * @param outPath Path to updated file (if this is empty, response contains streamed image)
    * @param storage Your Aspose Cloud Storage name.
    **/
    public CreateObjectBoundsRequest(byte[] imageData, String method, Integer threshold, Boolean includeLabel, Boolean includeScore, String allowedLabels, String blockedLabels, String outPath, String storage)             
    {
        this.imageData = imageData;
        this.method = method;
        this.threshold = threshold;
        this.includeLabel = includeLabel;
        this.includeScore = includeScore;
        this.allowedLabels = allowedLabels;
        this.blockedLabels = blockedLabels;
        this.outPath = outPath;
        this.storage = storage;
    }
        
    /**
    * Input image
    **/
    public byte[] imageData;

    /**
    * Object detection method
    **/
    public String method;

    /**
    * Object detection probability threshold in percents
    **/
    public Integer threshold;

    /**
    * Draw detected objects labels
    **/
    public Boolean includeLabel;

    /**
    * Draw detected objects scores
    **/
    public Boolean includeScore;

    /**
    * Comma-separated list of allowed labels
    **/
    public String allowedLabels;

    /**
    * Comma-separated list of blocked labels
    **/
    public String blockedLabels;

    /**
    * Path to updated file (if this is empty, response contains streamed image)
    **/
    public String outPath;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;
}
