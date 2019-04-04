/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FindImagesTests.java">
*   Copyright (c) 2019  Aspose Pty Ltd.
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

package com.aspose.imaging.cloud.test.api.ai;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.DownloadFileRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextFindSimilarRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextAddTagRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextFindByTagsRequest;
import com.google.gson.Gson;

public class FindImagesTests extends TestImagingAIBase {
    
     private final String ImageToFind = "4.jpg";
     private final String ImageToFindByTag = "ComparingImageSimilar75.jpg";

     @Test
     public void findSimilarImagesTest() throws Exception
     {
         addImageFeaturesToSearchContext(OriginalDataFolder + "/FindSimilar", true);
         String findImageId = OriginalDataFolder +"/FindSimilar/"+ImageToFind;
         SearchResultsSet result = ImagingApi.getSearchContextFindSimilar(
                 new GetSearchContextFindSimilarRequest(SearchContextId, 3.0, 3, null, findImageId, null, TestStorage));

         Assert.assertTrue(result.getResults().size() >= 1);       
     }

     @Test
     public void findSimilarImagesByTagTest() throws Exception
     {
         addImageFeaturesToSearchContext(OriginalDataFolder +"/FindSimilar", true);

         String tag = "TestTag";

         String storagePath = OriginalDataFolder + "/" + ImageToFindByTag;
         byte[] imageData = ImagingApi.downloadFile(new DownloadFileRequest(storagePath, TestStorage, null));
         
         ImagingApi.postSearchContextAddTag(
                 new PostSearchContextAddTagRequest(imageData, SearchContextId, tag, null, TestStorage));           

         List<String> tagsList = new ArrayList<String>();
         tagsList.add(tag);
         String tags = new Gson().toJson(tagsList);
         SearchResultsSet result = ImagingApi.postSearchContextFindByTags(
             new PostSearchContextFindByTagsRequest(tags, SearchContextId, 60.0, 5, null, TestStorage));
       
         Assert.assertEquals(1, result.getResults().size());  
         Assert.assertTrue(result.getResults().get(0).getImageId().contains("2.jpg"));  
     }
}