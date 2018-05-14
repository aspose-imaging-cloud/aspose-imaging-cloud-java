/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OdgMetadata.java">
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
 * ODG format metadata
 */
public class OdgMetadata {
  @JsonProperty("Generator")
  private String generator = null;

  @JsonProperty("Title")
  private String title = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("Keywords")
  private String keywords = null;

  @JsonProperty("InitialCreator")
  private String initialCreator = null;

  @JsonProperty("Creator")
  private String creator = null;

  @JsonProperty("PrintedBy")
  private String printedBy = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("ModificationDateTime")
  private String modificationDateTime = null;

  @JsonProperty("PrintDateTime")
  private String printDateTime = null;

  @JsonProperty("DocumentTemplate")
  private String documentTemplate = null;

  @JsonProperty("AutomaticReload")
  private String automaticReload = null;

  @JsonProperty("HyperlinkBehavior")
  private String hyperlinkBehavior = null;

  @JsonProperty("Language")
  private String language = null;

  @JsonProperty("EditingCycles")
  private String editingCycles = null;

  @JsonProperty("EditingDuration")
  private String editingDuration = null;

  @JsonProperty("DocumentStatistics")
  private String documentStatistics = null;

  public OdgMetadata generator(String generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Gets or sets the generator.             
   * @return generator
  **/
  @ApiModelProperty(value = "Gets or sets the generator.             ")
  public String getGenerator() {
    return generator;
  }

  public void setGenerator(String generator) {
    this.generator = generator;
  }

  public OdgMetadata title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets the title.             
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets the title.             ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OdgMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Gets or sets the description.             
   * @return description
  **/
  @ApiModelProperty(value = "Gets or sets the description.             ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OdgMetadata subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Gets or sets the subject.             
   * @return subject
  **/
  @ApiModelProperty(value = "Gets or sets the subject.             ")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public OdgMetadata keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Gets or sets the keywords.             
   * @return keywords
  **/
  @ApiModelProperty(value = "Gets or sets the keywords.             ")
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public OdgMetadata initialCreator(String initialCreator) {
    this.initialCreator = initialCreator;
    return this;
  }

   /**
   * Gets or sets the initial creator.             
   * @return initialCreator
  **/
  @ApiModelProperty(value = "Gets or sets the initial creator.             ")
  public String getInitialCreator() {
    return initialCreator;
  }

  public void setInitialCreator(String initialCreator) {
    this.initialCreator = initialCreator;
  }

  public OdgMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Gets or sets the creator.             
   * @return creator
  **/
  @ApiModelProperty(value = "Gets or sets the creator.             ")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public OdgMetadata printedBy(String printedBy) {
    this.printedBy = printedBy;
    return this;
  }

   /**
   * Gets or sets the \&quot;PrintedBy\&quot; record.             
   * @return printedBy
  **/
  @ApiModelProperty(value = "Gets or sets the \"PrintedBy\" record.             ")
  public String getPrintedBy() {
    return printedBy;
  }

  public void setPrintedBy(String printedBy) {
    this.printedBy = printedBy;
  }

  public OdgMetadata creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Gets or sets the creation date and time.             
   * @return creationDateTime
  **/
  @ApiModelProperty(value = "Gets or sets the creation date and time.             ")
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OdgMetadata modificationDateTime(String modificationDateTime) {
    this.modificationDateTime = modificationDateTime;
    return this;
  }

   /**
   * Gets or sets the modification date and time.             
   * @return modificationDateTime
  **/
  @ApiModelProperty(value = "Gets or sets the modification date and time.             ")
  public String getModificationDateTime() {
    return modificationDateTime;
  }

  public void setModificationDateTime(String modificationDateTime) {
    this.modificationDateTime = modificationDateTime;
  }

  public OdgMetadata printDateTime(String printDateTime) {
    this.printDateTime = printDateTime;
    return this;
  }

   /**
   * Gets or sets the print date and time.             
   * @return printDateTime
  **/
  @ApiModelProperty(value = "Gets or sets the print date and time.             ")
  public String getPrintDateTime() {
    return printDateTime;
  }

  public void setPrintDateTime(String printDateTime) {
    this.printDateTime = printDateTime;
  }

  public OdgMetadata documentTemplate(String documentTemplate) {
    this.documentTemplate = documentTemplate;
    return this;
  }

   /**
   * Gets or sets the document template.             
   * @return documentTemplate
  **/
  @ApiModelProperty(value = "Gets or sets the document template.             ")
  public String getDocumentTemplate() {
    return documentTemplate;
  }

  public void setDocumentTemplate(String documentTemplate) {
    this.documentTemplate = documentTemplate;
  }

  public OdgMetadata automaticReload(String automaticReload) {
    this.automaticReload = automaticReload;
    return this;
  }

   /**
   * Gets or sets the automatic reload.             
   * @return automaticReload
  **/
  @ApiModelProperty(value = "Gets or sets the automatic reload.             ")
  public String getAutomaticReload() {
    return automaticReload;
  }

  public void setAutomaticReload(String automaticReload) {
    this.automaticReload = automaticReload;
  }

  public OdgMetadata hyperlinkBehavior(String hyperlinkBehavior) {
    this.hyperlinkBehavior = hyperlinkBehavior;
    return this;
  }

   /**
   * Gets or sets the hyperlink behavior.             
   * @return hyperlinkBehavior
  **/
  @ApiModelProperty(value = "Gets or sets the hyperlink behavior.             ")
  public String getHyperlinkBehavior() {
    return hyperlinkBehavior;
  }

  public void setHyperlinkBehavior(String hyperlinkBehavior) {
    this.hyperlinkBehavior = hyperlinkBehavior;
  }

  public OdgMetadata language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Gets or sets the language.             
   * @return language
  **/
  @ApiModelProperty(value = "Gets or sets the language.             ")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public OdgMetadata editingCycles(String editingCycles) {
    this.editingCycles = editingCycles;
    return this;
  }

   /**
   * Gets or sets the editing cycles.             
   * @return editingCycles
  **/
  @ApiModelProperty(value = "Gets or sets the editing cycles.             ")
  public String getEditingCycles() {
    return editingCycles;
  }

  public void setEditingCycles(String editingCycles) {
    this.editingCycles = editingCycles;
  }

  public OdgMetadata editingDuration(String editingDuration) {
    this.editingDuration = editingDuration;
    return this;
  }

   /**
   * Gets or sets the duration of the editing.             
   * @return editingDuration
  **/
  @ApiModelProperty(value = "Gets or sets the duration of the editing.             ")
  public String getEditingDuration() {
    return editingDuration;
  }

  public void setEditingDuration(String editingDuration) {
    this.editingDuration = editingDuration;
  }

  public OdgMetadata documentStatistics(String documentStatistics) {
    this.documentStatistics = documentStatistics;
    return this;
  }

   /**
   * Gets or sets the document statistics.             
   * @return documentStatistics
  **/
  @ApiModelProperty(value = "Gets or sets the document statistics.             ")
  public String getDocumentStatistics() {
    return documentStatistics;
  }

  public void setDocumentStatistics(String documentStatistics) {
    this.documentStatistics = documentStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OdgMetadata odgMetadata = (OdgMetadata) o;
    return Objects.equals(this.generator, odgMetadata.generator) &&
        Objects.equals(this.title, odgMetadata.title) &&
        Objects.equals(this.description, odgMetadata.description) &&
        Objects.equals(this.subject, odgMetadata.subject) &&
        Objects.equals(this.keywords, odgMetadata.keywords) &&
        Objects.equals(this.initialCreator, odgMetadata.initialCreator) &&
        Objects.equals(this.creator, odgMetadata.creator) &&
        Objects.equals(this.printedBy, odgMetadata.printedBy) &&
        Objects.equals(this.creationDateTime, odgMetadata.creationDateTime) &&
        Objects.equals(this.modificationDateTime, odgMetadata.modificationDateTime) &&
        Objects.equals(this.printDateTime, odgMetadata.printDateTime) &&
        Objects.equals(this.documentTemplate, odgMetadata.documentTemplate) &&
        Objects.equals(this.automaticReload, odgMetadata.automaticReload) &&
        Objects.equals(this.hyperlinkBehavior, odgMetadata.hyperlinkBehavior) &&
        Objects.equals(this.language, odgMetadata.language) &&
        Objects.equals(this.editingCycles, odgMetadata.editingCycles) &&
        Objects.equals(this.editingDuration, odgMetadata.editingDuration) &&
        Objects.equals(this.documentStatistics, odgMetadata.documentStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generator, title, description, subject, keywords, initialCreator, creator, printedBy, creationDateTime, modificationDateTime, printDateTime, documentTemplate, automaticReload, hyperlinkBehavior, language, editingCycles, editingDuration, documentStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdgMetadata {\n");
    
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    initialCreator: ").append(toIndentedString(initialCreator)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    printedBy: ").append(toIndentedString(printedBy)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    modificationDateTime: ").append(toIndentedString(modificationDateTime)).append("\n");
    sb.append("    printDateTime: ").append(toIndentedString(printDateTime)).append("\n");
    sb.append("    documentTemplate: ").append(toIndentedString(documentTemplate)).append("\n");
    sb.append("    automaticReload: ").append(toIndentedString(automaticReload)).append("\n");
    sb.append("    hyperlinkBehavior: ").append(toIndentedString(hyperlinkBehavior)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    editingCycles: ").append(toIndentedString(editingCycles)).append("\n");
    sb.append("    editingDuration: ").append(toIndentedString(editingDuration)).append("\n");
    sb.append("    documentStatistics: ").append(toIndentedString(documentStatistics)).append("\n");
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

