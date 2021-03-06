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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import space.universe.cowin.model.CenterResponseSchema;
import space.universe.cowin.model.SessionResponseSchemaAllOf;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SessionResponseSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T22:36:34.068661500+05:30[Asia/Calcutta]")
public class SessionResponseSchema implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CENTER_ID = "center_id";
  @SerializedName(SERIALIZED_NAME_CENTER_ID)
  private BigDecimal centerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_L = "name_l";
  @SerializedName(SERIALIZED_NAME_NAME_L)
  private String nameL;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_L = "address_l";
  @SerializedName(SERIALIZED_NAME_ADDRESS_L)
  private String addressL;

  public static final String SERIALIZED_NAME_STATE_NAME = "state_name";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private String stateName;

  public static final String SERIALIZED_NAME_STATE_NAME_L = "state_name_l";
  @SerializedName(SERIALIZED_NAME_STATE_NAME_L)
  private String stateNameL;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "district_name";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_DISTRICT_NAME_L = "district_name_l";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME_L)
  private String districtNameL;

  public static final String SERIALIZED_NAME_BLOCK_NAME = "block_name";
  @SerializedName(SERIALIZED_NAME_BLOCK_NAME)
  private String blockName;

  public static final String SERIALIZED_NAME_BLOCK_NAME_L = "block_name_l";
  @SerializedName(SERIALIZED_NAME_BLOCK_NAME_L)
  private String blockNameL;

  public static final String SERIALIZED_NAME_PINCODE = "pincode";
  @SerializedName(SERIALIZED_NAME_PINCODE)
  private String pincode;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Float lat;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Float _long;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  /**
   * Fee charged for vaccination
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    FREE("Free"),
    
    PAID("Paid");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeTypeEnum feeType;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private UUID sessionId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_AVAILABLE_CAPACITY = "available_capacity";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CAPACITY)
  private BigDecimal availableCapacity;

  public static final String SERIALIZED_NAME_MIN_AGE_LIMIT = "min_age_limit";
  @SerializedName(SERIALIZED_NAME_MIN_AGE_LIMIT)
  private BigDecimal minAgeLimit;

  public static final String SERIALIZED_NAME_VACCINE = "vaccine";
  @SerializedName(SERIALIZED_NAME_VACCINE)
  private String vaccine;

  public static final String SERIALIZED_NAME_SLOTS = "slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private Set<String> slots = new LinkedHashSet<>();


  public SessionResponseSchema centerId(BigDecimal centerId) {
    
    this.centerId = centerId;
    return this;
  }

   /**
   * Get centerId
   * @return centerId
  **/
  @NotNull
  @Valid
  @ApiModelProperty(example = "1234", required = true, value = "")

  public BigDecimal getCenterId() {
    return centerId;
  }


  public void setCenterId(BigDecimal centerId) {
    this.centerId = centerId;
  }


  public SessionResponseSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(example = "District General Hostpital", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SessionResponseSchema nameL(String nameL) {
    
    this.nameL = nameL;
    return this;
  }

   /**
   * Name in preferred language as specified in Accept-Language header parameter.
   * @return nameL
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "", value = "Name in preferred language as specified in Accept-Language header parameter.")

  public String getNameL() {
    return nameL;
  }


  public void setNameL(String nameL) {
    this.nameL = nameL;
  }


  public SessionResponseSchema address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "45 M G Road", value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public SessionResponseSchema addressL(String addressL) {
    
    this.addressL = addressL;
    return this;
  }

   /**
   * Address line in preferred language as specified in Accept-Language header parameter.
   * @return addressL
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "", value = "Address line in preferred language as specified in Accept-Language header parameter.")

  public String getAddressL() {
    return addressL;
  }


  public void setAddressL(String addressL) {
    this.addressL = addressL;
  }


  public SessionResponseSchema stateName(String stateName) {
    
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @NotNull
  @ApiModelProperty(example = "Maharashtra", required = true, value = "")

  public String getStateName() {
    return stateName;
  }


  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  public SessionResponseSchema stateNameL(String stateNameL) {
    
    this.stateNameL = stateNameL;
    return this;
  }

   /**
   * State name in preferred language as specified in Accept-Language header parameter.
   * @return stateNameL
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "", value = "State name in preferred language as specified in Accept-Language header parameter.")

  public String getStateNameL() {
    return stateNameL;
  }


  public void setStateNameL(String stateNameL) {
    this.stateNameL = stateNameL;
  }


  public SessionResponseSchema districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @NotNull
  @ApiModelProperty(example = "Satara", required = true, value = "")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public SessionResponseSchema districtNameL(String districtNameL) {
    
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


  public SessionResponseSchema blockName(String blockName) {
    
    this.blockName = blockName;
    return this;
  }

   /**
   * Get blockName
   * @return blockName
  **/
  @NotNull
  @ApiModelProperty(example = "Jaoli", required = true, value = "")

  public String getBlockName() {
    return blockName;
  }


  public void setBlockName(String blockName) {
    this.blockName = blockName;
  }


  public SessionResponseSchema blockNameL(String blockNameL) {
    
    this.blockNameL = blockNameL;
    return this;
  }

   /**
   * Block name in preferred language as specified in Accept-Language header parameter.
   * @return blockNameL
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(example = "", value = "Block name in preferred language as specified in Accept-Language header parameter.")

  public String getBlockNameL() {
    return blockNameL;
  }


  public void setBlockNameL(String blockNameL) {
    this.blockNameL = blockNameL;
  }


  public SessionResponseSchema pincode(String pincode) {
    
    this.pincode = pincode;
    return this;
  }

   /**
   * Get pincode
   * @return pincode
  **/
  @NotNull
  @ApiModelProperty(example = "413608", required = true, value = "")

  public String getPincode() {
    return pincode;
  }


  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  public SessionResponseSchema lat(Float lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * minimum: 8.06
   * maximum: 37.1
   * @return lat
  **/
  @javax.annotation.Nullable
 @DecimalMin("8.06") @DecimalMax("37.1")  @ApiModelProperty(example = "28.7", value = "")

  public Float getLat() {
    return lat;
  }


  public void setLat(Float lat) {
    this.lat = lat;
  }


  public SessionResponseSchema _long(Float _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * minimum: 68.11
   * maximum: 97.41
   * @return _long
  **/
  @javax.annotation.Nullable
 @DecimalMin("68.11") @DecimalMax("97.41")  @ApiModelProperty(example = "77.1", value = "")

  public Float getLong() {
    return _long;
  }


  public void setLong(Float _long) {
    this._long = _long;
  }


  public SessionResponseSchema from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @NotNull
  @ApiModelProperty(example = "09:00:00", required = true, value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SessionResponseSchema to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @NotNull
  @ApiModelProperty(example = "18:00:00", required = true, value = "")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public SessionResponseSchema feeType(FeeTypeEnum feeType) {
    
    this.feeType = feeType;
    return this;
  }

   /**
   * Fee charged for vaccination
   * @return feeType
  **/
  @NotNull
  @ApiModelProperty(example = "Paid", required = true, value = "Fee charged for vaccination")

  public FeeTypeEnum getFeeType() {
    return feeType;
  }


  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }


  public SessionResponseSchema fee(String fee) {
    
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


  public SessionResponseSchema sessionId(UUID sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @NotNull
  @Valid
 @Size(min=1)  @ApiModelProperty(required = true, value = "")

  public UUID getSessionId() {
    return sessionId;
  }


  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public SessionResponseSchema date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(example = "31-05-2021", required = true, value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public SessionResponseSchema availableCapacity(BigDecimal availableCapacity) {
    
    this.availableCapacity = availableCapacity;
    return this;
  }

   /**
   * Get availableCapacity
   * @return availableCapacity
  **/
  @NotNull
  @Valid
  @ApiModelProperty(example = "50", required = true, value = "")

  public BigDecimal getAvailableCapacity() {
    return availableCapacity;
  }


  public void setAvailableCapacity(BigDecimal availableCapacity) {
    this.availableCapacity = availableCapacity;
  }


  public SessionResponseSchema minAgeLimit(BigDecimal minAgeLimit) {
    
    this.minAgeLimit = minAgeLimit;
    return this;
  }

   /**
   * Get minAgeLimit
   * @return minAgeLimit
  **/
  @NotNull
  @Valid
  @ApiModelProperty(example = "18", required = true, value = "")

  public BigDecimal getMinAgeLimit() {
    return minAgeLimit;
  }


  public void setMinAgeLimit(BigDecimal minAgeLimit) {
    this.minAgeLimit = minAgeLimit;
  }


  public SessionResponseSchema vaccine(String vaccine) {
    
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


  public SessionResponseSchema slots(Set<String> slots) {
    
    this.slots = slots;
    return this;
  }

  public SessionResponseSchema addSlotsItem(String slotsItem) {
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Array of slot names
   * @return slots
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(example = "[\"FORENOON\",\"AFTERNOON\"]", required = true, value = "Array of slot names")

  public Set<String> getSlots() {
    return slots;
  }


  public void setSlots(Set<String> slots) {
    this.slots = slots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponseSchema sessionResponseSchema = (SessionResponseSchema) o;
    return Objects.equals(this.centerId, sessionResponseSchema.centerId) &&
        Objects.equals(this.name, sessionResponseSchema.name) &&
        Objects.equals(this.nameL, sessionResponseSchema.nameL) &&
        Objects.equals(this.address, sessionResponseSchema.address) &&
        Objects.equals(this.addressL, sessionResponseSchema.addressL) &&
        Objects.equals(this.stateName, sessionResponseSchema.stateName) &&
        Objects.equals(this.stateNameL, sessionResponseSchema.stateNameL) &&
        Objects.equals(this.districtName, sessionResponseSchema.districtName) &&
        Objects.equals(this.districtNameL, sessionResponseSchema.districtNameL) &&
        Objects.equals(this.blockName, sessionResponseSchema.blockName) &&
        Objects.equals(this.blockNameL, sessionResponseSchema.blockNameL) &&
        Objects.equals(this.pincode, sessionResponseSchema.pincode) &&
        Objects.equals(this.lat, sessionResponseSchema.lat) &&
        Objects.equals(this._long, sessionResponseSchema._long) &&
        Objects.equals(this.from, sessionResponseSchema.from) &&
        Objects.equals(this.to, sessionResponseSchema.to) &&
        Objects.equals(this.feeType, sessionResponseSchema.feeType) &&
        Objects.equals(this.fee, sessionResponseSchema.fee) &&
        Objects.equals(this.sessionId, sessionResponseSchema.sessionId) &&
        Objects.equals(this.date, sessionResponseSchema.date) &&
        Objects.equals(this.availableCapacity, sessionResponseSchema.availableCapacity) &&
        Objects.equals(this.minAgeLimit, sessionResponseSchema.minAgeLimit) &&
        Objects.equals(this.vaccine, sessionResponseSchema.vaccine) &&
        Objects.equals(this.slots, sessionResponseSchema.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centerId, name, nameL, address, addressL, stateName, stateNameL, districtName, districtNameL, blockName, blockNameL, pincode, lat, _long, from, to, feeType, fee, sessionId, date, availableCapacity, minAgeLimit, vaccine, slots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponseSchema {\n");
    sb.append("    centerId: ").append(toIndentedString(centerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameL: ").append(toIndentedString(nameL)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressL: ").append(toIndentedString(addressL)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    stateNameL: ").append(toIndentedString(stateNameL)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtNameL: ").append(toIndentedString(districtNameL)).append("\n");
    sb.append("    blockName: ").append(toIndentedString(blockName)).append("\n");
    sb.append("    blockNameL: ").append(toIndentedString(blockNameL)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    minAgeLimit: ").append(toIndentedString(minAgeLimit)).append("\n");
    sb.append("    vaccine: ").append(toIndentedString(vaccine)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

