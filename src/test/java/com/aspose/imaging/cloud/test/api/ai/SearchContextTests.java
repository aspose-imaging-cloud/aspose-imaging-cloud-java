package com.aspose.imaging.cloud.test.api.ai;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiException;
import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.ImageFeatures;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteSearchContextImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextExtractImageFeaturesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextImageFeaturesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextStatusRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextAddImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextExtractImageFeaturesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PutSearchContextImageFeaturesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PutSearchContextImageRequest;
import com.aspose.storage.model.FileExistResponse;
import com.aspose.storage.model.ResponseMessage;

public class SearchContextTests extends TestImagingAIBase {
	private final String SmallTestImage = "ComparableImage.jpg";
	private final String TestImage = "ComparingImageSimilar15.jpg";

	@Test
	public void createSearchContextTest() {
		Assert.assertNotNull(SearchContextId);
	}

	@Test(expected = ApiException.class)
	public void deleteSearchContextTest() throws Exception {
		deleteSearchContext(SearchContextId);

		ImagingApi
				.getSearchContextStatus(new GetSearchContextStatusRequest(SearchContextId, null, DefaultStorage));
	}

	@Test
	public void addImageTest() throws Exception {
		this.addImage(TestImage);
	}

	@Test(expected = ApiException.class)
	public void deleteImageTest() throws Exception {
		String image = TestImage;
		this.addImage(image);

		String destServerPath = TempFolder + "/" + image;

		ImagingApi.deleteSearchContextImage(
				new DeleteSearchContextImageRequest(SearchContextId, destServerPath, null, DefaultStorage));

		ImagingApi.getSearchContextImage(
				new GetSearchContextImageRequest(SearchContextId, destServerPath, null, DefaultStorage));
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
		String destServerPath = TempFolder + "/" + image;

		String storagePath = OriginalDataFolder + "/" + image;

		ResponseMessage tagImageStream = StorageApi.GetDownload(storagePath, null, DefaultStorage);
		Assert.assertNotNull(tagImageStream);
		byte[] imageData = StreamHelper.readAsBytes(tagImageStream.getInputStream());

		ImagingApi.putSearchContextImage(new PutSearchContextImageRequest(SearchContextId, destServerPath,
				imageData, null, DefaultStorage));

		responseStream = this.getImage(image);
		Assert.assertTrue((int) responseStream.length < 40000);
	}

	@Test
	public void ExtractImageFeaturesTest() throws Exception {
		String image = TestImage;

		this.addImage(image);

		String destServerPath = TempFolder + "/" + image;

		ApiResponse response = ImagingApi.getSearchContextExtractImageFeatures(
				new GetSearchContextExtractImageFeaturesRequest(SearchContextId, destServerPath, null, null,
						DefaultStorage));

		ImageFeatures result = (ImageFeatures) response.getSaaSposeResponse();
		Assert.assertEquals((long) 200, (long) result.getCode());
		Assert.assertTrue(result.getImageId().contains(image));
		Assert.assertTrue(result.getFeatures().length > 0);

	}

	@Test
	public void extractAndAddImageFeaturesTest() throws Exception {
		this.addImageFeatures(TestImage);
	}

	@Test
	public void extractAndAddImageFeaturesFromFolderTest() throws Exception {
		ImagingApi.postSearchContextExtractImageFeatures(new PostSearchContextExtractImageFeaturesRequest(
				SearchContextId, null, null, OriginalDataFolder + "/FindSimilar", null, DefaultStorage));

		ApiResponse response = ImagingApi.getSearchContextImageFeatures(new GetSearchContextImageFeaturesRequest(
				SearchContextId, OriginalDataFolder + "/FindSimilar/3.jpg", null, DefaultStorage));

		ImageFeatures result = (ImageFeatures) response.getSaaSposeResponse();
		Assert.assertEquals((long) 200, (long) result.getCode());
		Assert.assertTrue(result.getImageId().contains("3.jp"));
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
		String destServerPath = TempFolder + "/" + image;
		ImagingApi.deleteSearchContextImage(
				new DeleteSearchContextImageRequest(SearchContextId, destServerPath, null, DefaultStorage));

		ImagingApi.getSearchContextImage(
				new GetSearchContextImageRequest(SearchContextId, destServerPath, null, DefaultStorage));
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

		ResponseMessage tagImageStream = StorageApi.GetDownload(storagePath, null, DefaultStorage);
		Assert.assertNotNull(tagImageStream);
		byte[] imageData = StreamHelper.readAsBytes(tagImageStream.getInputStream());

		ImagingApi.putSearchContextImageFeatures(new PutSearchContextImageFeaturesRequest(SearchContextId,
				destServerPath, imageData, null, DefaultStorage));

		response = this.getImageFeatures(image);
		Assert.assertTrue(response.getImageId().contains(TestImage));
		Assert.assertTrue(featuresLength != response.getFeatures().length);
	}

	private void addImage(String image) throws Exception {
		String destServerPath = TempFolder + "/" + image;

		String storagePath = OriginalDataFolder + "/" + image;

		ResponseMessage tagImageStream = StorageApi.GetDownload(storagePath, null, DefaultStorage);
		Assert.assertNotNull(tagImageStream);
		byte[] imageData = StreamHelper.readAsBytes(tagImageStream.getInputStream());

		ImagingApi.postSearchContextAddImage(new PostSearchContextAddImageRequest(SearchContextId, destServerPath,
				imageData, null, DefaultStorage));

		FileExistResponse existResponse = StorageApi.GetIsExist(destServerPath, null, DefaultStorage);
		Assert.assertNotNull(existResponse);
		Assert.assertTrue(existResponse.getFileExist().getIsExist());
	}

	private byte[] getImage(String image) throws Exception {
		String destServerPath = TempFolder + "/" + image;

		ApiResponse response = ImagingApi.getSearchContextImage(
				new GetSearchContextImageRequest(SearchContextId, destServerPath, null, DefaultStorage));

		return response.getResponseData();
	}

	private void addImageFeatures(String image) throws Exception {
		String destServerPath = OriginalDataFolder + "/" + image;

		ImagingApi.postSearchContextExtractImageFeatures(new PostSearchContextExtractImageFeaturesRequest(
				SearchContextId, null, destServerPath, null, null, DefaultStorage));
	}

	private ImageFeatures getImageFeatures(String image) throws Exception {
		String destServerPath = OriginalDataFolder + "/" + image;
		ApiResponse response = ImagingApi.getSearchContextImageFeatures(
				new GetSearchContextImageFeaturesRequest(SearchContextId, destServerPath, null, DefaultStorage));

		ImageFeatures result = (ImageFeatures) response.getSaaSposeResponse();
		Assert.assertEquals((long) 200, (long) result.getCode());

		return result;
	}
}
