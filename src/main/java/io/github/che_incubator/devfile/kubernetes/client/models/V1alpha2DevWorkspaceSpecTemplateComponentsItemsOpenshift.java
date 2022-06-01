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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows importing into the devworkspace the OpenShift resources defined in a given manifest. For example this allows reusing the OpenShift definitions used to deploy some runtime components in production.
 */
@ApiModel(description = "Allows importing into the devworkspace the OpenShift resources defined in a given manifest. For example this allows reusing the OpenShift definitions used to deploy some runtime components in production.")

public class V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift {
  public static final String SERIALIZED_NAME_DEPLOY_BY_DEFAULT = "deployByDefault";
  @SerializedName(SERIALIZED_NAME_DEPLOY_BY_DEFAULT)
  private Boolean deployByDefault;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints> endpoints = null;

  public static final String SERIALIZED_NAME_INLINED = "inlined";
  @SerializedName(SERIALIZED_NAME_INLINED)
  private String inlined;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift deployByDefault(Boolean deployByDefault) {
    
    this.deployByDefault = deployByDefault;
    return this;
  }

   /**
   * Defines if the component should be deployed during startup.  Default value is &#x60;false&#x60;
   * @return deployByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the component should be deployed during startup.  Default value is `false`")

  public Boolean getDeployByDefault() {
    return deployByDefault;
  }


  public void setDeployByDefault(Boolean deployByDefault) {
    this.deployByDefault = deployByDefault;
  }


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift endpoints(List<V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift addEndpointsItem(V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshiftEndpoints> endpoints) {
    this.endpoints = endpoints;
  }


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift inlined(String inlined) {
    
    this.inlined = inlined;
    return this;
  }

   /**
   * Inlined manifest
   * @return inlined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inlined manifest")

  public String getInlined() {
    return inlined;
  }


  public void setInlined(String inlined) {
    this.inlined = inlined;
  }


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Location in a file fetched from a uri.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location in a file fetched from a uri.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift v1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift = (V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift) o;
    return Objects.equals(this.deployByDefault, v1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift.deployByDefault) &&
        Objects.equals(this.endpoints, v1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift.endpoints) &&
        Objects.equals(this.inlined, v1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift.inlined) &&
        Objects.equals(this.uri, v1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployByDefault, endpoints, inlined, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceSpecTemplateComponentsItemsOpenshift {\n");
    sb.append("    deployByDefault: ").append(toIndentedString(deployByDefault)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    inlined: ").append(toIndentedString(inlined)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
