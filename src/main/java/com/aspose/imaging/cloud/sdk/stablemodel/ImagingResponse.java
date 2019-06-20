/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingResponse.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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
import com.aspose.imaging.cloud.sdk.model.BmpProperties;
import com.aspose.imaging.cloud.sdk.model.DicomProperties;
import com.aspose.imaging.cloud.sdk.model.DjvuProperties;
import com.aspose.imaging.cloud.sdk.model.DngProperties;
import com.aspose.imaging.cloud.sdk.model.GifProperties;
import com.aspose.imaging.cloud.sdk.model.Jpeg2000Properties;
import com.aspose.imaging.cloud.sdk.model.JpegProperties;
import com.aspose.imaging.cloud.sdk.model.OdgProperties;
import com.aspose.imaging.cloud.sdk.model.PngProperties;
import com.aspose.imaging.cloud.sdk.model.PsdProperties;
import com.aspose.imaging.cloud.sdk.model.TiffProperties;
import com.aspose.imaging.cloud.sdk.model.WebPProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about image.
 */
public class ImagingResponse {
  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("bitsPerPixel")
  private Integer bitsPerPixel = null;

  @JsonProperty("bmpProperties")
  private BmpProperties bmpProperties = null;

  @JsonProperty("gifProperties")
  private GifProperties gifProperties = null;

  @JsonProperty("jpegProperties")
  private JpegProperties jpegProperties = null;

  @JsonProperty("pngProperties")
  private PngProperties pngProperties = null;

  @JsonProperty("tiffProperties")
  private TiffProperties tiffProperties = null;

  @JsonProperty("psdProperties")
  private PsdProperties psdProperties = null;

  @JsonProperty("djvuProperties")
  private DjvuProperties djvuProperties = null;

  @JsonProperty("webPProperties")
  private WebPProperties webPProperties = null;

  @JsonProperty("jpeg2000Properties")
  private Jpeg2000Properties jpeg2000Properties = null;

  @JsonProperty("dicomProperties")
  private DicomProperties dicomProperties = null;

  @JsonProperty("dngProperties")
  private DngProperties dngProperties = null;

  @JsonProperty("odgProperties")
  private OdgProperties odgProperties = null;

  @JsonProperty("horizontalResolution")
  private Double horizontalResolution = null;

  @JsonProperty("verticalResolution")
  private Double verticalResolution = null;

  @JsonProperty("isCached")
  private Boolean isCached = null;

  public ImagingResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height of image.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImagingResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width of image.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImagingResponse bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

   /**
   * Gets or sets the bits per pixel for image.
   * @return bitsPerPixel
  **/
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }

  public ImagingResponse bmpProperties(BmpProperties bmpProperties) {
    this.bmpProperties = bmpProperties;
    return this;
  }

   /**
   * Gets or sets the BMP properties.
   * @return bmpProperties
  **/
  public BmpProperties getBmpProperties() {
    return bmpProperties;
  }

  public void setBmpProperties(BmpProperties bmpProperties) {
    this.bmpProperties = bmpProperties;
  }

  public ImagingResponse gifProperties(GifProperties gifProperties) {
    this.gifProperties = gifProperties;
    return this;
  }

   /**
   * Gets or sets the GIF properties.
   * @return gifProperties
  **/
  public GifProperties getGifProperties() {
    return gifProperties;
  }

  public void setGifProperties(GifProperties gifProperties) {
    this.gifProperties = gifProperties;
  }

  public ImagingResponse jpegProperties(JpegProperties jpegProperties) {
    this.jpegProperties = jpegProperties;
    return this;
  }

   /**
   * Gets or sets the JPEG properties.
   * @return jpegProperties
  **/
  public JpegProperties getJpegProperties() {
    return jpegProperties;
  }

  public void setJpegProperties(JpegProperties jpegProperties) {
    this.jpegProperties = jpegProperties;
  }

  public ImagingResponse pngProperties(PngProperties pngProperties) {
    this.pngProperties = pngProperties;
    return this;
  }

   /**
   * Gets or sets the PNG properties.
   * @return pngProperties
  **/
  public PngProperties getPngProperties() {
    return pngProperties;
  }

  public void setPngProperties(PngProperties pngProperties) {
    this.pngProperties = pngProperties;
  }

  public ImagingResponse tiffProperties(TiffProperties tiffProperties) {
    this.tiffProperties = tiffProperties;
    return this;
  }

   /**
   * Gets or sets the TIFF properties.
   * @return tiffProperties
  **/
  public TiffProperties getTiffProperties() {
    return tiffProperties;
  }

  public void setTiffProperties(TiffProperties tiffProperties) {
    this.tiffProperties = tiffProperties;
  }

  public ImagingResponse psdProperties(PsdProperties psdProperties) {
    this.psdProperties = psdProperties;
    return this;
  }

   /**
   * Gets or sets the PSD properties.
   * @return psdProperties
  **/
  public PsdProperties getPsdProperties() {
    return psdProperties;
  }

  public void setPsdProperties(PsdProperties psdProperties) {
    this.psdProperties = psdProperties;
  }

  public ImagingResponse djvuProperties(DjvuProperties djvuProperties) {
    this.djvuProperties = djvuProperties;
    return this;
  }

   /**
   * Gets or sets the DJVU properties.
   * @return djvuProperties
  **/
  public DjvuProperties getDjvuProperties() {
    return djvuProperties;
  }

  public void setDjvuProperties(DjvuProperties djvuProperties) {
    this.djvuProperties = djvuProperties;
  }

  public ImagingResponse webPProperties(WebPProperties webPProperties) {
    this.webPProperties = webPProperties;
    return this;
  }

   /**
   * Gets or sets the WEBP properties.
   * @return webPProperties
  **/
  public WebPProperties getWebPProperties() {
    return webPProperties;
  }

  public void setWebPProperties(WebPProperties webPProperties) {
    this.webPProperties = webPProperties;
  }

  public ImagingResponse jpeg2000Properties(Jpeg2000Properties jpeg2000Properties) {
    this.jpeg2000Properties = jpeg2000Properties;
    return this;
  }

   /**
   * Gets or sets the JPEG2000 properties.
   * @return jpeg2000Properties
  **/
  public Jpeg2000Properties getJpeg2000Properties() {
    return jpeg2000Properties;
  }

  public void setJpeg2000Properties(Jpeg2000Properties jpeg2000Properties) {
    this.jpeg2000Properties = jpeg2000Properties;
  }

  public ImagingResponse dicomProperties(DicomProperties dicomProperties) {
    this.dicomProperties = dicomProperties;
    return this;
  }

   /**
   * Gets or sets the DICOM properties.
   * @return dicomProperties
  **/
  public DicomProperties getDicomProperties() {
    return dicomProperties;
  }

  public void setDicomProperties(DicomProperties dicomProperties) {
    this.dicomProperties = dicomProperties;
  }

  public ImagingResponse dngProperties(DngProperties dngProperties) {
    this.dngProperties = dngProperties;
    return this;
  }

   /**
   * Gets or sets the DNG properties.
   * @return dngProperties
  **/
  public DngProperties getDngProperties() {
    return dngProperties;
  }

  public void setDngProperties(DngProperties dngProperties) {
    this.dngProperties = dngProperties;
  }

  public ImagingResponse odgProperties(OdgProperties odgProperties) {
    this.odgProperties = odgProperties;
    return this;
  }

   /**
   * Gets or sets the the ODG properties.
   * @return odgProperties
  **/
  public OdgProperties getOdgProperties() {
    return odgProperties;
  }

  public void setOdgProperties(OdgProperties odgProperties) {
    this.odgProperties = odgProperties;
  }

  public ImagingResponse horizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Gets or sets the horizontal resolution of an image.
   * @return horizontalResolution
  **/
  public Double getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public ImagingResponse verticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Gets or sets the vertical resolution of an image.
   * @return verticalResolution
  **/
  public Double getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public ImagingResponse isCached(Boolean isCached) {
    this.isCached = isCached;
    return this;
  }

   /**
   * Gets or sets a value indicating whether image is cached.
   * @return isCached
  **/
  public Boolean isIsCached() {
    return isCached;
  }

  public void setIsCached(Boolean isCached) {
    this.isCached = isCached;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagingResponse imagingResponse = (ImagingResponse) o;
    return ObjectUtils.equals(this.height, imagingResponse.height) &&
        ObjectUtils.equals(this.width, imagingResponse.width) &&
        ObjectUtils.equals(this.bitsPerPixel, imagingResponse.bitsPerPixel) &&
        ObjectUtils.equals(this.bmpProperties, imagingResponse.bmpProperties) &&
        ObjectUtils.equals(this.gifProperties, imagingResponse.gifProperties) &&
        ObjectUtils.equals(this.jpegProperties, imagingResponse.jpegProperties) &&
        ObjectUtils.equals(this.pngProperties, imagingResponse.pngProperties) &&
        ObjectUtils.equals(this.tiffProperties, imagingResponse.tiffProperties) &&
        ObjectUtils.equals(this.psdProperties, imagingResponse.psdProperties) &&
        ObjectUtils.equals(this.djvuProperties, imagingResponse.djvuProperties) &&
        ObjectUtils.equals(this.webPProperties, imagingResponse.webPProperties) &&
        ObjectUtils.equals(this.jpeg2000Properties, imagingResponse.jpeg2000Properties) &&
        ObjectUtils.equals(this.dicomProperties, imagingResponse.dicomProperties) &&
        ObjectUtils.equals(this.dngProperties, imagingResponse.dngProperties) &&
        ObjectUtils.equals(this.odgProperties, imagingResponse.odgProperties) &&
        ObjectUtils.equals(this.horizontalResolution, imagingResponse.horizontalResolution) &&
        ObjectUtils.equals(this.verticalResolution, imagingResponse.verticalResolution) &&
        ObjectUtils.equals(this.isCached, imagingResponse.isCached) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(height, width, bitsPerPixel, bmpProperties, gifProperties, jpegProperties, pngProperties, tiffProperties, psdProperties, djvuProperties, webPProperties, jpeg2000Properties, dicomProperties, dngProperties, odgProperties, horizontalResolution, verticalResolution, isCached, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagingResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
    sb.append("    bmpProperties: ").append(toIndentedString(bmpProperties)).append("\n");
    sb.append("    gifProperties: ").append(toIndentedString(gifProperties)).append("\n");
    sb.append("    jpegProperties: ").append(toIndentedString(jpegProperties)).append("\n");
    sb.append("    pngProperties: ").append(toIndentedString(pngProperties)).append("\n");
    sb.append("    tiffProperties: ").append(toIndentedString(tiffProperties)).append("\n");
    sb.append("    psdProperties: ").append(toIndentedString(psdProperties)).append("\n");
    sb.append("    djvuProperties: ").append(toIndentedString(djvuProperties)).append("\n");
    sb.append("    webPProperties: ").append(toIndentedString(webPProperties)).append("\n");
    sb.append("    jpeg2000Properties: ").append(toIndentedString(jpeg2000Properties)).append("\n");
    sb.append("    dicomProperties: ").append(toIndentedString(dicomProperties)).append("\n");
    sb.append("    dngProperties: ").append(toIndentedString(dngProperties)).append("\n");
    sb.append("    odgProperties: ").append(toIndentedString(odgProperties)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    isCached: ").append(toIndentedString(isCached)).append("\n");
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

