package examples;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageRotateFlipRequest;

public class PostImageRotateFlipExample {

	public static void main(String[] args) throws Exception {
		byte[] imageData = null;

		String name = null;
		String method = "Rotate90FlipX";
		String format = "PNG";
		PostImageRotateFlipRequest postImageRotateFlipRequest = new PostImageRotateFlipRequest(imageData, format,
				method, null, null);

		String outName = name + "_rotateFlip." + format;

		ImagingApi api = new ImagingApi(Configuration.app_key, Configuration.app_sid);
		byte[] stream = api.postImageRotateFlip(postImageRotateFlipRequest);

		System.out.println("Example completed");

	}

}
