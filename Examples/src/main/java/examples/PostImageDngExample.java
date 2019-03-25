package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageDngRequest;

public class PostImageDngExample {

	public static void main(String[] args) throws Exception {
		  byte[] imageData = null;
	        Boolean fromScratch = null;
	        String outPath = null;
	        String storage = null;
	        String folder = null;
	        String name = "test.dng";
			String outName = name + "_specific." + "png";
			PostImageDngRequest postImageDngRequest = new PostImageDngRequest(imageData, fromScratch, outPath, storage);
			ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);

			
			api.postImageDng(postImageDngRequest);
			
			System.out.println("Example completed");

	}

}
