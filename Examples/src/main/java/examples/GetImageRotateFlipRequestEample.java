package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageRotateFlipRequest;

public class GetImageRotateFlipRequestEample {

	public static void main(String[] args) throws Exception {
		
		String name = null;
        String method = "Rotate90FlipX";
        String format="PNG";
        GetImageRotateFlipRequest getImageRotateFlipRequest = new GetImageRotateFlipRequest(name, format, method, null, null, null);
		
		String outName = name + "_rotateFlip." + format;
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageRotateFlip(getImageRotateFlipRequest);
		
		
		System.out.println("Example completed");		
	}
}
