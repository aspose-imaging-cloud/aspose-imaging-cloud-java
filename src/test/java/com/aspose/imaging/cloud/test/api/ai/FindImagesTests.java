package com.aspose.imaging.cloud.test.api.ai;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextFindSimilarRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextAddTagRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextFindByTagsRequest;
import com.aspose.storage.model.ResponseMessage;
import com.google.gson.Gson;

public class FindImagesTests extends TestImagingAIBase {
	
	 private final String ImageToFind = "4.jpg";
     private final String ImageToFindByTag = "ComparingImageSimilar75.jpg";

     @Test
     public void findSimilarImagesTest() throws Exception
     {
         addImageFeaturesToSearchContext(OriginalDataFolder +"/FindSimilar", true);
         String findImageId = OriginalDataFolder +"/FindSimilar/"+ImageToFind;
         ApiResponse response = ImagingApi.getSearchContextFindSimilar(
        		 new GetSearchContextFindSimilarRequest(SearchContextId, 3.0, 3, null, findImageId, null, DefaultStorage));

         SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse();
         Assert.assertEquals((long)200, (long)result.getCode());
         Assert.assertEquals(2, result.getResults().size());       
     }

     @Test
     public void findSimilarImagesByTagTest() throws Exception
     {
         addImageFeaturesToSearchContext(OriginalDataFolder +"/FindSimilar", true);

         String tag = "TestTag";

         String storagePath = OriginalDataFolder + "/" + ImageToFindByTag;

         ResponseMessage tagImageStream = StorageApi.GetDownload(storagePath, null, DefaultStorage);
         Assert.assertNotNull(tagImageStream);         
         byte[] imageData = StreamHelper.readAsBytes(tagImageStream.getInputStream());
         
         ImagingApi.postSearchContextAddTag(
        		 new PostSearchContextAddTagRequest(imageData, SearchContextId, tag, null, DefaultStorage));
           

         List<String> tagsList = new ArrayList<String>();
         tagsList.add(tag);
         String tags = "[\"TestTag\"]";//new Gson().toJson(tagsList);
         ApiResponse response = ImagingApi.postSearchContextFindByTags(
             new PostSearchContextFindByTagsRequest(tags, SearchContextId, 60.0, 5, null, DefaultStorage));
       
         SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse();
         Assert.assertEquals((long)200, (long)result.getCode());
         Assert.assertEquals(1, result.getResults().size());  
         Assert.assertTrue(result.getResults().get(0).getImageId().contains("2.jpg"));  
     }
}