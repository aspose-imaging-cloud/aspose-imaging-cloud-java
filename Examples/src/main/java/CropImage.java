import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageCropRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageCropRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class CropImage {

    private ImagingApi imagingApi;

    public CropImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Crop an existing image.
     */
    public void cropImageInCloud() {
        String fileName = "WaterMark.bmp";

        try {
            // Upload local image to storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String format = "jpg"; // Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
            Integer x = 10;
            Integer y = 10;
            Integer width = 100;
            Integer height = 150;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageCropRequest getImageCropRequest = new GetImageCropRequest(fileName, format, x, y,
                                                                                width, height, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageCrop(getImageCropRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out." + format);
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Crop an existing image. Image is passed in a request stream.
     */
    public void cropImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "WaterMark.bmp");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "jpg"; // Resulting image format. Currently, BMP, PSD, JPG, TIFF, GIF, PNG, J2K and WEBP are supported.
            Integer x = 10;
            Integer y = 10;
            Integer width = 100;
            Integer height = 150;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            PostImageCropRequest postImageCropRequest = new PostImageCropRequest(imageData, format, x, y, width, height,
                                                                                                        outPath, storage);

            byte[] updatedImage = imagingApi.postImageCrop(postImageCropRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out." + format);
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
