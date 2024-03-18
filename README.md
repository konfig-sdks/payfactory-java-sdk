<div align="left">

[![Visit Payfactory](./header.png)](https://payfactory.io&#x2F;)

# [Payfactory](https://payfactory.io&#x2F;)

Payfactory specializes in embedded payment facilitation (payfac) services for ISVs and SaaS companies. Our gateway-friendly platform integrates with software systems to provide seamless payment facilitation with little to no development required, allowing our partners to minimize integration costs and quickly gain a new revenue stream. Founded by payment industry veterans, we believe that integrated processing should be simple, frictionless and fast – while also maintaining the highest level of security, customer service and human support.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Payfactory&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>payfactory-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:payfactory-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/payfactory-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://dev-api.payfactory.app*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**createNewApplication**](docs/ApplicationApi.md#createNewApplication) | **POST** /v1/Application/Submit | Submit a new Application
*ApplicationApi* | [**getApplicationDetails**](docs/ApplicationApi.md#getApplicationDetails) | **GET** /v1/Application/Details/{appId} | Gets Details for an Application
*ApplicationApi* | [**getApplicationStatus**](docs/ApplicationApi.md#getApplicationStatus) | **GET** /v1/Application/Status/{appId} | Gets the Status of an Application
*ApplicationApi* | [**removeById**](docs/ApplicationApi.md#removeById) | **DELETE** /v1/Application/Delete/{appId} | 
*ApplicationApi* | [**startUnderwritingProcess**](docs/ApplicationApi.md#startUnderwritingProcess) | **POST** /v1/Application/StartUnderwriting/{appId} | Start Underwriting Process for an Application
*ApplicationFormApi* | [**createSession**](docs/ApplicationFormApi.md#createSession) | **POST** /v1/ApplicationForm/session | Creates a new Session
*ApplicationFormApi* | [**getSessionInfo**](docs/ApplicationFormApi.md#getSessionInfo) | **GET** /v1/ApplicationForm/session/{sessionId} | Gets information about a Session
*ApplicationFormApi* | [**updateSessionActivity**](docs/ApplicationFormApi.md#updateSessionActivity) | **PUT** /v1/ApplicationForm/session/{sessionId} | Touch a Session, keeping it active
*DocumentApi* | [**uploadAgreement**](docs/DocumentApi.md#uploadAgreement) | **POST** /v1/Document/Upload/{type}/{appId} | Upload an Agreement for a new Application
*ReportingApi* | [**getAchTransactionsByReferenceId**](docs/ReportingApi.md#getAchTransactionsByReferenceId) | **GET** /v1/Reporting/AchTransactions/{referenceId} | 
*ReportingApi* | [**getDeposits**](docs/ReportingApi.md#getDeposits) | **GET** /v1/Reporting/Deposits | Get current Deposits
*ReportingApi* | [**getDepositsByCount**](docs/ReportingApi.md#getDepositsByCount) | **GET** /v1/Reporting/Deposits/{numberOfDeposits} | Get {n} current Deposits
*ReportingApi* | [**getDepositsByReferenceId**](docs/ReportingApi.md#getDepositsByReferenceId) | **GET** /v1/Reporting/Deposits/{referenceId} | Get Deposits by ReferenceId.
*TransactionApi* | [**createMetadata**](docs/TransactionApi.md#createMetadata) | **POST** /v1/Transaction/Metadata | Post Metadata related to a Transaction
*TransactionApi* | [**createMetadataBulk**](docs/TransactionApi.md#createMetadataBulk) | **POST** /v1/Transaction/MetadataBulk | Post multiple Metadate related to a Transactions


## Documentation for Models

 - [AddressModel](docs/AddressModel.md)
 - [ApplicationDetailsResponse](docs/ApplicationDetailsResponse.md)
 - [ApplicationDetailsResponseCustomerServiceModel](docs/ApplicationDetailsResponseCustomerServiceModel.md)
 - [ApplicationDetailsResponseSignerModel](docs/ApplicationDetailsResponseSignerModel.md)
 - [ApplicationStatus](docs/ApplicationStatus.md)
 - [ApplicationStatusResponse](docs/ApplicationStatusResponse.md)
 - [ApplicationSubmitRequestModel](docs/ApplicationSubmitRequestModel.md)
 - [ApplicationSubmitResponseModel](docs/ApplicationSubmitResponseModel.md)
 - [BankDetailsModel](docs/BankDetailsModel.md)
 - [BusinessDetailsModel](docs/BusinessDetailsModel.md)
 - [CardTypeEnum](docs/CardTypeEnum.md)
 - [CreateSessionRequest](docs/CreateSessionRequest.md)
 - [CreateSessionRequestSignerModel](docs/CreateSessionRequestSignerModel.md)
 - [CustomerServiceContactModel](docs/CustomerServiceContactModel.md)
 - [DepositModel](docs/DepositModel.md)
 - [DepositType](docs/DepositType.md)
 - [DocumentUploadAgreementRequest](docs/DocumentUploadAgreementRequest.md)
 - [OwnerModel](docs/OwnerModel.md)
 - [OwnershipTypeEnum](docs/OwnershipTypeEnum.md)
 - [PersonModel](docs/PersonModel.md)
 - [PricingModel](docs/PricingModel.md)
 - [PricingModelBillingFrequencyEnum](docs/PricingModelBillingFrequencyEnum.md)
 - [PricingModelPricingStructureCardModel](docs/PricingModelPricingStructureCardModel.md)
 - [PricingProgramEnum](docs/PricingProgramEnum.md)
 - [ProcessingDetailsModel](docs/ProcessingDetailsModel.md)
 - [RiskContactModel](docs/RiskContactModel.md)
 - [SessionBusinessDetailsModel](docs/SessionBusinessDetailsModel.md)
 - [SessionResponse](docs/SessionResponse.md)
 - [TransactionMetadataRequest](docs/TransactionMetadataRequest.md)
 - [TransactionModel](docs/TransactionModel.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
