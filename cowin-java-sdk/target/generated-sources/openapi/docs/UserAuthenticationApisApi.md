# UserAuthenticationApisApi

All URIs are relative to *https://cdn-api.co-vin.in/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmOTP**](UserAuthenticationApisApi.md#confirmOTP) | **POST** /v2/auth/public/confirmOTP | Confirm mobile OTP for authentication
[**generateOTP**](UserAuthenticationApisApi.md#generateOTP) | **POST** /v2/auth/public/generateOTP | Authenticate a beneficiary by Mobile/OTP


<a name="confirmOTP"></a>
# **confirmOTP**
> InlineResponse2001 confirmOTP(inlineObject1)

Confirm mobile OTP for authentication

API to confirm the OTP for authentication.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.UserAuthenticationApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    UserAuthenticationApisApi apiInstance = new UserAuthenticationApisApi(defaultClient);
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2001 result = apiInstance.confirmOTP(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthenticationApisApi#confirmOTP");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

<a name="generateOTP"></a>
# **generateOTP**
> InlineResponse200 generateOTP(inlineObject)

Authenticate a beneficiary by Mobile/OTP

Initiate beneficiary authentication using mobile and OTP

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.models.*;
import space.universe.cowin.api.UserAuthenticationApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");

    UserAuthenticationApisApi apiInstance = new UserAuthenticationApisApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse200 result = apiInstance.generateOTP(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthenticationApisApi#generateOTP");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated access! |  -  |
**500** | Internal Server Error |  -  |

