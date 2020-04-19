/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="BilateralSmoothingFilterProperties.java">
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
 * The Bilateral Smoothing Filter Options.
 */
public class BilateralSmoothingFilterProperties extends FilterPropertiesBase {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("spatialFactor")
  private Double spatialFactor = null;

  @JsonProperty("spatialPower")
  private Double spatialPower = null;

  @JsonProperty("colorFactor")
  private Double colorFactor = null;

  @JsonProperty("colorPower")
  private Double colorPower = null;

  public BilateralSmoothingFilterProperties size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Gets or sets the size of the kernel.
   * @return size
  **/
  public Integer getSize() {
    return size;
  }  

  public void setSize(Integer size) {
    this.size = size;
  }

  public BilateralSmoothingFilterProperties spatialFactor(Double spatialFactor) {
    this.spatialFactor = spatialFactor;
    return this;
  }

  /**
   * Gets or sets the spatial factor.
   * @return spatialFactor
  **/
  public Double getSpatialFactor() {
    return spatialFactor;
  }  

  public void setSpatialFactor(Double spatialFactor) {
    this.spatialFactor = spatialFactor;
  }

  public BilateralSmoothingFilterProperties spatialPower(Double spatialPower) {
    this.spatialPower = spatialPower;
    return this;
  }

  /**
   * Gets or sets the spatial power.
   * @return spatialPower
  **/
  public Double getSpatialPower() {
    return spatialPower;
  }  

  public void setSpatialPower(Double spatialPower) {
    this.spatialPower = spatialPower;
  }

  public BilateralSmoothingFilterProperties colorFactor(Double colorFactor) {
    this.colorFactor = colorFactor;
    return this;
  }

  /**
   * Gets or sets the color factor.
   * @return colorFactor
  **/
  public Double getColorFactor() {
    return colorFactor;
  }  

  public void setColorFactor(Double colorFactor) {
    this.colorFactor = colorFactor;
  }

  public BilateralSmoothingFilterProperties colorPower(Double colorPower) {
    this.colorPower = colorPower;
    return this;
  }

  /**
   * Gets or sets the color power.
   * @return colorPower
  **/
  public Double getColorPower() {
    return colorPower;
  }  

  public void setColorPower(Double colorPower) {
    this.colorPower = colorPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    BilateralSmoothingFilterProperties bilateralSmoothingFilterProperties = (BilateralSmoothingFilterProperties) o;
    return ObjectUtils.equals(this.size, bilateralSmoothingFilterProperties.size) &&
    ObjectUtils.equals(this.spatialFactor, bilateralSmoothingFilterProperties.spatialFactor) &&
    ObjectUtils.equals(this.spatialPower, bilateralSmoothingFilterProperties.spatialPower) &&
    ObjectUtils.equals(this.colorFactor, bilateralSmoothingFilterProperties.colorFactor) &&
    ObjectUtils.equals(this.colorPower, bilateralSmoothingFilterProperties.colorPower) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(size, spatialFactor, spatialPower, colorFactor, colorPower, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BilateralSmoothingFilterProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    spatialFactor: ").append(toIndentedString(spatialFactor)).append("\n");
    sb.append("    spatialPower: ").append(toIndentedString(spatialPower)).append("\n");
    sb.append("    colorFactor: ").append(toIndentedString(colorFactor)).append("\n");
    sb.append("    colorPower: ").append(toIndentedString(colorPower)).append("\n");
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

