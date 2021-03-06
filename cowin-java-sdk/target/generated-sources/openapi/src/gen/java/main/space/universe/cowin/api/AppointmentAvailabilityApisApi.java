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


package space.universe.cowin.api;

import space.universe.cowin.ApiCallback;
import space.universe.cowin.ApiClient;
import space.universe.cowin.ApiException;
import space.universe.cowin.ApiResponse;
import space.universe.cowin.Configuration;
import space.universe.cowin.Pair;
import space.universe.cowin.ProgressRequestBody;
import space.universe.cowin.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import javax.validation.constraints.*;

import space.universe.cowin.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentAvailabilityApisApi {
    private ApiClient localVarApiClient;

    public AppointmentAvailabilityApisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppointmentAvailabilityApisApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for calendarByDistrict
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calendarByDistrictCall(String districtId, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/appointment/sessions/public/calendarByDistrict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (districtId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("district_id", districtId));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call calendarByDistrictValidateBeforeCall(String districtId, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'districtId' is set
        if (districtId == null) {
            throw new ApiException("Missing the required parameter 'districtId' when calling calendarByDistrict(Async)");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling calendarByDistrict(Async)");
        }
        

        okhttp3.Call localVarCall = calendarByDistrictCall(districtId, date, acceptLanguage, _callback);
        return localVarCall;

    }

    /**
     * Get vaccination sessions by district for 7 days
     * API to get planned vaccination sessions for 7 days from a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Object calendarByDistrict(String districtId, String date, String acceptLanguage) throws ApiException {
        ApiResponse<Object> localVarResp = calendarByDistrictWithHttpInfo(districtId, date, acceptLanguage);
        return localVarResp.getData();
    }

    /**
     * Get vaccination sessions by district for 7 days
     * API to get planned vaccination sessions for 7 days from a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> calendarByDistrictWithHttpInfo( @NotNull @Size(min=3) String districtId,  @NotNull String date,  String acceptLanguage) throws ApiException {
        okhttp3.Call localVarCall = calendarByDistrictValidateBeforeCall(districtId, date, acceptLanguage, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get vaccination sessions by district for 7 days (asynchronously)
     * API to get planned vaccination sessions for 7 days from a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calendarByDistrictAsync(String districtId, String date, String acceptLanguage, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = calendarByDistrictValidateBeforeCall(districtId, date, acceptLanguage, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for calendarByPin
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calendarByPinCall(String pincode, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/appointment/sessions/public/calendarByPin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pincode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pincode", pincode));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call calendarByPinValidateBeforeCall(String pincode, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pincode' is set
        if (pincode == null) {
            throw new ApiException("Missing the required parameter 'pincode' when calling calendarByPin(Async)");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling calendarByPin(Async)");
        }
        

        okhttp3.Call localVarCall = calendarByPinCall(pincode, date, acceptLanguage, _callback);
        return localVarCall;

    }

    /**
     * Get vaccination sessions by PIN for 7 days
     * API to get planned vaccination sessions for 7 days from a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Object calendarByPin(String pincode, String date, String acceptLanguage) throws ApiException {
        ApiResponse<Object> localVarResp = calendarByPinWithHttpInfo(pincode, date, acceptLanguage);
        return localVarResp.getData();
    }

    /**
     * Get vaccination sessions by PIN for 7 days
     * API to get planned vaccination sessions for 7 days from a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> calendarByPinWithHttpInfo( @NotNull @Size(min=3) String pincode,  @NotNull String date,  String acceptLanguage) throws ApiException {
        okhttp3.Call localVarCall = calendarByPinValidateBeforeCall(pincode, date, acceptLanguage, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get vaccination sessions by PIN for 7 days (asynchronously)
     * API to get planned vaccination sessions for 7 days from a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calendarByPinAsync(String pincode, String date, String acceptLanguage, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = calendarByPinValidateBeforeCall(pincode, date, acceptLanguage, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findByDistrict
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByDistrictCall(String districtId, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/appointment/sessions/public/findByDistrict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (districtId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("district_id", districtId));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findByDistrictValidateBeforeCall(String districtId, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'districtId' is set
        if (districtId == null) {
            throw new ApiException("Missing the required parameter 'districtId' when calling findByDistrict(Async)");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling findByDistrict(Async)");
        }
        

        okhttp3.Call localVarCall = findByDistrictCall(districtId, date, acceptLanguage, _callback);
        return localVarCall;

    }

    /**
     * Get vaccination sessions by district
     * API to get planned vaccination sessions on a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Object findByDistrict(String districtId, String date, String acceptLanguage) throws ApiException {
        ApiResponse<Object> localVarResp = findByDistrictWithHttpInfo(districtId, date, acceptLanguage);
        return localVarResp.getData();
    }

    /**
     * Get vaccination sessions by district
     * API to get planned vaccination sessions on a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> findByDistrictWithHttpInfo( @NotNull @Size(min=3) String districtId,  @NotNull String date,  String acceptLanguage) throws ApiException {
        okhttp3.Call localVarCall = findByDistrictValidateBeforeCall(districtId, date, acceptLanguage, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get vaccination sessions by district (asynchronously)
     * API to get planned vaccination sessions on a specific date in a given district.
     * @param districtId  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByDistrictAsync(String districtId, String date, String acceptLanguage, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = findByDistrictValidateBeforeCall(districtId, date, acceptLanguage, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findByPin
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByPinCall(String pincode, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/appointment/sessions/public/findByPin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pincode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pincode", pincode));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findByPinValidateBeforeCall(String pincode, String date, String acceptLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pincode' is set
        if (pincode == null) {
            throw new ApiException("Missing the required parameter 'pincode' when calling findByPin(Async)");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling findByPin(Async)");
        }
        

        okhttp3.Call localVarCall = findByPinCall(pincode, date, acceptLanguage, _callback);
        return localVarCall;

    }

    /**
     * Get vaccination sessions by PIN
     * API to get planned vaccination sessions on a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Object findByPin(String pincode, String date, String acceptLanguage) throws ApiException {
        ApiResponse<Object> localVarResp = findByPinWithHttpInfo(pincode, date, acceptLanguage);
        return localVarResp.getData();
    }

    /**
     * Get vaccination sessions by PIN
     * API to get planned vaccination sessions on a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> findByPinWithHttpInfo( @NotNull @Size(min=3) String pincode,  @NotNull String date,  String acceptLanguage) throws ApiException {
        okhttp3.Call localVarCall = findByPinValidateBeforeCall(pincode, date, acceptLanguage, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get vaccination sessions by PIN (asynchronously)
     * API to get planned vaccination sessions on a specific date in a given pin.
     * @param pincode  (required)
     * @param date  (required)
     * @param acceptLanguage The locate code of the preferred language such as en_US. The text data will be returned in the preferred language along with default English text. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated Access </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByPinAsync(String pincode, String date, String acceptLanguage, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = findByPinValidateBeforeCall(pincode, date, acceptLanguage, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
