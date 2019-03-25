package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImagePsdRequest;

public class GetImagePsdExample {

	public static void main(String[] args) throws Exception {
		String name = "test.psd";
    	int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_specific." + "psd";
		GetImagePsdRequest getImagePsdRequest = new GetImagePsdRequest(name, channelsCount, compressionMethod, fromScratch, outPath, folder, storage);

		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImagePsd(getImagePsdRequest);
		System.out.println("Example completed");		
	}
}
