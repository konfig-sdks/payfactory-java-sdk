

# CreateSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pricingPlanId** | **String** | Id of the Pricing Plan. Only used if enabled for the partner |  [optional] |
|**signer** | [**CreateSessionRequestSignerModel**](CreateSessionRequestSignerModel.md) |  |  |
|**companyName** | **String** | Name of the merchant account |  |
|**redirectUrl** | **URI** | Url to redirect the merchant user to when clicking the back button |  |
|**completeUrl** | **URI** | Url to redirect the merchant user to upon completing the application |  |
|**refreshUrl** | **URI** | Url to redirect to the merchant user to when their session is expired |  |
|**externalId** | **String** | Unique identifier for the merchant in your system |  |
|**businessDetails** | [**SessionBusinessDetailsModel**](SessionBusinessDetailsModel.md) |  |  [optional] |



