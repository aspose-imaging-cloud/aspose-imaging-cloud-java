package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageJpgRequest;

public class PostImageJpgExample {

	public static void main(String[] args) throws Exception {
		  byte[] imageData = null;
	        int quality = 65;
	        String compressionType = "progressive";
	        Boolean fromScratch = null;
	        String outPath = null;
	        String storage = null;
	        String folder = null;
	        String name = "test.jpg";
			String outName = name + "_specific." + "jpg";
			PostImageJpgRequest postImageJpgRequest = new PostImageJpgRequest(imageData, quality, compressionType, fromScratch, outPath, storage);

				
			ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
			byte[] stream = api.postImageJpg(postImageJpgRequest);
			System.out.println("Example completed");
	}
}
