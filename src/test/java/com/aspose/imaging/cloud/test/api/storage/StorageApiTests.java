/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageApiTests.java">
*   Copyright (c) 2019  Aspose Pty Ltd.
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

package com.aspose.imaging.cloud.test.api.storage;

import org.junit.Assert;
import org.junit.Test;

import com.aspose.imaging.cloud.sdk.invoker.ApiException;
import com.aspose.imaging.cloud.sdk.model.DiscUsage;
import com.aspose.imaging.cloud.sdk.model.StorageExist;
import com.aspose.imaging.cloud.sdk.model.requests.GetDiscUsageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.StorageExistsRequest;

/**
 * Specific Storage API tests.
 */
public class StorageApiTests extends StorageApiTester {
    @Test
    public void getDiscUsageTest() throws Exception {
        try {
            DiscUsage discUsage = ImagingApi.getDiscUsage(new GetDiscUsageRequest(TestStorage));
            Assert.assertTrue(discUsage.getUsedSize() < discUsage.getTotalSize());
            Assert.assertTrue(discUsage.getTotalSize() > 0);
            Assert.assertTrue(discUsage.getUsedSize() > 0);
        } catch (ApiException ex) {
            Assert.assertTrue(ex.errorCode == 501);
        }
    }

    @Test
    public void storageExistsTest() throws Exception {
        StorageExist storageExists = ImagingApi.storageExists(new StorageExistsRequest(TestStorage));
        Assert.assertTrue(storageExists.isExists());
    }

    @Test
    public void storageDoesNotExistTest() throws Exception {
        StorageExist storageExists = ImagingApi.storageExists(new StorageExistsRequest("NotExistingStorage"));
        Assert.assertFalse(storageExists.isExists());
    }
}
