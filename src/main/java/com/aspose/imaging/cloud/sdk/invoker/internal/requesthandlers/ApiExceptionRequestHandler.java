/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiExceptionRequestHandler.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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

package com.aspose.imaging.cloud.sdk.invoker.internal.requesthandlers;

import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.aspose.imaging.cloud.sdk.invoker.ApiException;
import com.aspose.imaging.cloud.sdk.invoker.internal.SerializationHelper;
import com.aspose.imaging.cloud.sdk.stablemodel.SaaSposeResponse;

/**
 * API exception request handler
 */
public class ApiExceptionRequestHandler implements IRequestHandler
{
	/**
	 * Processes the URL.
	 * @param url The URL.
	 * @return Processed URL.
	 */
    public String processUrl(String url)
    {
        return url;
    }

    /**
     * Processes parameters before sending.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     */
    public void beforeSend(HttpURLConnection connection, OutputStream streamToSend)
    {
    }

    /**
     * Processes the response.
     * @param connection The connection.
     * @param resultStream The result data.
     * @throws Exception 
     */
    public void processResponse(HttpURLConnection connection, byte[] resultData) throws Exception
    {
        if (connection.getResponseCode() != 200)
        {
            this.throwApiException(connection, resultData);
        }
    }

    /**
     * Throws the API exception.
     * @param connection The connection.
     * @param resultStream The result data.
     * @throws Exception
     */
    private void throwApiException(HttpURLConnection connection, byte[] resultData) throws Exception
    {
        Exception resutException;
        try
        {
        	String responseData = resultData.toString();
        	SaaSposeResponse errorResponse = SerializationHelper.deserialize(responseData, SaaSposeResponse.class);
        	if (errorResponse.getStatus() == null || errorResponse.getStatus() == "")
            {
                errorResponse.setStatus(responseData);
            }

            resutException = new ApiException(connection.getResponseCode(), errorResponse.getStatus());
        }
        catch (Exception e)
        {
            throw new ApiException(connection.getResponseCode(), connection.getResponseMessage());
        }

        throw resutException;
    }
}