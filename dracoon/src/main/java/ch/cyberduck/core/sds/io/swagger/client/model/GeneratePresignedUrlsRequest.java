/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.20.1  - built at: 2020-04-05 23:00:17<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.20.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model for generating presigned URLs
 */
@ApiModel(description = "Request model for generating presigned URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class GeneratePresignedUrlsRequest {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("firstPartNumber")
  private Integer firstPartNumber = null;

  @JsonProperty("lastPartNumber")
  private Integer lastPartNumber = null;

  public GeneratePresignedUrlsRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * &#x60;Content-Length&#x60; header size for each presigned URL (in bytes) *MUST* be &gt;&#x3D; 5 MB except the last part.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "`Content-Length` header size for each presigned URL (in bytes) *MUST* be >= 5 MB except the last part.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public GeneratePresignedUrlsRequest firstPartNumber(Integer firstPartNumber) {
    this.firstPartNumber = firstPartNumber;
    return this;
  }

   /**
   * First part number of a range of requested presigned URLs (for S3 it is: &#x60;1&#x60;)
   * @return firstPartNumber
  **/
  @ApiModelProperty(required = true, value = "First part number of a range of requested presigned URLs (for S3 it is: `1`)")
  public Integer getFirstPartNumber() {
    return firstPartNumber;
  }

  public void setFirstPartNumber(Integer firstPartNumber) {
    this.firstPartNumber = firstPartNumber;
  }

  public GeneratePresignedUrlsRequest lastPartNumber(Integer lastPartNumber) {
    this.lastPartNumber = lastPartNumber;
    return this;
  }

   /**
   * Last part number of a range of requested presigned URLs
   * @return lastPartNumber
  **/
  @ApiModelProperty(required = true, value = "Last part number of a range of requested presigned URLs")
  public Integer getLastPartNumber() {
    return lastPartNumber;
  }

  public void setLastPartNumber(Integer lastPartNumber) {
    this.lastPartNumber = lastPartNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePresignedUrlsRequest generatePresignedUrlsRequest = (GeneratePresignedUrlsRequest) o;
    return Objects.equals(this.size, generatePresignedUrlsRequest.size) &&
        Objects.equals(this.firstPartNumber, generatePresignedUrlsRequest.firstPartNumber) &&
        Objects.equals(this.lastPartNumber, generatePresignedUrlsRequest.lastPartNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, firstPartNumber, lastPartNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratePresignedUrlsRequest {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    firstPartNumber: ").append(toIndentedString(firstPartNumber)).append("\n");
    sb.append("    lastPartNumber: ").append(toIndentedString(lastPartNumber)).append("\n");
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

