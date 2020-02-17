/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SearchImages.java">
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

import com.aspose.imaging.cloud.sdk.model.ImageFeatures;
import com.aspose.imaging.cloud.sdk.model.requests.CreateWebSiteImageFeaturesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageFeaturesRequest;

import java.net.URLEncoder;

/**
 * Search images
 */
public class SearchImages extends ImagingAiBase {
    /**
     * Initializes a new instance of the ImagingAiBase class
     *
     * @param imagingApi ImagingApi
     */
    public SearchImages(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        System.out.println("Search images example:" + System.lineSeparator());
    }

    /**
     * Prepares the search context.
     *
     * @throws Exception
     */
    public void PrepareSearchContext() throws Exception {
        createSearchContext();
    }

    /**
     * Searches for images from a web source
     *
     * @throws Exception
     */
    public void SearchImageFromWebSource() throws Exception {
        System.out.println("Searches for images from a web source:");

        // Compare two images
        String folder = CloudPath; // Folder with image to process
        String storage = null; // We are using default Cloud Storage

        String imageSourceUrl = URLEncoder.encode("https://www.f1news.ru/interview/hamilton/140909.shtml", "UTF-8");
        ImagingApi.createWebSiteImageFeatures(new CreateWebSiteImageFeaturesRequest(SearchContextId, imageSourceUrl, folder, storage));

        WaitIdle(SearchContextId);

        String image_url = URLEncoder.encode("https://cdn.f1ne.ws/userfiles/hamilton/140909.jpg", "UTF-8");
        ImageFeatures result = ImagingApi.getImageFeatures(new GetImageFeaturesRequest(SearchContextId, image_url, folder, storage));

        System.out.println("Image features found: " + result.getFeaturesCount());
    }
}
