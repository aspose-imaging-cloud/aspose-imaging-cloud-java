import com.aspose.imaging.cloud.sdk.model.DetectedObjectList;
import com.aspose.imaging.cloud.sdk.model.requests.CreateObjectBoundsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.CreateVisualObjectBoundsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetObjectBoundsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetVisualObjectBoundsRequest;

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
        Boolean includeLabel = true;
        Boolean includeScore = true;
        String allowedLabels = "cat";
        String blockedLabels = "dog";
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetObjectBoundsRequest request = new GetObjectBoundsRequest(getSampleImageFileName(), method, threshold, includeLabel, includeScore, allowedLabels, blockedLabels, folder, storage);

        System.out.println(String.format("Call ObjectBoundsRequest with params: method: %s, threshold: %s, includeLabel: %s, includeScore: %s", method, threshold, includeLabel, includeScore));

        DetectedObjectList detectedObjectsList = ImagingApi.getObjectBounds(request);
        System.out.println(String.format("Objects detected: %s", detectedObjectsList.getDetectedObjects().size()));

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
        Boolean includeLabel = true;
        Boolean includeScore = true;
        String allowedLabels = "cat";
        String blockedLabels = "dog";
        String color = "blue";
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetVisualObjectBoundsRequest request = new GetVisualObjectBoundsRequest(getSampleImageFileName(), method, threshold, includeLabel, includeScore, allowedLabels, blockedLabels, color, folder, storage);

        System.out.println(String.format("Call VisualObjectBoundsRequest with params: method: %s, threshold: %s, includeLabel: %s, includeScore: %s, color: %s", method, threshold, includeLabel, includeScore, color));

        byte[] updatedImage = ImagingApi.getVisualObjectBounds(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, "jpg"));

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
        Boolean includeLabel = true;
        Boolean includeScore = true;
        String allowedLabels = "cat";
        String blockedLabels = "dog";
        String outPath = null;
        String storage = null; // We are using default Cloud Storage
        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));

        CreateObjectBoundsRequest request = new CreateObjectBoundsRequest(inputStream, method, threshold, includeLabel, includeScore, allowedLabels, blockedLabels, outPath, storage);

        System.out.println(String.format("Call CreateObjectBoundsRequest with params: method: %s, threshold: %s, includeLabel: %s, includeScore: %s", method, threshold, includeLabel, includeScore));

        DetectedObjectList detectedObjectsList = ImagingApi.createObjectBounds(request);
        System.out.println(String.format("Objects detected: %s", detectedObjectsList.getDetectedObjects().size()));

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
        Boolean includeLabel = true;
        Boolean includeScore = true;
        String allowedLabels = "cat";
        String blockedLabels = "dog";
        String color = null;
        String outPath = null;
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateVisualObjectBoundsRequest request = new CreateVisualObjectBoundsRequest(inputStream, method, threshold, includeLabel, includeScore, allowedLabels, blockedLabels, color, outPath, storage);

        System.out.println(String.format("Call CreateVisualObjectBoundsRequest with params: method: %s, threshold: %s, includeLabel: %s, includeScore: %s, color: null", method, threshold, includeLabel, includeScore));

        byte[] updatedImage = ImagingApi.createVisualObjectBounds(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, "jpg"));

        System.out.println();
    }
}
