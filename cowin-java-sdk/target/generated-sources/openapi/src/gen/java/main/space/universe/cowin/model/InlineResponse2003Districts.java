/*
 * Co-WIN Public APIs
 * Co-WIN Public APIs to find appointment availabilty and to download vaccination certificates. These APIs are available for use by all third party applications. The appointment availability data is cached and may be upto 30 minutes old. Further, these APIs are subject to a rate limit of 100 API calls per 5 minutes per IP. Please consider these points while using the APIs in your application. For further questions, please visit our <a href=\"https://github.com/cowinapi/developer.cowin/issues\" target=\"_blank\">Open Tracker on GitHub</a>.<br>[<i>Updated on 5 May 2021</i>]
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package space.universe.cowin.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * InlineResponse2003Districts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-09T19:44:24.133367300+05:30[Asia/Calcutta]")
public class InlineResponse2003Districts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_STATE_ID = "state_id";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private BigDecimal stateId;

  public static final String SERIALIZED_NAME_DISTRICT_ID = "district_id";
  @SerializedName(SERIALIZED_NAME_DISTRICT_ID)
  private BigDecimal districtId;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "district_name";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_DISTRICT_NAME_L = "district_name_l";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME_L)
  private String districtNameL;


  public InlineResponse2003Districts stateId(BigDecimal stateId) {
    
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(example = "16", value = "")

  public BigDecimal getStateId() {
    return stateId;
  }


  public void setStateId(BigDecimal stateId) {
    this.stateId = stateId;
  }


  public InlineResponse2003Districts districtId(BigDecimal districtId) {
    
    this.districtId = districtId;
    return this;
  }

   /**
   * Get districtId
   * @return districtId
  **/
  @NotNull
  @Valid
  @ApiModelProperty(example = "391", required = true, value = "")

  public BigDecimal getDistrictId() {
    return districtId;
  }


  public void setDistrictId(BigDecimal districtId) {
    this.districtId = districtId;
  }


  public InlineResponse2003Districts districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(example = "Ahmednagar", required = true, value = "")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public InlineResponse2003Districts districtNameL(String districtNameL) {
    
    this.districtNameL = districtNameL;
    return this;
  }

   /**
   * District name in preferred language as specified in Accept-Language header parameter.
   * @return districtNameL
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "", value = "District name in preferred language as specified in Accept-Language header parameter.")

  public String getDistrictNameL() {
    return districtNameL;
  }


  public void setDistrictNameL(String districtNameL) {
    this.districtNameL = districtNameL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Districts inlineResponse2003Districts = (InlineResponse2003Districts) o;
    return Objects.equals(this.stateId, inlineResponse2003Districts.stateId) &&
        Objects.equals(this.districtId, inlineResponse2003Districts.districtId) &&
        Objects.equals(this.districtName, inlineResponse2003Districts.districtName) &&
        Objects.equals(this.districtNameL, inlineResponse2003Districts.districtNameL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateId, districtId, districtName, districtNameL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Districts {\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtNameL: ").append(toIndentedString(districtNameL)).append("\n");
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

