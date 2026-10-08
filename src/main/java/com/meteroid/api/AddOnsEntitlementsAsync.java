// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateEntitlementsRequest;
import com.meteroid.models.EntitlementListResponse;
import com.meteroid.models.ResolvedEntitlementListResponse;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code add_ons.entitlements} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class AddOnsEntitlementsAsync {
    private final AddOnsEntitlements sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public AddOnsEntitlementsAsync(AddOnsEntitlements sync) {
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
     * List add-on entitlements
     *
     * @param addonId the {@code addon_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> list(final String addonId) {
        return list(addonId, RequestOptions.none());
    }

    /**
     * List add-on entitlements
     *
     * @param addonId the {@code addon_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> list(
            final String addonId, final RequestOptions requestOptions) {
        return sync.exchangeList(addonId, requestOptions).sendAsync();
    }

    /**
     * Create add-on entitlements
     *
     * <p>Entitlements already present on this add-on are skipped.
     *
     * @param addonId the {@code addon_id} path parameter
     * @param createEntitlementsRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> create(
            final String addonId, final CreateEntitlementsRequest createEntitlementsRequest) {
        return create(addonId, createEntitlementsRequest, RequestOptions.none());
    }

    /**
     * Create add-on entitlements
     *
     * <p>Entitlements already present on this add-on are skipped.
     *
     * @param addonId the {@code addon_id} path parameter
     * @param createEntitlementsRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> create(
            final String addonId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(addonId, createEntitlementsRequest, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List add-on entitlements
         *
         * @param addonId the {@code addon_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>> list(
                final String addonId) {
            return list(addonId, RequestOptions.none());
        }

        /**
         * List add-on entitlements
         *
         * @param addonId the {@code addon_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>> list(
                final String addonId, final RequestOptions requestOptions) {
            return sync.exchangeList(addonId, requestOptions).sendRawAsync();
        }

        /**
         * Create add-on entitlements
         *
         * <p>Entitlements already present on this add-on are skipped.
         *
         * @param addonId the {@code addon_id} path parameter
         * @param createEntitlementsRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> create(
                final String addonId, final CreateEntitlementsRequest createEntitlementsRequest) {
            return create(addonId, createEntitlementsRequest, RequestOptions.none());
        }

        /**
         * Create add-on entitlements
         *
         * <p>Entitlements already present on this add-on are skipped.
         *
         * @param addonId the {@code addon_id} path parameter
         * @param createEntitlementsRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> create(
                final String addonId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(addonId, createEntitlementsRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
