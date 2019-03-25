package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImagePngRequest;

public class PostImagePngExample {

	public static void main(String[] args) throws Exception {
		 byte[] imageData = null;
	        Boolean fromScratch = false;
	        String outPath = null;
	        String storage = null;
	        String folder =null;
	        String name = "test.png";
			String outName = name + "_specific." + "png";
			PostImagePngRequest postImagePngRequest = new PostImagePngRequest(imageData, fromScratch, outPath, storage);
			
			ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
			byte[] stream = api.postImagePng(postImagePngRequest);
			System.out.println("Example completed");

	}
}
