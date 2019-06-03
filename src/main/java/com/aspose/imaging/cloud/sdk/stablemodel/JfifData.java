/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JfifData.java">
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

package com.aspose.imaging.cloud.sdk.stablemodel;

import org.apache.commons.lang3.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents JFIF data.
 */
public class JfifData {
  @JsonProperty("densityUnits")
  private String densityUnits = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("xDensity")
  private Integer xDensity = null;

  @JsonProperty("yDensity")
  private Integer yDensity = null;

  public JfifData densityUnits(String densityUnits) {
    this.densityUnits = densityUnits;
    return this;
  }

  /**
   * Gets or sets the density units.
   * @return densityUnits
  **/
  public String getDensityUnits() {
    return densityUnits;
  }  

  public void setDensityUnits(String densityUnits) {
    this.densityUnits = densityUnits;
  }

  public JfifData version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Gets or sets the version.
   * @return version
  **/
  public Integer getVersion() {
    return version;
  }  

  public void setVersion(Integer version) {
    this.version = version;
  }

  public JfifData xDensity(Integer xDensity) {
    this.xDensity = xDensity;
    return this;
  }

  /**
   * Gets or sets the X density.
   * @return xdensity
  **/
  public Integer getXdensity() {
    return xDensity;
  }  

  public void setXdensity(Integer xDensity) {
    this.xDensity = xDensity;
  }

  public JfifData ydensity(Integer yDensity) {
    this.yDensity = yDensity;
    return this;
  }

  /**
   * Gets or sets the Y density.
   * @return ydensity
  **/
  public Integer getYdensity() {
    return yDensity;
  }  

  public void setYdensity(Integer yDensity) {
    this.yDensity = yDensity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    JfifData jfifData = (JfifData) o;
    return ObjectUtils.equals(this.densityUnits, jfifData.densityUnits) &&
    ObjectUtils.equals(this.version, jfifData.version) &&
    ObjectUtils.equals(this.xDensity, jfifData.xDensity) &&
    ObjectUtils.equals(this.yDensity, jfifData.yDensity);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(densityUnits, version, xDensity, yDensity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JfifData {\n");
    
    sb.append("    densityUnits: ").append(toIndentedString(densityUnits)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    xDensity: ").append(toIndentedString(xDensity)).append("\n");
    sb.append("    yDensity: ").append(toIndentedString(yDensity)).append("\n");
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

