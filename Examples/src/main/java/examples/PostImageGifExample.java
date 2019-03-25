package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageGifRequest;

public class PostImageGifExample {

	public static void main(String[] args) throws Exception {
		 byte[] imageData = null;
	        Integer backgroundColorIndex = 5;
	        Integer colorResolution = 4;
	        Boolean hasTrailer = true;
	        Boolean interlaced = false;
	        Boolean isPaletteSorted = true;
	        Integer pixelAspectRatio = 4;
	        Boolean fromScratch = null;
	        String outPath = null;
	        String storage = null;
	        String folder = null;
	        String name = "test.gif";
			String outName = name + "_specific." + "gif";
			PostImageGifRequest postImageGifRequest = new PostImageGifRequest(imageData, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, 
					pixelAspectRatio, fromScratch, outPath, storage);
			
			ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
			byte[] stream = api.postImageGif(postImageGifRequest);
			
			System.out.println("Example completed");

	}

}
