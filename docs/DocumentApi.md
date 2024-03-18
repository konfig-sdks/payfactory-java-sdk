# DocumentApi

All URIs are relative to *https://dev-api.payfactory.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadAgreement**](DocumentApi.md#uploadAgreement) | **POST** /v1/Document/Upload/{type}/{appId} | Upload an Agreement for a new Application |


<a name="uploadAgreement"></a>
# **uploadAgreement**
> uploadAgreement(type, appId, document).documentUploadAgreementRequest(documentUploadAgreementRequest).execute();

Upload an Agreement for a new Application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String type = "type_example"; // 
    String appId = "appId_example"; // 
    File document = new File("/path/to/file");
    try {
      client
              .document
              .uploadAgreement(type, appId, document)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#uploadAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .document
              .uploadAgreement(type, appId, document)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#uploadAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**|  | |
| **appId** | **String**|  | |
| **document** | **File**|  | |
| **documentUploadAgreementRequest** | [**DocumentUploadAgreementRequest**](DocumentUploadAgreementRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

