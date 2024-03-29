/*
 * Payfactory Api
 * Payfactory specializes in embedded payment facilitation (payfac) services for ISVs and SaaS companies. Our gateway-friendly platform integrates with software systems to provide seamless payment facilitation with little to no development required, allowing our partners to minimize integration costs and quickly gain a new revenue stream. Founded by payment industry veterans, we believe that integrated processing should be simple, frictionless and fast – while also maintaining the highest level of security, customer service and human support.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.DepositModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReportingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKey() == null) {
            throw new IllegalArgumentException("\"pf-api-key\" is required but no API key was provided. Please set \"pf-api-key\" with ApiClient#setApiKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getAchTransactionsByReferenceIdCall(String referenceId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/Reporting/AchTransactions/{referenceId}"
            .replace("{" + "referenceId" + "}", localVarApiClient.escapeString(referenceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAchTransactionsByReferenceIdValidateBeforeCall(String referenceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'referenceId' is set
        if (referenceId == null) {
            throw new ApiException("Missing the required parameter 'referenceId' when calling getAchTransactionsByReferenceId(Async)");
        }

        return getAchTransactionsByReferenceIdCall(referenceId, _callback);

    }


    private ApiResponse<List<DepositModel>> getAchTransactionsByReferenceIdWithHttpInfo(String referenceId) throws ApiException {
        okhttp3.Call localVarCall = getAchTransactionsByReferenceIdValidateBeforeCall(referenceId, null);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAchTransactionsByReferenceIdAsync(String referenceId, final ApiCallback<List<DepositModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAchTransactionsByReferenceIdValidateBeforeCall(referenceId, _callback);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAchTransactionsByReferenceIdRequestBuilder {
        private final String referenceId;

        private GetAchTransactionsByReferenceIdRequestBuilder(String referenceId) {
            this.referenceId = referenceId;
        }

        /**
         * Build call for getAchTransactionsByReferenceId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAchTransactionsByReferenceIdCall(referenceId, _callback);
        }


        /**
         * Execute getAchTransactionsByReferenceId request
         * @return List&lt;DepositModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<DepositModel> execute() throws ApiException {
            ApiResponse<List<DepositModel>> localVarResp = getAchTransactionsByReferenceIdWithHttpInfo(referenceId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAchTransactionsByReferenceId request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DepositModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DepositModel>> executeWithHttpInfo() throws ApiException {
            return getAchTransactionsByReferenceIdWithHttpInfo(referenceId);
        }

        /**
         * Execute getAchTransactionsByReferenceId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DepositModel>> _callback) throws ApiException {
            return getAchTransactionsByReferenceIdAsync(referenceId, _callback);
        }
    }

    /**
     * 
     * 
     * @param referenceId  (required)
     * @return GetAchTransactionsByReferenceIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetAchTransactionsByReferenceIdRequestBuilder getAchTransactionsByReferenceId(String referenceId) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            

        return new GetAchTransactionsByReferenceIdRequestBuilder(referenceId);
    }
    private okhttp3.Call getDepositsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/Reporting/Deposits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDepositsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getDepositsCall(_callback);

    }


    private ApiResponse<List<DepositModel>> getDepositsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDepositsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDepositsAsync(final ApiCallback<List<DepositModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDepositsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDepositsRequestBuilder {

        private GetDepositsRequestBuilder() {
        }

        /**
         * Build call for getDeposits
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDepositsCall(_callback);
        }


        /**
         * Execute getDeposits request
         * @return List&lt;DepositModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<DepositModel> execute() throws ApiException {
            ApiResponse<List<DepositModel>> localVarResp = getDepositsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDeposits request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DepositModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DepositModel>> executeWithHttpInfo() throws ApiException {
            return getDepositsWithHttpInfo();
        }

        /**
         * Execute getDeposits request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DepositModel>> _callback) throws ApiException {
            return getDepositsAsync(_callback);
        }
    }

    /**
     * Get current Deposits
     * 
     * @return GetDepositsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetDepositsRequestBuilder getDeposits() throws IllegalArgumentException {
        return new GetDepositsRequestBuilder();
    }
    private okhttp3.Call getDepositsByCountCall(Integer numberOfDeposits, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/Reporting/Deposits/{numberOfDeposits}"
            .replace("{" + "numberOfDeposits" + "}", localVarApiClient.escapeString(numberOfDeposits.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDepositsByCountValidateBeforeCall(Integer numberOfDeposits, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'numberOfDeposits' is set
        if (numberOfDeposits == null) {
            throw new ApiException("Missing the required parameter 'numberOfDeposits' when calling getDepositsByCount(Async)");
        }

        return getDepositsByCountCall(numberOfDeposits, _callback);

    }


    private ApiResponse<List<DepositModel>> getDepositsByCountWithHttpInfo(Integer numberOfDeposits) throws ApiException {
        okhttp3.Call localVarCall = getDepositsByCountValidateBeforeCall(numberOfDeposits, null);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDepositsByCountAsync(Integer numberOfDeposits, final ApiCallback<List<DepositModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDepositsByCountValidateBeforeCall(numberOfDeposits, _callback);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDepositsByCountRequestBuilder {
        private final Integer numberOfDeposits;

        private GetDepositsByCountRequestBuilder(Integer numberOfDeposits) {
            this.numberOfDeposits = numberOfDeposits;
        }

        /**
         * Build call for getDepositsByCount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDepositsByCountCall(numberOfDeposits, _callback);
        }


        /**
         * Execute getDepositsByCount request
         * @return List&lt;DepositModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<DepositModel> execute() throws ApiException {
            ApiResponse<List<DepositModel>> localVarResp = getDepositsByCountWithHttpInfo(numberOfDeposits);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDepositsByCount request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DepositModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DepositModel>> executeWithHttpInfo() throws ApiException {
            return getDepositsByCountWithHttpInfo(numberOfDeposits);
        }

        /**
         * Execute getDepositsByCount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DepositModel>> _callback) throws ApiException {
            return getDepositsByCountAsync(numberOfDeposits, _callback);
        }
    }

    /**
     * Get {n} current Deposits
     * 
     * @param numberOfDeposits  (required)
     * @return GetDepositsByCountRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetDepositsByCountRequestBuilder getDepositsByCount(Integer numberOfDeposits) throws IllegalArgumentException {
        if (numberOfDeposits == null) throw new IllegalArgumentException("\"numberOfDeposits\" is required but got null");
        return new GetDepositsByCountRequestBuilder(numberOfDeposits);
    }
    private okhttp3.Call getDepositsByReferenceIdCall(String referenceId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/Reporting/Deposits/{referenceId}"
            .replace("{" + "referenceId" + "}", localVarApiClient.escapeString(referenceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDepositsByReferenceIdValidateBeforeCall(String referenceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'referenceId' is set
        if (referenceId == null) {
            throw new ApiException("Missing the required parameter 'referenceId' when calling getDepositsByReferenceId(Async)");
        }

        return getDepositsByReferenceIdCall(referenceId, _callback);

    }


    private ApiResponse<List<DepositModel>> getDepositsByReferenceIdWithHttpInfo(String referenceId) throws ApiException {
        okhttp3.Call localVarCall = getDepositsByReferenceIdValidateBeforeCall(referenceId, null);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDepositsByReferenceIdAsync(String referenceId, final ApiCallback<List<DepositModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDepositsByReferenceIdValidateBeforeCall(referenceId, _callback);
        Type localVarReturnType = new TypeToken<List<DepositModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDepositsByReferenceIdRequestBuilder {
        private final String referenceId;

        private GetDepositsByReferenceIdRequestBuilder(String referenceId) {
            this.referenceId = referenceId;
        }

        /**
         * Build call for getDepositsByReferenceId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDepositsByReferenceIdCall(referenceId, _callback);
        }


        /**
         * Execute getDepositsByReferenceId request
         * @return List&lt;DepositModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<DepositModel> execute() throws ApiException {
            ApiResponse<List<DepositModel>> localVarResp = getDepositsByReferenceIdWithHttpInfo(referenceId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDepositsByReferenceId request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DepositModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DepositModel>> executeWithHttpInfo() throws ApiException {
            return getDepositsByReferenceIdWithHttpInfo(referenceId);
        }

        /**
         * Execute getDepositsByReferenceId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DepositModel>> _callback) throws ApiException {
            return getDepositsByReferenceIdAsync(referenceId, _callback);
        }
    }

    /**
     * Get Deposits by ReferenceId.
     * 
     * @param referenceId  (required)
     * @return GetDepositsByReferenceIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetDepositsByReferenceIdRequestBuilder getDepositsByReferenceId(String referenceId) throws IllegalArgumentException {
        if (referenceId == null) throw new IllegalArgumentException("\"referenceId\" is required but got null");
            

        return new GetDepositsByReferenceIdRequestBuilder(referenceId);
    }
}
