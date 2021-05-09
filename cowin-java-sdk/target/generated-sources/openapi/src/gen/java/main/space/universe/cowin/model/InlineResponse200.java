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
import java.util.UUID;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-09T19:44:24.133367300+05:30[Asia/Calcutta]")
public class InlineResponse200 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TXN_ID = "txnId";
  @SerializedName(SERIALIZED_NAME_TXN_ID)
  private UUID txnId;


  public InlineResponse200 txnId(UUID txnId) {
    
    this.txnId = txnId;
    return this;
  }

   /**
   * Get txnId
   * @return txnId
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "")

  public UUID getTxnId() {
    return txnId;
  }


  public void setTxnId(UUID txnId) {
    this.txnId = txnId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.txnId, inlineResponse200.txnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
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

