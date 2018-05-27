/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.8.0-LTS  - built at: 2018-05-03 15:44:37<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.8.0-LTS
 * Contact: develop@dracoon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotRestoredNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class NotRestoredNode {
  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Node type
   */
  public enum TypeEnum {
    ROOM("room"),
    
    FOLDER("folder");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("id")
  private Long id = null;

  public NotRestoredNode parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent node ID (room or folder)
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "Parent node ID (room or folder)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public NotRestoredNode parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Parent node path &#x60;/&#x60; if node is a root node (room)
   * @return parentPath
  **/
  @ApiModelProperty(required = true, value = "Parent node path `/` if node is a root node (room)")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public NotRestoredNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Node name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Node name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotRestoredNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @ApiModelProperty(example = "file", required = true, value = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NotRestoredNode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Not restored node ID
   * @return id
  **/
  @ApiModelProperty(value = "Not restored node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotRestoredNode notRestoredNode = (NotRestoredNode) o;
    return Objects.equals(this.parentId, notRestoredNode.parentId) &&
        Objects.equals(this.parentPath, notRestoredNode.parentPath) &&
        Objects.equals(this.name, notRestoredNode.name) &&
        Objects.equals(this.type, notRestoredNode.type) &&
        Objects.equals(this.id, notRestoredNode.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, parentPath, name, type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotRestoredNode {\n");

    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
