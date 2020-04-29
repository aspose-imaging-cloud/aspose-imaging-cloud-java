/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="V3_0TestSuite.java">
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
package com.aspose.imaging.cloud.test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.aspose.imaging.cloud.test.api.ExamplesTests;
import com.aspose.imaging.cloud.test.api.TiffApiTests;
import com.aspose.imaging.cloud.test.api.TiffSpecificApiTests;
import com.aspose.imaging.cloud.test.api.storage.FileApiTests;
import com.aspose.imaging.cloud.test.api.storage.FolderApiTests;
import com.aspose.imaging.cloud.test.api.storage.StorageApiTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BmpTestSuite.class,
    CropTestSuite.class,
    EmfTestSuite.class,
    GifTestSuite.class,
    Jpeg2000TestSuite.class,
    JpgTestSuite.class,
    PsdTestSuite.class,
    ResizeTestSuite.class,
    RotateFlipTestSuite.class,
    SaveAsTestSuite.class,
    UpdateTestSuite.class,
    WebpTestSuite.class,
    WmfTestSuite.class,
    TiffApiTests.class,
    TiffSpecificApiTests.class,
    AITestSuite.class,
    FileApiTests.class,
    FolderApiTests.class,
    StorageApiTests.class,
    ExamplesTests.class
})
public class V3_0TestSuite {

}
