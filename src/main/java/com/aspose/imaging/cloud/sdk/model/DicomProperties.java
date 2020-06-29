/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DicomProperties.java">
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
 * Represents information about image in dicom format.
 */
public class DicomProperties {
  @JsonProperty("planarConfiguration")
  private Integer planarConfiguration = null;

  @JsonProperty("reds")
  private byte[] reds = null;

  @JsonProperty("greens")
  private byte[] greens = null;

  @JsonProperty("blues")
  private byte[] blues = null;

  @JsonProperty("dicomHeaderInfoByBytes")
  private byte[] dicomHeaderInfoByBytes = null;

  @JsonProperty("signedImage")
  private Boolean signedImage = null;

  @JsonProperty("dicomInfo")
  private List<String> dicomInfo = null;

  @JsonProperty("samplesPerPixel")
  private Integer samplesPerPixel = null;

  @JsonProperty("bitsAllocated")
  private Integer bitsAllocated = null;

  @JsonProperty("photoInterpretation")
  private String photoInterpretation = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("windowCentre")
  private Double windowCentre = null;

  @JsonProperty("windowWidth")
  private Double windowWidth = null;

  @JsonProperty("pixelRepresentation")
  private Integer pixelRepresentation = null;

  @JsonProperty("rescaleIntercept")
  private Double rescaleIntercept = null;

  @JsonProperty("rescaleSlope")
  private Double rescaleSlope = null;

  @JsonProperty("numberOfFrames")
  private Integer numberOfFrames = null;

  @JsonProperty("isLittleEndian")
  private Boolean isLittleEndian = null;

  @JsonProperty("offset")
  private Integer offset = null;

  public DicomProperties planarConfiguration(Integer planarConfiguration) {
    this.planarConfiguration = planarConfiguration;
    return this;
  }

  /**
   * Gets or sets the planar configuration.
   * @return planarConfiguration
  **/
  public Integer getPlanarConfiguration() {
    return planarConfiguration;
  }  

  public void setPlanarConfiguration(Integer planarConfiguration) {
    this.planarConfiguration = planarConfiguration;
  }

  public DicomProperties reds(byte[] reds) {
    this.reds = reds;
    return this;
  }

  /**
   * Gets or sets the array of red colors.
   * @return reds
  **/
  public byte[] getReds() {
    return reds;
  }  

  public void setReds(byte[] reds) {
    this.reds = reds;
  }

  public DicomProperties greens(byte[] greens) {
    this.greens = greens;
    return this;
  }

  /**
   * Gets or sets the array of green colors.
   * @return greens
  **/
  public byte[] getGreens() {
    return greens;
  }  

  public void setGreens(byte[] greens) {
    this.greens = greens;
  }

  public DicomProperties blues(byte[] blues) {
    this.blues = blues;
    return this;
  }

  /**
   * Gets or sets the array of blue colors.
   * @return blues
  **/
  public byte[] getBlues() {
    return blues;
  }  

  public void setBlues(byte[] blues) {
    this.blues = blues;
  }

  public DicomProperties dicomHeaderInfoByBytes(byte[] dicomHeaderInfoByBytes) {
    this.dicomHeaderInfoByBytes = dicomHeaderInfoByBytes;
    return this;
  }

  /**
   * Gets or sets the header information by bytes.
   * @return dicomHeaderInfoByBytes
  **/
  public byte[] getDicomHeaderInfoByBytes() {
    return dicomHeaderInfoByBytes;
  }  

  public void setDicomHeaderInfoByBytes(byte[] dicomHeaderInfoByBytes) {
    this.dicomHeaderInfoByBytes = dicomHeaderInfoByBytes;
  }

  public DicomProperties signedImage(Boolean signedImage) {
    this.signedImage = signedImage;
    return this;
  }

  /**
   * Gets or sets a value indicating whether it&#39;s a signed image.
   * @return signedImage
  **/
  public Boolean isSignedImage() {
    return signedImage;
  }  

  public void setSignedImage(Boolean signedImage) {
    this.signedImage = signedImage;
  }

  public DicomProperties dicomInfo(List<String> dicomInfo) {
    this.dicomInfo = dicomInfo;
    return this;
  }

  public DicomProperties addDicomInfoItem(String dicomInfoItem) {
    if (this.dicomInfo == null) {
      this.dicomInfo = new ArrayList<String>();
    }
    this.dicomInfo.add(dicomInfoItem);
    return this;
  }

  /**
   * Gets or sets the header information of the DICOM file.
   * @return dicomInfo
  **/
  public List<String> getDicomInfo() {
    return dicomInfo;
  }  

  public void setDicomInfo(List<String> dicomInfo) {
    this.dicomInfo = dicomInfo;
  }

  public DicomProperties samplesPerPixel(Integer samplesPerPixel) {
    this.samplesPerPixel = samplesPerPixel;
    return this;
  }

  /**
   * Gets or sets samples per pixel count.
   * @return samplesPerPixel
  **/
  public Integer getSamplesPerPixel() {
    return samplesPerPixel;
  }  

  public void setSamplesPerPixel(Integer samplesPerPixel) {
    this.samplesPerPixel = samplesPerPixel;
  }

  public DicomProperties bitsAllocated(Integer bitsAllocated) {
    this.bitsAllocated = bitsAllocated;
    return this;
  }

  /**
   * Gets or sets allocated bits count.
   * @return bitsAllocated
  **/
  public Integer getBitsAllocated() {
    return bitsAllocated;
  }  

  public void setBitsAllocated(Integer bitsAllocated) {
    this.bitsAllocated = bitsAllocated;
  }

  public DicomProperties photoInterpretation(String photoInterpretation) {
    this.photoInterpretation = photoInterpretation;
    return this;
  }

  /**
   * Gets or sets the photo interpretation.
   * @return photoInterpretation
  **/
  public String getPhotoInterpretation() {
    return photoInterpretation;
  }  

  public void setPhotoInterpretation(String photoInterpretation) {
    this.photoInterpretation = photoInterpretation;
  }

  public DicomProperties width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Gets or sets the width.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }  

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DicomProperties height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Gets or sets the height.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }  

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DicomProperties windowCentre(Double windowCentre) {
    this.windowCentre = windowCentre;
    return this;
  }

  /**
   * Gets or sets the window centre.
   * @return windowCentre
  **/
  public Double getWindowCentre() {
    return windowCentre;
  }  

  public void setWindowCentre(Double windowCentre) {
    this.windowCentre = windowCentre;
  }

  public DicomProperties windowWidth(Double windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

  /**
   * Gets or sets the width of the window.
   * @return windowWidth
  **/
  public Double getWindowWidth() {
    return windowWidth;
  }  

  public void setWindowWidth(Double windowWidth) {
    this.windowWidth = windowWidth;
  }

  public DicomProperties pixelRepresentation(Integer pixelRepresentation) {
    this.pixelRepresentation = pixelRepresentation;
    return this;
  }

  /**
   * Gets or sets data representation of the pixel samples.
   * @return pixelRepresentation
  **/
  public Integer getPixelRepresentation() {
    return pixelRepresentation;
  }  

  public void setPixelRepresentation(Integer pixelRepresentation) {
    this.pixelRepresentation = pixelRepresentation;
  }

  public DicomProperties rescaleIntercept(Double rescaleIntercept) {
    this.rescaleIntercept = rescaleIntercept;
    return this;
  }

  /**
   * Gets or sets a value of the rescale intercept.
   * @return rescaleIntercept
  **/
  public Double getRescaleIntercept() {
    return rescaleIntercept;
  }  

  public void setRescaleIntercept(Double rescaleIntercept) {
    this.rescaleIntercept = rescaleIntercept;
  }

  public DicomProperties rescaleSlope(Double rescaleSlope) {
    this.rescaleSlope = rescaleSlope;
    return this;
  }

  /**
   * Gets or sets a value of the rescale slope.
   * @return rescaleSlope
  **/
  public Double getRescaleSlope() {
    return rescaleSlope;
  }  

  public void setRescaleSlope(Double rescaleSlope) {
    this.rescaleSlope = rescaleSlope;
  }

  public DicomProperties numberOfFrames(Integer numberOfFrames) {
    this.numberOfFrames = numberOfFrames;
    return this;
  }

  /**
   * Gets or sets the number of frames.
   * @return numberOfFrames
  **/
  public Integer getNumberOfFrames() {
    return numberOfFrames;
  }  

  public void setNumberOfFrames(Integer numberOfFrames) {
    this.numberOfFrames = numberOfFrames;
  }

  public DicomProperties isLittleEndian(Boolean isLittleEndian) {
    this.isLittleEndian = isLittleEndian;
    return this;
  }

  /**
   * Indicates if DICOM image has little endian byte order.
   * @return isLittleEndian
  **/
  public Boolean isIsLittleEndian() {
    return isLittleEndian;
  }  

  public void setIsLittleEndian(Boolean isLittleEndian) {
    this.isLittleEndian = isLittleEndian;
  }

  public DicomProperties offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Gets or sets the offset.
   * @return offset
  **/
  public Integer getOffset() {
    return offset;
  }  

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DicomProperties dicomProperties = (DicomProperties) o;
    return ObjectUtils.equals(this.planarConfiguration, dicomProperties.planarConfiguration) &&
    ObjectUtils.equals(this.reds, dicomProperties.reds) &&
    ObjectUtils.equals(this.greens, dicomProperties.greens) &&
    ObjectUtils.equals(this.blues, dicomProperties.blues) &&
    ObjectUtils.equals(this.dicomHeaderInfoByBytes, dicomProperties.dicomHeaderInfoByBytes) &&
    ObjectUtils.equals(this.signedImage, dicomProperties.signedImage) &&
    ObjectUtils.equals(this.dicomInfo, dicomProperties.dicomInfo) &&
    ObjectUtils.equals(this.samplesPerPixel, dicomProperties.samplesPerPixel) &&
    ObjectUtils.equals(this.bitsAllocated, dicomProperties.bitsAllocated) &&
    ObjectUtils.equals(this.photoInterpretation, dicomProperties.photoInterpretation) &&
    ObjectUtils.equals(this.width, dicomProperties.width) &&
    ObjectUtils.equals(this.height, dicomProperties.height) &&
    ObjectUtils.equals(this.windowCentre, dicomProperties.windowCentre) &&
    ObjectUtils.equals(this.windowWidth, dicomProperties.windowWidth) &&
    ObjectUtils.equals(this.pixelRepresentation, dicomProperties.pixelRepresentation) &&
    ObjectUtils.equals(this.rescaleIntercept, dicomProperties.rescaleIntercept) &&
    ObjectUtils.equals(this.rescaleSlope, dicomProperties.rescaleSlope) &&
    ObjectUtils.equals(this.numberOfFrames, dicomProperties.numberOfFrames) &&
    ObjectUtils.equals(this.isLittleEndian, dicomProperties.isLittleEndian) &&
    ObjectUtils.equals(this.offset, dicomProperties.offset);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(planarConfiguration, reds, greens, blues, dicomHeaderInfoByBytes, signedImage, dicomInfo, samplesPerPixel, bitsAllocated, photoInterpretation, width, height, windowCentre, windowWidth, pixelRepresentation, rescaleIntercept, rescaleSlope, numberOfFrames, isLittleEndian, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DicomProperties {\n");
    
    sb.append("    planarConfiguration: ").append(toIndentedString(planarConfiguration)).append("\n");
    sb.append("    reds: ").append(toIndentedString(reds)).append("\n");
    sb.append("    greens: ").append(toIndentedString(greens)).append("\n");
    sb.append("    blues: ").append(toIndentedString(blues)).append("\n");
    sb.append("    dicomHeaderInfoByBytes: ").append(toIndentedString(dicomHeaderInfoByBytes)).append("\n");
    sb.append("    signedImage: ").append(toIndentedString(signedImage)).append("\n");
    sb.append("    dicomInfo: ").append(toIndentedString(dicomInfo)).append("\n");
    sb.append("    samplesPerPixel: ").append(toIndentedString(samplesPerPixel)).append("\n");
    sb.append("    bitsAllocated: ").append(toIndentedString(bitsAllocated)).append("\n");
    sb.append("    photoInterpretation: ").append(toIndentedString(photoInterpretation)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    windowCentre: ").append(toIndentedString(windowCentre)).append("\n");
    sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
    sb.append("    pixelRepresentation: ").append(toIndentedString(pixelRepresentation)).append("\n");
    sb.append("    rescaleIntercept: ").append(toIndentedString(rescaleIntercept)).append("\n");
    sb.append("    rescaleSlope: ").append(toIndentedString(rescaleSlope)).append("\n");
    sb.append("    numberOfFrames: ").append(toIndentedString(numberOfFrames)).append("\n");
    sb.append("    isLittleEndian: ").append(toIndentedString(isLittleEndian)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

