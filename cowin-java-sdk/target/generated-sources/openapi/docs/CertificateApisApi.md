# CertificateApisApi

All URIs are relative to *https://cdn-api.co-vin.in/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download**](CertificateApisApi.md#download) | **GET** /v2/registration/certificate/public/download | Download vaccination certificate in PDF format by beneficiary reference id


<a name="download"></a>
# **download**
> File download(beneficiaryReferenceId)

Download vaccination certificate in PDF format by beneficiary reference id

API to download vaccination certificate in PDF format by beneficiary reference id. This API requires a &lt;i&gt;Bearer&lt;/i&gt; token acquired with user mobile OTP validation as defined in User Authentication APIs.

### Example
```java
// Import classes:
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.Configuration;
import space.universe.cowin.auth.*;
import space.universe.cowin.models.*;
import space.universe.cowin.api.CertificateApisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdn-api.co-vin.in/api");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CertificateApisApi apiInstance = new CertificateApisApi(defaultClient);
    String beneficiaryReferenceId = "1234567890123"; // String | 
    try {
      File result = apiInstance.download(beneficiaryReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApisApi#download");
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
 **beneficiaryReferenceId** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Operation |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated Access |  -  |
**500** | Internal Server Error |  -  |

