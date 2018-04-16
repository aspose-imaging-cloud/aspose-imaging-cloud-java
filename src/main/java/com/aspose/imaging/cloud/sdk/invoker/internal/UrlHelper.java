/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UrlHelper.java">
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

package com.aspose.imaging.cloud.sdk.invoker.internal;

import java.net.URISyntaxException;

/**
 * URL helper class
 */
public class UrlHelper
{
	/**
	 * Adds the path parameter.
	 * @param url The URL.
	 * @param parameterName Name of the parameter.
	 * @param parameterValue The parameter value.
	 * @return Resulting URL.
	 */
    public static String addPathParameter(String url, String parameterName, Object parameterValue)
    {
        if (parameterValue == null || parameterValue.toString() == null || parameterValue.toString().equals(""))
        {
            url = url.replace("/{" + parameterName + "}", "");
        }
        else
        {
            url = url.replace("{" + parameterName + "}", parameterValue.toString());
        }

        return url;
    }

    /**
     * Adds the query parameter to URL.
     * @param url The URL.
     * @param parameterName Name of the parameter.
     * @param parameterValue The parameter value.
     * @return Resulting URL.
     * @throws IllegalArgumentException
     * @throws URISyntaxException
     */
    public static String addQueryParameterToUrl(String url, String parameterName, Object parameterValue) 
    		throws IllegalArgumentException, URISyntaxException
    {
        if (url.contains("{" + parameterName + "}"))
        {               
            url = addPathParameter(url, parameterName, parameterValue);
            return url;
        }

        if (url.contains("%7B" + parameterName + "%7D"))
        {
            url = url.replace("%7B", "{").replace("%7D", "}");
            url = addPathParameter(url, parameterName, parameterValue);
            return url;
        }
       
        if (parameterValue != null)
        {
        	if (!url.contains("?"))
        	{
        		url = url + "?";
        	}
        	else
        	{
        		url = url + "&";
        	}
        	
            url = url + String.format("%s=%s", parameterName, parameterValue);
        }
        
        return url;
    }
}