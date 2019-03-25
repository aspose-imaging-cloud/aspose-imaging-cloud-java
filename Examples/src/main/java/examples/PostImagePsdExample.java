package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImagePsdRequest;

public class PostImagePsdExample {

	public static void main(String[] args) throws Exception {
		byte[] imageData = null;
        int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = null;
        String folder = null;
        String name = "test.psd";
		String outName = name + "_specific." + "psd";
		PostImagePsdRequest postImagePsdRequest = new PostImagePsdRequest(imageData, channelsCount, compressionMethod, fromScratch, outPath, storage);
		
		
		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.postImagePsd(postImagePsdRequest);
		System.out.println("Example completed");		
	}

}
