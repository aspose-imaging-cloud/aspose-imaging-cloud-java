/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffOptions.java">
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

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents options for TIFF frame.
 */
public class TiffOptions {
  @JsonProperty("IsValid")
  private Boolean isValid = null;

  @JsonProperty("Artist")
  private String artist = null;

  @JsonProperty("ByteOrder")
  private String byteOrder = null;

  @JsonProperty("BitsPerSample")
  private List<Integer> bitsPerSample = null;

  @JsonProperty("Compression")
  private String compression = null;

  @JsonProperty("Copyright")
  private String copyright = null;

  @JsonProperty("ColorMap")
  private List<Integer> colorMap = null;

  @JsonProperty("DateTime")
  private String dateTime = null;

  @JsonProperty("DocumentName")
  private String documentName = null;

  @JsonProperty("AlphaStorage")
  private String alphaStorage = null;

  @JsonProperty("FillOrder")
  private String fillOrder = null;

  @JsonProperty("HalfToneHints")
  private List<Integer> halfToneHints = null;

  @JsonProperty("ImageDescription")
  private String imageDescription = null;

  @JsonProperty("InkNames")
  private String inkNames = null;

  @JsonProperty("ScannerManufacturer")
  private String scannerManufacturer = null;

  @JsonProperty("MaxSampleValue")
  private List<Integer> maxSampleValue = null;

  @JsonProperty("MinSampleValue")
  private List<Integer> minSampleValue = null;

  @JsonProperty("ScannerModel")
  private String scannerModel = null;

  @JsonProperty("PageName")
  private String pageName = null;

  @JsonProperty("Orientation")
  private String orientation = null;

  @JsonProperty("PageNumber")
  private List<Integer> pageNumber = null;

  @JsonProperty("Photometric")
  private String photometric = null;

  @JsonProperty("PlanarConfiguration")
  private String planarConfiguration = null;

  @JsonProperty("ResolutionUnit")
  private String resolutionUnit = null;

  @JsonProperty("RowsPerStrip")
  private Long rowsPerStrip = null;

  @JsonProperty("SampleFormat")
  private List<String> sampleFormat = null;

  @JsonProperty("SamplesPerPixel")
  private Integer samplesPerPixel = null;

  @JsonProperty("SmaxSampleValue")
  private List<Long> smaxSampleValue = null;

  @JsonProperty("SminSampleValue")
  private List<Long> sminSampleValue = null;

  @JsonProperty("SoftwareType")
  private String softwareType = null;

  @JsonProperty("StripByteCounts")
  private List<Long> stripByteCounts = null;

  @JsonProperty("StripOffsets")
  private List<Long> stripOffsets = null;

  @JsonProperty("SubFileType")
  private String subFileType = null;

  @JsonProperty("TargetPrinter")
  private String targetPrinter = null;

  @JsonProperty("Threshholding")
  private String threshholding = null;

  @JsonProperty("TotalPages")
  private Integer totalPages = null;

  @JsonProperty("Xposition")
  private Double xposition = null;

  @JsonProperty("Xresolution")
  private Double xresolution = null;

  @JsonProperty("Yposition")
  private Double yposition = null;

  @JsonProperty("Yresolution")
  private Double yresolution = null;

  @JsonProperty("FaxT4Options")
  private String faxT4Options = null;

  @JsonProperty("Predictor")
  private String predictor = null;

  @JsonProperty("ImageLength")
  private Long imageLength = null;

  @JsonProperty("ImageWidth")
  private Long imageWidth = null;

  @JsonProperty("ValidTagCount")
  private Integer validTagCount = null;

  @JsonProperty("BitsPerPixel")
  private Integer bitsPerPixel = null;

  public TiffOptions isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Gets or sets a value indicating whether TIFF image has valid data.
   * @return isValid
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether TIFF image has valid data.")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public TiffOptions artist(String artist) {
    this.artist = artist;
    return this;
  }

   /**
   * Gets or sets the artist.
   * @return artist
  **/
  @ApiModelProperty(value = "Gets or sets the artist.")
  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public TiffOptions byteOrder(String byteOrder) {
    this.byteOrder = byteOrder;
    return this;
  }

   /**
   * Gets or sets the byte order.
   * @return byteOrder
  **/
  @ApiModelProperty(value = "Gets or sets the byte order.")
  public String getByteOrder() {
    return byteOrder;
  }

  public void setByteOrder(String byteOrder) {
    this.byteOrder = byteOrder;
  }

  public TiffOptions bitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
    return this;
  }

  public TiffOptions addBitsPerSampleItem(Integer bitsPerSampleItem) {
    if (this.bitsPerSample == null) {
      this.bitsPerSample = new ArrayList<Integer>();
    }
    this.bitsPerSample.add(bitsPerSampleItem);
    return this;
  }

   /**
   * Gets or sets the bits per sample.
   * @return bitsPerSample
  **/
  @ApiModelProperty(value = "Gets or sets the bits per sample.")
  public List<Integer> getBitsPerSample() {
    return bitsPerSample;
  }

  public void setBitsPerSample(List<Integer> bitsPerSample) {
    this.bitsPerSample = bitsPerSample;
  }

  public TiffOptions compression(String compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Gets or sets the compression.
   * @return compression
  **/
  @ApiModelProperty(value = "Gets or sets the compression.")
  public String getCompression() {
    return compression;
  }

  public void setCompression(String compression) {
    this.compression = compression;
  }

  public TiffOptions copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * Gets or sets the copyright info.
   * @return copyright
  **/
  @ApiModelProperty(value = "Gets or sets the copyright info.")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public TiffOptions colorMap(List<Integer> colorMap) {
    this.colorMap = colorMap;
    return this;
  }

  public TiffOptions addColorMapItem(Integer colorMapItem) {
    if (this.colorMap == null) {
      this.colorMap = new ArrayList<Integer>();
    }
    this.colorMap.add(colorMapItem);
    return this;
  }

   /**
   * Gets or sets the color map.
   * @return colorMap
  **/
  @ApiModelProperty(value = "Gets or sets the color map.")
  public List<Integer> getColorMap() {
    return colorMap;
  }

  public void setColorMap(List<Integer> colorMap) {
    this.colorMap = colorMap;
  }

  public TiffOptions dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Gets or sets the date and time.
   * @return dateTime
  **/
  @ApiModelProperty(value = "Gets or sets the date and time.")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public TiffOptions documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
   * Gets or sets the document name.
   * @return documentName
  **/
  @ApiModelProperty(value = "Gets or sets the document name.")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public TiffOptions alphaStorage(String alphaStorage) {
    this.alphaStorage = alphaStorage;
    return this;
  }

   /**
   * Gets or sets the alpha storage.
   * @return alphaStorage
  **/
  @ApiModelProperty(value = "Gets or sets the alpha storage.")
  public String getAlphaStorage() {
    return alphaStorage;
  }

  public void setAlphaStorage(String alphaStorage) {
    this.alphaStorage = alphaStorage;
  }

  public TiffOptions fillOrder(String fillOrder) {
    this.fillOrder = fillOrder;
    return this;
  }

   /**
   * Gets or sets the fill order.
   * @return fillOrder
  **/
  @ApiModelProperty(value = "Gets or sets the fill order.")
  public String getFillOrder() {
    return fillOrder;
  }

  public void setFillOrder(String fillOrder) {
    this.fillOrder = fillOrder;
  }

  public TiffOptions halfToneHints(List<Integer> halfToneHints) {
    this.halfToneHints = halfToneHints;
    return this;
  }

  public TiffOptions addHalfToneHintsItem(Integer halfToneHintsItem) {
    if (this.halfToneHints == null) {
      this.halfToneHints = new ArrayList<Integer>();
    }
    this.halfToneHints.add(halfToneHintsItem);
    return this;
  }

   /**
   * Gets or sets the half-tone hints.
   * @return halfToneHints
  **/
  @ApiModelProperty(value = "Gets or sets the half-tone hints.")
  public List<Integer> getHalfToneHints() {
    return halfToneHints;
  }

  public void setHalfToneHints(List<Integer> halfToneHints) {
    this.halfToneHints = halfToneHints;
  }

  public TiffOptions imageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
    return this;
  }

   /**
   * Gets or sets the image description.
   * @return imageDescription
  **/
  @ApiModelProperty(value = "Gets or sets the image description.")
  public String getImageDescription() {
    return imageDescription;
  }

  public void setImageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
  }

  public TiffOptions inkNames(String inkNames) {
    this.inkNames = inkNames;
    return this;
  }

   /**
   * Gets or sets the ink names.
   * @return inkNames
  **/
  @ApiModelProperty(value = "Gets or sets the ink names.")
  public String getInkNames() {
    return inkNames;
  }

  public void setInkNames(String inkNames) {
    this.inkNames = inkNames;
  }

  public TiffOptions scannerManufacturer(String scannerManufacturer) {
    this.scannerManufacturer = scannerManufacturer;
    return this;
  }

   /**
   * Gets or sets the scanner manufacturer.
   * @return scannerManufacturer
  **/
  @ApiModelProperty(value = "Gets or sets the scanner manufacturer.")
  public String getScannerManufacturer() {
    return scannerManufacturer;
  }

  public void setScannerManufacturer(String scannerManufacturer) {
    this.scannerManufacturer = scannerManufacturer;
  }

  public TiffOptions maxSampleValue(List<Integer> maxSampleValue) {
    this.maxSampleValue = maxSampleValue;
    return this;
  }

  public TiffOptions addMaxSampleValueItem(Integer maxSampleValueItem) {
    if (this.maxSampleValue == null) {
      this.maxSampleValue = new ArrayList<Integer>();
    }
    this.maxSampleValue.add(maxSampleValueItem);
    return this;
  }

   /**
   * Gets or sets the max sample value.
   * @return maxSampleValue
  **/
  @ApiModelProperty(value = "Gets or sets the max sample value.")
  public List<Integer> getMaxSampleValue() {
    return maxSampleValue;
  }

  public void setMaxSampleValue(List<Integer> maxSampleValue) {
    this.maxSampleValue = maxSampleValue;
  }

  public TiffOptions minSampleValue(List<Integer> minSampleValue) {
    this.minSampleValue = minSampleValue;
    return this;
  }

  public TiffOptions addMinSampleValueItem(Integer minSampleValueItem) {
    if (this.minSampleValue == null) {
      this.minSampleValue = new ArrayList<Integer>();
    }
    this.minSampleValue.add(minSampleValueItem);
    return this;
  }

   /**
   * Gets or sets the min sample value.
   * @return minSampleValue
  **/
  @ApiModelProperty(value = "Gets or sets the min sample value.")
  public List<Integer> getMinSampleValue() {
    return minSampleValue;
  }

  public void setMinSampleValue(List<Integer> minSampleValue) {
    this.minSampleValue = minSampleValue;
  }

  public TiffOptions scannerModel(String scannerModel) {
    this.scannerModel = scannerModel;
    return this;
  }

   /**
   * Gets or sets the scanner model.
   * @return scannerModel
  **/
  @ApiModelProperty(value = "Gets or sets the scanner model.")
  public String getScannerModel() {
    return scannerModel;
  }

  public void setScannerModel(String scannerModel) {
    this.scannerModel = scannerModel;
  }

  public TiffOptions pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

   /**
   * Gets or sets the page name.
   * @return pageName
  **/
  @ApiModelProperty(value = "Gets or sets the page name.")
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public TiffOptions orientation(String orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Gets or sets the orientation.
   * @return orientation
  **/
  @ApiModelProperty(value = "Gets or sets the orientation.")
  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public TiffOptions pageNumber(List<Integer> pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  public TiffOptions addPageNumberItem(Integer pageNumberItem) {
    if (this.pageNumber == null) {
      this.pageNumber = new ArrayList<Integer>();
    }
    this.pageNumber.add(pageNumberItem);
    return this;
  }

   /**
   * Gets or sets the page number.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Gets or sets the page number.")
  public List<Integer> getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(List<Integer> pageNumber) {
    this.pageNumber = pageNumber;
  }

  public TiffOptions photometric(String photometric) {
    this.photometric = photometric;
    return this;
  }

   /**
   * Gets or sets the photometric interpretation.
   * @return photometric
  **/
  @ApiModelProperty(value = "Gets or sets the photometric interpretation.")
  public String getPhotometric() {
    return photometric;
  }

  public void setPhotometric(String photometric) {
    this.photometric = photometric;
  }

  public TiffOptions planarConfiguration(String planarConfiguration) {
    this.planarConfiguration = planarConfiguration;
    return this;
  }

   /**
   * Gets or sets the planar configuration.
   * @return planarConfiguration
  **/
  @ApiModelProperty(value = "Gets or sets the planar configuration.")
  public String getPlanarConfiguration() {
    return planarConfiguration;
  }

  public void setPlanarConfiguration(String planarConfiguration) {
    this.planarConfiguration = planarConfiguration;
  }

  public TiffOptions resolutionUnit(String resolutionUnit) {
    this.resolutionUnit = resolutionUnit;
    return this;
  }

   /**
   * Gets or sets the resolution unit.
   * @return resolutionUnit
  **/
  @ApiModelProperty(value = "Gets or sets the resolution unit.")
  public String getResolutionUnit() {
    return resolutionUnit;
  }

  public void setResolutionUnit(String resolutionUnit) {
    this.resolutionUnit = resolutionUnit;
  }

  public TiffOptions rowsPerStrip(Long rowsPerStrip) {
    this.rowsPerStrip = rowsPerStrip;
    return this;
  }

   /**
   * Gets or sets the rows per strip.
   * @return rowsPerStrip
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the rows per strip.")
  public Long getRowsPerStrip() {
    return rowsPerStrip;
  }

  public void setRowsPerStrip(Long rowsPerStrip) {
    this.rowsPerStrip = rowsPerStrip;
  }

  public TiffOptions sampleFormat(List<String> sampleFormat) {
    this.sampleFormat = sampleFormat;
    return this;
  }

  public TiffOptions addSampleFormatItem(String sampleFormatItem) {
    if (this.sampleFormat == null) {
      this.sampleFormat = new ArrayList<String>();
    }
    this.sampleFormat.add(sampleFormatItem);
    return this;
  }

   /**
   * Gets or sets the sample format.
   * @return sampleFormat
  **/
  @ApiModelProperty(value = "Gets or sets the sample format.")
  public List<String> getSampleFormat() {
    return sampleFormat;
  }

  public void setSampleFormat(List<String> sampleFormat) {
    this.sampleFormat = sampleFormat;
  }

  public TiffOptions samplesPerPixel(Integer samplesPerPixel) {
    this.samplesPerPixel = samplesPerPixel;
    return this;
  }

   /**
   * Gets or sets the samples per pixel.
   * @return samplesPerPixel
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the samples per pixel.")
  public Integer getSamplesPerPixel() {
    return samplesPerPixel;
  }

  public void setSamplesPerPixel(Integer samplesPerPixel) {
    this.samplesPerPixel = samplesPerPixel;
  }

  public TiffOptions smaxSampleValue(List<Long> smaxSampleValue) {
    this.smaxSampleValue = smaxSampleValue;
    return this;
  }

  public TiffOptions addSmaxSampleValueItem(Long smaxSampleValueItem) {
    if (this.smaxSampleValue == null) {
      this.smaxSampleValue = new ArrayList<Long>();
    }
    this.smaxSampleValue.add(smaxSampleValueItem);
    return this;
  }

   /**
   * Gets or sets the Smax sample value.
   * @return smaxSampleValue
  **/
  @ApiModelProperty(value = "Gets or sets the Smax sample value.")
  public List<Long> getSmaxSampleValue() {
    return smaxSampleValue;
  }

  public void setSmaxSampleValue(List<Long> smaxSampleValue) {
    this.smaxSampleValue = smaxSampleValue;
  }

  public TiffOptions sminSampleValue(List<Long> sminSampleValue) {
    this.sminSampleValue = sminSampleValue;
    return this;
  }

  public TiffOptions addSminSampleValueItem(Long sminSampleValueItem) {
    if (this.sminSampleValue == null) {
      this.sminSampleValue = new ArrayList<Long>();
    }
    this.sminSampleValue.add(sminSampleValueItem);
    return this;
  }

   /**
   * Gets or sets the Smin sample value.
   * @return sminSampleValue
  **/
  @ApiModelProperty(value = "Gets or sets the Smin sample value.")
  public List<Long> getSminSampleValue() {
    return sminSampleValue;
  }

  public void setSminSampleValue(List<Long> sminSampleValue) {
    this.sminSampleValue = sminSampleValue;
  }

  public TiffOptions softwareType(String softwareType) {
    this.softwareType = softwareType;
    return this;
  }

   /**
   * Gets or sets the software type.
   * @return softwareType
  **/
  @ApiModelProperty(value = "Gets or sets the software type.")
  public String getSoftwareType() {
    return softwareType;
  }

  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }

  public TiffOptions stripByteCounts(List<Long> stripByteCounts) {
    this.stripByteCounts = stripByteCounts;
    return this;
  }

  public TiffOptions addStripByteCountsItem(Long stripByteCountsItem) {
    if (this.stripByteCounts == null) {
      this.stripByteCounts = new ArrayList<Long>();
    }
    this.stripByteCounts.add(stripByteCountsItem);
    return this;
  }

   /**
   * Gets or sets the strip byte counts.
   * @return stripByteCounts
  **/
  @ApiModelProperty(value = "Gets or sets the strip byte counts.")
  public List<Long> getStripByteCounts() {
    return stripByteCounts;
  }

  public void setStripByteCounts(List<Long> stripByteCounts) {
    this.stripByteCounts = stripByteCounts;
  }

  public TiffOptions stripOffsets(List<Long> stripOffsets) {
    this.stripOffsets = stripOffsets;
    return this;
  }

  public TiffOptions addStripOffsetsItem(Long stripOffsetsItem) {
    if (this.stripOffsets == null) {
      this.stripOffsets = new ArrayList<Long>();
    }
    this.stripOffsets.add(stripOffsetsItem);
    return this;
  }

   /**
   * Gets or sets the strip offsets.
   * @return stripOffsets
  **/
  @ApiModelProperty(value = "Gets or sets the strip offsets.")
  public List<Long> getStripOffsets() {
    return stripOffsets;
  }

  public void setStripOffsets(List<Long> stripOffsets) {
    this.stripOffsets = stripOffsets;
  }

  public TiffOptions subFileType(String subFileType) {
    this.subFileType = subFileType;
    return this;
  }

   /**
   * Gets or sets the subfile type.
   * @return subFileType
  **/
  @ApiModelProperty(value = "Gets or sets the subfile type.")
  public String getSubFileType() {
    return subFileType;
  }

  public void setSubFileType(String subFileType) {
    this.subFileType = subFileType;
  }

  public TiffOptions targetPrinter(String targetPrinter) {
    this.targetPrinter = targetPrinter;
    return this;
  }

   /**
   * Gets or sets the target printer.
   * @return targetPrinter
  **/
  @ApiModelProperty(value = "Gets or sets the target printer.")
  public String getTargetPrinter() {
    return targetPrinter;
  }

  public void setTargetPrinter(String targetPrinter) {
    this.targetPrinter = targetPrinter;
  }

  public TiffOptions threshholding(String threshholding) {
    this.threshholding = threshholding;
    return this;
  }

   /**
   * Gets or sets the threshholding.
   * @return threshholding
  **/
  @ApiModelProperty(value = "Gets or sets the threshholding.")
  public String getThreshholding() {
    return threshholding;
  }

  public void setThreshholding(String threshholding) {
    this.threshholding = threshholding;
  }

  public TiffOptions totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Gets or sets the total pages count.
   * @return totalPages
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total pages count.")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public TiffOptions xposition(Double xposition) {
    this.xposition = xposition;
    return this;
  }

   /**
   * Gets or sets the X position.
   * @return xposition
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the X position.")
  public Double getXposition() {
    return xposition;
  }

  public void setXposition(Double xposition) {
    this.xposition = xposition;
  }

  public TiffOptions xresolution(Double xresolution) {
    this.xresolution = xresolution;
    return this;
  }

   /**
   * Gets or sets the X resolution.
   * @return xresolution
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the X resolution.")
  public Double getXresolution() {
    return xresolution;
  }

  public void setXresolution(Double xresolution) {
    this.xresolution = xresolution;
  }

  public TiffOptions yposition(Double yposition) {
    this.yposition = yposition;
    return this;
  }

   /**
   * Gets or sets the Y position.
   * @return yposition
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the Y position.")
  public Double getYposition() {
    return yposition;
  }

  public void setYposition(Double yposition) {
    this.yposition = yposition;
  }

  public TiffOptions yresolution(Double yresolution) {
    this.yresolution = yresolution;
    return this;
  }

   /**
   * Gets or sets the Y resolution.
   * @return yresolution
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the Y resolution.")
  public Double getYresolution() {
    return yresolution;
  }

  public void setYresolution(Double yresolution) {
    this.yresolution = yresolution;
  }

  public TiffOptions faxT4Options(String faxT4Options) {
    this.faxT4Options = faxT4Options;
    return this;
  }

   /**
   * Gets or sets the FaxT4 Options.
   * @return faxT4Options
  **/
  @ApiModelProperty(value = "Gets or sets the FaxT4 Options.")
  public String getFaxT4Options() {
    return faxT4Options;
  }

  public void setFaxT4Options(String faxT4Options) {
    this.faxT4Options = faxT4Options;
  }

  public TiffOptions predictor(String predictor) {
    this.predictor = predictor;
    return this;
  }

   /**
   * Gets or sets the predictor (a mathematical operator that is applied to the image data before an encoding scheme is applied).
   * @return predictor
  **/
  @ApiModelProperty(value = "Gets or sets the predictor (a mathematical operator that is applied to the image data before an encoding scheme is applied).")
  public String getPredictor() {
    return predictor;
  }

  public void setPredictor(String predictor) {
    this.predictor = predictor;
  }

  public TiffOptions imageLength(Long imageLength) {
    this.imageLength = imageLength;
    return this;
  }

   /**
   * Gets or sets the image length.
   * @return imageLength
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the image length.")
  public Long getImageLength() {
    return imageLength;
  }

  public void setImageLength(Long imageLength) {
    this.imageLength = imageLength;
  }

  public TiffOptions imageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Gets or sets the image width.
   * @return imageWidth
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the image width.")
  public Long getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
  }

  public TiffOptions validTagCount(Integer validTagCount) {
    this.validTagCount = validTagCount;
    return this;
  }

   /**
   * Gets or sets the valid tag count.
   * @return validTagCount
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the valid tag count.")
  public Integer getValidTagCount() {
    return validTagCount;
  }

  public void setValidTagCount(Integer validTagCount) {
    this.validTagCount = validTagCount;
  }

  public TiffOptions bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

   /**
   * Gets or sets the bits per pixel.
   * @return bitsPerPixel
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the bits per pixel.")
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffOptions tiffOptions = (TiffOptions) o;
    return Objects.equals(this.isValid, tiffOptions.isValid) &&
        Objects.equals(this.artist, tiffOptions.artist) &&
        Objects.equals(this.byteOrder, tiffOptions.byteOrder) &&
        Objects.equals(this.bitsPerSample, tiffOptions.bitsPerSample) &&
        Objects.equals(this.compression, tiffOptions.compression) &&
        Objects.equals(this.copyright, tiffOptions.copyright) &&
        Objects.equals(this.colorMap, tiffOptions.colorMap) &&
        Objects.equals(this.dateTime, tiffOptions.dateTime) &&
        Objects.equals(this.documentName, tiffOptions.documentName) &&
        Objects.equals(this.alphaStorage, tiffOptions.alphaStorage) &&
        Objects.equals(this.fillOrder, tiffOptions.fillOrder) &&
        Objects.equals(this.halfToneHints, tiffOptions.halfToneHints) &&
        Objects.equals(this.imageDescription, tiffOptions.imageDescription) &&
        Objects.equals(this.inkNames, tiffOptions.inkNames) &&
        Objects.equals(this.scannerManufacturer, tiffOptions.scannerManufacturer) &&
        Objects.equals(this.maxSampleValue, tiffOptions.maxSampleValue) &&
        Objects.equals(this.minSampleValue, tiffOptions.minSampleValue) &&
        Objects.equals(this.scannerModel, tiffOptions.scannerModel) &&
        Objects.equals(this.pageName, tiffOptions.pageName) &&
        Objects.equals(this.orientation, tiffOptions.orientation) &&
        Objects.equals(this.pageNumber, tiffOptions.pageNumber) &&
        Objects.equals(this.photometric, tiffOptions.photometric) &&
        Objects.equals(this.planarConfiguration, tiffOptions.planarConfiguration) &&
        Objects.equals(this.resolutionUnit, tiffOptions.resolutionUnit) &&
        Objects.equals(this.rowsPerStrip, tiffOptions.rowsPerStrip) &&
        Objects.equals(this.sampleFormat, tiffOptions.sampleFormat) &&
        Objects.equals(this.samplesPerPixel, tiffOptions.samplesPerPixel) &&
        Objects.equals(this.smaxSampleValue, tiffOptions.smaxSampleValue) &&
        Objects.equals(this.sminSampleValue, tiffOptions.sminSampleValue) &&
        Objects.equals(this.softwareType, tiffOptions.softwareType) &&
        Objects.equals(this.stripByteCounts, tiffOptions.stripByteCounts) &&
        Objects.equals(this.stripOffsets, tiffOptions.stripOffsets) &&
        Objects.equals(this.subFileType, tiffOptions.subFileType) &&
        Objects.equals(this.targetPrinter, tiffOptions.targetPrinter) &&
        Objects.equals(this.threshholding, tiffOptions.threshholding) &&
        Objects.equals(this.totalPages, tiffOptions.totalPages) &&
        Objects.equals(this.xposition, tiffOptions.xposition) &&
        Objects.equals(this.xresolution, tiffOptions.xresolution) &&
        Objects.equals(this.yposition, tiffOptions.yposition) &&
        Objects.equals(this.yresolution, tiffOptions.yresolution) &&
        Objects.equals(this.faxT4Options, tiffOptions.faxT4Options) &&
        Objects.equals(this.predictor, tiffOptions.predictor) &&
        Objects.equals(this.imageLength, tiffOptions.imageLength) &&
        Objects.equals(this.imageWidth, tiffOptions.imageWidth) &&
        Objects.equals(this.validTagCount, tiffOptions.validTagCount) &&
        Objects.equals(this.bitsPerPixel, tiffOptions.bitsPerPixel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, artist, byteOrder, bitsPerSample, compression, copyright, colorMap, dateTime, documentName, alphaStorage, fillOrder, halfToneHints, imageDescription, inkNames, scannerManufacturer, maxSampleValue, minSampleValue, scannerModel, pageName, orientation, pageNumber, photometric, planarConfiguration, resolutionUnit, rowsPerStrip, sampleFormat, samplesPerPixel, smaxSampleValue, sminSampleValue, softwareType, stripByteCounts, stripOffsets, subFileType, targetPrinter, threshholding, totalPages, xposition, xresolution, yposition, yresolution, faxT4Options, predictor, imageLength, imageWidth, validTagCount, bitsPerPixel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffOptions {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    byteOrder: ").append(toIndentedString(byteOrder)).append("\n");
    sb.append("    bitsPerSample: ").append(toIndentedString(bitsPerSample)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    colorMap: ").append(toIndentedString(colorMap)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    alphaStorage: ").append(toIndentedString(alphaStorage)).append("\n");
    sb.append("    fillOrder: ").append(toIndentedString(fillOrder)).append("\n");
    sb.append("    halfToneHints: ").append(toIndentedString(halfToneHints)).append("\n");
    sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
    sb.append("    inkNames: ").append(toIndentedString(inkNames)).append("\n");
    sb.append("    scannerManufacturer: ").append(toIndentedString(scannerManufacturer)).append("\n");
    sb.append("    maxSampleValue: ").append(toIndentedString(maxSampleValue)).append("\n");
    sb.append("    minSampleValue: ").append(toIndentedString(minSampleValue)).append("\n");
    sb.append("    scannerModel: ").append(toIndentedString(scannerModel)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    photometric: ").append(toIndentedString(photometric)).append("\n");
    sb.append("    planarConfiguration: ").append(toIndentedString(planarConfiguration)).append("\n");
    sb.append("    resolutionUnit: ").append(toIndentedString(resolutionUnit)).append("\n");
    sb.append("    rowsPerStrip: ").append(toIndentedString(rowsPerStrip)).append("\n");
    sb.append("    sampleFormat: ").append(toIndentedString(sampleFormat)).append("\n");
    sb.append("    samplesPerPixel: ").append(toIndentedString(samplesPerPixel)).append("\n");
    sb.append("    smaxSampleValue: ").append(toIndentedString(smaxSampleValue)).append("\n");
    sb.append("    sminSampleValue: ").append(toIndentedString(sminSampleValue)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    stripByteCounts: ").append(toIndentedString(stripByteCounts)).append("\n");
    sb.append("    stripOffsets: ").append(toIndentedString(stripOffsets)).append("\n");
    sb.append("    subFileType: ").append(toIndentedString(subFileType)).append("\n");
    sb.append("    targetPrinter: ").append(toIndentedString(targetPrinter)).append("\n");
    sb.append("    threshholding: ").append(toIndentedString(threshholding)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    xposition: ").append(toIndentedString(xposition)).append("\n");
    sb.append("    xresolution: ").append(toIndentedString(xresolution)).append("\n");
    sb.append("    yposition: ").append(toIndentedString(yposition)).append("\n");
    sb.append("    yresolution: ").append(toIndentedString(yresolution)).append("\n");
    sb.append("    faxT4Options: ").append(toIndentedString(faxT4Options)).append("\n");
    sb.append("    predictor: ").append(toIndentedString(predictor)).append("\n");
    sb.append("    imageLength: ").append(toIndentedString(imageLength)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    validTagCount: ").append(toIndentedString(validTagCount)).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
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

