

# SessionResponseSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**centerId** | **BigDecimal** |  | 
**name** | **String** |  | 
**nameL** | **String** | Name in preferred language as specified in Accept-Language header parameter. |  [optional]
**address** | **String** |  |  [optional]
**addressL** | **String** | Address line in preferred language as specified in Accept-Language header parameter. |  [optional]
**stateName** | **String** |  | 
**stateNameL** | **String** | State name in preferred language as specified in Accept-Language header parameter. |  [optional]
**districtName** | **String** |  | 
**districtNameL** | **String** | District name in preferred language as specified in Accept-Language header parameter. |  [optional]
**blockName** | **String** |  | 
**blockNameL** | **String** | Block name in preferred language as specified in Accept-Language header parameter. |  [optional]
**pincode** | **String** |  | 
**lat** | **Float** |  |  [optional]
**_long** | **Float** |  |  [optional]
**from** | **String** |  | 
**to** | **String** |  | 
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee charged for vaccination | 
**fee** | **String** |  | 
**sessionId** | **UUID** |  | 
**date** | **String** |  | 
**availableCapacity** | **BigDecimal** |  | 
**minAgeLimit** | **BigDecimal** |  | 
**vaccine** | **String** |  | 
**slots** | **Set&lt;String&gt;** | Array of slot names | 



## Enum: FeeTypeEnum

Name | Value
---- | -----
FREE | &quot;Free&quot;
PAID | &quot;Paid&quot;


## Implemented Interfaces

* Serializable


