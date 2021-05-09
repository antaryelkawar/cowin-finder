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

import space.universe.cowin.ApiException;
import java.io.File;
import space.universe.cowin.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificateApisApi
 */
@Ignore
public class CertificateApisApiTest {

    private final CertificateApisApi api = new CertificateApisApi();

    
    /**
     * Download vaccination certificate in PDF format by beneficiary reference id
     *
     * API to download vaccination certificate in PDF format by beneficiary reference id. This API requires a &lt;i&gt;Bearer&lt;/i&gt; token acquired with user mobile OTP validation as defined in User Authentication APIs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadTest() throws ApiException {
        String beneficiaryReferenceId = null;
        File response = api.download(beneficiaryReferenceId);

        // TODO: test validations
    }
    
}