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
 * User Authentication Data
 */
@Schema(description = "User Authentication Data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class UserAuthData {
  @JsonProperty("method")
  private String method = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("mustChangePassword")
  private Boolean mustChangePassword = null;

  @JsonProperty("adConfigId")
  private Integer adConfigId = null;

  @JsonProperty("oidConfigId")
  private Integer oidConfigId = null;

  public UserAuthData method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Authentication method    Authentication methods:  * &#x60;basic&#x60;  * &#x60;active_directory&#x60;  * &#x60;radius&#x60;  * &#x60;openid&#x60;
   * @return method
  **/
  @Schema(required = true, description = "Authentication method    Authentication methods:  * `basic`  * `active_directory`  * `radius`  * `openid`")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public UserAuthData login(String login) {
    this.login = login;
    return this;
  }

   /**
   * User login name
   * @return login
  **/
  @Schema(description = "User login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserAuthData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password (only relevant for &#x60;basic&#x60; authentication type)  *NOT* your Active Directory, OpenID or RADIUS password!
   * @return password
  **/
  @Schema(description = "Password (only relevant for `basic` authentication type)  *NOT* your Active Directory, OpenID or RADIUS password!")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserAuthData mustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
    return this;
  }

   /**
   * Determines whether user has to change his / her password  * default: &#x60;true&#x60; for &#x60;basic&#x60; auth type  * default: &#x60;false&#x60; for &#x60;active_directory&#x60;, &#x60;openid&#x60; and &#x60;radius&#x60; auth types
   * @return mustChangePassword
  **/
  @Schema(description = "Determines whether user has to change his / her password  * default: `true` for `basic` auth type  * default: `false` for `active_directory`, `openid` and `radius` auth types")
  public Boolean isMustChangePassword() {
    return mustChangePassword;
  }

  public void setMustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
  }

  public UserAuthData adConfigId(Integer adConfigId) {
    this.adConfigId = adConfigId;
    return this;
  }

   /**
   * ID of the user&#x27;s Active Directory.
   * @return adConfigId
  **/
  @Schema(description = "ID of the user's Active Directory.")
  public Integer getAdConfigId() {
    return adConfigId;
  }

  public void setAdConfigId(Integer adConfigId) {
    this.adConfigId = adConfigId;
  }

  public UserAuthData oidConfigId(Integer oidConfigId) {
    this.oidConfigId = oidConfigId;
    return this;
  }

   /**
   * ID of the user&#x27;s OIDC provider.
   * @return oidConfigId
  **/
  @Schema(description = "ID of the user's OIDC provider.")
  public Integer getOidConfigId() {
    return oidConfigId;
  }

  public void setOidConfigId(Integer oidConfigId) {
    this.oidConfigId = oidConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthData userAuthData = (UserAuthData) o;
    return Objects.equals(this.method, userAuthData.method) &&
        Objects.equals(this.login, userAuthData.login) &&
        Objects.equals(this.password, userAuthData.password) &&
        Objects.equals(this.mustChangePassword, userAuthData.mustChangePassword) &&
        Objects.equals(this.adConfigId, userAuthData.adConfigId) &&
        Objects.equals(this.oidConfigId, userAuthData.oidConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, login, password, mustChangePassword, adConfigId, oidConfigId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthData {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mustChangePassword: ").append(toIndentedString(mustChangePassword)).append("\n");
    sb.append("    adConfigId: ").append(toIndentedString(adConfigId)).append("\n");
    sb.append("    oidConfigId: ").append(toIndentedString(oidConfigId)).append("\n");
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
