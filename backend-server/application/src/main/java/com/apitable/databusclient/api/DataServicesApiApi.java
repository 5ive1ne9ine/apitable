/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 0.99.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.api;

import com.apitable.databusclient.ApiCallback;
import com.apitable.databusclient.ApiClient;
import com.apitable.databusclient.ApiException;
import com.apitable.databusclient.ApiResponse;
import com.apitable.databusclient.Configuration;
import com.apitable.databusclient.Pair;
import com.apitable.databusclient.ProgressRequestBody;
import com.apitable.databusclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DataServicesApiApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataServicesApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataServicesApiApi(ApiClient apiClient) {
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

    /**
     * Build call for getDatasheetPack
     * @param id datasheet id (required)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDatasheetPackCall(String id, String userId, String spaceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/databus/get_datasheet_pack/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (spaceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("spaceId", spaceId));
        }

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDatasheetPackValidateBeforeCall(String id, String userId, String spaceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDatasheetPack(Async)");
        }

        return getDatasheetPackCall(id, userId, spaceId, _callback);

    }

    /**
     * 
     * 
     * @param id datasheet id (required)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public void getDatasheetPack(String id, String userId, String spaceId) throws ApiException {
        getDatasheetPackWithHttpInfo(id, userId, spaceId);
    }

    /**
     * 
     * 
     * @param id datasheet id (required)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getDatasheetPackWithHttpInfo(String id, String userId, String spaceId) throws ApiException {
        okhttp3.Call localVarCall = getDatasheetPackValidateBeforeCall(id, userId, spaceId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param id datasheet id (required)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDatasheetPackAsync(String id, String userId, String spaceId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDatasheetPackValidateBeforeCall(id, userId, spaceId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRecords
     * @param dstId  (optional)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param viewId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecordsCall(String dstId, String userId, String spaceId, String viewId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/databus/get_records";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dstId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dstId", dstId));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (spaceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("spaceId", spaceId));
        }

        if (viewId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("viewId", viewId));
        }

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRecordsValidateBeforeCall(String dstId, String userId, String spaceId, String viewId, final ApiCallback _callback) throws ApiException {
        return getRecordsCall(dstId, userId, spaceId, viewId, _callback);

    }

    /**
     * 
     * 
     * @param dstId  (optional)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param viewId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public void getRecords(String dstId, String userId, String spaceId, String viewId) throws ApiException {
        getRecordsWithHttpInfo(dstId, userId, spaceId, viewId);
    }

    /**
     * 
     * 
     * @param dstId  (optional)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param viewId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getRecordsWithHttpInfo(String dstId, String userId, String spaceId, String viewId) throws ApiException {
        okhttp3.Call localVarCall = getRecordsValidateBeforeCall(dstId, userId, spaceId, viewId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param dstId  (optional)
     * @param userId  (optional)
     * @param spaceId  (optional)
     * @param viewId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch completed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecordsAsync(String dstId, String userId, String spaceId, String viewId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRecordsValidateBeforeCall(dstId, userId, spaceId, viewId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
