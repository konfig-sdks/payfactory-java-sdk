# ApplicationApi

All URIs are relative to *https://dev-api.payfactory.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewApplication**](ApplicationApi.md#createNewApplication) | **POST** /v1/Application/Submit | Submit a new Application |
| [**getApplicationDetails**](ApplicationApi.md#getApplicationDetails) | **GET** /v1/Application/Details/{appId} | Gets Details for an Application |
| [**getApplicationStatus**](ApplicationApi.md#getApplicationStatus) | **GET** /v1/Application/Status/{appId} | Gets the Status of an Application |
| [**removeById**](ApplicationApi.md#removeById) | **DELETE** /v1/Application/Delete/{appId} |  |
| [**startUnderwritingProcess**](ApplicationApi.md#startUnderwritingProcess) | **POST** /v1/Application/StartUnderwriting/{appId} | Start Underwriting Process for an Application |


<a name="createNewApplication"></a>
# **createNewApplication**
> ApplicationSubmitResponseModel createNewApplication().applicationSubmitRequestModel(applicationSubmitRequestModel).execute();

Submit a new Application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String isvName = "isvName_example";
    BusinessDetailsModel businessDetails = new BusinessDetailsModel();
    CustomerServiceContactModel customerServiceContact = new CustomerServiceContactModel();
    RiskContactModel riskContact = new RiskContactModel();
    PersonModel businessContact = new PersonModel();
    ProcessingDetailsModel processingDetails = new ProcessingDetailsModel();
    BankDetailsModel bankDetails = new BankDetailsModel();
    PricingModel pricingStructure = new PricingModel();
    String externalId = "externalId_example";
    List<OwnerModel> owners = Arrays.asList();
    try {
      ApplicationSubmitResponseModel result = client
              .application
              .createNewApplication(isvName, businessDetails, customerServiceContact, riskContact, businessContact, processingDetails, bankDetails, pricingStructure)
              .externalId(externalId)
              .owners(owners)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNewApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationSubmitResponseModel> response = client
              .application
              .createNewApplication(isvName, businessDetails, customerServiceContact, riskContact, businessContact, processingDetails, bankDetails, pricingStructure)
              .externalId(externalId)
              .owners(owners)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNewApplication");
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
| **applicationSubmitRequestModel** | [**ApplicationSubmitRequestModel**](ApplicationSubmitRequestModel.md)|  | [optional] |

### Return type

[**ApplicationSubmitResponseModel**](ApplicationSubmitResponseModel.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getApplicationDetails"></a>
# **getApplicationDetails**
> ApplicationDetailsResponse getApplicationDetails(appId).execute();

Gets Details for an Application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String appId = "appId_example"; // 
    try {
      ApplicationDetailsResponse result = client
              .application
              .getApplicationDetails(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppId());
      System.out.println(result.getExternalId());
      System.out.println(result.getLegalName());
      System.out.println(result.getDbaName());
      System.out.println(result.getOwnershipType());
      System.out.println(result.getTaxId());
      System.out.println(result.getAddress());
      System.out.println(result.getPhone());
      System.out.println(result.getWebsite());
      System.out.println(result.getCustomerService());
      System.out.println(result.getSigner());
      System.out.println(result.getMonthlyTransactionVolume());
      System.out.println(result.getMerchantCategoryCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplicationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationDetailsResponse> response = client
              .application
              .getApplicationDetails(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplicationDetails");
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
| **appId** | **String**|  | |

### Return type

[**ApplicationDetailsResponse**](ApplicationDetailsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getApplicationStatus"></a>
# **getApplicationStatus**
> ApplicationStatusResponse getApplicationStatus(appId).execute();

Gets the Status of an Application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String appId = "appId_example"; // 
    try {
      ApplicationStatusResponse result = client
              .application
              .getApplicationStatus(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppId());
      System.out.println(result.getStatus());
      System.out.println(result.getLegalName());
      System.out.println(result.getDba());
      System.out.println(result.getExternalId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplicationStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationStatusResponse> response = client
              .application
              .getApplicationStatus(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplicationStatus");
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
| **appId** | **String**|  | |

### Return type

[**ApplicationStatusResponse**](ApplicationStatusResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(appId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .removeById(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeById(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeById");
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
| **appId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="startUnderwritingProcess"></a>
# **startUnderwritingProcess**
> startUnderwritingProcess(appId).execute();

Start Underwriting Process for an Application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String appId = "appId_example"; // 
    try {
      client
              .application
              .startUnderwritingProcess(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#startUnderwritingProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .startUnderwritingProcess(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#startUnderwritingProcess");
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
| **appId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

