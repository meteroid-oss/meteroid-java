// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateEntitlementsRequest;
import com.meteroid.models.EntitlementListResponse;
import com.meteroid.models.ResolvedEntitlementListResponse;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code products.entitlements} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class ProductsEntitlements {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public ProductsEntitlements(MeteroidHttpClient client) {
        this.client = client;
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
     * @return the response body
     */
    public ResolvedEntitlementListResponse list(final String productId) {
        return list(productId, RequestOptions.none());
    }

    /**
     * List product entitlements
     *
     * @param productId the {@code product_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public ResolvedEntitlementListResponse list(
            final String productId, final RequestOptions requestOptions) {
        return exchangeList(productId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<ResolvedEntitlementListResponse> exchangeList(
            final String productId, final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
                        .addPathSegments("entitlements")
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(ResolvedEntitlementListResponse.class);
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
     * @return the response body
     */
    public EntitlementListResponse create(
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
     * @return the response body
     */
    public EntitlementListResponse create(
            final String productId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(productId, createEntitlementsRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<EntitlementListResponse> exchangeCreate(
            final String productId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        Objects.requireNonNull(createEntitlementsRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
                        .addPathSegments("entitlements")
                        .build();
        return client.call("POST", url)
                .json(createEntitlementsRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(EntitlementListResponse.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List product entitlements
         *
         * @param productId the {@code product_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> list(final String productId) {
            return list(productId, RequestOptions.none());
        }

        /**
         * List product entitlements
         *
         * @param productId the {@code product_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> list(
                final String productId, final RequestOptions requestOptions) {
            return ProductsEntitlements.this.exchangeList(productId, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> create(
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
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> create(
                final String productId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return ProductsEntitlements.this
                    .exchangeCreate(productId, createEntitlementsRequest, requestOptions)
                    .sendRaw();
        }
    }
}
