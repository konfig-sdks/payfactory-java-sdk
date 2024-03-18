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


import com.konfigthis.client.model.DocumentUploadAgreementRequest;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DocumentApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DocumentApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call uploadAgreementCall(String type, String appId, File document, DocumentUploadAgreementRequest documentUploadAgreementRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = documentUploadAgreementRequest;

        // create path and map variables
        String localVarPath = "/v1/Document/Upload/{type}/{appId}"
            .replace("{" + "type" + "}", localVarApiClient.escapeString(type.toString()))
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (document != null) {
            localVarFormParams.put("Document", document);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadAgreementValidateBeforeCall(String type, String appId, File document, DocumentUploadAgreementRequest documentUploadAgreementRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling uploadAgreement(Async)");
        }

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling uploadAgreement(Async)");
        }

        // verify the required parameter 'document' is set
        if (document == null) {
            throw new ApiException("Missing the required parameter 'document' when calling uploadAgreement(Async)");
        }

        return uploadAgreementCall(type, appId, document, documentUploadAgreementRequest, _callback);

    }


    private ApiResponse<Void> uploadAgreementWithHttpInfo(String type, String appId, File document, DocumentUploadAgreementRequest documentUploadAgreementRequest) throws ApiException {
        okhttp3.Call localVarCall = uploadAgreementValidateBeforeCall(type, appId, document, documentUploadAgreementRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call uploadAgreementAsync(String type, String appId, File document, DocumentUploadAgreementRequest documentUploadAgreementRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadAgreementValidateBeforeCall(type, appId, document, documentUploadAgreementRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class UploadAgreementRequestBuilder {
        private final String type;
        private final String appId;
        private final File document;

        private UploadAgreementRequestBuilder(String type, String appId, File document) {
            this.type = type;
            this.appId = appId;
            this.document = document;
        }

        /**
         * Build call for uploadAgreement
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
            DocumentUploadAgreementRequest documentUploadAgreementRequest = buildBodyParams();
            return uploadAgreementCall(type, appId, document, documentUploadAgreementRequest, _callback);
        }

        private DocumentUploadAgreementRequest buildBodyParams() {
            DocumentUploadAgreementRequest documentUploadAgreementRequest = new DocumentUploadAgreementRequest();
            documentUploadAgreementRequest.document(this.document);
            return documentUploadAgreementRequest;
        }

        /**
         * Execute uploadAgreement request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DocumentUploadAgreementRequest documentUploadAgreementRequest = buildBodyParams();
            uploadAgreementWithHttpInfo(type, appId, document, documentUploadAgreementRequest);
        }

        /**
         * Execute uploadAgreement request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DocumentUploadAgreementRequest documentUploadAgreementRequest = buildBodyParams();
            return uploadAgreementWithHttpInfo(type, appId, document, documentUploadAgreementRequest);
        }

        /**
         * Execute uploadAgreement request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            DocumentUploadAgreementRequest documentUploadAgreementRequest = buildBodyParams();
            return uploadAgreementAsync(type, appId, document, documentUploadAgreementRequest, _callback);
        }
    }

    /**
     * Upload an Agreement for a new Application
     * 
     * @param type  (required)
     * @param appId  (required)
     * @param document  (required)
     * @return UploadAgreementRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public UploadAgreementRequestBuilder uploadAgreement(String type, String appId, File document) throws IllegalArgumentException {
        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
            

        if (appId == null) throw new IllegalArgumentException("\"appId\" is required but got null");
            

        if (document == null) throw new IllegalArgumentException("\"document\" is required but got null");
        return new UploadAgreementRequestBuilder(type, appId, document);
    }
}