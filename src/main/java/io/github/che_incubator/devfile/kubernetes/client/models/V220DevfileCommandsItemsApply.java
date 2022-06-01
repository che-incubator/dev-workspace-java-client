/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.che_incubator.devfile.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileCommandsItemsApplyGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Command that consists in applying a given component definition, typically bound to a devworkspace event.  For example, when an &#x60;apply&#x60; command is bound to a &#x60;preStart&#x60; event, and references a &#x60;container&#x60; component, it will start the container as a K8S initContainer in the devworkspace POD, unless the component has its &#x60;dedicatedPod&#x60; field set to &#x60;true&#x60;.  When no &#x60;apply&#x60; command exist for a given component, it is assumed the component will be applied at devworkspace start by default, unless &#x60;deployByDefault&#x60; for that component is set to false.
 */
@ApiModel(description = "Command that consists in applying a given component definition, typically bound to a devworkspace event.  For example, when an `apply` command is bound to a `preStart` event, and references a `container` component, it will start the container as a K8S initContainer in the devworkspace POD, unless the component has its `dedicatedPod` field set to `true`.  When no `apply` command exist for a given component, it is assumed the component will be applied at devworkspace start by default, unless `deployByDefault` for that component is set to false.")

public class V220DevfileCommandsItemsApply {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private V220DevfileCommandsItemsApplyGroup group;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;


  public V220DevfileCommandsItemsApply component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Describes component that will be applied
   * @return component
  **/
  @ApiModelProperty(required = true, value = "Describes component that will be applied")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  public V220DevfileCommandsItemsApply group(V220DevfileCommandsItemsApplyGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileCommandsItemsApplyGroup getGroup() {
    return group;
  }


  public void setGroup(V220DevfileCommandsItemsApplyGroup group) {
    this.group = group;
  }


  public V220DevfileCommandsItemsApply label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Optional label that provides a label for this command to be used in Editor UI menus for example
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional label that provides a label for this command to be used in Editor UI menus for example")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220DevfileCommandsItemsApply v220DevfileCommandsItemsApply = (V220DevfileCommandsItemsApply) o;
    return Objects.equals(this.component, v220DevfileCommandsItemsApply.component) &&
        Objects.equals(this.group, v220DevfileCommandsItemsApply.group) &&
        Objects.equals(this.label, v220DevfileCommandsItemsApply.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, group, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileCommandsItemsApply {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
