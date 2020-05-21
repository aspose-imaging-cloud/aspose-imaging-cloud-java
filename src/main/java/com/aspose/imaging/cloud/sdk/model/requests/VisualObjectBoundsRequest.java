/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="VisualObjectBoundsRequest.java">
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
* Class that holds parameters for VisualObjectBounds request invocation.
**/   
public class VisualObjectBoundsRequest
{
    /**
    * Initializes a new instance of the VisualObjectBoundsRequest class.   
    * @param name The image features detector.
    * @param method Object detection method
    * @param threshold Object detection probability threshold in percents
    * @param includeClass Draw detected objects classes
    * @param includeScore Draw detected objects scores
    * @param folder The folder.
    * @param storage The storage.
    **/
    public VisualObjectBoundsRequest(String name, String method, Integer threshold, Boolean includeClass, Boolean includeScore, String folder, String storage)             
    {
        this.name = name;
        this.method = method;
        this.threshold = threshold;
        this.includeClass = includeClass;
        this.includeScore = includeScore;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * The image features detector.
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
    * Draw detected objects classes
    **/
    public Boolean includeClass;

    /**
    * Draw detected objects scores
    **/
    public Boolean includeScore;

    /**
    * The folder.
    **/
    public String folder;

    /**
    * The storage.
    **/
    public String storage;
}

