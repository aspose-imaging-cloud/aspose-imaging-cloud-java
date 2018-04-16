/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PsdProperties.java">
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

package com.aspose.imaging.cloud.sdk.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about PSD image
 */
public class PsdProperties {
  @JsonProperty("BitsPerChannel")
  private Integer bitsPerChannel = null;

  @JsonProperty("ChannelsCount")
  private Integer channelsCount = null;

  @JsonProperty("ColorMode")
  private String colorMode = null;

  @JsonProperty("Compression")
  private String compression = null;

  public PsdProperties bitsPerChannel(Integer bitsPerChannel) {
    this.bitsPerChannel = bitsPerChannel;
    return this;
  }

   /**
   * Gets or sets the bits per channel.
   * @return bitsPerChannel
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the bits per channel.")
  public Integer getBitsPerChannel() {
    return bitsPerChannel;
  }

  public void setBitsPerChannel(Integer bitsPerChannel) {
    this.bitsPerChannel = bitsPerChannel;
  }

  public PsdProperties channelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
    return this;
  }

   /**
   * Gets or sets the channels count.
   * @return channelsCount
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the channels count.")
  public Integer getChannelsCount() {
    return channelsCount;
  }

  public void setChannelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
  }

  public PsdProperties colorMode(String colorMode) {
    this.colorMode = colorMode;
    return this;
  }

   /**
   * Gets or sets the color mode.
   * @return colorMode
  **/
  @ApiModelProperty(value = "Gets or sets the color mode.")
  public String getColorMode() {
    return colorMode;
  }

  public void setColorMode(String colorMode) {
    this.colorMode = colorMode;
  }

  public PsdProperties compression(String compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Gets or sets the compression.
   * @return compression
  **/
  @ApiModelProperty(value = "Gets or sets the compression.")
  public String getCompression() {
    return compression;
  }

  public void setCompression(String compression) {
    this.compression = compression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsdProperties psdProperties = (PsdProperties) o;
    return Objects.equals(this.bitsPerChannel, psdProperties.bitsPerChannel) &&
        Objects.equals(this.channelsCount, psdProperties.channelsCount) &&
        Objects.equals(this.colorMode, psdProperties.colorMode) &&
        Objects.equals(this.compression, psdProperties.compression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitsPerChannel, channelsCount, colorMode, compression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsdProperties {\n");
    
    sb.append("    bitsPerChannel: ").append(toIndentedString(bitsPerChannel)).append("\n");
    sb.append("    channelsCount: ").append(toIndentedString(channelsCount)).append("\n");
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

