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
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * VaccineFeeSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-09T19:44:24.133367300+05:30[Asia/Calcutta]")
public class VaccineFeeSchema implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VACCINE = "vaccine";
  @SerializedName(SERIALIZED_NAME_VACCINE)
  private String vaccine;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;


  public VaccineFeeSchema vaccine(String vaccine) {
    
    this.vaccine = vaccine;
    return this;
  }

   /**
   * Get vaccine
   * @return vaccine
  **/
  @NotNull
  @ApiModelProperty(example = "COVISHIELD", required = true, value = "")

  public String getVaccine() {
    return vaccine;
  }


  public void setVaccine(String vaccine) {
    this.vaccine = vaccine;
  }


  public VaccineFeeSchema fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @NotNull
  @ApiModelProperty(example = "250", required = true, value = "")

  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaccineFeeSchema vaccineFeeSchema = (VaccineFeeSchema) o;
    return Objects.equals(this.vaccine, vaccineFeeSchema.vaccine) &&
        Objects.equals(this.fee, vaccineFeeSchema.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaccine, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaccineFeeSchema {\n");
    sb.append("    vaccine: ").append(toIndentedString(vaccine)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

