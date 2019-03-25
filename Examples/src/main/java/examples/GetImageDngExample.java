package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageDngRequest;

public class GetImageDngExample {

	public static void main(String[] args) throws Exception {
		String name = "test.dng";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		String outName = name + "_specific." + "png";
		GetImageDngRequest getImageDngRequest = new GetImageDngRequest(name, fromScratch, outPath, folder, storage);
		
		
		ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);
		api.getImageDng(getImageDngRequest);
		
		System.out.println("Example completed");
	}
}
