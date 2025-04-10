/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SearchContextTests.java">
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

import java.io.IOException;
import java.net.URLEncoder;

import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiException;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.ImageFeatures;

public class SearchContextTests extends TestImagingAIBase {
    private final String SmallTestImage = "ComparableImage.jpg";
    private final String TestImage = "ComparingImageSimilar15.jpg";

    @Test
    public void createSearchContextTest() {
        Assert.assertNotNull(SearchContextId);
    }

    @Test(expected = ApiException.class)
    public void deleteImageSearchTest() throws Exception {
        deleteImageSearch(SearchContextId);

		try{
			ImagingApi
                .getImageSearchStatus(new GetImageSearchStatusRequest(SearchContextId, null, TestStorage));
		}
		finally{				
			SearchContextId = null;
		}
    }

    @Test
    public void addImageTest() throws Exception {
        this.addImage(TestImage);
    }

    @Test(expected = ApiException.class)
    public void deleteImageTest() throws Exception {
        String image = TestImage;
        this.addImage(image);

        String destServerPath = getTempFolder() + "/" + image;

        ImagingApi.deleteSearchImage(
                new DeleteSearchImageRequest(SearchContextId, destServerPath, null, TestStorage));

        ImagingApi.getSearchImage(
                new GetSearchImageRequest(SearchContextId, destServerPath, null, TestStorage));
    }

    @Test
    public void getImageTest() throws Exception {
        String image = TestImage;
        this.addImage(image);
        byte[] responseStream = this.getImage(image);
        Assert.assertTrue((int) responseStream.length > 50000);
    }

    @Test
    public void updateImageTest() throws Exception {
        String image = TestImage;
        this.addImage(image);
        byte[] responseStream = this.getImage(image);
        Assert.assertTrue(responseStream.length > 50000);

        image = SmallTestImage;
        String destServerPath = getTempFolder() + "/" + image;

        String storagePath = OriginalDataFolder + "/" + image;

        byte[] imageData = ImagingApi.downloadFile(new DownloadFileRequest(storagePath, TestStorage, null));

        ImagingApi.updateSearchImage(new UpdateSearchImageRequest(SearchContextId, destServerPath,
                imageData, null, TestStorage));

        responseStream = this.getImage(image);
        Assert.assertTrue((int) responseStream.length < 40000);
    }

    @Test
    public void extractImageFeaturesTest() throws Exception {
        String image = TestImage;

        this.addImage(image);

        String destServerPath = getTempFolder() + "/" + image;

        ImageFeatures result = ImagingApi.extractImageFeatures(
                new ExtractImageFeaturesRequest(SearchContextId, destServerPath, null, null,
                        TestStorage));

        Assert.assertTrue(result.getImageId().contains(image));
        Assert.assertTrue(result.getFeatures().length > 0);

    }

    @Test
    public void extractAndAddImageFeaturesTest() throws Exception {
        this.addImageFeatures(TestImage);
    }

    @Test    
    public void extractAndAddImageFeaturesFromFolderTest() throws Exception {
        ImagingApi.createImageFeatures(new CreateImageFeaturesRequest(
                SearchContextId, null, null, OriginalDataFolder + "/FindSimilar", null, TestStorage));

        waitSearchContextIdle();
          
        ImageFeatures result = ImagingApi.getImageFeatures(new GetImageFeaturesRequest(
                SearchContextId, OriginalDataFolder + "/FindSimilar/3.jpg", null, TestStorage));

        Assert.assertTrue(result.getImageId().contains("3.jp"));
        Assert.assertTrue(result.getFeatures().length > 0);
    }

    @Test
    public void extractAndAddImageFeaturesFromWebsiteTest() throws Exception {
        String imageSourceUrl = URLEncoder.encode("https://www.f1news.ru/interview/hamilton/140909.shtml", "UTF-8");
        ImagingApi.createWebSiteImageFeatures(new CreateWebSiteImageFeaturesRequest(SearchContextId, imageSourceUrl, null, TestStorage));

        waitSearchContextIdle();

        String image_url = URLEncoder.encode("https://c.f1news.ru/userfiles/hamilton/140909.jpg", "UTF-8");
        ImageFeatures result = ImagingApi.getImageFeatures(new GetImageFeaturesRequest(SearchContextId, image_url, null, TestStorage));

        Assert.assertTrue(result.getFeatures().length > 0);
    }

    @Test
    public void getImageFeaturesTest() throws Exception {
        this.addImageFeatures(TestImage);
        ImageFeatures response = this.getImageFeatures(TestImage);
        Assert.assertTrue(response.getImageId().contains(TestImage));
        byte[] features = response.getFeatures();
        Assert.assertTrue(features.length > 0);
    }

    @Test(expected = ApiException.class)
    public void deleteImageFeaturesTest() throws Exception {
        String image = TestImage;
        this.addImageFeatures(image);
        String destServerPath = getTempFolder() + "/" + image;
        ImagingApi.deleteSearchImage(
                new DeleteSearchImageRequest(SearchContextId, destServerPath, null, TestStorage));

        ImagingApi.getSearchImage(
                new GetSearchImageRequest(SearchContextId, destServerPath, null, TestStorage));
    }

    @Test
    public void updateImageFeaturesTest() throws Exception {
        String image = TestImage;
        this.addImageFeatures(image);
        ImageFeatures response = this.getImageFeatures(image);
        Assert.assertTrue(response.getImageId().contains(TestImage));
        byte[] features = response.getFeatures();
        int featuresLength = features.length;

        String destServerPath = OriginalDataFolder + "/" + image;

        String storagePath = OriginalDataFolder + "/" + SmallTestImage;

        byte[] imageData = ImagingApi.downloadFile(new DownloadFileRequest(storagePath, TestStorage, null));

        ImagingApi.updateImageFeatures(new UpdateImageFeaturesRequest(SearchContextId,
                destServerPath, imageData, null, TestStorage));

        response = this.getImageFeatures(image);
        Assert.assertTrue(response.getImageId().contains(TestImage));
        Assert.assertTrue(featuresLength != response.getFeatures().length);
    }

    private void addImage(String image) throws Exception {
        String destServerPath = getTempFolder() + "/" + image;

        String storagePath = OriginalDataFolder + "/" + image;

        byte[] imageData = ImagingApi.downloadFile(new DownloadFileRequest(storagePath, TestStorage, null));

        ImagingApi.addSearchImage(new AddSearchImageRequest(SearchContextId, destServerPath,
                imageData, null, TestStorage));

        Assert.assertTrue(ImagingApi.objectExists(new ObjectExistsRequest(destServerPath, TestStorage, null)).isExists());
    }

    private byte[] getImage(String image) throws Exception {
        String destServerPath = getTempFolder() + "/" + image;

        byte[] response = ImagingApi.getSearchImage(
                new GetSearchImageRequest(SearchContextId, destServerPath, null, TestStorage));

        return response;
    }

    private void addImageFeatures(String image) throws Exception {
        String destServerPath = OriginalDataFolder + "/" + image;

        ImagingApi.createImageFeatures(new CreateImageFeaturesRequest(
                SearchContextId, null, destServerPath, null, null, TestStorage));
    }

    private ImageFeatures getImageFeatures(String image) throws Exception {
        String destServerPath = OriginalDataFolder + "/" + image;
        ImageFeatures result = ImagingApi.getImageFeatures(
                new GetImageFeaturesRequest(SearchContextId, destServerPath, null, TestStorage));

        return result;
    }
}
