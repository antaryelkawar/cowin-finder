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


package space.universe.cowin;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T22:36:34.068661500+05:30[Asia/Calcutta]")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
