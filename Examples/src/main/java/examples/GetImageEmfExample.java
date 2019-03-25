package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageEmfRequest;

public class GetImageEmfExample {

	public static void main(String[] args) throws Exception {
		String name = "test.emf";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String folder =null;
        String storage = null;
		String outName = name + "_specific." + "png";
		GetImageEmfRequest getImageEmfRequest = new GetImageEmfRequest(name, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, folder, storage);

		ImagingApi api=new ImagingApi(Configuration.app_key, Configuration.app_sid);
		api.getImageEmf(getImageEmfRequest);
		
		System.out.println("Example completed");
	}

}
