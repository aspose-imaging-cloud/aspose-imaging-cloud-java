/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetSearchContextFindDuplicatesRequest.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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
* Class that holds parameters for getSearchContextFindDuplicates request invocation.
**/   
public class GetSearchContextFindDuplicatesRequest
{
	/**
	* Initializes a new instance of the GetSearchContextFindDuplicatesRequest class.   
    * @param searchContextId The search context identifier.
    * @param similarityThreshold The similarity threshold.
    * @param folder The folder.
    * @param storage The storage.
	**/
    public GetSearchContextFindDuplicatesRequest(String searchContextId, Double similarityThreshold, String folder, String storage)             
    {
        this.searchContextId = searchContextId;
        this.similarityThreshold = similarityThreshold;
        this.folder = folder;
        this.storage = storage;
    }
		
    /**
    * The search context identifier.
    **/
    public String searchContextId;

    /**
    * The similarity threshold.
    **/
    public Double similarityThreshold;

    /**
    * The folder.
    **/
    public String folder;

    /**
    * The storage.
    **/
    public String storage;
}
