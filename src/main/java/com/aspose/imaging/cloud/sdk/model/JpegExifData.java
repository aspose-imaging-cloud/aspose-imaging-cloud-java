/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JpegExifData.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
 * Represents EXIF data for JPEG
 */
public class JpegExifData extends ExifData {
  @JsonProperty("Artist")
  private String artist = null;

  @JsonProperty("Copyright")
  private String copyright = null;

  @JsonProperty("DateTime")
  private String dateTime = null;

  @JsonProperty("ImageDescription")
  private String imageDescription = null;

  @JsonProperty("Make")
  private String make = null;

  @JsonProperty("Model")
  private String model = null;

  @JsonProperty("Orientation")
  private String orientation = null;

  @JsonProperty("PrimaryChromaticities")
  private List<Double> primaryChromaticities = null;

  @JsonProperty("ReferenceBlackWhite")
  private List<Double> referenceBlackWhite = null;

  @JsonProperty("ResolutionUnit")
  private String resolutionUnit = null;

  @JsonProperty("Software")
  private String software = null;

  @JsonProperty("TransferFunction")
  private List<Integer> transferFunction = null;

  @JsonProperty("XResolution")
  private Double xresolution = null;

  @JsonProperty("YCbCrCoefficients")
  private List<Double> ycbCrCoefficients = null;

  @JsonProperty("YCbCrPositioning")
  private String ycbCrPositioning = null;

  @JsonProperty("YResolution")
  private Double yresolution = null;

  public JpegExifData artist(String artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Gets or sets the artist.
   * @return artist
  **/
  public String getArtist() {
    return artist;
  }  

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public JpegExifData copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * Gets or sets the copyright info.
   * @return copyright
  **/
  public String getCopyright() {
    return copyright;
  }  

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public JpegExifData dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Gets or sets the date and time.
   * @return dateTime
  **/
  public String getDateTime() {
    return dateTime;
  }  

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public JpegExifData imageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
    return this;
  }

  /**
   * Gets or sets the image description.
   * @return imageDescription
  **/
  public String getImageDescription() {
    return imageDescription;
  }  

  public void setImageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
  }

  public JpegExifData make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Gets or sets the manufacturer.
   * @return make
  **/
  public String getMake() {
    return make;
  }  

  public void setMake(String make) {
    this.make = make;
  }

  public JpegExifData model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Gets or sets the model.
   * @return model
  **/
  public String getModel() {
    return model;
  }  

  public void setModel(String model) {
    this.model = model;
  }

  public JpegExifData orientation(String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Gets or sets the orientation.
   * @return orientation
  **/
  public String getOrientation() {
    return orientation;
  }  

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public JpegExifData primaryChromaticities(List<Double> primaryChromaticities) {
    this.primaryChromaticities = primaryChromaticities;
    return this;
  }

  public JpegExifData addPrimaryChromaticitiesItem(Double primaryChromaticitiesItem) {
    if (this.primaryChromaticities == null) {
      this.primaryChromaticities = new ArrayList<Double>();
    }
    this.primaryChromaticities.add(primaryChromaticitiesItem);
    return this;
  }

  /**
   * Gets or sets the primary chromaticities.
   * @return primaryChromaticities
  **/
  public List<Double> getPrimaryChromaticities() {
    return primaryChromaticities;
  }  

  public void setPrimaryChromaticities(List<Double> primaryChromaticities) {
    this.primaryChromaticities = primaryChromaticities;
  }

  public JpegExifData referenceBlackWhite(List<Double> referenceBlackWhite) {
    this.referenceBlackWhite = referenceBlackWhite;
    return this;
  }

  public JpegExifData addReferenceBlackWhiteItem(Double referenceBlackWhiteItem) {
    if (this.referenceBlackWhite == null) {
      this.referenceBlackWhite = new ArrayList<Double>();
    }
    this.referenceBlackWhite.add(referenceBlackWhiteItem);
    return this;
  }

  /**
   * Gets or sets the reference black and white.
   * @return referenceBlackWhite
  **/
  public List<Double> getReferenceBlackWhite() {
    return referenceBlackWhite;
  }  

  public void setReferenceBlackWhite(List<Double> referenceBlackWhite) {
    this.referenceBlackWhite = referenceBlackWhite;
  }

  public JpegExifData resolutionUnit(String resolutionUnit) {
    this.resolutionUnit = resolutionUnit;
    return this;
  }

  /**
   * Gets or sets the resolution unit.
   * @return resolutionUnit
  **/
  public String getResolutionUnit() {
    return resolutionUnit;
  }  

  public void setResolutionUnit(String resolutionUnit) {
    this.resolutionUnit = resolutionUnit;
  }

  public JpegExifData software(String software) {
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

  public JpegExifData transferFunction(List<Integer> transferFunction) {
    this.transferFunction = transferFunction;
    return this;
  }

  public JpegExifData addTransferFunctionItem(Integer transferFunctionItem) {
    if (this.transferFunction == null) {
      this.transferFunction = new ArrayList<Integer>();
    }
    this.transferFunction.add(transferFunctionItem);
    return this;
  }

  /**
   * Gets or sets the transfer function.
   * @return transferFunction
  **/
  public List<Integer> getTransferFunction() {
    return transferFunction;
  }  

  public void setTransferFunction(List<Integer> transferFunction) {
    this.transferFunction = transferFunction;
  }

  public JpegExifData xresolution(Double xresolution) {
    this.xresolution = xresolution;
    return this;
  }

  /**
   * Gets or sets the X resolution.
   * @return xresolution
  **/
  public Double getXresolution() {
    return xresolution;
  }  

  public void setXresolution(Double xresolution) {
    this.xresolution = xresolution;
  }

  public JpegExifData ycbCrCoefficients(List<Double> ycbCrCoefficients) {
    this.ycbCrCoefficients = ycbCrCoefficients;
    return this;
  }

  public JpegExifData addYcbCrCoefficientsItem(Double ycbCrCoefficientsItem) {
    if (this.ycbCrCoefficients == null) {
      this.ycbCrCoefficients = new ArrayList<Double>();
    }
    this.ycbCrCoefficients.add(ycbCrCoefficientsItem);
    return this;
  }

  /**
   * Gets or sets the YCbCr coefficients.
   * @return ycbCrCoefficients
  **/
  public List<Double> getYcbCrCoefficients() {
    return ycbCrCoefficients;
  }  

  public void setYcbCrCoefficients(List<Double> ycbCrCoefficients) {
    this.ycbCrCoefficients = ycbCrCoefficients;
  }

  public JpegExifData ycbCrPositioning(String ycbCrPositioning) {
    this.ycbCrPositioning = ycbCrPositioning;
    return this;
  }

  /**
   * Gets or sets the YCbCr positioning.
   * @return ycbCrPositioning
  **/
  public String getYcbCrPositioning() {
    return ycbCrPositioning;
  }  

  public void setYcbCrPositioning(String ycbCrPositioning) {
    this.ycbCrPositioning = ycbCrPositioning;
  }

  public JpegExifData yresolution(Double yresolution) {
    this.yresolution = yresolution;
    return this;
  }

  /**
   * Gets or sets the Y resolution.
   * @return yresolution
  **/
  public Double getYresolution() {
    return yresolution;
  }  

  public void setYresolution(Double yresolution) {
    this.yresolution = yresolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    JpegExifData jpegExifData = (JpegExifData) o;
    return ObjectUtils.equals(this.artist, jpegExifData.artist) &&
    ObjectUtils.equals(this.copyright, jpegExifData.copyright) &&
    ObjectUtils.equals(this.dateTime, jpegExifData.dateTime) &&
    ObjectUtils.equals(this.imageDescription, jpegExifData.imageDescription) &&
    ObjectUtils.equals(this.make, jpegExifData.make) &&
    ObjectUtils.equals(this.model, jpegExifData.model) &&
    ObjectUtils.equals(this.orientation, jpegExifData.orientation) &&
    ObjectUtils.equals(this.primaryChromaticities, jpegExifData.primaryChromaticities) &&
    ObjectUtils.equals(this.referenceBlackWhite, jpegExifData.referenceBlackWhite) &&
    ObjectUtils.equals(this.resolutionUnit, jpegExifData.resolutionUnit) &&
    ObjectUtils.equals(this.software, jpegExifData.software) &&
    ObjectUtils.equals(this.transferFunction, jpegExifData.transferFunction) &&
    ObjectUtils.equals(this.xresolution, jpegExifData.xresolution) &&
    ObjectUtils.equals(this.ycbCrCoefficients, jpegExifData.ycbCrCoefficients) &&
    ObjectUtils.equals(this.ycbCrPositioning, jpegExifData.ycbCrPositioning) &&
    ObjectUtils.equals(this.yresolution, jpegExifData.yresolution) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(artist, copyright, dateTime, imageDescription, make, model, orientation, primaryChromaticities, referenceBlackWhite, resolutionUnit, software, transferFunction, xresolution, ycbCrCoefficients, ycbCrPositioning, yresolution, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JpegExifData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    primaryChromaticities: ").append(toIndentedString(primaryChromaticities)).append("\n");
    sb.append("    referenceBlackWhite: ").append(toIndentedString(referenceBlackWhite)).append("\n");
    sb.append("    resolutionUnit: ").append(toIndentedString(resolutionUnit)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    transferFunction: ").append(toIndentedString(transferFunction)).append("\n");
    sb.append("    xresolution: ").append(toIndentedString(xresolution)).append("\n");
    sb.append("    ycbCrCoefficients: ").append(toIndentedString(ycbCrCoefficients)).append("\n");
    sb.append("    ycbCrPositioning: ").append(toIndentedString(ycbCrPositioning)).append("\n");
    sb.append("    yresolution: ").append(toIndentedString(yresolution)).append("\n");
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

