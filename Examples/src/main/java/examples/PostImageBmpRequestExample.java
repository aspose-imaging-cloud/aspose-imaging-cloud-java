package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageBmpRequest;

public class PostImageBmpRequestExample {

	public static void main(String[] args) throws Exception {

		byte[] imageData = null;
		Integer bitsPerPixel = 32;
		Integer horizontalResolution = 300;
		Integer verticalResolution = 300;
		Boolean fromScratch = null;
		String outPath = null;
		String storage = null;
		String folder = null;
		String name = "test.bmp";

		PostImageBmpRequest postImageBmpRequest = new PostImageBmpRequest(imageData, bitsPerPixel, horizontalResolution,
				verticalResolution, fromScratch, outPath, storage);
		
		ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream=api.postImageBmp(postImageBmpRequest);
		
		System.out.println("Example completed");

	}

}
