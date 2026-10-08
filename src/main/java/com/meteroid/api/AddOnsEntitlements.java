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
 * The {@code add_ons.entitlements} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class AddOnsEntitlements {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public AddOnsEntitlements(MeteroidHttpClient client) {
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
     * List add-on entitlements
     *
     * @param addonId the {@code addon_id} path parameter
     * @return the response body
     */
    public ResolvedEntitlementListResponse list(final String addonId) {
        return list(addonId, RequestOptions.none());
    }

    /**
     * List add-on entitlements
     *
     * @param addonId the {@code addon_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public ResolvedEntitlementListResponse list(
            final String addonId, final RequestOptions requestOptions) {
        return exchangeList(addonId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<ResolvedEntitlementListResponse> exchangeList(
            final String addonId, final RequestOptions requestOptions) {
        Objects.requireNonNull(addonId, "addon_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/addons")
                        .addPathSegment(Utils.pathSegment("addon_id", addonId))
                        .addPathSegments("entitlements")
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(ResolvedEntitlementListResponse.class);
    }

    /**
     * Create add-on entitlements
     *
     * <p>Entitlements already present on this add-on are skipped.
     *
     * @param addonId the {@code addon_id} path parameter
     * @param createEntitlementsRequest the request body
     * @return the response body
     */
    public EntitlementListResponse create(
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
     * @return the response body
     */
    public EntitlementListResponse create(
            final String addonId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(addonId, createEntitlementsRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<EntitlementListResponse> exchangeCreate(
            final String addonId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(addonId, "addon_id");
        Objects.requireNonNull(createEntitlementsRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/addons")
                        .addPathSegment(Utils.pathSegment("addon_id", addonId))
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
         * List add-on entitlements
         *
         * @param addonId the {@code addon_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> list(final String addonId) {
            return list(addonId, RequestOptions.none());
        }

        /**
         * List add-on entitlements
         *
         * @param addonId the {@code addon_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> list(
                final String addonId, final RequestOptions requestOptions) {
            return AddOnsEntitlements.this.exchangeList(addonId, requestOptions).sendRaw();
        }

        /**
         * Create add-on entitlements
         *
         * <p>Entitlements already present on this add-on are skipped.
         *
         * @param addonId the {@code addon_id} path parameter
         * @param createEntitlementsRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> create(
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
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> create(
                final String addonId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return AddOnsEntitlements.this
                    .exchangeCreate(addonId, createEntitlementsRequest, requestOptions)
                    .sendRaw();
        }
    }
}
