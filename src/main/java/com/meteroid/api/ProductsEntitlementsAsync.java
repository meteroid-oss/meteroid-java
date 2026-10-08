// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateEntitlementsRequest;
import com.meteroid.models.EntitlementListResponse;
import com.meteroid.models.ResolvedEntitlementListResponse;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code products.entitlements} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class ProductsEntitlementsAsync {
    private final ProductsEntitlements sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public ProductsEntitlementsAsync(ProductsEntitlements sync) {
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
     * List product entitlements
     *
     * @param productId the {@code product_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> list(final String productId) {
        return list(productId, RequestOptions.none());
    }

    /**
     * List product entitlements
     *
     * @param productId the {@code product_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> list(
            final String productId, final RequestOptions requestOptions) {
        return sync.exchangeList(productId, requestOptions).sendAsync();
    }

    /**
     * Create product entitlements
     *
     * <p>A product has no entitlement rows of its own: its entitlements are the feature-level
     * defaults of the features scoped to it, which is what <code>GET</code> on this path resolves.
     * Every spec must therefore target a feature belonging to <code>product_id</code>. Features
     * that already carry a default entitlement are skipped.
     *
     * <p>Specs are validated up front, but the writes are not atomic: each feature is written on
     * its own, so a failure part-way can leave earlier specs committed. Retrying is safe.
     *
     * @param productId the {@code product_id} path parameter
     * @param createEntitlementsRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> create(
            final String productId, final CreateEntitlementsRequest createEntitlementsRequest) {
        return create(productId, createEntitlementsRequest, RequestOptions.none());
    }

    /**
     * Create product entitlements
     *
     * <p>A product has no entitlement rows of its own: its entitlements are the feature-level
     * defaults of the features scoped to it, which is what <code>GET</code> on this path resolves.
     * Every spec must therefore target a feature belonging to <code>product_id</code>. Features
     * that already carry a default entitlement are skipped.
     *
     * <p>Specs are validated up front, but the writes are not atomic: each feature is written on
     * its own, so a failure part-way can leave earlier specs committed. Retrying is safe.
     *
     * @param productId the {@code product_id} path parameter
     * @param createEntitlementsRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> create(
            final String productId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(productId, createEntitlementsRequest, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List product entitlements
         *
         * @param productId the {@code product_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>> list(
                final String productId) {
            return list(productId, RequestOptions.none());
        }

        /**
         * List product entitlements
         *
         * @param productId the {@code product_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>> list(
                final String productId, final RequestOptions requestOptions) {
            return sync.exchangeList(productId, requestOptions).sendRawAsync();
        }

        /**
         * Create product entitlements
         *
         * <p>A product has no entitlement rows of its own: its entitlements are the feature-level
         * defaults of the features scoped to it, which is what <code>GET</code> on this path
         * resolves. Every spec must therefore target a feature belonging to <code>product_id</code>
         * . Features that already carry a default entitlement are skipped.
         *
         * <p>Specs are validated up front, but the writes are not atomic: each feature is written
         * on its own, so a failure part-way can leave earlier specs committed. Retrying is safe.
         *
         * @param productId the {@code product_id} path parameter
         * @param createEntitlementsRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> create(
                final String productId, final CreateEntitlementsRequest createEntitlementsRequest) {
            return create(productId, createEntitlementsRequest, RequestOptions.none());
        }

        /**
         * Create product entitlements
         *
         * <p>A product has no entitlement rows of its own: its entitlements are the feature-level
         * defaults of the features scoped to it, which is what <code>GET</code> on this path
         * resolves. Every spec must therefore target a feature belonging to <code>product_id</code>
         * . Features that already carry a default entitlement are skipped.
         *
         * <p>Specs are validated up front, but the writes are not atomic: each feature is written
         * on its own, so a failure part-way can leave earlier specs committed. Retrying is safe.
         *
         * @param productId the {@code product_id} path parameter
         * @param createEntitlementsRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> create(
                final String productId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(productId, createEntitlementsRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
