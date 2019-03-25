package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageGifRequest;

public class GetImageGifExample {

	public static void main(String[] args) throws Exception {
		String name = "test.gif";
        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_specific." + "gif";
		GetImageGifRequest getImageGifRequest = new GetImageGifRequest(name, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, 
				pixelAspectRatio, fromScratch, outPath, folder, storage);
		

		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageGif(getImageGifRequest);
		
		System.out.println("Example completed");

	
	}
}
