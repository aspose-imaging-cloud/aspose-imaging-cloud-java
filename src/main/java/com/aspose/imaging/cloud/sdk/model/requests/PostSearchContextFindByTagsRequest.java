/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostSearchContextFindByTagsRequest.java">
<<<<<<< HEAD
*   Copyright (c) 2018 Aspose Pty Ltd.
=======
*   Copyright (c) 2018 Aspose.Imaging for Cloud
>>>>>>> SDK regenerated by CI server
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
* Class that holds parameters for postSearchContextFindByTags request invocation.
**/   
public class PostSearchContextFindByTagsRequest
{
	/**
	* Initializes a new instance of the PostSearchContextFindByTagsRequest class.   
<<<<<<< HEAD
    * @param tags Tags array for searching
=======
>>>>>>> SDK regenerated by CI server
    * @param searchContextId The search context identifier.
    * @param similarityThreshold The similarity threshold.
    * @param maxCount The maximum count.
	**/
<<<<<<< HEAD
    public PostSearchContextFindByTagsRequest(String tags, String searchContextId, Double similarityThreshold, Integer maxCount)             
    {
        this.tags = tags;
=======
    public PostSearchContextFindByTagsRequest(String searchContextId, Double similarityThreshold, Integer maxCount)             
    {
>>>>>>> SDK regenerated by CI server
        this.searchContextId = searchContextId;
        this.similarityThreshold = similarityThreshold;
        this.maxCount = maxCount;
    }
		
    /**
<<<<<<< HEAD
    * Tags array for searching
    **/
    public String tags;

    /**
=======
>>>>>>> SDK regenerated by CI server
    * The search context identifier.
    **/
    public String searchContextId;

    /**
    * The similarity threshold.
    **/
    public Double similarityThreshold;

    /**
    * The maximum count.
    **/
    public Integer maxCount;
}
