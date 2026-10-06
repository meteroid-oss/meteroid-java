// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.Entitlement;
import com.meteroid.models.UpdateEntitlementRequest;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code entitlements} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class EntitlementsAsync {
    private final Entitlements sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public EntitlementsAsync(Entitlements sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();
    }

    /**
     * The same operations, returning the status and headers along with the body.
     *
     * @return the operations
     */
    public WithRawResponse withRawResponse() {
        return withRawResponse;
    }

    /**
     * Get entitlement details
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Entitlement> retrieve(final String entitlementId) {
        return retrieve(entitlementId, RequestOptions.none());
    }

    /**
     * Get entitlement details
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Entitlement> retrieve(
            final String entitlementId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(entitlementId, requestOptions).sendAsync();
    }

    /**
     * Delete an entitlement
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> delete(final String entitlementId) {
        return delete(entitlementId, RequestOptions.none());
    }

    /**
     * Delete an entitlement
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> delete(
            final String entitlementId, final RequestOptions requestOptions) {
        return sync.exchangeDelete(entitlementId, requestOptions).sendAsync();
    }

    /**
     * Update an entitlement
     *
     * <p>The new value must match the feature's declared type.
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param updateEntitlementRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Entitlement> update(
            final String entitlementId, final UpdateEntitlementRequest updateEntitlementRequest) {
        return update(entitlementId, updateEntitlementRequest, RequestOptions.none());
    }

    /**
     * Update an entitlement
     *
     * <p>The new value must match the feature's declared type.
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param updateEntitlementRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Entitlement> update(
            final String entitlementId,
            final UpdateEntitlementRequest updateEntitlementRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(entitlementId, updateEntitlementRequest, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Get entitlement details
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Entitlement>> retrieve(final String entitlementId) {
            return retrieve(entitlementId, RequestOptions.none());
        }

        /**
         * Get entitlement details
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Entitlement>> retrieve(
                final String entitlementId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(entitlementId, requestOptions).sendRawAsync();
        }

        /**
         * Delete an entitlement
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> delete(final String entitlementId) {
            return delete(entitlementId, RequestOptions.none());
        }

        /**
         * Delete an entitlement
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> delete(
                final String entitlementId, final RequestOptions requestOptions) {
            return sync.exchangeDelete(entitlementId, requestOptions).sendRawAsync();
        }

        /**
         * Update an entitlement
         *
         * <p>The new value must match the feature's declared type.
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param updateEntitlementRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Entitlement>> update(
                final String entitlementId,
                final UpdateEntitlementRequest updateEntitlementRequest) {
            return update(entitlementId, updateEntitlementRequest, RequestOptions.none());
        }

        /**
         * Update an entitlement
         *
         * <p>The new value must match the feature's declared type.
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param updateEntitlementRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Entitlement>> update(
                final String entitlementId,
                final UpdateEntitlementRequest updateEntitlementRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(entitlementId, updateEntitlementRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
