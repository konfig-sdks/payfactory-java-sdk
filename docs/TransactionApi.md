# TransactionApi

All URIs are relative to *https://dev-api.payfactory.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMetadata**](TransactionApi.md#createMetadata) | **POST** /v1/Transaction/Metadata | Post Metadata related to a Transaction |
| [**createMetadataBulk**](TransactionApi.md#createMetadataBulk) | **POST** /v1/Transaction/MetadataBulk | Post multiple Metadate related to a Transactions |


<a name="createMetadata"></a>
# **createMetadata**
> Object createMetadata().transactionMetadataRequest(transactionMetadataRequest).execute();

Post Metadata related to a Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev-api.payfactory.app";
    
    configuration.apiKey  = "YOUR API KEY";
    Payfactory client = new Payfactory(configuration);
    String transactionId = "transactionId_example"; // The transaction Id from the payment processor
    String merchantId = "merchantId_example"; // Payfactoy's merchant Id
    String cardHolderName = "cardHolderName_example"; // Name of the Cardholder
    String externalId = "externalId_example"; // Any identifier you choose to send
    String orderId = "orderId_example"; // Any identifier you choose to send
    Double partnerFee = 3.4D; // Required if partner is configured for the partner fee program
    Integer itemCount = 56; // Number of items sold in the transaction
    try {
      Object result = client
              .transaction
              .createMetadata(transactionId, merchantId, cardHolderName)
              .externalId(externalId)
              .orderId(orderId)
              .partnerFee(partnerFee)
              .itemCount(itemCount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transaction
              .createMetadata(transactionId, merchantId, cardHolderName)
              .externalId(externalId)
              .orderId(orderId)
              .partnerFee(partnerFee)
              .itemCount(itemCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createMetadata");
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
| **transactionMetadataRequest** | [**TransactionMetadataRequest**](TransactionMetadataRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createMetadataBulk"></a>
# **createMetadataBulk**
> Object createMetadataBulk().transactionMetadataRequest(transactionMetadataRequest).execute();

Post multiple Metadate related to a Transactions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Payfactory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
      Object result = client
              .transaction
              .createMetadataBulk()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createMetadataBulk");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transaction
              .createMetadataBulk()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createMetadataBulk");
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
| **transactionMetadataRequest** | [**List&lt;TransactionMetadataRequest&gt;**](TransactionMetadataRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

