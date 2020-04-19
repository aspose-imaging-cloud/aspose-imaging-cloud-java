/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FilterEffectApiTests.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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
package com.aspose.imaging.cloud.test.api;

import com.aspose.imaging.cloud.sdk.model.*;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Method;

/**
 * Class for testing filter effect API calls
 */
@RunWith(Parameterized.class)
public class FilterEffectApiTests extends ApiTester {

    private FilterEffectImageRequest filterEffectImageRequest;

    /**
     * Wrapper for filter type and filter properties
     */
    private class Filter {
        /**
         * The filter type
         */
        private String filterType;

        /**
         * The filter properties
         */
        private FilterPropertiesBase filterProperties;

        /**
         * Creates Filter instance
         *
         * @param filterType       The filter type.
         * @param filterProperties The filter properties.
         */
        Filter(String filterType, FilterPropertiesBase filterProperties) {
            this.filterType = filterType;
            this.filterProperties = filterProperties;
        }
    }

    private Iterable<Filter> filters = Arrays.asList(
//            new Filter("BigRectangular", new BigRectangularFilterProperties()),
//            new Filter("SmallRectangular", new SmallRectangularFilterProperties()),
            new Filter("Median", new MedianFilterProperties() {{
                setSize(2);
            }}),
            new Filter("GaussWiener", new GaussWienerFilterProperties(){{
                setRadius(2);
                setSmooth(2.0);
            }}),
            new Filter("MotionWiener", new MotionWienerFilterProperties(){{
                setLength(2);
                setSmooth(2.0);
                setAngle(12.0);
            }}),
            new Filter("GaussianBlur", new GaussianBlurFilterProperties(){{
                setRadius(2);
                setSigma(0.5);
            }}),
            new Filter("Sharpen", new SharpenFilterProperties(){{
                setSize(2);
                setSigma(0.5);
            }}),
            new Filter("BilateralSmoothing", new BilateralSmoothingFilterProperties(){{
                setSize(2);
                setSpatialFactor(2.0);
                setSpatialPower(2.0);
                setColorFactor(2.0);
                setColorPower(2.0);
            }}));

    @Parameters
    public static Iterable<Object[]> data() {
        if (isExtendedTests()) {
            return Arrays.asList(new Object[][]{
                    {".dicom", new String[]{}},
                    {".djvu", new String[]{}},
                    {".gif", new String[]{}},
                    {".psd", new String[]{}},
                    {".tiff", new String[]{}},
                    {".webp", new String[]{}}});
        }
        else return Arrays.asList(new Object[][]{
                {".psd", new String[]{}},
        });
    }

    private String formatExtension;
    String[] additionalExportFormats;

    public FilterEffectApiTests(String extension, String[] additionalFormats) {
        this.formatExtension = extension;
        this.additionalExportFormats = additionalFormats;
    }

    /**
     * Test operation: Apply filtering effect on and existing image
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void filterEffectTest() throws Exception {
        String name = null;
        String folder = getTempFolder();
        String storage = TestStorage;

        ArrayList<String> formatsToExport = new ArrayList<String>();
        Collections.addAll(formatsToExport, this.BasicExportFormats);
	
        for (String additionalExportFormat : additionalExportFormats) {
            if (additionalExportFormat == null || (!additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))) {
                formatsToExport.add(additionalExportFormat);
            }
        }

        for (StorageFile inputFile : InputTestFiles) {
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            for (Filter filter  : filters) {
                for (String format : formatsToExport) {		

					if (formatExtension == ".psd" && format == "webp") {
						continue;
					}				

                    filterEffectImageRequest = new FilterEffectImageRequest(name,  filter.filterType, filter.filterProperties, format, folder, storage);

                    Method propertiesTester = FilterEffectApiTests.class.getDeclaredMethod("filterEffectPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                    propertiesTester.setAccessible(true);

                    Method requestInvoker = FilterEffectApiTests.class.getDeclaredMethod("filterEffectRequestInvoker", String.class);
                    requestInvoker.setAccessible(true);

                    this.testGetRequest(
                            "FilterEffectTest",
                            String.format("Input image: %s; Output format: %s; Filter type: %s", name, format, filter.filterType),
                            name,
                            requestInvoker,
                            propertiesTester,
                            folder,
                            storage
                    );
                }
            }
        }
    }

    /**
     * Tests properties for FilterEffectImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void filterEffectPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {

    }

    /**
     * Invokes POST request for createModifiedJpeg2000 operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception
     */
    private byte[] filterEffectRequestInvoker(String name) throws Exception
    {
        filterEffectImageRequest.name = name;
        return ImagingApi.filterEffectImage(filterEffectImageRequest);
    }
}
