# AppointmentAvailabilityApisApi

All URIs are relative to *https://cdn-api.co-vin.in/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calendarByDistrict**](AppointmentAvailabilityApisApi.md#calendarByDistrict) | **GET** /v2/appointment/sessions/public/calendarByDistrict | Get vaccination sessions by district for 7 days
[**calendarByPin**](AppointmentAvailabilityApisApi.md#calendarByPin) | **GET** /v2/appointment/sessions/public/calendarByPin | Get vaccination sessions by PIN for 7 days
[**findByDistrict**](AppointmentAvailabilityApisApi.md#findByDistrict) | **GET** /v2/appointment/sessions/public/findByDistrict | Get vaccination sessions by district
[**findByPin**](AppointmentAvailabilityApisApi.md#findByPin) | **GET** /v2/appointment/sessions/public/findByPin | Get vaccination sessions by PIN


<a name="calendarByDistrict"></a>
# **calendarByDistrict**
> Object calendarByDistrict(districtId, date, acceptLanguage)

Get vaccination sessions by district for 7 days

API to get planned vaccination sessions for 7 days from a specific date in a given district.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    AppointmentAvailabilityApisApi apiInstance = new AppointmentAvailabilityApisApi(defaultClient);
    String districtId = "512"; // String | 
    String date = "31-03-2021"; // String | 
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      Object result = apiInstance.calendarByDistrict(districtId, date, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentAvailabilityApisApi#calendarByDistrict");
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
 **districtId** | **String**|  |
 **date** | **String**|  |
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

<a name="calendarByPin"></a>
# **calendarByPin**
> Object calendarByPin(pincode, date, acceptLanguage)

Get vaccination sessions by PIN for 7 days

API to get planned vaccination sessions for 7 days from a specific date in a given pin.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    AppointmentAvailabilityApisApi apiInstance = new AppointmentAvailabilityApisApi(defaultClient);
    String pincode = "110001"; // String | 
    String date = "31-03-2021"; // String | 
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      Object result = apiInstance.calendarByPin(pincode, date, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentAvailabilityApisApi#calendarByPin");
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
 **pincode** | **String**|  |
 **date** | **String**|  |
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

<a name="findByDistrict"></a>
# **findByDistrict**
> Object findByDistrict(districtId, date, acceptLanguage)

Get vaccination sessions by district

API to get planned vaccination sessions on a specific date in a given district.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    AppointmentAvailabilityApisApi apiInstance = new AppointmentAvailabilityApisApi(defaultClient);
    String districtId = "512"; // String | 
    String date = "31-03-2021"; // String | 
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      Object result = apiInstance.findByDistrict(districtId, date, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentAvailabilityApisApi#findByDistrict");
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
 **districtId** | **String**|  |
 **date** | **String**|  |
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

<a name="findByPin"></a>
# **findByPin**
> Object findByPin(pincode, date, acceptLanguage)

Get vaccination sessions by PIN

API to get planned vaccination sessions on a specific date in a given pin.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    AppointmentAvailabilityApisApi apiInstance = new AppointmentAvailabilityApisApi(defaultClient);
    String pincode = "110001"; // String | 
    String date = "31-03-2021"; // String | 
    String acceptLanguage = "hi_IN"; // String | The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text.
    try {
      Object result = apiInstance.findByPin(pincode, date, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentAvailabilityApisApi#findByPin");
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
 **pincode** | **String**|  |
 **date** | **String**|  |
 **acceptLanguage** | **String**| The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

