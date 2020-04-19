/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MoveFileRequest.java">
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
* Class that holds parameters for MoveFile request invocation.
**/   
public class MoveFileRequest
{
    /**
    * Initializes a new instance of the MoveFileRequest class.   
    * @param srcPath Source file path e.g. &#39;/src.ext&#39;
    * @param destPath Destination file path e.g. &#39;/dest.ext&#39;
    * @param srcStorageName Source storage name
    * @param destStorageName Destination storage name
    * @param versionId File version ID to move
    **/
    public MoveFileRequest(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId)             
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }
        
    /**
    * Source file path e.g. '/src.ext'
    **/
    public String srcPath;

    /**
    * Destination file path e.g. '/dest.ext'
    **/
    public String destPath;

    /**
    * Source storage name
    **/
    public String srcStorageName;

    /**
    * Destination storage name
    **/
    public String destStorageName;

    /**
    * File version ID to move
    **/
    public String versionId;
}
