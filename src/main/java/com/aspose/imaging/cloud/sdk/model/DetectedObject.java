/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DetectedObject.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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
 * DetectedObject
 */
public class DetectedObject {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("score")
  private Double score = null;

  @JsonProperty("bounds")
  private Rectangle bounds = null;

  public DetectedObject label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }  

  public void setLabel(String label) {
    this.label = label;
  }

  public DetectedObject score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  **/
  public Double getScore() {
    return score;
  }  

  public void setScore(Double score) {
    this.score = score;
  }

  public DetectedObject bounds(Rectangle bounds) {
    this.bounds = bounds;
    return this;
  }

  /**
   * Get bounds
   * @return bounds
  **/
  public Rectangle getBounds() {
    return bounds;
  }  

  public void setBounds(Rectangle bounds) {
    this.bounds = bounds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DetectedObject detectedObject = (DetectedObject) o;
    return ObjectUtils.equals(this.label, detectedObject.label) &&
    ObjectUtils.equals(this.score, detectedObject.score) &&
    ObjectUtils.equals(this.bounds, detectedObject.bounds);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(label, score, bounds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObject {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
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

