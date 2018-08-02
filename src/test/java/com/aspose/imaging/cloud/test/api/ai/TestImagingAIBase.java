/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TestImagingAIBase.java">
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

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.model.SearchContextStatus;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.test.base.ApiTester;
import com.aspose.imaging.cloud.test.categories.AITestCategory;

import org.apache.commons.lang.StringUtils;
import org.junit.*;
import org.junit.experimental.categories.Category;

public abstract class TestImagingAIBase extends ApiTester {

	protected static int WaitTimeoutInSeconds = 300;
	
	@Before
	public void initTest() throws Exception {
		SearchContextId = createSearchContext();
	}

	@After
	public void finalizeTest() throws Exception {
		if (StringUtils.isNotEmpty(SearchContextId)) {
			deleteSearchContext(SearchContextId);
		}

		if (StorageApi.GetIsExist(TempFolder, null, TestStorage).getFileExist().getIsExist()) {
			StorageApi.DeleteFolder(TempFolder, TestStorage, true);
		}
	}

	protected String SearchContextId;

	protected final static String OriginalDataFolder = "ImagingAI";

	protected final static String TempFolder = "TempImagingAI";

	protected static String getStoragePath(String imageName, String folder) {
		return (folder != null ? folder : OriginalDataFolder) + "/" + imageName;
	}

	protected static String createSearchContext() throws Exception {
		ApiResponse response = ImagingApi
				.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, TestStorage));

		SearchContextStatus status = (SearchContextStatus) response.getSaaSposeResponse();
		Assert.assertEquals((long) 200, (long) status.getCode());
		return status.getId();
	}

	protected void deleteSearchContext(String searchContextId) throws Exception {
		ImagingApi.deleteSearchContext(new DeleteSearchContextRequest(searchContextId, null, TestStorage));
	}

	protected String getSearchContextStatus(String searchContextId) throws Exception {
		ApiResponse response = ImagingApi
				.getSearchContextStatus(new GetSearchContextStatusRequest(SearchContextId, null, TestStorage));
		SearchContextStatus status = (SearchContextStatus) response.getSaaSposeResponse();
		Assert.assertEquals((long) 200, (long) status.getCode());
		return status.getSearchStatus();
	}

	protected  void addImageFeaturesToSearchContext(String storageSourcePath, Boolean isFolder) throws Exception {
		
		PostSearchContextExtractImageFeaturesRequest request = isFolder 
				 ? new PostSearchContextExtractImageFeaturesRequest(SearchContextId, null, null,  storageSourcePath, null,  TestStorage)
				 : new PostSearchContextExtractImageFeaturesRequest(SearchContextId, null, storageSourcePath, null, null, TestStorage);
		  ImagingApi.postSearchContextExtractImageFeatures(request);		 
		waitSearchContextIdle();		
	}

	protected void waitSearchContextIdle() throws Exception {
		waitSearchContextIdle(WaitTimeoutInSeconds);
	}

	protected void waitSearchContextIdle(int maxTimeInSeconds) throws Exception {
		int timeout = 10;		
		String status = "unknown";
		
		long startTime = System.currentTimeMillis();

		while (!"Idle".equalsIgnoreCase(status) && (System.currentTimeMillis() - startTime) * 1000 < maxTimeInSeconds) {
			ApiResponse response = ImagingApi.getSearchContextStatus(
					new GetSearchContextStatusRequest(this.SearchContextId, null, DefaultStorage));
			SearchContextStatus contextStatus = (SearchContextStatus) response.getSaaSposeResponse();
			status = contextStatus.getSearchStatus();
			Thread.sleep(timeout * 1000);
		}
	}
}