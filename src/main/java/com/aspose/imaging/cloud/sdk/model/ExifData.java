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

import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.imaging.cloud.sdk.stablemodel.*;

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
    return ObjectUtils.equals(this.apertureValue, exifData.apertureValue) &&
    ObjectUtils.equals(this.bodySerialNumber, exifData.bodySerialNumber) &&
    ObjectUtils.equals(this.brightnessValue, exifData.brightnessValue) &&
    ObjectUtils.equals(this.cfAPattern, exifData.cfAPattern) &&
    ObjectUtils.equals(this.cameraOwnerName, exifData.cameraOwnerName) &&
    ObjectUtils.equals(this.colorSpace, exifData.colorSpace) &&
    ObjectUtils.equals(this.componentsConfiguration, exifData.componentsConfiguration) &&
    ObjectUtils.equals(this.compressedBitsPerPixel, exifData.compressedBitsPerPixel) &&
    ObjectUtils.equals(this.contrast, exifData.contrast) &&
    ObjectUtils.equals(this.customRendered, exifData.customRendered) &&
    ObjectUtils.equals(this.dateTimeDigitized, exifData.dateTimeDigitized) &&
    ObjectUtils.equals(this.dateTimeOriginal, exifData.dateTimeOriginal) &&
    ObjectUtils.equals(this.deviceSettingDescription, exifData.deviceSettingDescription) &&
    ObjectUtils.equals(this.digitalZoomRatio, exifData.digitalZoomRatio) &&
    ObjectUtils.equals(this.exifVersion, exifData.exifVersion) &&
    ObjectUtils.equals(this.exposureBiasValue, exifData.exposureBiasValue) &&
    ObjectUtils.equals(this.exposureIndex, exifData.exposureIndex) &&
    ObjectUtils.equals(this.exposureMode, exifData.exposureMode) &&
    ObjectUtils.equals(this.exposureProgram, exifData.exposureProgram) &&
    ObjectUtils.equals(this.exposureTime, exifData.exposureTime) &&
    ObjectUtils.equals(this.fnumber, exifData.fnumber) &&
    ObjectUtils.equals(this.fileSource, exifData.fileSource) &&
    ObjectUtils.equals(this.flash, exifData.flash) &&
    ObjectUtils.equals(this.flashEnergy, exifData.flashEnergy) &&
    ObjectUtils.equals(this.flashpixVersion, exifData.flashpixVersion) &&
    ObjectUtils.equals(this.focalLength, exifData.focalLength) &&
    ObjectUtils.equals(this.focalLengthIn35MmFilm, exifData.focalLengthIn35MmFilm) &&
    ObjectUtils.equals(this.focalPlaneResolutionUnit, exifData.focalPlaneResolutionUnit) &&
    ObjectUtils.equals(this.focalPlaneXResolution, exifData.focalPlaneXResolution) &&
    ObjectUtils.equals(this.focalPlaneYResolution, exifData.focalPlaneYResolution) &&
    ObjectUtils.equals(this.gpSAltitude, exifData.gpSAltitude) &&
    ObjectUtils.equals(this.gpSAltitudeRef, exifData.gpSAltitudeRef) &&
    ObjectUtils.equals(this.gpSAreaInformation, exifData.gpSAreaInformation) &&
    ObjectUtils.equals(this.GPSDOP, exifData.GPSDOP) &&
    ObjectUtils.equals(this.gpSDestBearing, exifData.gpSDestBearing) &&
    ObjectUtils.equals(this.gpSDestBearingRef, exifData.gpSDestBearingRef) &&
    ObjectUtils.equals(this.gpSDestDistance, exifData.gpSDestDistance) &&
    ObjectUtils.equals(this.gpSDestDistanceRef, exifData.gpSDestDistanceRef) &&
    ObjectUtils.equals(this.gpSDestLatitude, exifData.gpSDestLatitude) &&
    ObjectUtils.equals(this.gpSDestLatitudeRef, exifData.gpSDestLatitudeRef) &&
    ObjectUtils.equals(this.gpSDestLongitude, exifData.gpSDestLongitude) &&
    ObjectUtils.equals(this.gpSDestLongitudeRef, exifData.gpSDestLongitudeRef) &&
    ObjectUtils.equals(this.gpSDifferential, exifData.gpSDifferential) &&
    ObjectUtils.equals(this.gpSImgDirection, exifData.gpSImgDirection) &&
    ObjectUtils.equals(this.gpSImgDirectionRef, exifData.gpSImgDirectionRef) &&
    ObjectUtils.equals(this.gpSDateStamp, exifData.gpSDateStamp) &&
    ObjectUtils.equals(this.gpSLatitude, exifData.gpSLatitude) &&
    ObjectUtils.equals(this.gpSLatitudeRef, exifData.gpSLatitudeRef) &&
    ObjectUtils.equals(this.gpSLongitude, exifData.gpSLongitude) &&
    ObjectUtils.equals(this.gpSLongitudeRef, exifData.gpSLongitudeRef) &&
    ObjectUtils.equals(this.gpSMapDatum, exifData.gpSMapDatum) &&
    ObjectUtils.equals(this.gpSMeasureMode, exifData.gpSMeasureMode) &&
    ObjectUtils.equals(this.gpSProcessingMethod, exifData.gpSProcessingMethod) &&
    ObjectUtils.equals(this.gpSSatellites, exifData.gpSSatellites) &&
    ObjectUtils.equals(this.gpSSpeed, exifData.gpSSpeed) &&
    ObjectUtils.equals(this.gpSSpeedRef, exifData.gpSSpeedRef) &&
    ObjectUtils.equals(this.gpSStatus, exifData.gpSStatus) &&
    ObjectUtils.equals(this.gpSTimestamp, exifData.gpSTimestamp) &&
    ObjectUtils.equals(this.gpSTrack, exifData.gpSTrack) &&
    ObjectUtils.equals(this.gpSTrackRef, exifData.gpSTrackRef) &&
    ObjectUtils.equals(this.gpSVersionID, exifData.gpSVersionID) &&
    ObjectUtils.equals(this.gainControl, exifData.gainControl) &&
    ObjectUtils.equals(this.gamma, exifData.gamma) &&
    ObjectUtils.equals(this.isOSpeed, exifData.isOSpeed) &&
    ObjectUtils.equals(this.isOSpeedLatitudeYYY, exifData.isOSpeedLatitudeYYY) &&
    ObjectUtils.equals(this.isOSpeedLatitudeZZZ, exifData.isOSpeedLatitudeZZZ) &&
    ObjectUtils.equals(this.photographicSensitivity, exifData.photographicSensitivity) &&
    ObjectUtils.equals(this.imageUniqueID, exifData.imageUniqueID) &&
    ObjectUtils.equals(this.lensMake, exifData.lensMake) &&
    ObjectUtils.equals(this.lensModel, exifData.lensModel) &&
    ObjectUtils.equals(this.lensSerialNumber, exifData.lensSerialNumber) &&
    ObjectUtils.equals(this.lensSpecification, exifData.lensSpecification) &&
    ObjectUtils.equals(this.lightSource, exifData.lightSource) &&
    ObjectUtils.equals(this.makerNoteRawData, exifData.makerNoteRawData) &&
    ObjectUtils.equals(this.maxApertureValue, exifData.maxApertureValue) &&
    ObjectUtils.equals(this.meteringMode, exifData.meteringMode) &&
    ObjectUtils.equals(this.OECF, exifData.OECF) &&
    ObjectUtils.equals(this.pixelXDimension, exifData.pixelXDimension) &&
    ObjectUtils.equals(this.pixelYDimension, exifData.pixelYDimension) &&
    ObjectUtils.equals(this.recommendedExposureIndex, exifData.recommendedExposureIndex) &&
    ObjectUtils.equals(this.relatedSoundFile, exifData.relatedSoundFile) &&
    ObjectUtils.equals(this.saturation, exifData.saturation) &&
    ObjectUtils.equals(this.sceneCaptureType, exifData.sceneCaptureType) &&
    ObjectUtils.equals(this.sceneType, exifData.sceneType) &&
    ObjectUtils.equals(this.sensingMethod, exifData.sensingMethod) &&
    ObjectUtils.equals(this.sensitivityType, exifData.sensitivityType) &&
    ObjectUtils.equals(this.sharpness, exifData.sharpness) &&
    ObjectUtils.equals(this.shutterSpeedValue, exifData.shutterSpeedValue) &&
    ObjectUtils.equals(this.spatialFrequencyResponse, exifData.spatialFrequencyResponse) &&
    ObjectUtils.equals(this.spectralSensitivity, exifData.spectralSensitivity) &&
    ObjectUtils.equals(this.standardOutputSensitivity, exifData.standardOutputSensitivity) &&
    ObjectUtils.equals(this.subjectArea, exifData.subjectArea) &&
    ObjectUtils.equals(this.subjectDistance, exifData.subjectDistance) &&
    ObjectUtils.equals(this.subjectDistanceRange, exifData.subjectDistanceRange) &&
    ObjectUtils.equals(this.subjectLocation, exifData.subjectLocation) &&
    ObjectUtils.equals(this.subsecTime, exifData.subsecTime) &&
    ObjectUtils.equals(this.subsecTimeDigitized, exifData.subsecTimeDigitized) &&
    ObjectUtils.equals(this.subsecTimeOriginal, exifData.subsecTimeOriginal) &&
    ObjectUtils.equals(this.userComment, exifData.userComment) &&
    ObjectUtils.equals(this.whiteBalance, exifData.whiteBalance) &&
    ObjectUtils.equals(this.whitePoint, exifData.whitePoint);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(apertureValue, bodySerialNumber, brightnessValue, cfAPattern, cameraOwnerName, colorSpace, componentsConfiguration, compressedBitsPerPixel, contrast, customRendered, dateTimeDigitized, dateTimeOriginal, deviceSettingDescription, digitalZoomRatio, exifVersion, exposureBiasValue, exposureIndex, exposureMode, exposureProgram, exposureTime, fnumber, fileSource, flash, flashEnergy, flashpixVersion, focalLength, focalLengthIn35MmFilm, focalPlaneResolutionUnit, focalPlaneXResolution, focalPlaneYResolution, gpSAltitude, gpSAltitudeRef, gpSAreaInformation, GPSDOP, gpSDestBearing, gpSDestBearingRef, gpSDestDistance, gpSDestDistanceRef, gpSDestLatitude, gpSDestLatitudeRef, gpSDestLongitude, gpSDestLongitudeRef, gpSDifferential, gpSImgDirection, gpSImgDirectionRef, gpSDateStamp, gpSLatitude, gpSLatitudeRef, gpSLongitude, gpSLongitudeRef, gpSMapDatum, gpSMeasureMode, gpSProcessingMethod, gpSSatellites, gpSSpeed, gpSSpeedRef, gpSStatus, gpSTimestamp, gpSTrack, gpSTrackRef, gpSVersionID, gainControl, gamma, isOSpeed, isOSpeedLatitudeYYY, isOSpeedLatitudeZZZ, photographicSensitivity, imageUniqueID, lensMake, lensModel, lensSerialNumber, lensSpecification, lightSource, makerNoteRawData, maxApertureValue, meteringMode, OECF, pixelXDimension, pixelYDimension, recommendedExposureIndex, relatedSoundFile, saturation, sceneCaptureType, sceneType, sensingMethod, sensitivityType, sharpness, shutterSpeedValue, spatialFrequencyResponse, spectralSensitivity, standardOutputSensitivity, subjectArea, subjectDistance, subjectDistanceRange, subjectLocation, subsecTime, subsecTimeDigitized, subsecTimeOriginal, userComment, whiteBalance, whitePoint);
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

