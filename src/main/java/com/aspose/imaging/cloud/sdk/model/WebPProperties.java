/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WebPProperties.java">
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
 * Represents information about image in WEBP format.
 */
public class WebPProperties {
  @JsonProperty("lossless")
  private Boolean lossless = null;

  @JsonProperty("quality")
  private Double quality = null;

  @JsonProperty("animLoopCount")
  private Integer animLoopCount = null;

  @JsonProperty("animBackgroundColor")
  private Long animBackgroundColor = null;

  public WebPProperties lossless(Boolean lossless) {
    this.lossless = lossless;
    return this;
  }

  /**
   * Gets or sets a value indicating whether these WebPOptions is lossless.
   * @return lossless
  **/
  public Boolean isLossless() {
    return lossless;
  }  

  public void setLossless(Boolean lossless) {
    this.lossless = lossless;
  }

  public WebPProperties quality(Double quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Gets or sets the quality.
   * @return quality
  **/
  public Double getQuality() {
    return quality;
  }  

  public void setQuality(Double quality) {
    this.quality = quality;
  }

  public WebPProperties animLoopCount(Integer animLoopCount) {
    this.animLoopCount = animLoopCount;
    return this;
  }

  /**
   * Gets or sets the animation loop count.
   * @return animLoopCount
  **/
  public Integer getAnimLoopCount() {
    return animLoopCount;
  }  

  public void setAnimLoopCount(Integer animLoopCount) {
    this.animLoopCount = animLoopCount;
  }

  public WebPProperties animBackgroundColor(Long animBackgroundColor) {
    this.animBackgroundColor = animBackgroundColor;
    return this;
  }

  /**
   * Gets or sets the color of the animation background.
   * @return animBackgroundColor
  **/
  public Long getAnimBackgroundColor() {
    return animBackgroundColor;
  }  

  public void setAnimBackgroundColor(Long animBackgroundColor) {
    this.animBackgroundColor = animBackgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    WebPProperties webPProperties = (WebPProperties) o;
    return ObjectUtils.equals(this.lossless, webPProperties.lossless) &&
    ObjectUtils.equals(this.quality, webPProperties.quality) &&
    ObjectUtils.equals(this.animLoopCount, webPProperties.animLoopCount) &&
    ObjectUtils.equals(this.animBackgroundColor, webPProperties.animBackgroundColor);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(lossless, quality, animLoopCount, animBackgroundColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPProperties {\n");
    
    sb.append("    lossless: ").append(toIndentedString(lossless)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    animLoopCount: ").append(toIndentedString(animLoopCount)).append("\n");
    sb.append("    animBackgroundColor: ").append(toIndentedString(animBackgroundColor)).append("\n");
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

