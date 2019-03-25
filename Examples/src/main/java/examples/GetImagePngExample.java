package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImagePngRequest;

public class GetImagePngExample {

	public static void main(String[] args) throws Exception {
		String name = "test.png";
        Boolean fromScratch = false;
        String outPath = null;
        String folder =null;
        String storage = null;
		String outName = name + "_specific." + "png";
		GetImagePngRequest getImagePngRequest = new GetImagePngRequest(name, fromScratch, outPath, folder, storage);
		
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImagePng(getImagePngRequest);
		System.out.println("Example completed");
	}

}
