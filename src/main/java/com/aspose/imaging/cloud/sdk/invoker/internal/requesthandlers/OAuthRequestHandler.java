/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OAuthRequestHandler.java">
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

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.aspose.imaging.cloud.sdk.invoker.AuthType;
import com.aspose.imaging.cloud.sdk.invoker.Configuration;
import com.aspose.imaging.cloud.sdk.invoker.internal.ApiInvoker;
import com.aspose.imaging.cloud.sdk.invoker.internal.NeedRepeatRequestException;
import com.aspose.imaging.cloud.sdk.invoker.internal.SerializationHelper;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth request handler.
 */
public class OAuthRequestHandler implements IRequestHandler
{
	/**
     * The configuration
     */
    private final Configuration configuration;

    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;

    /**
     * The access token
     */
    private String accessToken;

    /**
     * The refresh token
     */
    private String refreshToken;

    /**
     * Initializes a new instance of the OAuthRequestHandler class.
     * @param configuration The configuration.
     */
    public OAuthRequestHandler(Configuration configuration)
    {
        this.configuration = configuration;

        IRequestHandler[] requestHandlers = new IRequestHandler[2];
        requestHandlers[0] = new DebugLogRequestHandler(this.configuration);
        requestHandlers[1] = new ApiExceptionRequestHandler();
        this.apiInvoker = new ApiInvoker(requestHandlers);
    }

    /**
     * Processes the URL.
     * @param url The URL.
     * @return Processed URL.
     * @throws Exception 
     */
    public String processUrl(String url) throws Exception
    {
        if (this.configuration.AuthType != AuthType.OAuth2)
        {
            return url;
        }

        if (this.accessToken == null || this.accessToken == "")
        {
            this.requestToken();
        }

        return url;
    }

    /**
     * Processes parameters before sending.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     */
    public void beforeSend(HttpURLConnection connection, OutputStream streamToSend)
    {
        if (this.configuration.AuthType != AuthType.OAuth2)
        {
            return;
        }
        
        connection.setRequestProperty("Authorization", "Bearer " + this.accessToken);
    }

    /**
     * Processes the response.
     * @param connection The connection.
     * @param resultStream The result data.
     * @throws IOException 
     * @throws Exception 
     */
    public void processResponse(HttpURLConnection connection, byte[] resultData) throws IOException, Exception
    {
        if (this.configuration.AuthType != AuthType.OAuth2)
        {
            return;
        }

        if (connection.getResponseCode() == 401)
        {
            this.refreshToken();

            throw new NeedRepeatRequestException();
        }
    }

    /**
     * Refreshes the token.
     * @throws Exception 
     */
    private void refreshToken() throws Exception
    {
        String requestUrl = this.configuration.getApiBaseUrl() + "oauth2/token";

        String postData = "grant_type=refresh_token";
        postData += "&refresh_token=" + this.refreshToken;

        byte[] resultData = this.apiInvoker.invokeApi(
                requestUrl,
                "POST",
                postData,
                null,
                null,
                "application/x-www-form-urlencoded");
        String responseString = new String(resultData);

        GetAccessTokenResult result =
            SerializationHelper.deserialize(responseString, GetAccessTokenResult.class);

        this.accessToken = result.AccessToken;
        this.refreshToken = result.RefreshToken;
    }

    /// <summary>
    /// Requests the token.
    /// </summary>
    private void requestToken() throws Exception
    {
    	String requestUrl = this.configuration.getApiBaseUrl() + "oauth2/token";

        String postData = "grant_type=client_credentials";
        postData += "&client_id=" + this.configuration.AppSid;
        postData += "&client_secret=" + this.configuration.AppKey;

        byte[] resultData = this.apiInvoker.invokeApi(
                requestUrl,
                "POST",
                postData,
                null,
                null,
                "application/x-www-form-urlencoded");
        String responseString = new String(resultData);

        GetAccessTokenResult result =
            SerializationHelper.deserialize(responseString, GetAccessTokenResult.class);

        this.accessToken = result.AccessToken;
        this.refreshToken = result.RefreshToken;
    }

    /// <summary>
    /// Token access result class.
    /// </summary>
    public static class GetAccessTokenResult
    {
    	public GetAccessTokenResult()
    	{
    		
    	}
    	
        /// <summary>
        /// Gets or sets the access token.
        /// </summary>
        /// <value>
        /// The access token.
        /// </value>
    	@JsonProperty("access_token")
        public String AccessToken;

        /// <summary>
        /// Gets or sets the refresh token.
        /// </summary>
        /// <value>
        /// The refresh token.
        /// </value>
    	@JsonProperty("refresh_token")
        public String RefreshToken;
    	
    	@JsonProperty("expires_in")
        public Integer ExpiresIn;
    	
    	@JsonProperty("token_type")
        public String Type;
    	
    	@JsonProperty("client_id")
        public String ClientId;
    	
    	@JsonProperty("clientRefreshTokenLifeTimeInMinutes")
        public Integer ClientRefreshTokenLifeTimeInMinutes;
    	
    	@JsonProperty(".issued")
        public String Issued;
    	
    	@JsonProperty(".expires")
        public String Expires;
    }        
}