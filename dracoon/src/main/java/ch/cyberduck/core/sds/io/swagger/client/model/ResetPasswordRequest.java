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
 * Request model for reseting user&#x27;s login password
 */
@Schema(description = "Request model for reseting user's login password")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class ResetPasswordRequest {
  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("creatorLanguage")
  private String creatorLanguage = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("login")
  private String login = null;

  public ResetPasswordRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * &amp;#128640; Since v4.13.0  Username
   * @return userName
  **/
  @Schema(description = "&#128640; Since v4.13.0  Username")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ResetPasswordRequest creatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
    return this;
  }

   /**
   * IETF language tag
   * @return creatorLanguage
  **/
  @Schema(description = "IETF language tag")
  public String getCreatorLanguage() {
    return creatorLanguage;
  }

  public void setCreatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
  }

  public ResetPasswordRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.7.0  Language ID or ISO 639-1 code
   * @return language
  **/
  @Schema(description = "&#128679; Deprecated since v4.7.0  Language ID or ISO 639-1 code")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ResetPasswordRequest login(String login) {
    this.login = login;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.13.0  User login name
   * @return login
  **/
  @Schema(description = "&#128679; Deprecated since v4.13.0  User login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return Objects.equals(this.userName, resetPasswordRequest.userName) &&
        Objects.equals(this.creatorLanguage, resetPasswordRequest.creatorLanguage) &&
        Objects.equals(this.language, resetPasswordRequest.language) &&
        Objects.equals(this.login, resetPasswordRequest.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, creatorLanguage, language, login);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    creatorLanguage: ").append(toIndentedString(creatorLanguage)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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
