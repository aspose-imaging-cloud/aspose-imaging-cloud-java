/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostTiffAppendRequest.java">
*   Copyright (c) 2018 Aspose Pty Ltd. All rights reserved.
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
* Class that holds parameters for PostTiffAppend request invocation.
**/   
public class PostTiffAppendRequest
{
	/**
	* Initializes a new instance of the PostTiffAppendRequest class.   
    * @param name Original image file name.
    * @param appendFile Image file name to be appended to original one.
    * @param storage Your Aspose Cloud Storage name.
    * @param folder Folder with images to process.
	**/
    public PostTiffAppendRequest(String name, String appendFile, String storage, String folder)             
    {
        this.name = name;
        this.appendFile = appendFile;
        this.storage = storage;
        this.folder = folder;
    }
		
    /**
    * Original image file name.
    **/
    public String name;

    /**
    * Image file name to be appended to original one.
    **/
    public String appendFile;

    /**
    * Your Aspose Cloud Storage name.
    **/
    public String storage;

    /**
    * Folder with images to process.
    **/
    public String folder;
}
