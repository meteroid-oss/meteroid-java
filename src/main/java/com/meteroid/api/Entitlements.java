// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.Entitlement;
import com.meteroid.models.UpdateEntitlementRequest;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code entitlements} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Entitlements {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Entitlements(MeteroidHttpClient client) {
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
     * Get entitlement details
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @return the response body
     */
    public Entitlement retrieve(final String entitlementId) {
        return retrieve(entitlementId, RequestOptions.none());
    }

    /**
     * Get entitlement details
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Entitlement retrieve(final String entitlementId, final RequestOptions requestOptions) {
        return exchangeRetrieve(entitlementId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Entitlement> exchangeRetrieve(
            final String entitlementId, final RequestOptions requestOptions) {
        Objects.requireNonNull(entitlementId, "entitlement_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/entitlements")
                        .addPathSegment(Utils.pathSegment("entitlement_id", entitlementId))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(Entitlement.class);
    }

    /**
     * Delete an entitlement
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     */
    public void delete(final String entitlementId) {
        delete(entitlementId, RequestOptions.none());
    }

    /**
     * Delete an entitlement
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void delete(final String entitlementId, final RequestOptions requestOptions) {
        exchangeDelete(entitlementId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeDelete(
            final String entitlementId, final RequestOptions requestOptions) {
        Objects.requireNonNull(entitlementId, "entitlement_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/entitlements")
                        .addPathSegment(Utils.pathSegment("entitlement_id", entitlementId))
                        .build();
        return client.call("DELETE", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * Update an entitlement
     *
     * <p>The new value must match the feature's declared type.
     *
     * @param entitlementId the {@code entitlement_id} path parameter
     * @param updateEntitlementRequest the request body
     * @return the response body
     */
    public Entitlement update(
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
     * @return the response body
     */
    public Entitlement update(
            final String entitlementId,
            final UpdateEntitlementRequest updateEntitlementRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(entitlementId, updateEntitlementRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Entitlement> exchangeUpdate(
            final String entitlementId,
            final UpdateEntitlementRequest updateEntitlementRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(entitlementId, "entitlement_id");
        Objects.requireNonNull(updateEntitlementRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/entitlements")
                        .addPathSegment(Utils.pathSegment("entitlement_id", entitlementId))
                        .build();
        return client.call("PATCH", url)
                .json(updateEntitlementRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(Entitlement.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Get entitlement details
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Entitlement> retrieve(final String entitlementId) {
            return retrieve(entitlementId, RequestOptions.none());
        }

        /**
         * Get entitlement details
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Entitlement> retrieve(
                final String entitlementId, final RequestOptions requestOptions) {
            return Entitlements.this.exchangeRetrieve(entitlementId, requestOptions).sendRaw();
        }

        /**
         * Delete an entitlement
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> delete(final String entitlementId) {
            return delete(entitlementId, RequestOptions.none());
        }

        /**
         * Delete an entitlement
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> delete(
                final String entitlementId, final RequestOptions requestOptions) {
            return Entitlements.this.exchangeDelete(entitlementId, requestOptions).sendRaw();
        }

        /**
         * Update an entitlement
         *
         * <p>The new value must match the feature's declared type.
         *
         * @param entitlementId the {@code entitlement_id} path parameter
         * @param updateEntitlementRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Entitlement> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<Entitlement> update(
                final String entitlementId,
                final UpdateEntitlementRequest updateEntitlementRequest,
                final RequestOptions requestOptions) {
            return Entitlements.this
                    .exchangeUpdate(entitlementId, updateEntitlementRequest, requestOptions)
                    .sendRaw();
        }
    }
}
