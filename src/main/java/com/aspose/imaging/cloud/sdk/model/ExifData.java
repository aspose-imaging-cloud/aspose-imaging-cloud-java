/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ExifData.java">
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
 * Represents common EXIF data section.
 */
public class ExifData {
  @JsonProperty("ApertureValue")
  private Double apertureValue = null;

  @JsonProperty("BodySerialNumber")
  private String bodySerialNumber = null;

  @JsonProperty("BrightnessValue")
  private Double brightnessValue = null;

  @JsonProperty("CFAPattern")
  private byte[] cfAPattern = null;

  @JsonProperty("CameraOwnerName")
  private String cameraOwnerName = null;

  @JsonProperty("ColorSpace")
  private String colorSpace = null;

  @JsonProperty("ComponentsConfiguration")
  private byte[] componentsConfiguration = null;

  @JsonProperty("CompressedBitsPerPixel")
  private Double compressedBitsPerPixel = null;

  @JsonProperty("Contrast")
  private String contrast = null;

  @JsonProperty("CustomRendered")
  private String customRendered = null;

  @JsonProperty("DateTimeDigitized")
  private String dateTimeDigitized = null;

  @JsonProperty("DateTimeOriginal")
  private String dateTimeOriginal = null;

  @JsonProperty("DeviceSettingDescription")
  private byte[] deviceSettingDescription = null;

  @JsonProperty("DigitalZoomRatio")
  private Double digitalZoomRatio = null;

  @JsonProperty("ExifVersion")
  private byte[] exifVersion = null;

  @JsonProperty("ExposureBiasValue")
  private Double exposureBiasValue = null;

  @JsonProperty("ExposureIndex")
  private Double exposureIndex = null;

  @JsonProperty("ExposureMode")
  private String exposureMode = null;

  @JsonProperty("ExposureProgram")
  private String exposureProgram = null;

  @JsonProperty("ExposureTime")
  private Double exposureTime = null;

  @JsonProperty("FNumber")
  private Double fnumber = null;

  @JsonProperty("FileSource")
  private String fileSource = null;

  @JsonProperty("Flash")
  private String flash = null;

  @JsonProperty("FlashEnergy")
  private Double flashEnergy = null;

  @JsonProperty("FlashpixVersion")
  private byte[] flashpixVersion = null;

  @JsonProperty("FocalLength")
  private Double focalLength = null;

  @JsonProperty("FocalLengthIn35MmFilm")
  private Integer focalLengthIn35MmFilm = null;

  @JsonProperty("FocalPlaneResolutionUnit")
  private String focalPlaneResolutionUnit = null;

  @JsonProperty("FocalPlaneXResolution")
  private Double focalPlaneXResolution = null;

  @JsonProperty("FocalPlaneYResolution")
  private Double focalPlaneYResolution = null;

  @JsonProperty("GPSAltitude")
  private Double gpSAltitude = null;

  @JsonProperty("GPSAltitudeRef")
  private String gpSAltitudeRef = null;

  @JsonProperty("GPSAreaInformation")
  private byte[] gpSAreaInformation = null;

  @JsonProperty("GPSDOP")
  private Double GPSDOP = null;

  @JsonProperty("GPSDestBearing")
  private Double gpSDestBearing = null;

  @JsonProperty("GPSDestBearingRef")
  private String gpSDestBearingRef = null;

  @JsonProperty("GPSDestDistance")
  private Double gpSDestDistance = null;

  @JsonProperty("GPSDestDistanceRef")
  private String gpSDestDistanceRef = null;

  @JsonProperty("GPSDestLatitude")
  private List<Double> gpSDestLatitude = null;

  @JsonProperty("GPSDestLatitudeRef")
  private String gpSDestLatitudeRef = null;

  @JsonProperty("GPSDestLongitude")
  private List<Double> gpSDestLongitude = null;

  @JsonProperty("GPSDestLongitudeRef")
  private String gpSDestLongitudeRef = null;

  @JsonProperty("GPSDifferential")
  private Integer gpSDifferential = null;

  @JsonProperty("GPSImgDirection")
  private Double gpSImgDirection = null;

  @JsonProperty("GPSImgDirectionRef")
  private String gpSImgDirectionRef = null;

  @JsonProperty("GPSDateStamp")
  private String gpSDateStamp = null;

  @JsonProperty("GPSLatitude")
  private List<Double> gpSLatitude = null;

  @JsonProperty("GPSLatitudeRef")
  private String gpSLatitudeRef = null;

  @JsonProperty("GPSLongitude")
  private List<Double> gpSLongitude = null;

  @JsonProperty("GPSLongitudeRef")
  private String gpSLongitudeRef = null;

  @JsonProperty("GPSMapDatum")
  private String gpSMapDatum = null;

  @JsonProperty("GPSMeasureMode")
  private String gpSMeasureMode = null;

  @JsonProperty("GPSProcessingMethod")
  private byte[] gpSProcessingMethod = null;

  @JsonProperty("GPSSatellites")
  private String gpSSatellites = null;

  @JsonProperty("GPSSpeed")
  private Double gpSSpeed = null;

  @JsonProperty("GPSSpeedRef")
  private String gpSSpeedRef = null;

  @JsonProperty("GPSStatus")
  private String gpSStatus = null;

  @JsonProperty("GPSTimestamp")
  private List<Double> gpSTimestamp = null;

  @JsonProperty("GPSTrack")
  private String gpSTrack = null;

  @JsonProperty("GPSTrackRef")
  private String gpSTrackRef = null;

  @JsonProperty("GPSVersionID")
  private byte[] gpSVersionID = null;

  @JsonProperty("GainControl")
  private String gainControl = null;

  @JsonProperty("Gamma")
  private Double gamma = null;

  @JsonProperty("ISOSpeed")
  private Long isOSpeed = null;

  @JsonProperty("ISOSpeedLatitudeYYY")
  private Long isOSpeedLatitudeYYY = null;

  @JsonProperty("ISOSpeedLatitudeZZZ")
  private Long isOSpeedLatitudeZZZ = null;

  @JsonProperty("PhotographicSensitivity")
  private Long photographicSensitivity = null;

  @JsonProperty("ImageUniqueID")
  private String imageUniqueID = null;

  @JsonProperty("LensMake")
  private String lensMake = null;

  @JsonProperty("LensModel")
  private String lensModel = null;

  @JsonProperty("LensSerialNumber")
  private String lensSerialNumber = null;

  @JsonProperty("LensSpecification")
  private List<Double> lensSpecification = null;

  @JsonProperty("LightSource")
  private String lightSource = null;

  @JsonProperty("MakerNoteRawData")
  private byte[] makerNoteRawData = null;

  @JsonProperty("MaxApertureValue")
  private Double maxApertureValue = null;

  @JsonProperty("MeteringMode")
  private String meteringMode = null;

  @JsonProperty("OECF")
  private byte[] OECF = null;

  @JsonProperty("PixelXDimension")
  private Long pixelXDimension = null;

  @JsonProperty("PixelYDimension")
  private Long pixelYDimension = null;

  @JsonProperty("RecommendedExposureIndex")
  private Long recommendedExposureIndex = null;

  @JsonProperty("RelatedSoundFile")
  private String relatedSoundFile = null;

  @JsonProperty("Saturation")
  private String saturation = null;

  @JsonProperty("SceneCaptureType")
  private String sceneCaptureType = null;

  @JsonProperty("SceneType")
  private Integer sceneType = null;

  @JsonProperty("SensingMethod")
  private String sensingMethod = null;

  @JsonProperty("SensitivityType")
  private Integer sensitivityType = null;

  @JsonProperty("Sharpness")
  private Integer sharpness = null;

  @JsonProperty("ShutterSpeedValue")
  private Double shutterSpeedValue = null;

  @JsonProperty("SpatialFrequencyResponse")
  private byte[] spatialFrequencyResponse = null;

  @JsonProperty("SpectralSensitivity")
  private String spectralSensitivity = null;

  @JsonProperty("StandardOutputSensitivity")
  private Long standardOutputSensitivity = null;

  @JsonProperty("SubjectArea")
  private List<Integer> subjectArea = null;

  @JsonProperty("SubjectDistance")
  private Double subjectDistance = null;

  @JsonProperty("SubjectDistanceRange")
  private String subjectDistanceRange = null;

  @JsonProperty("SubjectLocation")
  private List<Integer> subjectLocation = null;

  @JsonProperty("SubsecTime")
  private String subsecTime = null;

  @JsonProperty("SubsecTimeDigitized")
  private String subsecTimeDigitized = null;

  @JsonProperty("SubsecTimeOriginal")
  private String subsecTimeOriginal = null;

  @JsonProperty("UserComment")
  private String userComment = null;

  @JsonProperty("WhiteBalance")
  private String whiteBalance = null;

  @JsonProperty("WhitePoint")
  private List<Double> whitePoint = null;

  public ExifData apertureValue(Double apertureValue) {
    this.apertureValue = apertureValue;
    return this;
  }

   /**
   * Gets or sets the aperture.
   * @return apertureValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the aperture.")
  public Double getApertureValue() {
    return apertureValue;
  }

  public void setApertureValue(Double apertureValue) {
    this.apertureValue = apertureValue;
  }

  public ExifData bodySerialNumber(String bodySerialNumber) {
    this.bodySerialNumber = bodySerialNumber;
    return this;
  }

   /**
   * Gets or sets the body serial number.
   * @return bodySerialNumber
  **/
  @ApiModelProperty(value = "Gets or sets the body serial number.")
  public String getBodySerialNumber() {
    return bodySerialNumber;
  }

  public void setBodySerialNumber(String bodySerialNumber) {
    this.bodySerialNumber = bodySerialNumber;
  }

  public ExifData brightnessValue(Double brightnessValue) {
    this.brightnessValue = brightnessValue;
    return this;
  }

   /**
   * Gets or sets the brightness.
   * @return brightnessValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the brightness.")
  public Double getBrightnessValue() {
    return brightnessValue;
  }

  public void setBrightnessValue(Double brightnessValue) {
    this.brightnessValue = brightnessValue;
  }

  public ExifData cfAPattern(byte[] cfAPattern) {
    this.cfAPattern = cfAPattern;
    return this;
  }

   /**
   * Gets or sets the CFA pattern.
   * @return cfAPattern
  **/
  @ApiModelProperty(value = "Gets or sets the CFA pattern.")
  public byte[] getCfAPattern() {
    return cfAPattern;
  }

  public void setCfAPattern(byte[] cfAPattern) {
    this.cfAPattern = cfAPattern;
  }

  public ExifData cameraOwnerName(String cameraOwnerName) {
    this.cameraOwnerName = cameraOwnerName;
    return this;
  }

   /**
   * Gets or sets the camera owner name.
   * @return cameraOwnerName
  **/
  @ApiModelProperty(value = "Gets or sets the camera owner name.")
  public String getCameraOwnerName() {
    return cameraOwnerName;
  }

  public void setCameraOwnerName(String cameraOwnerName) {
    this.cameraOwnerName = cameraOwnerName;
  }

  public ExifData colorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

   /**
   * Gets or sets the color space.
   * @return colorSpace
  **/
  @ApiModelProperty(value = "Gets or sets the color space.")
  public String getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }

  public ExifData componentsConfiguration(byte[] componentsConfiguration) {
    this.componentsConfiguration = componentsConfiguration;
    return this;
  }

   /**
   * Gets or sets the components configuration.
   * @return componentsConfiguration
  **/
  @ApiModelProperty(value = "Gets or sets the components configuration.")
  public byte[] getComponentsConfiguration() {
    return componentsConfiguration;
  }

  public void setComponentsConfiguration(byte[] componentsConfiguration) {
    this.componentsConfiguration = componentsConfiguration;
  }

  public ExifData compressedBitsPerPixel(Double compressedBitsPerPixel) {
    this.compressedBitsPerPixel = compressedBitsPerPixel;
    return this;
  }

   /**
   * Gets or sets the compressed bits per pixel.
   * @return compressedBitsPerPixel
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the compressed bits per pixel.")
  public Double getCompressedBitsPerPixel() {
    return compressedBitsPerPixel;
  }

  public void setCompressedBitsPerPixel(Double compressedBitsPerPixel) {
    this.compressedBitsPerPixel = compressedBitsPerPixel;
  }

  public ExifData contrast(String contrast) {
    this.contrast = contrast;
    return this;
  }

   /**
   * Gets or sets the contrast.
   * @return contrast
  **/
  @ApiModelProperty(value = "Gets or sets the contrast.")
  public String getContrast() {
    return contrast;
  }

  public void setContrast(String contrast) {
    this.contrast = contrast;
  }

  public ExifData customRendered(String customRendered) {
    this.customRendered = customRendered;
    return this;
  }

   /**
   * Gets or sets the value indincating if custom rendering is performed.
   * @return customRendered
  **/
  @ApiModelProperty(value = "Gets or sets the value indincating if custom rendering is performed.")
  public String getCustomRendered() {
    return customRendered;
  }

  public void setCustomRendered(String customRendered) {
    this.customRendered = customRendered;
  }

  public ExifData dateTimeDigitized(String dateTimeDigitized) {
    this.dateTimeDigitized = dateTimeDigitized;
    return this;
  }

   /**
   * Gets or sets date and time when image was digitized.
   * @return dateTimeDigitized
  **/
  @ApiModelProperty(value = "Gets or sets date and time when image was digitized.")
  public String getDateTimeDigitized() {
    return dateTimeDigitized;
  }

  public void setDateTimeDigitized(String dateTimeDigitized) {
    this.dateTimeDigitized = dateTimeDigitized;
  }

  public ExifData dateTimeOriginal(String dateTimeOriginal) {
    this.dateTimeOriginal = dateTimeOriginal;
    return this;
  }

   /**
   * Gets or sets date and time of the original image.
   * @return dateTimeOriginal
  **/
  @ApiModelProperty(value = "Gets or sets date and time of the original image.")
  public String getDateTimeOriginal() {
    return dateTimeOriginal;
  }

  public void setDateTimeOriginal(String dateTimeOriginal) {
    this.dateTimeOriginal = dateTimeOriginal;
  }

  public ExifData deviceSettingDescription(byte[] deviceSettingDescription) {
    this.deviceSettingDescription = deviceSettingDescription;
    return this;
  }

   /**
   * Gets or sets the device setting description.
   * @return deviceSettingDescription
  **/
  @ApiModelProperty(value = "Gets or sets the device setting description.")
  public byte[] getDeviceSettingDescription() {
    return deviceSettingDescription;
  }

  public void setDeviceSettingDescription(byte[] deviceSettingDescription) {
    this.deviceSettingDescription = deviceSettingDescription;
  }

  public ExifData digitalZoomRatio(Double digitalZoomRatio) {
    this.digitalZoomRatio = digitalZoomRatio;
    return this;
  }

   /**
   * Gets or sets the digital zoom ratio.
   * @return digitalZoomRatio
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the digital zoom ratio.")
  public Double getDigitalZoomRatio() {
    return digitalZoomRatio;
  }

  public void setDigitalZoomRatio(Double digitalZoomRatio) {
    this.digitalZoomRatio = digitalZoomRatio;
  }

  public ExifData exifVersion(byte[] exifVersion) {
    this.exifVersion = exifVersion;
    return this;
  }

   /**
   * Gets or sets EXIF version.
   * @return exifVersion
  **/
  @ApiModelProperty(value = "Gets or sets EXIF version.")
  public byte[] getExifVersion() {
    return exifVersion;
  }

  public void setExifVersion(byte[] exifVersion) {
    this.exifVersion = exifVersion;
  }

  public ExifData exposureBiasValue(Double exposureBiasValue) {
    this.exposureBiasValue = exposureBiasValue;
    return this;
  }

   /**
   * Gets or sets the exposure bias.
   * @return exposureBiasValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the exposure bias.")
  public Double getExposureBiasValue() {
    return exposureBiasValue;
  }

  public void setExposureBiasValue(Double exposureBiasValue) {
    this.exposureBiasValue = exposureBiasValue;
  }

  public ExifData exposureIndex(Double exposureIndex) {
    this.exposureIndex = exposureIndex;
    return this;
  }

   /**
   * Gets or sets the exposure index.
   * @return exposureIndex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the exposure index.")
  public Double getExposureIndex() {
    return exposureIndex;
  }

  public void setExposureIndex(Double exposureIndex) {
    this.exposureIndex = exposureIndex;
  }

  public ExifData exposureMode(String exposureMode) {
    this.exposureMode = exposureMode;
    return this;
  }

   /**
   * Gets or sets the exposure mode.
   * @return exposureMode
  **/
  @ApiModelProperty(value = "Gets or sets the exposure mode.")
  public String getExposureMode() {
    return exposureMode;
  }

  public void setExposureMode(String exposureMode) {
    this.exposureMode = exposureMode;
  }

  public ExifData exposureProgram(String exposureProgram) {
    this.exposureProgram = exposureProgram;
    return this;
  }

   /**
   * Gets or sets the exposure program.
   * @return exposureProgram
  **/
  @ApiModelProperty(value = "Gets or sets the exposure program.")
  public String getExposureProgram() {
    return exposureProgram;
  }

  public void setExposureProgram(String exposureProgram) {
    this.exposureProgram = exposureProgram;
  }

  public ExifData exposureTime(Double exposureTime) {
    this.exposureTime = exposureTime;
    return this;
  }

   /**
   * Gets or sets the exposure time.
   * @return exposureTime
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the exposure time.")
  public Double getExposureTime() {
    return exposureTime;
  }

  public void setExposureTime(Double exposureTime) {
    this.exposureTime = exposureTime;
  }

  public ExifData fnumber(Double fnumber) {
    this.fnumber = fnumber;
    return this;
  }

   /**
   * Gets or sets the focal number.
   * @return fnumber
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the focal number.")
  public Double getFnumber() {
    return fnumber;
  }

  public void setFnumber(Double fnumber) {
    this.fnumber = fnumber;
  }

  public ExifData fileSource(String fileSource) {
    this.fileSource = fileSource;
    return this;
  }

   /**
   * Gets or sets the file source.
   * @return fileSource
  **/
  @ApiModelProperty(value = "Gets or sets the file source.")
  public String getFileSource() {
    return fileSource;
  }

  public void setFileSource(String fileSource) {
    this.fileSource = fileSource;
  }

  public ExifData flash(String flash) {
    this.flash = flash;
    return this;
  }

   /**
   * Gets or sets the flash.
   * @return flash
  **/
  @ApiModelProperty(value = "Gets or sets the flash.")
  public String getFlash() {
    return flash;
  }

  public void setFlash(String flash) {
    this.flash = flash;
  }

  public ExifData flashEnergy(Double flashEnergy) {
    this.flashEnergy = flashEnergy;
    return this;
  }

   /**
   * Gets or sets the flash energy.
   * @return flashEnergy
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the flash energy.")
  public Double getFlashEnergy() {
    return flashEnergy;
  }

  public void setFlashEnergy(Double flashEnergy) {
    this.flashEnergy = flashEnergy;
  }

  public ExifData flashpixVersion(byte[] flashpixVersion) {
    this.flashpixVersion = flashpixVersion;
    return this;
  }

   /**
   * Gets or sets the Flashpix version.
   * @return flashpixVersion
  **/
  @ApiModelProperty(value = "Gets or sets the Flashpix version.")
  public byte[] getFlashpixVersion() {
    return flashpixVersion;
  }

  public void setFlashpixVersion(byte[] flashpixVersion) {
    this.flashpixVersion = flashpixVersion;
  }

  public ExifData focalLength(Double focalLength) {
    this.focalLength = focalLength;
    return this;
  }

   /**
   * Gets or sets the focal length.
   * @return focalLength
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the focal length.")
  public Double getFocalLength() {
    return focalLength;
  }

  public void setFocalLength(Double focalLength) {
    this.focalLength = focalLength;
  }

  public ExifData focalLengthIn35MmFilm(Integer focalLengthIn35MmFilm) {
    this.focalLengthIn35MmFilm = focalLengthIn35MmFilm;
    return this;
  }

   /**
   * Gets or sets the focal length in 35mm film.
   * @return focalLengthIn35MmFilm
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the focal length in 35mm film.")
  public Integer getFocalLengthIn35MmFilm() {
    return focalLengthIn35MmFilm;
  }

  public void setFocalLengthIn35MmFilm(Integer focalLengthIn35MmFilm) {
    this.focalLengthIn35MmFilm = focalLengthIn35MmFilm;
  }

  public ExifData focalPlaneResolutionUnit(String focalPlaneResolutionUnit) {
    this.focalPlaneResolutionUnit = focalPlaneResolutionUnit;
    return this;
  }

   /**
   * Gets or sets the focal plane resolution unit.
   * @return focalPlaneResolutionUnit
  **/
  @ApiModelProperty(value = "Gets or sets the focal plane resolution unit.")
  public String getFocalPlaneResolutionUnit() {
    return focalPlaneResolutionUnit;
  }

  public void setFocalPlaneResolutionUnit(String focalPlaneResolutionUnit) {
    this.focalPlaneResolutionUnit = focalPlaneResolutionUnit;
  }

  public ExifData focalPlaneXResolution(Double focalPlaneXResolution) {
    this.focalPlaneXResolution = focalPlaneXResolution;
    return this;
  }

   /**
   * Gets or sets the focal plane X resolution.
   * @return focalPlaneXResolution
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the focal plane X resolution.")
  public Double getFocalPlaneXResolution() {
    return focalPlaneXResolution;
  }

  public void setFocalPlaneXResolution(Double focalPlaneXResolution) {
    this.focalPlaneXResolution = focalPlaneXResolution;
  }

  public ExifData focalPlaneYResolution(Double focalPlaneYResolution) {
    this.focalPlaneYResolution = focalPlaneYResolution;
    return this;
  }

   /**
   * Gets or sets the focal plane Y resolution.
   * @return focalPlaneYResolution
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the focal plane Y resolution.")
  public Double getFocalPlaneYResolution() {
    return focalPlaneYResolution;
  }

  public void setFocalPlaneYResolution(Double focalPlaneYResolution) {
    this.focalPlaneYResolution = focalPlaneYResolution;
  }

  public ExifData gpSAltitude(Double gpSAltitude) {
    this.gpSAltitude = gpSAltitude;
    return this;
  }

   /**
   * Gets or sets the GPS altitude.
   * @return gpSAltitude
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS altitude.")
  public Double getGpSAltitude() {
    return gpSAltitude;
  }

  public void setGpSAltitude(Double gpSAltitude) {
    this.gpSAltitude = gpSAltitude;
  }

  public ExifData gpSAltitudeRef(String gpSAltitudeRef) {
    this.gpSAltitudeRef = gpSAltitudeRef;
    return this;
  }

   /**
   * Gets or sets the GPS altitude reference (if it&#39;s above or below sea level).
   * @return gpSAltitudeRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS altitude reference (if it's above or below sea level).")
  public String getGpSAltitudeRef() {
    return gpSAltitudeRef;
  }

  public void setGpSAltitudeRef(String gpSAltitudeRef) {
    this.gpSAltitudeRef = gpSAltitudeRef;
  }

  public ExifData gpSAreaInformation(byte[] gpSAreaInformation) {
    this.gpSAreaInformation = gpSAreaInformation;
    return this;
  }

   /**
   * Gets or sets the GPS area information.
   * @return gpSAreaInformation
  **/
  @ApiModelProperty(value = "Gets or sets the GPS area information.")
  public byte[] getGpSAreaInformation() {
    return gpSAreaInformation;
  }

  public void setGpSAreaInformation(byte[] gpSAreaInformation) {
    this.gpSAreaInformation = gpSAreaInformation;
  }

  public ExifData GPSDOP(Double GPSDOP) {
    this.GPSDOP = GPSDOP;
    return this;
  }

   /**
   * Gets or sets the GPS DOP (data degree of precision).
   * @return GPSDOP
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS DOP (data degree of precision).")
  public Double getGPSDOP() {
    return GPSDOP;
  }

  public void setGPSDOP(Double GPSDOP) {
    this.GPSDOP = GPSDOP;
  }

  public ExifData gpSDestBearing(Double gpSDestBearing) {
    this.gpSDestBearing = gpSDestBearing;
    return this;
  }

   /**
   * Gets or sets the GPS bearing of the destination.
   * @return gpSDestBearing
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS bearing of the destination.")
  public Double getGpSDestBearing() {
    return gpSDestBearing;
  }

  public void setGpSDestBearing(Double gpSDestBearing) {
    this.gpSDestBearing = gpSDestBearing;
  }

  public ExifData gpSDestBearingRef(String gpSDestBearingRef) {
    this.gpSDestBearingRef = gpSDestBearingRef;
    return this;
  }

   /**
   * Gets or sets the GPS reference unit for bearing of the destination.
   * @return gpSDestBearingRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS reference unit for bearing of the destination.")
  public String getGpSDestBearingRef() {
    return gpSDestBearingRef;
  }

  public void setGpSDestBearingRef(String gpSDestBearingRef) {
    this.gpSDestBearingRef = gpSDestBearingRef;
  }

  public ExifData gpSDestDistance(Double gpSDestDistance) {
    this.gpSDestDistance = gpSDestDistance;
    return this;
  }

   /**
   * Gets or sets the GPS destination distance.
   * @return gpSDestDistance
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS destination distance.")
  public Double getGpSDestDistance() {
    return gpSDestDistance;
  }

  public void setGpSDestDistance(Double gpSDestDistance) {
    this.gpSDestDistance = gpSDestDistance;
  }

  public ExifData gpSDestDistanceRef(String gpSDestDistanceRef) {
    this.gpSDestDistanceRef = gpSDestDistanceRef;
    return this;
  }

   /**
   * Gets or sets the GPS reference unit for destination distance.
   * @return gpSDestDistanceRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS reference unit for destination distance.")
  public String getGpSDestDistanceRef() {
    return gpSDestDistanceRef;
  }

  public void setGpSDestDistanceRef(String gpSDestDistanceRef) {
    this.gpSDestDistanceRef = gpSDestDistanceRef;
  }

  public ExifData gpSDestLatitude(List<Double> gpSDestLatitude) {
    this.gpSDestLatitude = gpSDestLatitude;
    return this;
  }

  public ExifData addGpSDestLatitudeItem(Double gpSDestLatitudeItem) {
    if (this.gpSDestLatitude == null) {
      this.gpSDestLatitude = new ArrayList<Double>();
    }
    this.gpSDestLatitude.add(gpSDestLatitudeItem);
    return this;
  }

   /**
   * Gets or sets the GPS destination latitude.
   * @return gpSDestLatitude
  **/
  @ApiModelProperty(value = "Gets or sets the GPS destination latitude.")
  public List<Double> getGpSDestLatitude() {
    return gpSDestLatitude;
  }

  public void setGpSDestLatitude(List<Double> gpSDestLatitude) {
    this.gpSDestLatitude = gpSDestLatitude;
  }

  public ExifData gpSDestLatitudeRef(String gpSDestLatitudeRef) {
    this.gpSDestLatitudeRef = gpSDestLatitudeRef;
    return this;
  }

   /**
   * Gets or sets the GPS reference destination latitude (north or south).
   * @return gpSDestLatitudeRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS reference destination latitude (north or south).")
  public String getGpSDestLatitudeRef() {
    return gpSDestLatitudeRef;
  }

  public void setGpSDestLatitudeRef(String gpSDestLatitudeRef) {
    this.gpSDestLatitudeRef = gpSDestLatitudeRef;
  }

  public ExifData gpSDestLongitude(List<Double> gpSDestLongitude) {
    this.gpSDestLongitude = gpSDestLongitude;
    return this;
  }

  public ExifData addGpSDestLongitudeItem(Double gpSDestLongitudeItem) {
    if (this.gpSDestLongitude == null) {
      this.gpSDestLongitude = new ArrayList<Double>();
    }
    this.gpSDestLongitude.add(gpSDestLongitudeItem);
    return this;
  }

   /**
   * Gets or sets the GPS destination longtitude.
   * @return gpSDestLongitude
  **/
  @ApiModelProperty(value = "Gets or sets the GPS destination longtitude.")
  public List<Double> getGpSDestLongitude() {
    return gpSDestLongitude;
  }

  public void setGpSDestLongitude(List<Double> gpSDestLongitude) {
    this.gpSDestLongitude = gpSDestLongitude;
  }

  public ExifData gpSDestLongitudeRef(String gpSDestLongitudeRef) {
    this.gpSDestLongitudeRef = gpSDestLongitudeRef;
    return this;
  }

   /**
   * Gets or sets the GPS reference destination longtitude (east or west).
   * @return gpSDestLongitudeRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS reference destination longtitude (east or west).")
  public String getGpSDestLongitudeRef() {
    return gpSDestLongitudeRef;
  }

  public void setGpSDestLongitudeRef(String gpSDestLongitudeRef) {
    this.gpSDestLongitudeRef = gpSDestLongitudeRef;
  }

  public ExifData gpSDifferential(Integer gpSDifferential) {
    this.gpSDifferential = gpSDifferential;
    return this;
  }

   /**
   * Gets or sets the GPS differential.
   * @return gpSDifferential
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS differential.")
  public Integer getGpSDifferential() {
    return gpSDifferential;
  }

  public void setGpSDifferential(Integer gpSDifferential) {
    this.gpSDifferential = gpSDifferential;
  }

  public ExifData gpSImgDirection(Double gpSImgDirection) {
    this.gpSImgDirection = gpSImgDirection;
    return this;
  }

   /**
   * Gets or sets the GPS image direction.
   * @return gpSImgDirection
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS image direction.")
  public Double getGpSImgDirection() {
    return gpSImgDirection;
  }

  public void setGpSImgDirection(Double gpSImgDirection) {
    this.gpSImgDirection = gpSImgDirection;
  }

  public ExifData gpSImgDirectionRef(String gpSImgDirectionRef) {
    this.gpSImgDirectionRef = gpSImgDirectionRef;
    return this;
  }

   /**
   * Gets or sets the GPS reference image direction.
   * @return gpSImgDirectionRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS reference image direction.")
  public String getGpSImgDirectionRef() {
    return gpSImgDirectionRef;
  }

  public void setGpSImgDirectionRef(String gpSImgDirectionRef) {
    this.gpSImgDirectionRef = gpSImgDirectionRef;
  }

  public ExifData gpSDateStamp(String gpSDateStamp) {
    this.gpSDateStamp = gpSDateStamp;
    return this;
  }

   /**
   * Gets or sets the GPS date stamp.
   * @return gpSDateStamp
  **/
  @ApiModelProperty(value = "Gets or sets the GPS date stamp.")
  public String getGpSDateStamp() {
    return gpSDateStamp;
  }

  public void setGpSDateStamp(String gpSDateStamp) {
    this.gpSDateStamp = gpSDateStamp;
  }

  public ExifData gpSLatitude(List<Double> gpSLatitude) {
    this.gpSLatitude = gpSLatitude;
    return this;
  }

  public ExifData addGpSLatitudeItem(Double gpSLatitudeItem) {
    if (this.gpSLatitude == null) {
      this.gpSLatitude = new ArrayList<Double>();
    }
    this.gpSLatitude.add(gpSLatitudeItem);
    return this;
  }

   /**
   * Gets or sets the GPS latitude.
   * @return gpSLatitude
  **/
  @ApiModelProperty(value = "Gets or sets the GPS latitude.")
  public List<Double> getGpSLatitude() {
    return gpSLatitude;
  }

  public void setGpSLatitude(List<Double> gpSLatitude) {
    this.gpSLatitude = gpSLatitude;
  }

  public ExifData gpSLatitudeRef(String gpSLatitudeRef) {
    this.gpSLatitudeRef = gpSLatitudeRef;
    return this;
  }

   /**
   * Gets or sets the GPS latitude reference (north or south).
   * @return gpSLatitudeRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS latitude reference (north or south).")
  public String getGpSLatitudeRef() {
    return gpSLatitudeRef;
  }

  public void setGpSLatitudeRef(String gpSLatitudeRef) {
    this.gpSLatitudeRef = gpSLatitudeRef;
  }

  public ExifData gpSLongitude(List<Double> gpSLongitude) {
    this.gpSLongitude = gpSLongitude;
    return this;
  }

  public ExifData addGpSLongitudeItem(Double gpSLongitudeItem) {
    if (this.gpSLongitude == null) {
      this.gpSLongitude = new ArrayList<Double>();
    }
    this.gpSLongitude.add(gpSLongitudeItem);
    return this;
  }

   /**
   * Gets or sets the GPS longitude.
   * @return gpSLongitude
  **/
  @ApiModelProperty(value = "Gets or sets the GPS longitude.")
  public List<Double> getGpSLongitude() {
    return gpSLongitude;
  }

  public void setGpSLongitude(List<Double> gpSLongitude) {
    this.gpSLongitude = gpSLongitude;
  }

  public ExifData gpSLongitudeRef(String gpSLongitudeRef) {
    this.gpSLongitudeRef = gpSLongitudeRef;
    return this;
  }

   /**
   * Gets or sets the GPS longitude reference (east or west).
   * @return gpSLongitudeRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS longitude reference (east or west).")
  public String getGpSLongitudeRef() {
    return gpSLongitudeRef;
  }

  public void setGpSLongitudeRef(String gpSLongitudeRef) {
    this.gpSLongitudeRef = gpSLongitudeRef;
  }

  public ExifData gpSMapDatum(String gpSMapDatum) {
    this.gpSMapDatum = gpSMapDatum;
    return this;
  }

   /**
   * Gets or sets the geodetic survey data used by the GPS receiver.
   * @return gpSMapDatum
  **/
  @ApiModelProperty(value = "Gets or sets the geodetic survey data used by the GPS receiver.")
  public String getGpSMapDatum() {
    return gpSMapDatum;
  }

  public void setGpSMapDatum(String gpSMapDatum) {
    this.gpSMapDatum = gpSMapDatum;
  }

  public ExifData gpSMeasureMode(String gpSMeasureMode) {
    this.gpSMeasureMode = gpSMeasureMode;
    return this;
  }

   /**
   * Gets or sets the GPS measure mode.
   * @return gpSMeasureMode
  **/
  @ApiModelProperty(value = "Gets or sets the GPS measure mode.")
  public String getGpSMeasureMode() {
    return gpSMeasureMode;
  }

  public void setGpSMeasureMode(String gpSMeasureMode) {
    this.gpSMeasureMode = gpSMeasureMode;
  }

  public ExifData gpSProcessingMethod(byte[] gpSProcessingMethod) {
    this.gpSProcessingMethod = gpSProcessingMethod;
    return this;
  }

   /**
   * Gets or setsthe GPS processing method.
   * @return gpSProcessingMethod
  **/
  @ApiModelProperty(value = "Gets or setsthe GPS processing method.")
  public byte[] getGpSProcessingMethod() {
    return gpSProcessingMethod;
  }

  public void setGpSProcessingMethod(byte[] gpSProcessingMethod) {
    this.gpSProcessingMethod = gpSProcessingMethod;
  }

  public ExifData gpSSatellites(String gpSSatellites) {
    this.gpSSatellites = gpSSatellites;
    return this;
  }

   /**
   * Gets or sets the GPS satellites info.
   * @return gpSSatellites
  **/
  @ApiModelProperty(value = "Gets or sets the GPS satellites info.")
  public String getGpSSatellites() {
    return gpSSatellites;
  }

  public void setGpSSatellites(String gpSSatellites) {
    this.gpSSatellites = gpSSatellites;
  }

  public ExifData gpSSpeed(Double gpSSpeed) {
    this.gpSSpeed = gpSSpeed;
    return this;
  }

   /**
   * Gets or sets the GPS speed.
   * @return gpSSpeed
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the GPS speed.")
  public Double getGpSSpeed() {
    return gpSSpeed;
  }

  public void setGpSSpeed(Double gpSSpeed) {
    this.gpSSpeed = gpSSpeed;
  }

  public ExifData gpSSpeedRef(String gpSSpeedRef) {
    this.gpSSpeedRef = gpSSpeedRef;
    return this;
  }

   /**
   * Gets or sets the GPS speed reference unit.
   * @return gpSSpeedRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS speed reference unit.")
  public String getGpSSpeedRef() {
    return gpSSpeedRef;
  }

  public void setGpSSpeedRef(String gpSSpeedRef) {
    this.gpSSpeedRef = gpSSpeedRef;
  }

  public ExifData gpSStatus(String gpSStatus) {
    this.gpSStatus = gpSStatus;
    return this;
  }

   /**
   * Gets or sets the GPS status.
   * @return gpSStatus
  **/
  @ApiModelProperty(value = "Gets or sets the GPS status.")
  public String getGpSStatus() {
    return gpSStatus;
  }

  public void setGpSStatus(String gpSStatus) {
    this.gpSStatus = gpSStatus;
  }

  public ExifData gpSTimestamp(List<Double> gpSTimestamp) {
    this.gpSTimestamp = gpSTimestamp;
    return this;
  }

  public ExifData addGpSTimestampItem(Double gpSTimestampItem) {
    if (this.gpSTimestamp == null) {
      this.gpSTimestamp = new ArrayList<Double>();
    }
    this.gpSTimestamp.add(gpSTimestampItem);
    return this;
  }

   /**
   * Gets or sets the GPS times tamp.
   * @return gpSTimestamp
  **/
  @ApiModelProperty(value = "Gets or sets the GPS times tamp.")
  public List<Double> getGpSTimestamp() {
    return gpSTimestamp;
  }

  public void setGpSTimestamp(List<Double> gpSTimestamp) {
    this.gpSTimestamp = gpSTimestamp;
  }

  public ExifData gpSTrack(String gpSTrack) {
    this.gpSTrack = gpSTrack;
    return this;
  }

   /**
   * Gets or sets the GPS track.
   * @return gpSTrack
  **/
  @ApiModelProperty(value = "Gets or sets the GPS track.")
  public String getGpSTrack() {
    return gpSTrack;
  }

  public void setGpSTrack(String gpSTrack) {
    this.gpSTrack = gpSTrack;
  }

  public ExifData gpSTrackRef(String gpSTrackRef) {
    this.gpSTrackRef = gpSTrackRef;
    return this;
  }

   /**
   * Gets or sets the GPS track reference.
   * @return gpSTrackRef
  **/
  @ApiModelProperty(value = "Gets or sets the GPS track reference.")
  public String getGpSTrackRef() {
    return gpSTrackRef;
  }

  public void setGpSTrackRef(String gpSTrackRef) {
    this.gpSTrackRef = gpSTrackRef;
  }

  public ExifData gpSVersionID(byte[] gpSVersionID) {
    this.gpSVersionID = gpSVersionID;
    return this;
  }

   /**
   * Gets or sets the GPS version ID.
   * @return gpSVersionID
  **/
  @ApiModelProperty(value = "Gets or sets the GPS version ID.")
  public byte[] getGpSVersionID() {
    return gpSVersionID;
  }

  public void setGpSVersionID(byte[] gpSVersionID) {
    this.gpSVersionID = gpSVersionID;
  }

  public ExifData gainControl(String gainControl) {
    this.gainControl = gainControl;
    return this;
  }

   /**
   * Gets or sets the gain control.
   * @return gainControl
  **/
  @ApiModelProperty(value = "Gets or sets the gain control.")
  public String getGainControl() {
    return gainControl;
  }

  public void setGainControl(String gainControl) {
    this.gainControl = gainControl;
  }

  public ExifData gamma(Double gamma) {
    this.gamma = gamma;
    return this;
  }

   /**
   * Gets or sets the gamma.
   * @return gamma
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the gamma.")
  public Double getGamma() {
    return gamma;
  }

  public void setGamma(Double gamma) {
    this.gamma = gamma;
  }

  public ExifData isOSpeed(Long isOSpeed) {
    this.isOSpeed = isOSpeed;
    return this;
  }

   /**
   * Gets or sets the ISO speed.
   * @return isOSpeed
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the ISO speed.")
  public Long getIsOSpeed() {
    return isOSpeed;
  }

  public void setIsOSpeed(Long isOSpeed) {
    this.isOSpeed = isOSpeed;
  }

  public ExifData isOSpeedLatitudeYYY(Long isOSpeedLatitudeYYY) {
    this.isOSpeedLatitudeYYY = isOSpeedLatitudeYYY;
    return this;
  }

   /**
   * Gets or sets the ISO speed latitude YYY value.
   * @return isOSpeedLatitudeYYY
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the ISO speed latitude YYY value.")
  public Long getIsOSpeedLatitudeYYY() {
    return isOSpeedLatitudeYYY;
  }

  public void setIsOSpeedLatitudeYYY(Long isOSpeedLatitudeYYY) {
    this.isOSpeedLatitudeYYY = isOSpeedLatitudeYYY;
  }

  public ExifData isOSpeedLatitudeZZZ(Long isOSpeedLatitudeZZZ) {
    this.isOSpeedLatitudeZZZ = isOSpeedLatitudeZZZ;
    return this;
  }

   /**
   * Gets or sets the ISO speed latitude ZZZ value.
   * @return isOSpeedLatitudeZZZ
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the ISO speed latitude ZZZ value.")
  public Long getIsOSpeedLatitudeZZZ() {
    return isOSpeedLatitudeZZZ;
  }

  public void setIsOSpeedLatitudeZZZ(Long isOSpeedLatitudeZZZ) {
    this.isOSpeedLatitudeZZZ = isOSpeedLatitudeZZZ;
  }

  public ExifData photographicSensitivity(Long photographicSensitivity) {
    this.photographicSensitivity = photographicSensitivity;
    return this;
  }

   /**
   * Gets or sets the photographic sensitivity.
   * @return photographicSensitivity
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the photographic sensitivity.")
  public Long getPhotographicSensitivity() {
    return photographicSensitivity;
  }

  public void setPhotographicSensitivity(Long photographicSensitivity) {
    this.photographicSensitivity = photographicSensitivity;
  }

  public ExifData imageUniqueID(String imageUniqueID) {
    this.imageUniqueID = imageUniqueID;
    return this;
  }

   /**
   * Gets or sets the image unique ID.
   * @return imageUniqueID
  **/
  @ApiModelProperty(value = "Gets or sets the image unique ID.")
  public String getImageUniqueID() {
    return imageUniqueID;
  }

  public void setImageUniqueID(String imageUniqueID) {
    this.imageUniqueID = imageUniqueID;
  }

  public ExifData lensMake(String lensMake) {
    this.lensMake = lensMake;
    return this;
  }

   /**
   * Gets or sets the lens manufacturer.
   * @return lensMake
  **/
  @ApiModelProperty(value = "Gets or sets the lens manufacturer.")
  public String getLensMake() {
    return lensMake;
  }

  public void setLensMake(String lensMake) {
    this.lensMake = lensMake;
  }

  public ExifData lensModel(String lensModel) {
    this.lensModel = lensModel;
    return this;
  }

   /**
   * Gets or sets the lens model.
   * @return lensModel
  **/
  @ApiModelProperty(value = "Gets or sets the lens model.")
  public String getLensModel() {
    return lensModel;
  }

  public void setLensModel(String lensModel) {
    this.lensModel = lensModel;
  }

  public ExifData lensSerialNumber(String lensSerialNumber) {
    this.lensSerialNumber = lensSerialNumber;
    return this;
  }

   /**
   * Gets or sets the lens serial number.
   * @return lensSerialNumber
  **/
  @ApiModelProperty(value = "Gets or sets the lens serial number.")
  public String getLensSerialNumber() {
    return lensSerialNumber;
  }

  public void setLensSerialNumber(String lensSerialNumber) {
    this.lensSerialNumber = lensSerialNumber;
  }

  public ExifData lensSpecification(List<Double> lensSpecification) {
    this.lensSpecification = lensSpecification;
    return this;
  }

  public ExifData addLensSpecificationItem(Double lensSpecificationItem) {
    if (this.lensSpecification == null) {
      this.lensSpecification = new ArrayList<Double>();
    }
    this.lensSpecification.add(lensSpecificationItem);
    return this;
  }

   /**
   * Gets or sets the lens specification.
   * @return lensSpecification
  **/
  @ApiModelProperty(value = "Gets or sets the lens specification.")
  public List<Double> getLensSpecification() {
    return lensSpecification;
  }

  public void setLensSpecification(List<Double> lensSpecification) {
    this.lensSpecification = lensSpecification;
  }

  public ExifData lightSource(String lightSource) {
    this.lightSource = lightSource;
    return this;
  }

   /**
   * Gets or sets the light source.
   * @return lightSource
  **/
  @ApiModelProperty(value = "Gets or sets the light source.")
  public String getLightSource() {
    return lightSource;
  }

  public void setLightSource(String lightSource) {
    this.lightSource = lightSource;
  }

  public ExifData makerNoteRawData(byte[] makerNoteRawData) {
    this.makerNoteRawData = makerNoteRawData;
    return this;
  }

   /**
   * Gets or sets the maker note raw data.
   * @return makerNoteRawData
  **/
  @ApiModelProperty(value = "Gets or sets the maker note raw data.")
  public byte[] getMakerNoteRawData() {
    return makerNoteRawData;
  }

  public void setMakerNoteRawData(byte[] makerNoteRawData) {
    this.makerNoteRawData = makerNoteRawData;
  }

  public ExifData maxApertureValue(Double maxApertureValue) {
    this.maxApertureValue = maxApertureValue;
    return this;
  }

   /**
   * Gets or sets the max aperture.
   * @return maxApertureValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the max aperture.")
  public Double getMaxApertureValue() {
    return maxApertureValue;
  }

  public void setMaxApertureValue(Double maxApertureValue) {
    this.maxApertureValue = maxApertureValue;
  }

  public ExifData meteringMode(String meteringMode) {
    this.meteringMode = meteringMode;
    return this;
  }

   /**
   * Gets or sets the metering mode.
   * @return meteringMode
  **/
  @ApiModelProperty(value = "Gets or sets the metering mode.")
  public String getMeteringMode() {
    return meteringMode;
  }

  public void setMeteringMode(String meteringMode) {
    this.meteringMode = meteringMode;
  }

  public ExifData OECF(byte[] OECF) {
    this.OECF = OECF;
    return this;
  }

   /**
   * Gets or sets the OECF (Opto-Electric Conversion Function).
   * @return OECF
  **/
  @ApiModelProperty(value = "Gets or sets the OECF (Opto-Electric Conversion Function).")
  public byte[] getOECF() {
    return OECF;
  }

  public void setOECF(byte[] OECF) {
    this.OECF = OECF;
  }

  public ExifData pixelXDimension(Long pixelXDimension) {
    this.pixelXDimension = pixelXDimension;
    return this;
  }

   /**
   * Gets or sets the pixel X dimension.
   * @return pixelXDimension
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the pixel X dimension.")
  public Long getPixelXDimension() {
    return pixelXDimension;
  }

  public void setPixelXDimension(Long pixelXDimension) {
    this.pixelXDimension = pixelXDimension;
  }

  public ExifData pixelYDimension(Long pixelYDimension) {
    this.pixelYDimension = pixelYDimension;
    return this;
  }

   /**
   * Gets or sets the pixel Y dimension.
   * @return pixelYDimension
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the pixel Y dimension.")
  public Long getPixelYDimension() {
    return pixelYDimension;
  }

  public void setPixelYDimension(Long pixelYDimension) {
    this.pixelYDimension = pixelYDimension;
  }

  public ExifData recommendedExposureIndex(Long recommendedExposureIndex) {
    this.recommendedExposureIndex = recommendedExposureIndex;
    return this;
  }

   /**
   * Gets or sets the recommended exposure index.
   * @return recommendedExposureIndex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the recommended exposure index.")
  public Long getRecommendedExposureIndex() {
    return recommendedExposureIndex;
  }

  public void setRecommendedExposureIndex(Long recommendedExposureIndex) {
    this.recommendedExposureIndex = recommendedExposureIndex;
  }

  public ExifData relatedSoundFile(String relatedSoundFile) {
    this.relatedSoundFile = relatedSoundFile;
    return this;
  }

   /**
   * Gets or sets the related sound file.
   * @return relatedSoundFile
  **/
  @ApiModelProperty(value = "Gets or sets the related sound file.")
  public String getRelatedSoundFile() {
    return relatedSoundFile;
  }

  public void setRelatedSoundFile(String relatedSoundFile) {
    this.relatedSoundFile = relatedSoundFile;
  }

  public ExifData saturation(String saturation) {
    this.saturation = saturation;
    return this;
  }

   /**
   * Gets or sets the saturation.
   * @return saturation
  **/
  @ApiModelProperty(value = "Gets or sets the saturation.")
  public String getSaturation() {
    return saturation;
  }

  public void setSaturation(String saturation) {
    this.saturation = saturation;
  }

  public ExifData sceneCaptureType(String sceneCaptureType) {
    this.sceneCaptureType = sceneCaptureType;
    return this;
  }

   /**
   * Gets or sets the scene capture type.
   * @return sceneCaptureType
  **/
  @ApiModelProperty(value = "Gets or sets the scene capture type.")
  public String getSceneCaptureType() {
    return sceneCaptureType;
  }

  public void setSceneCaptureType(String sceneCaptureType) {
    this.sceneCaptureType = sceneCaptureType;
  }

  public ExifData sceneType(Integer sceneType) {
    this.sceneType = sceneType;
    return this;
  }

   /**
   * Gets or sets the scene type.
   * @return sceneType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the scene type.")
  public Integer getSceneType() {
    return sceneType;
  }

  public void setSceneType(Integer sceneType) {
    this.sceneType = sceneType;
  }

  public ExifData sensingMethod(String sensingMethod) {
    this.sensingMethod = sensingMethod;
    return this;
  }

   /**
   * Gets or sets the sensing method.
   * @return sensingMethod
  **/
  @ApiModelProperty(value = "Gets or sets the sensing method.")
  public String getSensingMethod() {
    return sensingMethod;
  }

  public void setSensingMethod(String sensingMethod) {
    this.sensingMethod = sensingMethod;
  }

  public ExifData sensitivityType(Integer sensitivityType) {
    this.sensitivityType = sensitivityType;
    return this;
  }

   /**
   * Gets or sets the sensitivity type.
   * @return sensitivityType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the sensitivity type.")
  public Integer getSensitivityType() {
    return sensitivityType;
  }

  public void setSensitivityType(Integer sensitivityType) {
    this.sensitivityType = sensitivityType;
  }

  public ExifData sharpness(Integer sharpness) {
    this.sharpness = sharpness;
    return this;
  }

   /**
   * Gets or sets the sharpness.
   * @return sharpness
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the sharpness.")
  public Integer getSharpness() {
    return sharpness;
  }

  public void setSharpness(Integer sharpness) {
    this.sharpness = sharpness;
  }

  public ExifData shutterSpeedValue(Double shutterSpeedValue) {
    this.shutterSpeedValue = shutterSpeedValue;
    return this;
  }

   /**
   * Gets or sets the shutter speed.
   * @return shutterSpeedValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the shutter speed.")
  public Double getShutterSpeedValue() {
    return shutterSpeedValue;
  }

  public void setShutterSpeedValue(Double shutterSpeedValue) {
    this.shutterSpeedValue = shutterSpeedValue;
  }

  public ExifData spatialFrequencyResponse(byte[] spatialFrequencyResponse) {
    this.spatialFrequencyResponse = spatialFrequencyResponse;
    return this;
  }

   /**
   * Gets or sets the spatial frequency response.
   * @return spatialFrequencyResponse
  **/
  @ApiModelProperty(value = "Gets or sets the spatial frequency response.")
  public byte[] getSpatialFrequencyResponse() {
    return spatialFrequencyResponse;
  }

  public void setSpatialFrequencyResponse(byte[] spatialFrequencyResponse) {
    this.spatialFrequencyResponse = spatialFrequencyResponse;
  }

  public ExifData spectralSensitivity(String spectralSensitivity) {
    this.spectralSensitivity = spectralSensitivity;
    return this;
  }

   /**
   * Gets or sets the spectral sensitivity.
   * @return spectralSensitivity
  **/
  @ApiModelProperty(value = "Gets or sets the spectral sensitivity.")
  public String getSpectralSensitivity() {
    return spectralSensitivity;
  }

  public void setSpectralSensitivity(String spectralSensitivity) {
    this.spectralSensitivity = spectralSensitivity;
  }

  public ExifData standardOutputSensitivity(Long standardOutputSensitivity) {
    this.standardOutputSensitivity = standardOutputSensitivity;
    return this;
  }

   /**
   * Gets or sets the standard output sensitivity.
   * @return standardOutputSensitivity
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the standard output sensitivity.")
  public Long getStandardOutputSensitivity() {
    return standardOutputSensitivity;
  }

  public void setStandardOutputSensitivity(Long standardOutputSensitivity) {
    this.standardOutputSensitivity = standardOutputSensitivity;
  }

  public ExifData subjectArea(List<Integer> subjectArea) {
    this.subjectArea = subjectArea;
    return this;
  }

  public ExifData addSubjectAreaItem(Integer subjectAreaItem) {
    if (this.subjectArea == null) {
      this.subjectArea = new ArrayList<Integer>();
    }
    this.subjectArea.add(subjectAreaItem);
    return this;
  }

   /**
   * Gets or sets the subject area.
   * @return subjectArea
  **/
  @ApiModelProperty(value = "Gets or sets the subject area.")
  public List<Integer> getSubjectArea() {
    return subjectArea;
  }

  public void setSubjectArea(List<Integer> subjectArea) {
    this.subjectArea = subjectArea;
  }

  public ExifData subjectDistance(Double subjectDistance) {
    this.subjectDistance = subjectDistance;
    return this;
  }

   /**
   * Gets or sets the subject distance.
   * @return subjectDistance
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the subject distance.")
  public Double getSubjectDistance() {
    return subjectDistance;
  }

  public void setSubjectDistance(Double subjectDistance) {
    this.subjectDistance = subjectDistance;
  }

  public ExifData subjectDistanceRange(String subjectDistanceRange) {
    this.subjectDistanceRange = subjectDistanceRange;
    return this;
  }

   /**
   * Gets or sets the subject distance range.
   * @return subjectDistanceRange
  **/
  @ApiModelProperty(value = "Gets or sets the subject distance range.")
  public String getSubjectDistanceRange() {
    return subjectDistanceRange;
  }

  public void setSubjectDistanceRange(String subjectDistanceRange) {
    this.subjectDistanceRange = subjectDistanceRange;
  }

  public ExifData subjectLocation(List<Integer> subjectLocation) {
    this.subjectLocation = subjectLocation;
    return this;
  }

  public ExifData addSubjectLocationItem(Integer subjectLocationItem) {
    if (this.subjectLocation == null) {
      this.subjectLocation = new ArrayList<Integer>();
    }
    this.subjectLocation.add(subjectLocationItem);
    return this;
  }

   /**
   * Gets or sets the subject location.
   * @return subjectLocation
  **/
  @ApiModelProperty(value = "Gets or sets the subject location.")
  public List<Integer> getSubjectLocation() {
    return subjectLocation;
  }

  public void setSubjectLocation(List<Integer> subjectLocation) {
    this.subjectLocation = subjectLocation;
  }

  public ExifData subsecTime(String subsecTime) {
    this.subsecTime = subsecTime;
    return this;
  }

   /**
   * Gets or sets the fractions of seconds for the DateTime tag.
   * @return subsecTime
  **/
  @ApiModelProperty(value = "Gets or sets the fractions of seconds for the DateTime tag.")
  public String getSubsecTime() {
    return subsecTime;
  }

  public void setSubsecTime(String subsecTime) {
    this.subsecTime = subsecTime;
  }

  public ExifData subsecTimeDigitized(String subsecTimeDigitized) {
    this.subsecTimeDigitized = subsecTimeDigitized;
    return this;
  }

   /**
   * Gets or sets the fractions of seconds for the DateTimeDigitized tag.
   * @return subsecTimeDigitized
  **/
  @ApiModelProperty(value = "Gets or sets the fractions of seconds for the DateTimeDigitized tag.")
  public String getSubsecTimeDigitized() {
    return subsecTimeDigitized;
  }

  public void setSubsecTimeDigitized(String subsecTimeDigitized) {
    this.subsecTimeDigitized = subsecTimeDigitized;
  }

  public ExifData subsecTimeOriginal(String subsecTimeOriginal) {
    this.subsecTimeOriginal = subsecTimeOriginal;
    return this;
  }

   /**
   * Gets or sets the fractions of seconds for the DateTimeOriginal tag.
   * @return subsecTimeOriginal
  **/
  @ApiModelProperty(value = "Gets or sets the fractions of seconds for the DateTimeOriginal tag.")
  public String getSubsecTimeOriginal() {
    return subsecTimeOriginal;
  }

  public void setSubsecTimeOriginal(String subsecTimeOriginal) {
    this.subsecTimeOriginal = subsecTimeOriginal;
  }

  public ExifData userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

   /**
   * Gets or sets the user comment.
   * @return userComment
  **/
  @ApiModelProperty(value = "Gets or sets the user comment.")
  public String getUserComment() {
    return userComment;
  }

  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }

  public ExifData whiteBalance(String whiteBalance) {
    this.whiteBalance = whiteBalance;
    return this;
  }

   /**
   * Gets or sets the white balance.
   * @return whiteBalance
  **/
  @ApiModelProperty(value = "Gets or sets the white balance.")
  public String getWhiteBalance() {
    return whiteBalance;
  }

  public void setWhiteBalance(String whiteBalance) {
    this.whiteBalance = whiteBalance;
  }

  public ExifData whitePoint(List<Double> whitePoint) {
    this.whitePoint = whitePoint;
    return this;
  }

  public ExifData addWhitePointItem(Double whitePointItem) {
    if (this.whitePoint == null) {
      this.whitePoint = new ArrayList<Double>();
    }
    this.whitePoint.add(whitePointItem);
    return this;
  }

   /**
   * Gets or sets the white point.
   * @return whitePoint
  **/
  @ApiModelProperty(value = "Gets or sets the white point.")
  public List<Double> getWhitePoint() {
    return whitePoint;
  }

  public void setWhitePoint(List<Double> whitePoint) {
    this.whitePoint = whitePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExifData exifData = (ExifData) o;
    return Objects.equals(this.apertureValue, exifData.apertureValue) &&
        Objects.equals(this.bodySerialNumber, exifData.bodySerialNumber) &&
        Objects.equals(this.brightnessValue, exifData.brightnessValue) &&
        Objects.equals(this.cfAPattern, exifData.cfAPattern) &&
        Objects.equals(this.cameraOwnerName, exifData.cameraOwnerName) &&
        Objects.equals(this.colorSpace, exifData.colorSpace) &&
        Objects.equals(this.componentsConfiguration, exifData.componentsConfiguration) &&
        Objects.equals(this.compressedBitsPerPixel, exifData.compressedBitsPerPixel) &&
        Objects.equals(this.contrast, exifData.contrast) &&
        Objects.equals(this.customRendered, exifData.customRendered) &&
        Objects.equals(this.dateTimeDigitized, exifData.dateTimeDigitized) &&
        Objects.equals(this.dateTimeOriginal, exifData.dateTimeOriginal) &&
        Objects.equals(this.deviceSettingDescription, exifData.deviceSettingDescription) &&
        Objects.equals(this.digitalZoomRatio, exifData.digitalZoomRatio) &&
        Objects.equals(this.exifVersion, exifData.exifVersion) &&
        Objects.equals(this.exposureBiasValue, exifData.exposureBiasValue) &&
        Objects.equals(this.exposureIndex, exifData.exposureIndex) &&
        Objects.equals(this.exposureMode, exifData.exposureMode) &&
        Objects.equals(this.exposureProgram, exifData.exposureProgram) &&
        Objects.equals(this.exposureTime, exifData.exposureTime) &&
        Objects.equals(this.fnumber, exifData.fnumber) &&
        Objects.equals(this.fileSource, exifData.fileSource) &&
        Objects.equals(this.flash, exifData.flash) &&
        Objects.equals(this.flashEnergy, exifData.flashEnergy) &&
        Objects.equals(this.flashpixVersion, exifData.flashpixVersion) &&
        Objects.equals(this.focalLength, exifData.focalLength) &&
        Objects.equals(this.focalLengthIn35MmFilm, exifData.focalLengthIn35MmFilm) &&
        Objects.equals(this.focalPlaneResolutionUnit, exifData.focalPlaneResolutionUnit) &&
        Objects.equals(this.focalPlaneXResolution, exifData.focalPlaneXResolution) &&
        Objects.equals(this.focalPlaneYResolution, exifData.focalPlaneYResolution) &&
        Objects.equals(this.gpSAltitude, exifData.gpSAltitude) &&
        Objects.equals(this.gpSAltitudeRef, exifData.gpSAltitudeRef) &&
        Objects.equals(this.gpSAreaInformation, exifData.gpSAreaInformation) &&
        Objects.equals(this.GPSDOP, exifData.GPSDOP) &&
        Objects.equals(this.gpSDestBearing, exifData.gpSDestBearing) &&
        Objects.equals(this.gpSDestBearingRef, exifData.gpSDestBearingRef) &&
        Objects.equals(this.gpSDestDistance, exifData.gpSDestDistance) &&
        Objects.equals(this.gpSDestDistanceRef, exifData.gpSDestDistanceRef) &&
        Objects.equals(this.gpSDestLatitude, exifData.gpSDestLatitude) &&
        Objects.equals(this.gpSDestLatitudeRef, exifData.gpSDestLatitudeRef) &&
        Objects.equals(this.gpSDestLongitude, exifData.gpSDestLongitude) &&
        Objects.equals(this.gpSDestLongitudeRef, exifData.gpSDestLongitudeRef) &&
        Objects.equals(this.gpSDifferential, exifData.gpSDifferential) &&
        Objects.equals(this.gpSImgDirection, exifData.gpSImgDirection) &&
        Objects.equals(this.gpSImgDirectionRef, exifData.gpSImgDirectionRef) &&
        Objects.equals(this.gpSDateStamp, exifData.gpSDateStamp) &&
        Objects.equals(this.gpSLatitude, exifData.gpSLatitude) &&
        Objects.equals(this.gpSLatitudeRef, exifData.gpSLatitudeRef) &&
        Objects.equals(this.gpSLongitude, exifData.gpSLongitude) &&
        Objects.equals(this.gpSLongitudeRef, exifData.gpSLongitudeRef) &&
        Objects.equals(this.gpSMapDatum, exifData.gpSMapDatum) &&
        Objects.equals(this.gpSMeasureMode, exifData.gpSMeasureMode) &&
        Objects.equals(this.gpSProcessingMethod, exifData.gpSProcessingMethod) &&
        Objects.equals(this.gpSSatellites, exifData.gpSSatellites) &&
        Objects.equals(this.gpSSpeed, exifData.gpSSpeed) &&
        Objects.equals(this.gpSSpeedRef, exifData.gpSSpeedRef) &&
        Objects.equals(this.gpSStatus, exifData.gpSStatus) &&
        Objects.equals(this.gpSTimestamp, exifData.gpSTimestamp) &&
        Objects.equals(this.gpSTrack, exifData.gpSTrack) &&
        Objects.equals(this.gpSTrackRef, exifData.gpSTrackRef) &&
        Objects.equals(this.gpSVersionID, exifData.gpSVersionID) &&
        Objects.equals(this.gainControl, exifData.gainControl) &&
        Objects.equals(this.gamma, exifData.gamma) &&
        Objects.equals(this.isOSpeed, exifData.isOSpeed) &&
        Objects.equals(this.isOSpeedLatitudeYYY, exifData.isOSpeedLatitudeYYY) &&
        Objects.equals(this.isOSpeedLatitudeZZZ, exifData.isOSpeedLatitudeZZZ) &&
        Objects.equals(this.photographicSensitivity, exifData.photographicSensitivity) &&
        Objects.equals(this.imageUniqueID, exifData.imageUniqueID) &&
        Objects.equals(this.lensMake, exifData.lensMake) &&
        Objects.equals(this.lensModel, exifData.lensModel) &&
        Objects.equals(this.lensSerialNumber, exifData.lensSerialNumber) &&
        Objects.equals(this.lensSpecification, exifData.lensSpecification) &&
        Objects.equals(this.lightSource, exifData.lightSource) &&
        Objects.equals(this.makerNoteRawData, exifData.makerNoteRawData) &&
        Objects.equals(this.maxApertureValue, exifData.maxApertureValue) &&
        Objects.equals(this.meteringMode, exifData.meteringMode) &&
        Objects.equals(this.OECF, exifData.OECF) &&
        Objects.equals(this.pixelXDimension, exifData.pixelXDimension) &&
        Objects.equals(this.pixelYDimension, exifData.pixelYDimension) &&
        Objects.equals(this.recommendedExposureIndex, exifData.recommendedExposureIndex) &&
        Objects.equals(this.relatedSoundFile, exifData.relatedSoundFile) &&
        Objects.equals(this.saturation, exifData.saturation) &&
        Objects.equals(this.sceneCaptureType, exifData.sceneCaptureType) &&
        Objects.equals(this.sceneType, exifData.sceneType) &&
        Objects.equals(this.sensingMethod, exifData.sensingMethod) &&
        Objects.equals(this.sensitivityType, exifData.sensitivityType) &&
        Objects.equals(this.sharpness, exifData.sharpness) &&
        Objects.equals(this.shutterSpeedValue, exifData.shutterSpeedValue) &&
        Objects.equals(this.spatialFrequencyResponse, exifData.spatialFrequencyResponse) &&
        Objects.equals(this.spectralSensitivity, exifData.spectralSensitivity) &&
        Objects.equals(this.standardOutputSensitivity, exifData.standardOutputSensitivity) &&
        Objects.equals(this.subjectArea, exifData.subjectArea) &&
        Objects.equals(this.subjectDistance, exifData.subjectDistance) &&
        Objects.equals(this.subjectDistanceRange, exifData.subjectDistanceRange) &&
        Objects.equals(this.subjectLocation, exifData.subjectLocation) &&
        Objects.equals(this.subsecTime, exifData.subsecTime) &&
        Objects.equals(this.subsecTimeDigitized, exifData.subsecTimeDigitized) &&
        Objects.equals(this.subsecTimeOriginal, exifData.subsecTimeOriginal) &&
        Objects.equals(this.userComment, exifData.userComment) &&
        Objects.equals(this.whiteBalance, exifData.whiteBalance) &&
        Objects.equals(this.whitePoint, exifData.whitePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apertureValue, bodySerialNumber, brightnessValue, cfAPattern, cameraOwnerName, colorSpace, componentsConfiguration, compressedBitsPerPixel, contrast, customRendered, dateTimeDigitized, dateTimeOriginal, deviceSettingDescription, digitalZoomRatio, exifVersion, exposureBiasValue, exposureIndex, exposureMode, exposureProgram, exposureTime, fnumber, fileSource, flash, flashEnergy, flashpixVersion, focalLength, focalLengthIn35MmFilm, focalPlaneResolutionUnit, focalPlaneXResolution, focalPlaneYResolution, gpSAltitude, gpSAltitudeRef, gpSAreaInformation, GPSDOP, gpSDestBearing, gpSDestBearingRef, gpSDestDistance, gpSDestDistanceRef, gpSDestLatitude, gpSDestLatitudeRef, gpSDestLongitude, gpSDestLongitudeRef, gpSDifferential, gpSImgDirection, gpSImgDirectionRef, gpSDateStamp, gpSLatitude, gpSLatitudeRef, gpSLongitude, gpSLongitudeRef, gpSMapDatum, gpSMeasureMode, gpSProcessingMethod, gpSSatellites, gpSSpeed, gpSSpeedRef, gpSStatus, gpSTimestamp, gpSTrack, gpSTrackRef, gpSVersionID, gainControl, gamma, isOSpeed, isOSpeedLatitudeYYY, isOSpeedLatitudeZZZ, photographicSensitivity, imageUniqueID, lensMake, lensModel, lensSerialNumber, lensSpecification, lightSource, makerNoteRawData, maxApertureValue, meteringMode, OECF, pixelXDimension, pixelYDimension, recommendedExposureIndex, relatedSoundFile, saturation, sceneCaptureType, sceneType, sensingMethod, sensitivityType, sharpness, shutterSpeedValue, spatialFrequencyResponse, spectralSensitivity, standardOutputSensitivity, subjectArea, subjectDistance, subjectDistanceRange, subjectLocation, subsecTime, subsecTimeDigitized, subsecTimeOriginal, userComment, whiteBalance, whitePoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExifData {\n");
    
    sb.append("    apertureValue: ").append(toIndentedString(apertureValue)).append("\n");
    sb.append("    bodySerialNumber: ").append(toIndentedString(bodySerialNumber)).append("\n");
    sb.append("    brightnessValue: ").append(toIndentedString(brightnessValue)).append("\n");
    sb.append("    cfAPattern: ").append(toIndentedString(cfAPattern)).append("\n");
    sb.append("    cameraOwnerName: ").append(toIndentedString(cameraOwnerName)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    componentsConfiguration: ").append(toIndentedString(componentsConfiguration)).append("\n");
    sb.append("    compressedBitsPerPixel: ").append(toIndentedString(compressedBitsPerPixel)).append("\n");
    sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
    sb.append("    customRendered: ").append(toIndentedString(customRendered)).append("\n");
    sb.append("    dateTimeDigitized: ").append(toIndentedString(dateTimeDigitized)).append("\n");
    sb.append("    dateTimeOriginal: ").append(toIndentedString(dateTimeOriginal)).append("\n");
    sb.append("    deviceSettingDescription: ").append(toIndentedString(deviceSettingDescription)).append("\n");
    sb.append("    digitalZoomRatio: ").append(toIndentedString(digitalZoomRatio)).append("\n");
    sb.append("    exifVersion: ").append(toIndentedString(exifVersion)).append("\n");
    sb.append("    exposureBiasValue: ").append(toIndentedString(exposureBiasValue)).append("\n");
    sb.append("    exposureIndex: ").append(toIndentedString(exposureIndex)).append("\n");
    sb.append("    exposureMode: ").append(toIndentedString(exposureMode)).append("\n");
    sb.append("    exposureProgram: ").append(toIndentedString(exposureProgram)).append("\n");
    sb.append("    exposureTime: ").append(toIndentedString(exposureTime)).append("\n");
    sb.append("    fnumber: ").append(toIndentedString(fnumber)).append("\n");
    sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
    sb.append("    flash: ").append(toIndentedString(flash)).append("\n");
    sb.append("    flashEnergy: ").append(toIndentedString(flashEnergy)).append("\n");
    sb.append("    flashpixVersion: ").append(toIndentedString(flashpixVersion)).append("\n");
    sb.append("    focalLength: ").append(toIndentedString(focalLength)).append("\n");
    sb.append("    focalLengthIn35MmFilm: ").append(toIndentedString(focalLengthIn35MmFilm)).append("\n");
    sb.append("    focalPlaneResolutionUnit: ").append(toIndentedString(focalPlaneResolutionUnit)).append("\n");
    sb.append("    focalPlaneXResolution: ").append(toIndentedString(focalPlaneXResolution)).append("\n");
    sb.append("    focalPlaneYResolution: ").append(toIndentedString(focalPlaneYResolution)).append("\n");
    sb.append("    gpSAltitude: ").append(toIndentedString(gpSAltitude)).append("\n");
    sb.append("    gpSAltitudeRef: ").append(toIndentedString(gpSAltitudeRef)).append("\n");
    sb.append("    gpSAreaInformation: ").append(toIndentedString(gpSAreaInformation)).append("\n");
    sb.append("    GPSDOP: ").append(toIndentedString(GPSDOP)).append("\n");
    sb.append("    gpSDestBearing: ").append(toIndentedString(gpSDestBearing)).append("\n");
    sb.append("    gpSDestBearingRef: ").append(toIndentedString(gpSDestBearingRef)).append("\n");
    sb.append("    gpSDestDistance: ").append(toIndentedString(gpSDestDistance)).append("\n");
    sb.append("    gpSDestDistanceRef: ").append(toIndentedString(gpSDestDistanceRef)).append("\n");
    sb.append("    gpSDestLatitude: ").append(toIndentedString(gpSDestLatitude)).append("\n");
    sb.append("    gpSDestLatitudeRef: ").append(toIndentedString(gpSDestLatitudeRef)).append("\n");
    sb.append("    gpSDestLongitude: ").append(toIndentedString(gpSDestLongitude)).append("\n");
    sb.append("    gpSDestLongitudeRef: ").append(toIndentedString(gpSDestLongitudeRef)).append("\n");
    sb.append("    gpSDifferential: ").append(toIndentedString(gpSDifferential)).append("\n");
    sb.append("    gpSImgDirection: ").append(toIndentedString(gpSImgDirection)).append("\n");
    sb.append("    gpSImgDirectionRef: ").append(toIndentedString(gpSImgDirectionRef)).append("\n");
    sb.append("    gpSDateStamp: ").append(toIndentedString(gpSDateStamp)).append("\n");
    sb.append("    gpSLatitude: ").append(toIndentedString(gpSLatitude)).append("\n");
    sb.append("    gpSLatitudeRef: ").append(toIndentedString(gpSLatitudeRef)).append("\n");
    sb.append("    gpSLongitude: ").append(toIndentedString(gpSLongitude)).append("\n");
    sb.append("    gpSLongitudeRef: ").append(toIndentedString(gpSLongitudeRef)).append("\n");
    sb.append("    gpSMapDatum: ").append(toIndentedString(gpSMapDatum)).append("\n");
    sb.append("    gpSMeasureMode: ").append(toIndentedString(gpSMeasureMode)).append("\n");
    sb.append("    gpSProcessingMethod: ").append(toIndentedString(gpSProcessingMethod)).append("\n");
    sb.append("    gpSSatellites: ").append(toIndentedString(gpSSatellites)).append("\n");
    sb.append("    gpSSpeed: ").append(toIndentedString(gpSSpeed)).append("\n");
    sb.append("    gpSSpeedRef: ").append(toIndentedString(gpSSpeedRef)).append("\n");
    sb.append("    gpSStatus: ").append(toIndentedString(gpSStatus)).append("\n");
    sb.append("    gpSTimestamp: ").append(toIndentedString(gpSTimestamp)).append("\n");
    sb.append("    gpSTrack: ").append(toIndentedString(gpSTrack)).append("\n");
    sb.append("    gpSTrackRef: ").append(toIndentedString(gpSTrackRef)).append("\n");
    sb.append("    gpSVersionID: ").append(toIndentedString(gpSVersionID)).append("\n");
    sb.append("    gainControl: ").append(toIndentedString(gainControl)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    isOSpeed: ").append(toIndentedString(isOSpeed)).append("\n");
    sb.append("    isOSpeedLatitudeYYY: ").append(toIndentedString(isOSpeedLatitudeYYY)).append("\n");
    sb.append("    isOSpeedLatitudeZZZ: ").append(toIndentedString(isOSpeedLatitudeZZZ)).append("\n");
    sb.append("    photographicSensitivity: ").append(toIndentedString(photographicSensitivity)).append("\n");
    sb.append("    imageUniqueID: ").append(toIndentedString(imageUniqueID)).append("\n");
    sb.append("    lensMake: ").append(toIndentedString(lensMake)).append("\n");
    sb.append("    lensModel: ").append(toIndentedString(lensModel)).append("\n");
    sb.append("    lensSerialNumber: ").append(toIndentedString(lensSerialNumber)).append("\n");
    sb.append("    lensSpecification: ").append(toIndentedString(lensSpecification)).append("\n");
    sb.append("    lightSource: ").append(toIndentedString(lightSource)).append("\n");
    sb.append("    makerNoteRawData: ").append(toIndentedString(makerNoteRawData)).append("\n");
    sb.append("    maxApertureValue: ").append(toIndentedString(maxApertureValue)).append("\n");
    sb.append("    meteringMode: ").append(toIndentedString(meteringMode)).append("\n");
    sb.append("    OECF: ").append(toIndentedString(OECF)).append("\n");
    sb.append("    pixelXDimension: ").append(toIndentedString(pixelXDimension)).append("\n");
    sb.append("    pixelYDimension: ").append(toIndentedString(pixelYDimension)).append("\n");
    sb.append("    recommendedExposureIndex: ").append(toIndentedString(recommendedExposureIndex)).append("\n");
    sb.append("    relatedSoundFile: ").append(toIndentedString(relatedSoundFile)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    sceneCaptureType: ").append(toIndentedString(sceneCaptureType)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
    sb.append("    sensingMethod: ").append(toIndentedString(sensingMethod)).append("\n");
    sb.append("    sensitivityType: ").append(toIndentedString(sensitivityType)).append("\n");
    sb.append("    sharpness: ").append(toIndentedString(sharpness)).append("\n");
    sb.append("    shutterSpeedValue: ").append(toIndentedString(shutterSpeedValue)).append("\n");
    sb.append("    spatialFrequencyResponse: ").append(toIndentedString(spatialFrequencyResponse)).append("\n");
    sb.append("    spectralSensitivity: ").append(toIndentedString(spectralSensitivity)).append("\n");
    sb.append("    standardOutputSensitivity: ").append(toIndentedString(standardOutputSensitivity)).append("\n");
    sb.append("    subjectArea: ").append(toIndentedString(subjectArea)).append("\n");
    sb.append("    subjectDistance: ").append(toIndentedString(subjectDistance)).append("\n");
    sb.append("    subjectDistanceRange: ").append(toIndentedString(subjectDistanceRange)).append("\n");
    sb.append("    subjectLocation: ").append(toIndentedString(subjectLocation)).append("\n");
    sb.append("    subsecTime: ").append(toIndentedString(subsecTime)).append("\n");
    sb.append("    subsecTimeDigitized: ").append(toIndentedString(subsecTimeDigitized)).append("\n");
    sb.append("    subsecTimeOriginal: ").append(toIndentedString(subsecTimeOriginal)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
    sb.append("    whiteBalance: ").append(toIndentedString(whiteBalance)).append("\n");
    sb.append("    whitePoint: ").append(toIndentedString(whitePoint)).append("\n");
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

