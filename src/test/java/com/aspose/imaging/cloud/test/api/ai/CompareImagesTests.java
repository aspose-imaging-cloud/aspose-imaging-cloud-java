package com.aspose.imaging.cloud.test.api.ai;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextCompareImagesRequest;
import com.aspose.storage.model.ResponseMessage;

public class CompareImagesTests extends TestImagingAIBase{
	 private final String ComparableImage = "ComparableImage.jpg";
     private final String ComparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";
     private final String ComparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";

     @Test
     public void compareTwoImagesInSearchContextTest() throws Exception
     {
         String image1 = getStoragePath(ComparableImage,null);
         addImageFeaturesToSearchContext(image1, false);

         String image2 = getStoragePath(ComparingImageSimilarMore75,null);
         addImageFeaturesToSearchContext(image2, false);

         ApiResponse response = ImagingApi.postSearchContextCompareImages(
             new PostSearchContextCompareImagesRequest(SearchContextId, image1, null, image2, null, DefaultStorage));

         SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse();
         Assert.assertEquals(1, result.getResults().size());
         Assert.assertTrue(result.getResults().get(0).getSimilarity() >= 70);
     }

     @Test
     public void compareLoadedImageToImageInSearchContextTest() throws Exception
     {
         String image = getStoragePath(ComparableImage, null);
         addImageFeaturesToSearchContext(image, false);

         String storagePath = OriginalDataFolder + "/" + ComparingImageSimilarLess15;

         ResponseMessage imageResponse = StorageApi.GetDownload(storagePath, null, DefaultStorage);
         Assert.assertNotNull(imageResponse);         
         byte[] imageData = StreamHelper.readAsBytes(imageResponse.getInputStream());

         ApiResponse response = ImagingApi.postSearchContextCompareImages(
             new PostSearchContextCompareImagesRequest(SearchContextId, image, imageData, null, null, DefaultStorage));

         SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse();
         Assert.assertEquals((long)200, (long)result.getCode());
         Assert.assertEquals(1, result.getResults().size());
         Assert.assertTrue(result.getResults().get(0).getSimilarity() <= 15);
     }
}
