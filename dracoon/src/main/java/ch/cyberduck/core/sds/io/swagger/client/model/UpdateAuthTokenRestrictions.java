/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-08-05 13:11:50<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.23.0-beta.2
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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Request model for updating auth token settings
 */
@Schema(description = "Request model for updating auth token settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class UpdateAuthTokenRestrictions {
  @JsonProperty("overwriteEnabled")
  private Boolean overwriteEnabled = null;

  @JsonProperty("accessTokenValidity")
  private Integer accessTokenValidity = null;

  @JsonProperty("refreshTokenValidity")
  private Integer refreshTokenValidity = null;

  public UpdateAuthTokenRestrictions overwriteEnabled(Boolean overwriteEnabled) {
    this.overwriteEnabled = overwriteEnabled;
    return this;
  }

   /**
   * &amp;#128640; Since v4.13.0  Defines if OAuth token restrictions are enabled
   * @return overwriteEnabled
  **/
  @Schema(required = true, description = "&#128640; Since v4.13.0  Defines if OAuth token restrictions are enabled")
  public Boolean isOverwriteEnabled() {
    return overwriteEnabled;
  }

  public void setOverwriteEnabled(Boolean overwriteEnabled) {
    this.overwriteEnabled = overwriteEnabled;
  }

  public UpdateAuthTokenRestrictions accessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
    return this;
  }

   /**
   * &amp;#128640; Since v4.13.0  Restricted OAuth access token validity (in seconds)
   * @return accessTokenValidity
  **/
  @Schema(description = "&#128640; Since v4.13.0  Restricted OAuth access token validity (in seconds)")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }

  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  public UpdateAuthTokenRestrictions refreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
    return this;
  }

   /**
   * &amp;#128640; Since v4.13.0  Restricted OAuth refresh token validity (in seconds)
   * @return refreshTokenValidity
  **/
  @Schema(description = "&#128640; Since v4.13.0  Restricted OAuth refresh token validity (in seconds)")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }

  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthTokenRestrictions updateAuthTokenRestrictions = (UpdateAuthTokenRestrictions) o;
    return Objects.equals(this.overwriteEnabled, updateAuthTokenRestrictions.overwriteEnabled) &&
        Objects.equals(this.accessTokenValidity, updateAuthTokenRestrictions.accessTokenValidity) &&
        Objects.equals(this.refreshTokenValidity, updateAuthTokenRestrictions.refreshTokenValidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwriteEnabled, accessTokenValidity, refreshTokenValidity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthTokenRestrictions {\n");
    
    sb.append("    overwriteEnabled: ").append(toIndentedString(overwriteEnabled)).append("\n");
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
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
