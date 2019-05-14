import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageSaveAsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageSaveAsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class ExportImage {

    private ImagingApi imagingApi;

    public ExportImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    public void exportImageToAnotherFormat() {
        // Input formats could be one of the following:
        // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG and SVG
        String fileName = "WaterMark.bmp";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Output formats could be one of the following:
            // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG, SVG and PDF
            String format = "pdf";
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // Cloud Storage name

            GetImageSaveAsRequest getSaveToStorageRequest = new GetImageSaveAsRequest(fileName, format, outPath,
                                                                                                    folder, storage);

            byte[] exportedImage = imagingApi.getImageSaveAs(getSaveToStorageRequest);

            // Save exported image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out.pdf");
            fos.write(exportedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void exportImageToAnotherFormatWithoutStorage() {

        try {
            // Input formats could be one of the following:
            // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG and SVG
            File file = new File(Main.DATA_PATH + "WaterMark.bmp");
            byte[] imageData = Files.readAllBytes(file.toPath());

            // Output formats could be one of the following:
            // BMP,	GIF, DJVU, WMF, EMF, JPEG, JPEG2000, PSD, TIFF, WEBP, PNG, DICOM, CDR, CMX, ODG, DNG, SVG and PDF
            String format = "pdf";
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // Cloud Storage name

            PostImageSaveAsRequest postSaveToStorageRequest = new PostImageSaveAsRequest(imageData, format,
                                                                                                outPath, storage);

            byte[] exportedImage = imagingApi.postImageSaveAs(postSaveToStorageRequest);

            // Save exported image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out.pdf");
            fos.write(exportedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
