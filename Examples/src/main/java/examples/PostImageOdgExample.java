package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageOdgRequest;

public class PostImageOdgExample {

	public static void main(String[] args) throws Exception {
		  byte[] imageData = null;
	        Boolean fromScratch = null;
	        String outPath = null;
	        String storage = null;
	        String folder = null;
	        String name = "test.odg";
			String outName = name + "_specific." + "png";
			PostImageOdgRequest postImageOdgRequest = new PostImageOdgRequest(imageData, fromScratch, outPath, storage);
			
			
			ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
			byte[] stream = api.postImageOdg(postImageOdgRequest);
			System.out.println("Example completed");
			
	}
}
