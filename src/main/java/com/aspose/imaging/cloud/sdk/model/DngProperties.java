/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DngProperties.java">
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

import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about image in DNG format.
 */
public class DngProperties {
  @JsonProperty("DngVersion")
  private Long dngVersion = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Model")
  private String model = null;

  @JsonProperty("CameraManufacturer")
  private String cameraManufacturer = null;

  @JsonProperty("IsFoveon")
  private Long isFoveon = null;

  @JsonProperty("Software")
  private String software = null;

  @JsonProperty("RawCount")
  private Long rawCount = null;

  @JsonProperty("Filters")
  private Long filters = null;

  @JsonProperty("ColorsCount")
  private Integer colorsCount = null;

  @JsonProperty("XmpData")
  private String xmpData = null;

  @JsonProperty("TranslationCfaDng")
  private List<String> translationCfaDng = null;

  public DngProperties dngVersion(Long dngVersion) {
    this.dngVersion = dngVersion;
    return this;
  }

  /**
   * Gets or sets the DNG version.
   * @return dngVersion
  **/
  public Long getDngVersion() {
    return dngVersion;
  }  

  public void setDngVersion(Long dngVersion) {
    this.dngVersion = dngVersion;
  }

  public DngProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Gets or sets the description of colors (RGBG, RGBE, GMCY or GBTG).
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  public void setDescription(String description) {
    this.description = description;
  }

  public DngProperties model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Gets or sets the camera model.
   * @return model
  **/
  public String getModel() {
    return model;
  }  

  public void setModel(String model) {
    this.model = model;
  }

  public DngProperties cameraManufacturer(String cameraManufacturer) {
    this.cameraManufacturer = cameraManufacturer;
    return this;
  }

  /**
   * Gets or sets the camera manufacturer.
   * @return cameraManufacturer
  **/
  public String getCameraManufacturer() {
    return cameraManufacturer;
  }  

  public void setCameraManufacturer(String cameraManufacturer) {
    this.cameraManufacturer = cameraManufacturer;
  }

  public DngProperties isFoveon(Long isFoveon) {
    this.isFoveon = isFoveon;
    return this;
  }

  /**
   * Gets or sets the value indicating whether it&#39;s a Foveon matrix.
   * @return isFoveon
  **/
  public Long getIsFoveon() {
    return isFoveon;
  }  

  public void setIsFoveon(Long isFoveon) {
    this.isFoveon = isFoveon;
  }

  public DngProperties software(String software) {
    this.software = software;
    return this;
  }

  /**
   * Gets or sets the software.
   * @return software
  **/
  public String getSoftware() {
    return software;
  }  

  public void setSoftware(String software) {
    this.software = software;
  }

  public DngProperties rawCount(Long rawCount) {
    this.rawCount = rawCount;
    return this;
  }

  /**
   * Gets or sets the number of RAW images in file (0 means that the file has not been recognized).
   * @return rawCount
  **/
  public Long getRawCount() {
    return rawCount;
  }  

  public void setRawCount(Long rawCount) {
    this.rawCount = rawCount;
  }

  public DngProperties filters(Long filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Gets or sets the bit mask describing the order of color pixels in the matrix.
   * @return filters
  **/
  public Long getFilters() {
    return filters;
  }  

  public void setFilters(Long filters) {
    this.filters = filters;
  }

  public DngProperties colorsCount(Integer colorsCount) {
    this.colorsCount = colorsCount;
    return this;
  }

  /**
   * Gets or sets the colors count.
   * @return colorsCount
  **/
  public Integer getColorsCount() {
    return colorsCount;
  }  

  public void setColorsCount(Integer colorsCount) {
    this.colorsCount = colorsCount;
  }

  public DngProperties xmpData(String xmpData) {
    this.xmpData = xmpData;
    return this;
  }

  /**
   * Gets or sets the XMP data.
   * @return xmpData
  **/
  public String getXmpData() {
    return xmpData;
  }  

  public void setXmpData(String xmpData) {
    this.xmpData = xmpData;
  }

  public DngProperties translationCfaDng(List<String> translationCfaDng) {
    this.translationCfaDng = translationCfaDng;
    return this;
  }

  public DngProperties addTranslationCfaDngItem(String translationCfaDngItem) {
    if (this.translationCfaDng == null) {
      this.translationCfaDng = new ArrayList<String>();
    }
    this.translationCfaDng.add(translationCfaDngItem);
    return this;
  }

  /**
   * Gets or sets the translation array for CFA mosaic of DNG format.
   * @return translationCfaDng
  **/
  public List<String> getTranslationCfaDng() {
    return translationCfaDng;
  }  

  public void setTranslationCfaDng(List<String> translationCfaDng) {
    this.translationCfaDng = translationCfaDng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DngProperties dngProperties = (DngProperties) o;
    return ObjectUtils.equals(this.dngVersion, dngProperties.dngVersion) &&
    ObjectUtils.equals(this.description, dngProperties.description) &&
    ObjectUtils.equals(this.model, dngProperties.model) &&
    ObjectUtils.equals(this.cameraManufacturer, dngProperties.cameraManufacturer) &&
    ObjectUtils.equals(this.isFoveon, dngProperties.isFoveon) &&
    ObjectUtils.equals(this.software, dngProperties.software) &&
    ObjectUtils.equals(this.rawCount, dngProperties.rawCount) &&
    ObjectUtils.equals(this.filters, dngProperties.filters) &&
    ObjectUtils.equals(this.colorsCount, dngProperties.colorsCount) &&
    ObjectUtils.equals(this.xmpData, dngProperties.xmpData) &&
    ObjectUtils.equals(this.translationCfaDng, dngProperties.translationCfaDng);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(dngVersion, description, model, cameraManufacturer, isFoveon, software, rawCount, filters, colorsCount, xmpData, translationCfaDng);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DngProperties {\n");
    
    sb.append("    dngVersion: ").append(toIndentedString(dngVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    cameraManufacturer: ").append(toIndentedString(cameraManufacturer)).append("\n");
    sb.append("    isFoveon: ").append(toIndentedString(isFoveon)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    rawCount: ").append(toIndentedString(rawCount)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    colorsCount: ").append(toIndentedString(colorsCount)).append("\n");
    sb.append("    xmpData: ").append(toIndentedString(xmpData)).append("\n");
    sb.append("    translationCfaDng: ").append(toIndentedString(translationCfaDng)).append("\n");
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

