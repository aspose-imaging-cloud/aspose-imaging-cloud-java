package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageDicomRequest;

public class PostImageDicomExample {

	public static void main(String[] args) throws Exception {
		
		
		 byte[] imageData = null;
	        Boolean fromScratch = null;
	        String outPath = null;
	        String storage = null;
	        String folder = null;
	        String name = "test.dicom";
			String outName = name + "_specific." + "png";
			PostImageDicomRequest postImageDicomRequest = new PostImageDicomRequest(imageData, fromScratch, outPath, storage);
			ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);

			byte[] stream=api.postImageDicom(postImageDicomRequest);
			
			System.out.println("Example completed");
	}
}
