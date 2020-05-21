/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Rectangle.java">
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
 * Rectangle
 */
public class Rectangle {
  @JsonProperty("X")
  private Double X = null;

  @JsonProperty("Y")
  private Double Y = null;

  @JsonProperty("width")
  private Double width = null;

  @JsonProperty("height")
  private Double height = null;

  public Rectangle X(Double X) {
    this.X = X;
    return this;
  }

  /**
   * Get X
   * @return X
  **/
  public Double getX() {
    return X;
  }  

  public void setX(Double X) {
    this.X = X;
  }

  public Rectangle Y(Double Y) {
    this.Y = Y;
    return this;
  }

  /**
   * Get Y
   * @return Y
  **/
  public Double getY() {
    return Y;
  }  

  public void setY(Double Y) {
    this.Y = Y;
  }

  public Rectangle width(Double width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/
  public Double getWidth() {
    return width;
  }  

  public void setWidth(Double width) {
    this.width = width;
  }

  public Rectangle height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  public Double getHeight() {
    return height;
  }  

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Rectangle rectangle = (Rectangle) o;
    return ObjectUtils.equals(this.X, rectangle.X) &&
    ObjectUtils.equals(this.Y, rectangle.Y) &&
    ObjectUtils.equals(this.width, rectangle.width) &&
    ObjectUtils.equals(this.height, rectangle.height);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(X, Y, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

