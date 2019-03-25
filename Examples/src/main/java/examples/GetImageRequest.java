package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageBmpRequest;

public class GetImageRequest {
	public static void main() throws Exception {
		
		String name = "test.bmp";
        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;

	
		GetImageBmpRequest getImageBmpRequest = new GetImageBmpRequest(name, bitsPerPixel, horizontalResolution,
				verticalResolution, fromScratch, outPath, folder, storage);
		
		
		ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream=api.getImageBmp(getImageBmpRequest);
		
		System.out.println("Example completed");

	}
}
