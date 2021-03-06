/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TestImagingAIBase.java">
*   Copyright (c) 2018-2019  Aspose Pty Ltd.
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

import com.aspose.imaging.cloud.sdk.model.SearchContextStatus;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import org.apache.commons.lang3.StringUtils;
import org.junit.*;

public abstract class TestImagingAIBase extends ApiTester {

    protected static int WaitTimeoutInSeconds = 300;
    
    @Before
    public void initTest() throws Exception {
        SearchContextId = createSearchContext();
    }

    @After
    public void finalizeTest() throws Exception {
        if (StringUtils.isNotEmpty(SearchContextId)) {
            deleteImageSearch(SearchContextId);
        }

        if (ImagingApi.objectExists(new ObjectExistsRequest(getTempFolder(), TestStorage, null)).isExists()) {
            ImagingApi.deleteFolder(new DeleteFolderRequest(getTempFolder(), TestStorage, true));
        }
    }

    protected String SearchContextId;

    protected final static String OriginalDataFolder = ApiTester.OriginalDataFolder + "/AI";

    protected static String getStoragePath(String imageName, String folder) {
        return (folder != null ? folder : OriginalDataFolder) + "/" + imageName;
    }

    protected static String createSearchContext() throws Exception {
        SearchContextStatus status = ImagingApi
                .createImageSearch(new CreateImageSearchRequest(null, null, null, TestStorage));

        return status.getId();
    }
    
    /**
     * Retrieves temp folder for dynamic name generation.
     * @return Temp folder name.
     */
    protected static String getTempFolder()
    {
        String folder;
        if (!IsAndroid) {
            folder = "ImagingAICloudTestJava_";
        }
        else {
            folder = "ImagingAICloudTestAndroid_";
        }
        
        return folder + getTempFolderId();
    }

    protected void deleteImageSearch(String searchContextId) throws Exception {
        ImagingApi.deleteImageSearch(new DeleteImageSearchRequest(searchContextId, null, TestStorage));
    }

    protected String getImageSearchStatus(String searchContextId) throws Exception {
        SearchContextStatus status = ImagingApi
                .getImageSearchStatus(new GetImageSearchStatusRequest(SearchContextId, null, TestStorage));
        return status.getSearchStatus();
    }

    protected void addImageFeaturesToSearchContext(String storageSourcePath, Boolean isFolder) throws Exception {
        
        CreateImageFeaturesRequest request = isFolder 
                 ? new CreateImageFeaturesRequest(SearchContextId, null, null,  storageSourcePath, null,  TestStorage)
                 : new CreateImageFeaturesRequest(SearchContextId, null, storageSourcePath, null, null, TestStorage);
          ImagingApi.createImageFeatures(request);         
        waitSearchContextIdle();        
    }

    protected void waitSearchContextIdle() throws Exception {
        waitSearchContextIdle(WaitTimeoutInSeconds);
    }

    protected void waitSearchContextIdle(int maxTimeInSeconds) throws Exception {
        int timeout = 10;        
        String status = "unknown";
        
        long startTime = System.currentTimeMillis();

        while (!"Idle".equalsIgnoreCase(status) && (System.currentTimeMillis() - startTime) / 1000 < maxTimeInSeconds) {
            SearchContextStatus contextStatus = ImagingApi.getImageSearchStatus(
                    new GetImageSearchStatusRequest(this.SearchContextId, null, TestStorage));
            status = contextStatus.getSearchStatus();
            Thread.sleep(timeout * 1000);
        }
    }
}