# ApplicationFormApi

All URIs are relative to *https://dev-api.payfactory.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSession**](ApplicationFormApi.md#createSession) | **POST** /v1/ApplicationForm/session | Creates a new Session |
| [**getSessionInfo**](ApplicationFormApi.md#getSessionInfo) | **GET** /v1/ApplicationForm/session/{sessionId} | Gets information about a Session |
| [**updateSessionActivity**](ApplicationFormApi.md#updateSessionActivity) | **PUT** /v1/ApplicationForm/session/{sessionId} | Touch a Session, keeping it active |


<a name="createSession"></a>
# **createSession**
> SessionResponse createSession().createSessionRequest(createSessionRequest).execute();

Creates a new Session

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationFormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    CreateSessionRequestSignerModel signer = new CreateSessionRequestSignerModel();
    String companyName = "companyName_example"; // Name of the merchant account
    URI redirectUrl = new URI(); // Url to redirect the merchant user to when clicking the back button
    URI completeUrl = new URI(); // Url to redirect the merchant user to upon completing the application
    URI refreshUrl = new URI(); // Url to redirect to the merchant user to when their session is expired
    String externalId = "externalId_example"; // Unique identifier for the merchant in your system
    String pricingPlanId = "pricingPlanId_example"; // Id of the Pricing Plan. Only used if enabled for the partner
    SessionBusinessDetailsModel businessDetails = new SessionBusinessDetailsModel();
    try {
      SessionResponse result = client
              .applicationForm
              .createSession(signer, companyName, redirectUrl, completeUrl, refreshUrl, externalId)
              .pricingPlanId(pricingPlanId)
              .businessDetails(businessDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getSessionId());
      System.out.println(result.getAppId());
      System.out.println(result.getExternalId());
      System.out.println(result.getValidUntil());
      System.out.println(result.getComplete());
      System.out.println(result.getUrl());
      System.out.println(result.getExpired());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionResponse> response = client
              .applicationForm
              .createSession(signer, companyName, redirectUrl, completeUrl, refreshUrl, externalId)
              .pricingPlanId(pricingPlanId)
              .businessDetails(businessDetails)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#createSession");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)|  | [optional] |

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSessionInfo"></a>
# **getSessionInfo**
> SessionResponse getSessionInfo(sessionId).execute();

Gets information about a Session

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationFormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String sessionId = "sessionId_example"; // 
    try {
      SessionResponse result = client
              .applicationForm
              .getSessionInfo(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSessionId());
      System.out.println(result.getAppId());
      System.out.println(result.getExternalId());
      System.out.println(result.getValidUntil());
      System.out.println(result.getComplete());
      System.out.println(result.getUrl());
      System.out.println(result.getExpired());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#getSessionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionResponse> response = client
              .applicationForm
              .getSessionInfo(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#getSessionInfo");
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
| **sessionId** | **String**|  | |

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSessionActivity"></a>
# **updateSessionActivity**
> SessionResponse updateSessionActivity(sessionId).execute();

Touch a Session, keeping it active

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationFormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String sessionId = "sessionId_example"; // 
    try {
      SessionResponse result = client
              .applicationForm
              .updateSessionActivity(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSessionId());
      System.out.println(result.getAppId());
      System.out.println(result.getExternalId());
      System.out.println(result.getValidUntil());
      System.out.println(result.getComplete());
      System.out.println(result.getUrl());
      System.out.println(result.getExpired());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#updateSessionActivity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionResponse> response = client
              .applicationForm
              .updateSessionActivity(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationFormApi#updateSessionActivity");
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
| **sessionId** | **String**|  | |

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

