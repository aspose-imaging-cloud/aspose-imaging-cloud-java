import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Object detection image example.
 */
public class ObjectDetectionImage extends ImagingBase {
    /**
     * Initializes a new instance of the ObjectDetection class
     *
     * @param imagingApi The imaging API.
     */
    public ObjectDetectionImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Object detection image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "object_detection_example.jpg";
    }

    /**
     * Detect objects on an image from a cloud storage.
     *
     * @throws Exception
     */
    public void DetectObjectsImageFromStorage() throws Exception {
        System.out.println("Detect objects on an image from a cloud storage");

        uploadSampleImageToCloud();

        String method = "ssd";
        int threshold = 50;
        Boolean includeClass = true;
        Boolean includeScore = true;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ObjectBoundsRequest request = new ObjectBoundsRequest(getSampleImageFileName(), method, threshold, includeClass, includeScore, folder, storage);

        System.out.println(String.format("Call ObjectBoundsRequest with params: method: %s, threshold: %s, includeClass: %s, includeScore: %s", method, threshold, includeClass, includeScore));

        DetectedObjectsList detectedObjectsList = ImagingApi.objectBounds(request);
        System.out.println(String.format("Objects detected: %s", detectedObjectsList.DetectedObjects.length()));

        System.out.println();
    }

    /**
     * Get visualized detected objects and upload it to the cloud storage.
     *
     * @throws Exception
     */
    public void VisualiizeDetectObjectsAndUploadToStorage() throws Exception {
        System.out.println("Get visualized detected objects and upload it to the cloud storage");

        uploadSampleImageToCloud();

        String method = "ssd";
        int threshold = 50;
        Boolean includeClass = true;
        Boolean includeScore = true;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        VisualObjectBoundsRequest request = new VisualObjectBoundsRequest(getSampleImageFileName(), method, threshold, includeClass, includeScore, folder, storage);

        System.out.println(String.format("Call VisualObjectBoundsRequest with params: method: %s, threshold: %s, includeClass: %s, includeScore: %s", method, threshold, includeClass, includeScore));

        byte[] updatedImage = ImagingApi.VisualObjectBounds(request);
        uploadImageToCloud(getModifiedSampleImageFileName(false, "jpg"), updatedImage);

        System.out.println();
    }


    /**
     * Detect objects on an image that is passed in a request stream.
     *
     * @throws Exception
     */
    public void DetectObjectsImageFromRequestBody() throws Exception {
        System.out.println("Detect objects on an image that is passed in a request stream");

        String method = "ssd";
        int threshold = 50;
        Boolean includeClass = true;
        Boolean includeScore = true;
        String outPath = null;
        String storage = null; // We are using default Cloud Storage
        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));

        CreateObjectBoundsRequest request = new CreateObjectBoundsRequest(inputStream, method, threshold, includeClass, includeScore, outPath, storage);

        System.out.println(String.format("Call CreateObjectBoundsRequest with params: method: %s, threshold: %s, includeClass: %s, includeScore: %s", method, threshold, includeClass, includeScore));

        DetectedObjectsList detectedObjectsList = ImagingApi.createObjectBounds(request);
        System.out.println(String.format("Objects detected: %s", detectedObjectsList.DetectedObjects.length()));

        System.out.println();
    }


    /**
     * Visualize detected object on an image that is passed in a request stream..
     *
     * @throws Exception
     */
    public void VisualizeDetectedObjectsImageFromRequestBody() throws Exception {
        System.out.println("Visualize detected object on an image that is passed in a request stream");

        String method = "ssd";
        int threshold = 50;
        Boolean includeClass = true;
        Boolean includeScore = true;
        String outPath = null;
        String storage = null; // We are using default Cloud Storage

        CreateVisualObjectBoundsRequest request = new CreateVisualObjectBoundsRequest(getSampleImageFileName(), method, threshold, includeClass, includeScore, outPath, storage);

        System.out.println(String.format("Call CreateVisualObjectBoundsRequest with params: method: %s, threshold: %s, includeClass: %s, includeScore: %s", method, threshold, includeClass, includeScore));

        byte[] updatedImage = ImagingApi.CreateVisualObjectBoundsRequest(request);
        uploadImageToCloud(getModifiedSampleImageFileName(false, "jpg"), updatedImage);

        System.out.println();
    }
}
