# ReportingApi

All URIs are relative to *https://dev-api.payfactory.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAchTransactionsByReferenceId**](ReportingApi.md#getAchTransactionsByReferenceId) | **GET** /v1/Reporting/AchTransactions/{referenceId} |  |
| [**getDeposits**](ReportingApi.md#getDeposits) | **GET** /v1/Reporting/Deposits | Get current Deposits |
| [**getDepositsByCount**](ReportingApi.md#getDepositsByCount) | **GET** /v1/Reporting/Deposits/{numberOfDeposits} | Get {n} current Deposits |
| [**getDepositsByReferenceId**](ReportingApi.md#getDepositsByReferenceId) | **GET** /v1/Reporting/Deposits/{referenceId} | Get Deposits by ReferenceId. |


<a name="getAchTransactionsByReferenceId"></a>
# **getAchTransactionsByReferenceId**
> List&lt;DepositModel&gt; getAchTransactionsByReferenceId(referenceId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String referenceId = "referenceId_example";
    try {
      List<DepositModel> result = client
              .reporting
              .getAchTransactionsByReferenceId(referenceId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getAchTransactionsByReferenceId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DepositModel>> response = client
              .reporting
              .getAchTransactionsByReferenceId(referenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getAchTransactionsByReferenceId");
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
| **referenceId** | **String**|  | |

### Return type

[**List&lt;DepositModel&gt;**](DepositModel.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDeposits"></a>
# **getDeposits**
> List&lt;DepositModel&gt; getDeposits().execute();

Get current Deposits

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    try {
      List<DepositModel> result = client
              .reporting
              .getDeposits()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DepositModel>> response = client
              .reporting
              .getDeposits()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DepositModel&gt;**](DepositModel.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDepositsByCount"></a>
# **getDepositsByCount**
> List&lt;DepositModel&gt; getDepositsByCount(numberOfDeposits).execute();

Get {n} current Deposits

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    Integer numberOfDeposits = 56; // 
    try {
      List<DepositModel> result = client
              .reporting
              .getDepositsByCount(numberOfDeposits)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDepositsByCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DepositModel>> response = client
              .reporting
              .getDepositsByCount(numberOfDeposits)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDepositsByCount");
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
| **numberOfDeposits** | **Integer**|  | |

### Return type

[**List&lt;DepositModel&gt;**](DepositModel.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDepositsByReferenceId"></a>
# **getDepositsByReferenceId**
> List&lt;DepositModel&gt; getDepositsByReferenceId(referenceId).execute();

Get Deposits by ReferenceId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String referenceId = "referenceId_example"; // 
    try {
      List<DepositModel> result = client
              .reporting
              .getDepositsByReferenceId(referenceId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDepositsByReferenceId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DepositModel>> response = client
              .reporting
              .getDepositsByReferenceId(referenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getDepositsByReferenceId");
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
| **referenceId** | **String**|  | |

### Return type

[**List&lt;DepositModel&gt;**](DepositModel.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

