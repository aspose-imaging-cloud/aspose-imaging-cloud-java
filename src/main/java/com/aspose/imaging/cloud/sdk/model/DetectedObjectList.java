/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DetectedObjectList.java">
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
 * Wrapper for detected objects array
 */
public class DetectedObjectList {
  @JsonProperty("detectedObjects")
  private List<DetectedObject> detectedObjects = null;

  public DetectedObjectList detectedObjects(List<DetectedObject> detectedObjects) {
    this.detectedObjects = detectedObjects;
    return this;
  }

  public DetectedObjectList addDetectedObjectsItem(DetectedObject detectedObjectsItem) {
    if (this.detectedObjects == null) {
      this.detectedObjects = new ArrayList<DetectedObject>();
    }
    this.detectedObjects.add(detectedObjectsItem);
    return this;
  }

  /**
   * detected objects
   * @return detectedObjects
  **/
  public List<DetectedObject> getDetectedObjects() {
    return detectedObjects;
  }  

  public void setDetectedObjects(List<DetectedObject> detectedObjects) {
    this.detectedObjects = detectedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DetectedObjectList detectedObjectList = (DetectedObjectList) o;
    return ObjectUtils.equals(this.detectedObjects, detectedObjectList.detectedObjects);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(detectedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObjectList {\n");
    
    sb.append("    detectedObjects: ").append(toIndentedString(detectedObjects)).append("\n");
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

