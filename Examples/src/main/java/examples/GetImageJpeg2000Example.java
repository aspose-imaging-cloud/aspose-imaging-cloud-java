package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageJpeg2000Request;

public class GetImageJpeg2000Example {

	public static void main(String[] args) throws Exception {
		String name = "test.j2k";
        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String outPath = null;
        String folder =null;
        String storage = null;
		String outName = name + "_specific." + "jp2";
		GetImageJpeg2000Request getImageJpeg2000Request = new GetImageJpeg2000Request(name, comment, codec, fromScratch, outPath, folder, storage);

		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.getImageJpeg2000(getImageJpeg2000Request);
		
		System.out.println("Example completed");

		
	
	}
}
