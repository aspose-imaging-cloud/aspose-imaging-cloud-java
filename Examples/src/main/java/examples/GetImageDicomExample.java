package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageDicomRequest;

public class GetImageDicomExample {

	public static void main(String[] args) throws Exception {
		String name = "test.dicom";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = null;
        String storage = null;
		GetImageDicomRequest getImageDicomRequest = new GetImageDicomRequest(name, fromScratch, outPath, folder, storage);
		
		
		ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream=api.getImageDicom(getImageDicomRequest);
		
		
		
		

	}

}
