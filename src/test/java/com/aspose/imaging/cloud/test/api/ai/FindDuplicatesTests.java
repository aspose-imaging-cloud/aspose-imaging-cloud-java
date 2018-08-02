/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FindDuplicatesTests.java">
*   Copyright (c) 2018  Aspose Pty Ltd. All rights reserved.
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

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.model.ImageDuplicatesSet;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextFindDuplicatesRequest;
import com.aspose.imaging.cloud.test.categories.AITestCategory;

@Category(AITestCategory.class)
public class FindDuplicatesTests extends TestImagingAIBase{
	
	 private final String ComparableImage = "ComparableImage.jpg";
     private final String ComparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";
     private final String ComparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";
     
     @Test
    public void findDuplicatesTest() throws Exception
    {
        addImageFeaturesToSearchContext(OriginalDataFolder +"/FindSimilar", true);

        String image = getStoragePath(ComparableImage, null);
        addImageFeaturesToSearchContext(image, false);

        image = getStoragePath(ComparingImageSimilarLess15, null);
        addImageFeaturesToSearchContext(image, false);

        image = getStoragePath(ComparingImageSimilarMore75, null);
        addImageFeaturesToSearchContext(image, false);

        ApiResponse response = ImagingApi.getSearchContextFindDuplicates(
            new GetSearchContextFindDuplicatesRequest(SearchContextId, 80.0, null,null));
        
        ImageDuplicatesSet result = (ImageDuplicatesSet)response.getSaaSposeResponse();
        Assert.assertEquals((long)200, (long)result.getCode());
        Assert.assertEquals(1, result.getDuplicates().size());
    } 
}