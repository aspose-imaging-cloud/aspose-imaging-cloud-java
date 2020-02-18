/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImagingAiBase.java">
 *   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package AI;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.SearchContextStatus;
import com.aspose.imaging.cloud.sdk.model.requests.*;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Base class for AI operations with images
 */
public abstract class ImagingAiBase {
    /**
     * The example images folder path.
     */
    protected final static String ExampleImagesFolder = Paths.get((Paths.get(System.getProperty("user.dir"))
            .getParent().toString()), "Examples", "Images", "AI").toString();

    /**
     * The cloud path.
     */
    protected final static String CloudPath = Paths.get("Examples", "AI").toString();

    /**
     * Gets the imaging API.
     */
    protected final ImagingApi ImagingApi;

    /**
     * Gets the search context identifier.
     */
    protected String SearchContextId;

    /**
     * Initializes a new instance of the ImagingAiBase class
     */
    public ImagingAiBase(ImagingApi imagingApi) {
        ImagingApi = imagingApi;
    }

    /**
     * Creates the image search.
     *
     * @throws Exception
     */
    protected void createSearchContext() throws Exception {
        String detector = "akaze";
        String matchingAlgorithm = "randomBinaryTree";
        String folder = null; // File will be saved at the root of the storage
        String storage = null; // We are using default Cloud Storage

        CreateImageSearchRequest createSearchContextRequest =
                new CreateImageSearchRequest(detector, matchingAlgorithm, folder, storage);
        SearchContextStatus status = ImagingApi.createImageSearch(createSearchContextRequest);
        SearchContextId = status.getId();

        System.out.println("Created new Search context with SearchContextId: " + SearchContextId);
    }

    /**
     * Deletes the image search context.
     *
     * @throws Exception
     */
    public void DeleteSearchContext() throws Exception {
        String folder = null; // File is saved at the root of the storage
        String storage = null; // Default Cloud Storage is being used

        DeleteImageSearchRequest deleteSearchContextRequest =
                new DeleteImageSearchRequest(SearchContextId, folder, storage);
        ImagingApi.deleteImageSearch(deleteSearchContextRequest);

        System.out.println("Deleted new Search context with SearchContextId: " + SearchContextId);
        System.out.println();
    }

    /**
     * Waits the idle.
     *
     * @param searchContextId The search context identifier.
     * @throws Exception
     */
    protected void WaitIdle(String searchContextId) throws Exception {
        System.out.println("Waiting Search context Idle...");

        while (!GetImageSearchStatus(searchContextId).equals("Idle")) {
            Thread.sleep(1000);
        }
    }

    /**
     * Gets the image search status.
     *
     * @param searchContextId The search context identifier.
     * @return The image search status.
     * @throws Exception
     */
    protected String GetImageSearchStatus(String searchContextId) throws Exception {
        String folder = null; // File is saved at the root of the storage
        String storage = null; // Default Cloud Storage is being used

        GetImageSearchStatusRequest searchContextStatusRequest =
                new GetImageSearchStatusRequest(searchContextId, folder, storage);

        SearchContextStatus status = ImagingApi.getImageSearchStatus(searchContextStatusRequest);
        return status.getSearchStatus();
    }

    /**
     * Extract images features and add them to search context.
     *
     * @param sourcePath The storage source path.
     * @param isFolder   If set to true - is folder.
     * @throws Exception
     */
    protected void createImageFeatures(String sourcePath, Boolean isFolder) throws Exception {
        String folder = null; // File is saved at the root of the storage
        String storage = null; // Default Cloud Storage is being used

        CreateImageFeaturesRequest request = isFolder
                ? new CreateImageFeaturesRequest(SearchContextId, null, null, Paths.get(CloudPath, sourcePath).toString(), folder, storage)
                : new CreateImageFeaturesRequest(SearchContextId, null, Paths.get(CloudPath, sourcePath).toString(), null, folder, storage);

        ImagingApi.createImageFeatures(request);

        if (isFolder) {
            System.out.println("Creating Search context image features...");

            WaitIdle(SearchContextId);
        } else {
            System.out.println("Created Search context image features for " + sourcePath);
        }
    }

    /**
     * Uploads the image to cloud.
     *
     * @param imageName Name of the image.
     * @param subFolder The subfolder.
     * @throws Exception
     */
    protected void uploadImageToCloud(String imageName, String subFolder) throws Exception {
        String folder = subFolder != null
                ? Paths.get(ExampleImagesFolder, subFolder).toString()
                : ExampleImagesFolder;

        byte[] inputStream = Files.readAllBytes(Paths.get(folder, imageName));
        UploadFileRequest request = new UploadFileRequest(Paths.get(CloudPath, imageName).toString(), inputStream, null);
        ImagingApi.uploadFile(request);

        System.out.println("Image " + imageName + " was uploaded to cloud storage");
    }
}
