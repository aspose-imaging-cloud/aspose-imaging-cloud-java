/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GifProperties.java">
*   Copyright (c) 2019 Aspose Pty Ltd. All rights reserved.
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

import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.imaging.cloud.sdk.stablemodel.*;

/**
 * Represents information about image in GIF format.
 */
public class GifProperties {
  @JsonProperty("backgroundColor")
  private String backgroundColor = null;

  @JsonProperty("hasBackgroundColor")
  private Boolean hasBackgroundColor = null;

  @JsonProperty("hasTrailer")
  private Boolean hasTrailer = null;

  @JsonProperty("pixelAspectRatio")
  private Integer pixelAspectRatio = null;

  public GifProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Gets or sets the background color.
   * @return backgroundColor
  **/
  public String getBackgroundColor() {
    return backgroundColor;
  }  

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public GifProperties hasBackgroundColor(Boolean hasBackgroundColor) {
    this.hasBackgroundColor = hasBackgroundColor;
    return this;
  }

  /**
   * Gets or sets a value indicating whether background color is used.
   * @return hasBackgroundColor
  **/
  public Boolean isHasBackgroundColor() {
    return hasBackgroundColor;
  }  

  public void setHasBackgroundColor(Boolean hasBackgroundColor) {
    this.hasBackgroundColor = hasBackgroundColor;
  }

  public GifProperties hasTrailer(Boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
    return this;
  }

  /**
   * Gets or sets a value indicating whether image has trailer.
   * @return hasTrailer
  **/
  public Boolean isHasTrailer() {
    return hasTrailer;
  }  

  public void setHasTrailer(Boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
  }

  public GifProperties pixelAspectRatio(Integer pixelAspectRatio) {
    this.pixelAspectRatio = pixelAspectRatio;
    return this;
  }

  /**
   * Gets or sets the pixel aspect ratio.
   * @return pixelAspectRatio
  **/
  public Integer getPixelAspectRatio() {
    return pixelAspectRatio;
  }  

  public void setPixelAspectRatio(Integer pixelAspectRatio) {
    this.pixelAspectRatio = pixelAspectRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GifProperties gifProperties = (GifProperties) o;
    return ObjectUtils.equals(this.backgroundColor, gifProperties.backgroundColor) &&
    ObjectUtils.equals(this.hasBackgroundColor, gifProperties.hasBackgroundColor) &&
    ObjectUtils.equals(this.hasTrailer, gifProperties.hasTrailer) &&
    ObjectUtils.equals(this.pixelAspectRatio, gifProperties.pixelAspectRatio);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(backgroundColor, hasBackgroundColor, hasTrailer, pixelAspectRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifProperties {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    hasBackgroundColor: ").append(toIndentedString(hasBackgroundColor)).append("\n");
    sb.append("    hasTrailer: ").append(toIndentedString(hasTrailer)).append("\n");
    sb.append("    pixelAspectRatio: ").append(toIndentedString(pixelAspectRatio)).append("\n");
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

