/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetObjectBoundsRequest.java">
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
* Class that holds parameters for GetObjectBounds request invocation.
**/   
public class GetObjectBoundsRequest
{
    /**
    * Initializes a new instance of the GetObjectBoundsRequest class.   
    * @param name Image file name.
    * @param method Object detection method
    * @param threshold Object detection probability threshold in percents
    * @param includeLabel Return detected objects labels
    * @param includeScore Return detected objects score
    * @param allowedLabels Comma-separated list of allowed labels
    * @param blockedLabels Comma-separated list of blocked labels
    * @param folder Folder
    * @param storage Storage
    **/
    public GetObjectBoundsRequest(String name, String method, Integer threshold, Boolean includeLabel, Boolean includeScore, String allowedLabels, String blockedLabels, String folder, String storage)             
    {
        this.name = name;
        this.method = method;
        this.threshold = threshold;
        this.includeLabel = includeLabel;
        this.includeScore = includeScore;
        this.allowedLabels = allowedLabels;
        this.blockedLabels = blockedLabels;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Image file name.
    **/
    public String name;

    /**
    * Object detection method
    **/
    public String method;

    /**
    * Object detection probability threshold in percents
    **/
    public Integer threshold;

    /**
    * Return detected objects labels
    **/
    public Boolean includeLabel;

    /**
    * Return detected objects score
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
    * Folder
    **/
    public String folder;

    /**
    * Storage
    **/
    public String storage;
}
