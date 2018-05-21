/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Configuration.java">
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

package com.aspose.imaging.cloud.sdk.invoker;

/**
 * Represents a set of configuration settings.
 */
public class Configuration
{
        /**
         * The default base URL
         */
        public final String DefaultBaseUrl = "https://api.aspose.cloud";

        /**
    	 * The default API version
    	 */
        public final String DefaultApiVersion = "v1";

        /**
    	 * The API base URL
    	 */
        private String apiBaseUrl = DefaultBaseUrl;

        /**
    	 * The API version
    	 */
        private String apiVersion = DefaultApiVersion;

        /**
         * The debug mode
         */
        private Boolean debugMode = false;

        /**
         * Gets or sets the app key.
         */
        public String AppKey;

        /**
         * Gets or sets the app SID.
         */
        public String AppSid;
        
        /**
         * Authentication type.
         * Default is OAuth.
         */
        public AuthType AuthType;
        
        /**
         * Get Aspose Cloud API base URL.
         * @return Aspose Cloud API base URL.
         */
        public String getApiBaseUrl()
        {
        	return this.apiBaseUrl;
        }
        
        /**
         * Set Aspose Cloud API base URL.
         * @param value
         */
        public void setApiBaseUrl(String value)
        {
        	this.apiBaseUrl = value;
        }
        
        /**
         * Get Aspose Cloud API version.
         * @return Aspose Cloud API version.
         */
        public String getApiVersion()
        {
        	return this.apiVersion;
        }
        
        /**
         * Set Aspose Cloud API base URL.
         * @param value
         */
        public void setApiVersion(String value)
        {
        	this.apiVersion = value;
        }
        
        /**
         * Get Aspose Cloud API debug mode value.
         * @return Aspose Cloud API debug mode value.
         */
        public Boolean getDebugMode()
        {
        	return this.debugMode;
        }
        
        /**
         * Set Aspose Cloud API debug mode value.
         * @param value
         */
        public void setDebugMode(Boolean value)
        {
        	this.debugMode = value;
        }

        /**
         * Gets the API root URL.
         * @return API root URL.
         */
        public String getApiRootUrl()
        {
            String result = this.getApiBaseUrl() + "/" + this.getApiVersion();

            return result.endsWith("/") ? result.substring(0, result.length() - 1) : result;
        }
}