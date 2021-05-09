# MetadataApisApi

All URIs are relative to *https://cdn-api.co-vin.in/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**districts**](MetadataApisApi.md#districts) | **GET** /v2/admin/location/districts/{state_id} | Get list of districts
[**states**](MetadataApisApi.md#states) | **GET** /v2/admin/location/states | Get states


<a name="districts"></a>
# **districts**
> InlineResponse2003 districts(stateId, acceptLanguage)

Get list of districts

API to get all the districts.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.MetadataApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    MetadataApisApi apiInstance = new MetadataApisApi(defaultClient);
    String stateId = "16"; // String | 
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      InlineResponse2003 result = apiInstance.districts(stateId, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApisApi#districts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stateId** | **String**|  |
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, examples

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**401** | Unauthenticated access! |  -  |
**500** | Internal Server Error |  -  |

<a name="states"></a>
# **states**
> InlineResponse2002 states(acceptLanguage)

Get states

API to get all the states in India.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.MetadataApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    MetadataApisApi apiInstance = new MetadataApisApi(defaultClient);
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      InlineResponse2002 result = apiInstance.states(acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApisApi#states");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, examples

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**401** | Unauthenticated access! |  -  |
**500** | Internal Server Error |  -  |

