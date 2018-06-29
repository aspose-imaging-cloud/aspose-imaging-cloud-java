package com.aspose.imaging.cloud.test.api.ai;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.model.ImageDuplicatesSet;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextFindDuplicatesRequest;

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