/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AuthWithSignatureRequestHandler.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.aspose.imaging.cloud.sdk.invoker.AuthType;
import com.aspose.imaging.cloud.sdk.invoker.Configuration;
import com.aspose.imaging.cloud.sdk.invoker.internal.UrlHelper;
import com.migcomponents.migbase64.Base64;

/**
 * Signature authentication request handler
 */
public class AuthWithSignatureRequestHandler implements IRequestHandler
{
    /**
     * The configuration
     */
    private final Configuration configuration;
    
    /**
     * Initializes a new instance of the AuthWithSignatureRequestHandler class.
     * @param configuration The configuration.
     */
    public AuthWithSignatureRequestHandler(Configuration configuration)
    {
        this.configuration = configuration;
    }

    /**
	 * Processes the URL.
	 * @param url The URL.
	 * @return Processed URL.
	 */
    public String processUrl(String url) throws IllegalArgumentException, URISyntaxException
    {
        if (this.configuration.AuthType != AuthType.RequestSignature)
        {
            return url;
        }

        url = UrlHelper.addQueryParameterToUrl(url, "appSid", this.configuration.AppSid);
        url = this.sign(url);

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
     */
    public void processResponse(HttpURLConnection connection, byte[] resultData)
    {
    }

    /**
     * Signs the specified URL.
     * @param url The URL.
     * @return Signed URL.
     */
    private String sign(String url)
    {
    	try {
    		url = url.replaceAll("(?<!(http:|https:))[//]+", "/");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(this.configuration.AppKey.getBytes(), "HmacSHA1"));
            
            String signature = new String(Base64.encodeToByte(mac.doFinal(url.getBytes()), false));
			
            if(signature.endsWith("=")){
                signature = signature.substring(0, signature.length() - 1);
            }

            return String.format("%s&signature=%s", url, URLEncoder.encode(signature, "UTF-8"));
			
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }

    	return null;
    }
}