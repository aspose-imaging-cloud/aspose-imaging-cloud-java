package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageJpgRequest;

public class GetImageJpgExample {

	public static void main(String[] args) throws Exception {
		String name = "test.jpg";
    	int quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_specific." + "jpg";
		GetImageJpgRequest getImageJpgRequest = new GetImageJpgRequest(name, quality, compressionType, fromScratch, outPath, folder, storage);
		
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageJpg(getImageJpgRequest);
		System.out.println("Example completed");
	}
}
