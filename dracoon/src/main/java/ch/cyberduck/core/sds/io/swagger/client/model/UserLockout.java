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
 * User lockout information
 */
@Schema(description = "User lockout information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T10:17:39.204928+02:00[Europe/Zurich]")
public class UserLockout {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("maxNumberOfLoginFailures")
  private Integer maxNumberOfLoginFailures = null;

  @JsonProperty("lockoutPeriod")
  private Integer lockoutPeriod = null;

  public UserLockout enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines whether user lockout is enabled
   * @return enabled
  **/
  @Schema(required = true, description = "Determines whether user lockout is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserLockout maxNumberOfLoginFailures(Integer maxNumberOfLoginFailures) {
    this.maxNumberOfLoginFailures = maxNumberOfLoginFailures;
    return this;
  }

   /**
   * Maximum allowed number of failed login attempts
   * @return maxNumberOfLoginFailures
  **/
  @Schema(description = "Maximum allowed number of failed login attempts")
  public Integer getMaxNumberOfLoginFailures() {
    return maxNumberOfLoginFailures;
  }

  public void setMaxNumberOfLoginFailures(Integer maxNumberOfLoginFailures) {
    this.maxNumberOfLoginFailures = maxNumberOfLoginFailures;
  }

  public UserLockout lockoutPeriod(Integer lockoutPeriod) {
    this.lockoutPeriod = lockoutPeriod;
    return this;
  }

   /**
   * Amount of minutes a user has to wait to make another login attempt after &#x60;maxNumberOfLoginFailures&#x60; has been exceeded
   * @return lockoutPeriod
  **/
  @Schema(description = "Amount of minutes a user has to wait to make another login attempt after `maxNumberOfLoginFailures` has been exceeded")
  public Integer getLockoutPeriod() {
    return lockoutPeriod;
  }

  public void setLockoutPeriod(Integer lockoutPeriod) {
    this.lockoutPeriod = lockoutPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLockout userLockout = (UserLockout) o;
    return Objects.equals(this.enabled, userLockout.enabled) &&
        Objects.equals(this.maxNumberOfLoginFailures, userLockout.maxNumberOfLoginFailures) &&
        Objects.equals(this.lockoutPeriod, userLockout.lockoutPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, maxNumberOfLoginFailures, lockoutPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLockout {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    maxNumberOfLoginFailures: ").append(toIndentedString(maxNumberOfLoginFailures)).append("\n");
    sb.append("    lockoutPeriod: ").append(toIndentedString(lockoutPeriod)).append("\n");
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
