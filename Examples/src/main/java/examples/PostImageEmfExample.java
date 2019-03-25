package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageEmfRequest;

public class PostImageEmfExample {

	public static void main(String[] args) throws Exception {
		byte[] imageData = null;
		String bkColor = "gray";
		Integer pageWidth = 300;
		Integer pageHeight = 300;
		Integer borderX = 50;
		Integer borderY = 50;
		Boolean fromScratch = null;
		String outPath = null;
		String storage = null;
		String folder = null;
		String name = "test.emf";
		String outName = name + "_specific." + "png";
		PostImageEmfRequest postImageEmfRequest = new PostImageEmfRequest(imageData, bkColor, pageWidth, pageHeight,
				borderX, borderY, fromScratch, outPath, storage);

		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.postImageEmf(postImageEmfRequest);

		System.out.println("Example completed");
	}
}
