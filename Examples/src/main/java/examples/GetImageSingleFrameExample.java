package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageFrameRequest;

public class GetImageSingleFrameExample {

	public static void main(String[] args) throws Exception {
		String name = "test.tiff";
    	Integer frameId = 2;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_singleFrame." + "tiff";
		GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(name, frameId, newWidth, newHeight, x, y, 
				rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, folder, storage);
		
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageFrame(getImageFrameRequest);
		
		System.out.println("Example completed");

		
	}

}
