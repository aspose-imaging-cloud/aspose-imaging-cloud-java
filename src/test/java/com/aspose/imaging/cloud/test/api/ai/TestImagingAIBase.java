package com.aspose.imaging.cloud.test.api.ai;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.model.SearchContextStatus;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import java.nio.file.Paths;

import org.apache.commons.lang.StringUtils;
import org.junit.*;

public abstract class TestImagingAIBase extends ApiTester {

	@BeforeClass
	public static void initTest() throws Exception {
		SearchContextId = createSearchContext();
	}

	@AfterClass
	public static void finalizeTest() throws Exception {
		if (StringUtils.isNotEmpty(SearchContextId)) {
			deleteSearchContext(SearchContextId);
		}

		if (StorageApi.GetIsExist(TempFolder, null, DefaultStorage).getFileExist().getIsExist()) {
			StorageApi.DeleteFolder(TempFolder, DefaultStorage, true);
		}
	}

	protected static String SearchContextId;

	protected final static String OriginalDataFolder = "ImagingAI";

	protected final static String TempFolder = "TempImagingAI";

	protected static String getStoragePath(String imageName, String folder) {
		return Paths.get((folder != null ? folder : OriginalDataFolder), imageName).toString();
	}

	protected static String createSearchContext() throws Exception {
		ApiResponse response = ImagingApi
				.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, DefaultStorage));

		SearchContextStatus status = (SearchContextStatus) response.getSaaSposeResponse();
		Assert.assertEquals((long)200, (long)status.getCode());
		return status.getId();
	}

	protected static void deleteSearchContext(String searchContextId) throws Exception {
		ImagingApi.deleteSearchContext(new DeleteSearchContextRequest(searchContextId, null, DefaultStorage));
	}

	protected static String getSearchContextStatus(String searchContextId) throws Exception {
		ApiResponse response = ImagingApi
				.getSearchContextStatus(new GetSearchContextStatusRequest(SearchContextId, null, DefaultStorage));
		SearchContextStatus status = (SearchContextStatus) response.getSaaSposeResponse();
		Assert.assertEquals((long)200, (long)status.getCode());
		return status.getSearchStatus();
	}

	protected static void addImageFeaturesToSearchContext(String storageSourcePath, Boolean isFolder) throws Exception {
		
		PostSearchContextExtractImageFeaturesRequest request = isFolder 
				  ? new PostSearchContextExtractImageFeaturesRequest(SearchContextId, null, storageSourcePath, null, null, DefaultStorage)
				 : new  PostSearchContextExtractImageFeaturesRequest(SearchContextId, null, null,  storageSourcePath, null,  DefaultStorage);
		  ImagingApi.postSearchContextExtractImageFeatures(request);		 
	}
}