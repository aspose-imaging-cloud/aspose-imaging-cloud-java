/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MotionWienerFilterProperties.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
 * Deconvolution filter options deblur motion             
 */
public class MotionWienerFilterProperties extends DeconvolutionFilterProperties {
  @JsonProperty("length")
  private Integer length = null;

  @JsonProperty("smooth")
  private Double smooth = null;

  @JsonProperty("angle")
  private Double angle = null;

  public MotionWienerFilterProperties length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Gets or sets the length.             
   * @return length
  **/
  public Integer getLength() {
    return length;
  }  

  public void setLength(Integer length) {
    this.length = length;
  }

  public MotionWienerFilterProperties smooth(Double smooth) {
    this.smooth = smooth;
    return this;
  }

  /**
   * Gets or sets the smooth.             
   * @return smooth
  **/
  public Double getSmooth() {
    return smooth;
  }  

  public void setSmooth(Double smooth) {
    this.smooth = smooth;
  }

  public MotionWienerFilterProperties angle(Double angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Gets or sets the angle in gradus.             
   * @return angle
  **/
  public Double getAngle() {
    return angle;
  }  

  public void setAngle(Double angle) {
    this.angle = angle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MotionWienerFilterProperties motionWienerFilterProperties = (MotionWienerFilterProperties) o;
    return ObjectUtils.equals(this.length, motionWienerFilterProperties.length) &&
    ObjectUtils.equals(this.smooth, motionWienerFilterProperties.smooth) &&
    ObjectUtils.equals(this.angle, motionWienerFilterProperties.angle) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(length, smooth, angle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotionWienerFilterProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    smooth: ").append(toIndentedString(smooth)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

