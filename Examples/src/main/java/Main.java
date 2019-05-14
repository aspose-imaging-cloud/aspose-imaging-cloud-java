import ai.SearchContext;
import ai.SearchContextFeatures;
import ai.SearchContextImages;
import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.sun.scenario.effect.Crop;


public class Main {

    private static final String APP_KEY = "";  // Get AppKey and AppSID from https:dashboard.aspose.cloud/
    private static final String APP_SID = ""; // Get AppKey and AppSID from https:dashboard.aspose.cloud/
    public static final String DATA_PATH = "src/main/resources/";

    public static void main(String[] args) {

        ImagingApi imagingApi = new ImagingApi(APP_KEY, APP_SID);

        // Update parameters of existing BMP image
        ManipulateBMPImage manipulateBMPImage = new ManipulateBMPImage(imagingApi);
        manipulateBMPImage.updateParametersOfBMPImageInCloud();
        manipulateBMPImage.updateParametersOfBMPImageInRequestBody();

        // Process existing EMF imaging using given parameters
        UpdateEMFImageProperties updateEMFImage = new UpdateEMFImageProperties(imagingApi);
        updateEMFImage.processEMFImage();
        updateEMFImage.processEMFImageWithoutStorage();

        // TIFF Frames
        TIFFFrames tiffFrames = new TIFFFrames(imagingApi);
        // Get a specified frame from existing TIFF image
        tiffFrames.getAFrameFromTIFFImageInCloud();
        // Get other frames from existing TIFF image
        tiffFrames.getOtherFramesFromTIFFImageInCloud();
        // Get separate frame from existing TIFF image.
        // Image data is passed as zero-indexed multipart/form-data content or as raw body stream
        tiffFrames.getAFrameFromTIFFImageInRequestBody();
        // Get separate frame properties of existing TIFF image
        tiffFrames.getFramePropertiesOfTIFFImageInCloud();
        // Get separate frame properties of existing TIFF image.
        // Image data is passed as zero-indexed multipart/form-data content or as raw body stream
        tiffFrames.getFramePropertiesOfTIFFImageInRequestBody();

        // Update parameters of existing GIF image
        UpdateGIFImage updateGIFImage = new UpdateGIFImage(imagingApi);
        updateGIFImage.updateParametersOfGIFImageInCloud();
        updateGIFImage.updateParametersOfGIFImageInRequestBody();

        // Update parameters of existing JPEG2000 image
        UpdateJPEG2000Image updateJPEG2000Image = new UpdateJPEG2000Image(imagingApi);
        updateJPEG2000Image.updateParametersOfJPEG2000ImageInCloud();
        updateJPEG2000Image.updateParametersOfJPEG2000ImageInRequestBody();

        // Update parameters of existing JPEG image
        UpdateJPEGImage updateJPEGImage = new UpdateJPEGImage(imagingApi);
        updateJPEGImage.updateParametersOfJPEGImageInCloud();
        updateJPEGImage.updateParametersOfJPEGImageInRequestBody();

        // Update parameters of existing PSD image
        UpdatePSDImage updatePSDImage = new UpdatePSDImage(imagingApi);
        updatePSDImage.updateParametersOfPSDImageInCloud();
        updatePSDImage.updateParametersOfPSDImageInRequestBody();

        // Update parameters of existing TIFF image
        TIFFImage tiffImage = new TIFFImage(imagingApi);
        tiffImage.updateParametersOfTIFFImageInCloud();
        tiffImage.updateParametersOfTIFFImageInRequestBody();
        tiffImage.updateParametersOfTIFFImageAccordingToFaxParameters();
        tiffImage.mergeTIFFImages();

        // Update parameters of existing WEBP image
        WEBPImage webpImage = new WEBPImage(imagingApi);
        webpImage.updateParametersOfWEBPImageInCloud();
        webpImage.updateParametersOfWEBPImageInRequestBody();

        // Process existing WMF image using given parameters
        WMFImage wmfImage = new WMFImage(imagingApi);
        wmfImage.updateParametersOfWMFImageInCloud();
        wmfImage.updateParametersOfWMFImageInRequestBody();

        // Export existing image to another format
        ExportImage exportImage = new ExportImage(imagingApi);
        exportImage.exportImageToAnotherFormat();
        exportImage.exportImageToAnotherFormatWithoutStorage();

        // Crop an existing image
        CropImage cropImage = new CropImage(imagingApi);
        cropImage.cropImageInCloud();
        cropImage.cropImageInRequestBody();

        // Get properties of an image
        ImageProperties imageProperties = new ImageProperties(imagingApi);
        imageProperties.getPropertiesOfAnImageInCloud();
        imageProperties.getPropertiesOfAnImageInRequestBody();

        // Resize an existing image
        ResizeImage resizeImage = new ResizeImage(imagingApi);
        resizeImage.resizeAnImageInCloud();
        resizeImage.resizeAnImageInRequestBody();

        // Rotate and/or flip an existing image
        RotateFlipAnImage rotateFlipAnImage = new RotateFlipAnImage(imagingApi);
        rotateFlipAnImage.rotateFlipAnImageInCloud();
        rotateFlipAnImage.rotateFlipAnImageInRequestBody();

        // Perform scaling, cropping and flipping of an existing image in a single request
        UpdateImage updateImage = new UpdateImage(imagingApi);
        updateImage.updateImageInCloud();
        updateImage.updateImageInRequestBody();

        // Search Context
        SearchContext searchContext = new SearchContext(imagingApi, DATA_PATH);
        searchContext.createNewSearchContext();
        searchContext.getTheSearchContextStatus();
        searchContext.deleteSearchContext();
        searchContext.extractFeaturesFromImageWithoutAddingToSearchContext();
        searchContext.compareTwoImages();
        searchContext.findSimilarImages();
        searchContext.findDuplicateImages();
        searchContext.addTagAndReferenceImageToSearchContext();
        searchContext.searchImagesByTags();

        // Search Context Features
        SearchContextFeatures searchContextFeatures = new SearchContextFeatures(imagingApi, DATA_PATH);
        searchContextFeatures.extractImageFeaturesAndAddThemToSearchContext();
        searchContextFeatures.getImageFeaturesFromSearchContext();
        searchContextFeatures.deleteImageFeaturesFromSearchContext();
        searchContextFeatures.updateImageFeaturesInSearchContext();

        // Search Context Images
        SearchContextImages searchContextImages = new SearchContextImages(imagingApi, DATA_PATH);
        searchContextImages.getImageFromSearchContext();
        searchContextImages.addImageAndImagesFeaturesToSearchContext();
        searchContextImages.deleteImageAndImagesFeaturesFromSearchContext();
        searchContextImages.updateImageAndImagesFeaturesInSearchContext();
    }
}
