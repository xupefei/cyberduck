/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class FileLock {
  @JsonProperty("fileId")
  private String fileId = null;

  @JsonProperty("lockId")
  private String lockId = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("expire")
  private DateTime expire = null;

  public FileLock fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * 
   * @return fileId
  **/
  @ApiModelProperty(value = "")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public FileLock lockId(String lockId) {
    this.lockId = lockId;
    return this;
  }

   /**
   * 
   * @return lockId
  **/
  @ApiModelProperty(value = "")
  public String getLockId() {
    return lockId;
  }

  public void setLockId(String lockId) {
    this.lockId = lockId;
  }

  public FileLock owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * 
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public FileLock expire(DateTime expire) {
    this.expire = expire;
    return this;
  }

   /**
   * 
   * @return expire
  **/
  @ApiModelProperty(value = "")
  public DateTime getExpire() {
    return expire;
  }

  public void setExpire(DateTime expire) {
    this.expire = expire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLock fileLock = (FileLock) o;
    return Objects.equals(this.fileId, fileLock.fileId) &&
        Objects.equals(this.lockId, fileLock.lockId) &&
        Objects.equals(this.owner, fileLock.owner) &&
        Objects.equals(this.expire, fileLock.expire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, lockId, owner, expire);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLock {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    lockId: ").append(toIndentedString(lockId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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
