package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageOdgRequest;

public class GetImageOdgExample {

	public static void main(String[] args) throws Exception {
		String name = "test.odg";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_specific." + "png";
		GetImageOdgRequest getImageOdgRequest = new GetImageOdgRequest(name, fromScratch, outPath, folder, storage);
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageOdg(getImageOdgRequest);
		System.out.println("Example completed");
	}
}
