// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateWebhookEndpointRequest;
import com.meteroid.models.CreatedWebhookEndpoint;
import com.meteroid.models.UpdateWebhookEndpointRequest;
import com.meteroid.models.WebhookDelivery;
import com.meteroid.models.WebhookDeliveryListResponse;
import com.meteroid.models.WebhookDeliveryStatus;
import com.meteroid.models.WebhookEndpoint;
import com.meteroid.models.WebhookEndpointListResponse;
import com.meteroid.models.WebhookEndpointSecret;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code webhook_endpoints.endpoints} operations, blocking. {@link #withRawResponse()} has the
 * same methods returning the status and headers along with the body.
 */
public final class WebhookEndpointsEndpoints {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public WebhookEndpointsEndpoints(MeteroidHttpClient client) {
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
     * List webhook endpoints
     *
     * @return the response body
     */
    public WebhookEndpointListResponse list() {
        return list(RequestOptions.none());
    }

    /**
     * List webhook endpoints
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookEndpointListResponse list(final RequestOptions requestOptions) {
        return exchangeList(requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookEndpointListResponse> exchangeList(
            final RequestOptions requestOptions) {
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/webhooks/endpoints").build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429")
                .options(requestOptions)
                .returning(WebhookEndpointListResponse.class);
    }

    /**
     * Create a webhook endpoint
     *
     * <p>The signing secret is returned once, in this response only.
     *
     * @param createWebhookEndpointRequest the request body
     * @return the response body
     */
    public CreatedWebhookEndpoint create(
            final CreateWebhookEndpointRequest createWebhookEndpointRequest) {
        return create(createWebhookEndpointRequest, RequestOptions.none());
    }

    /**
     * Create a webhook endpoint
     *
     * <p>The signing secret is returned once, in this response only.
     *
     * @param createWebhookEndpointRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public CreatedWebhookEndpoint create(
            final CreateWebhookEndpointRequest createWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(createWebhookEndpointRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreatedWebhookEndpoint> exchangeCreate(
            final CreateWebhookEndpointRequest createWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(createWebhookEndpointRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/webhooks/endpoints").build();
        return client.call("POST", url)
                .json(createWebhookEndpointRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "409", "429")
                .options(requestOptions)
                .returning(CreatedWebhookEndpoint.class);
    }

    /**
     * Get a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body
     */
    public WebhookEndpoint retrieve(final String endpointId) {
        return retrieve(endpointId, RequestOptions.none());
    }

    /**
     * Get a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookEndpoint retrieve(final String endpointId, final RequestOptions requestOptions) {
        return exchangeRetrieve(endpointId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookEndpoint> exchangeRetrieve(
            final String endpointId, final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookEndpoint.class);
    }

    /**
     * Delete a webhook endpoint
     *
     * <p>The endpoint is archived and its pending deliveries are cancelled.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     */
    public void delete(final String endpointId) {
        delete(endpointId, RequestOptions.none());
    }

    /**
     * Delete a webhook endpoint
     *
     * <p>The endpoint is archived and its pending deliveries are cancelled.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void delete(final String endpointId, final RequestOptions requestOptions) {
        exchangeDelete(endpointId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeDelete(
            final String endpointId, final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .build();
        return client.call("DELETE", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * Update a webhook endpoint
     *
     * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its consecutive
     * failure count.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param updateWebhookEndpointRequest the request body
     * @return the response body
     */
    public WebhookEndpoint update(
            final String endpointId,
            final UpdateWebhookEndpointRequest updateWebhookEndpointRequest) {
        return update(endpointId, updateWebhookEndpointRequest, RequestOptions.none());
    }

    /**
     * Update a webhook endpoint
     *
     * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its consecutive
     * failure count.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param updateWebhookEndpointRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookEndpoint update(
            final String endpointId,
            final UpdateWebhookEndpointRequest updateWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(endpointId, updateWebhookEndpointRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookEndpoint> exchangeUpdate(
            final String endpointId,
            final UpdateWebhookEndpointRequest updateWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        Objects.requireNonNull(updateWebhookEndpointRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .build();
        return client.call("PATCH", url)
                .json(updateWebhookEndpointRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookEndpoint.class);
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public WebhookEndpointsEndpointsListDeliveriesPage listDeliveries(final String endpointId) {
        return listDeliveries(
                endpointId,
                WebhookEndpointsEndpointsListDeliveriesOptions.none(),
                RequestOptions.none());
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public WebhookEndpointsEndpointsListDeliveriesPage listDeliveries(
            final String endpointId, final WebhookEndpointsEndpointsListDeliveriesOptions options) {
        return listDeliveries(endpointId, options, RequestOptions.none());
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public WebhookEndpointsEndpointsListDeliveriesPage listDeliveries(
            final String endpointId, final RequestOptions requestOptions) {
        return listDeliveries(
                endpointId, WebhookEndpointsEndpointsListDeliveriesOptions.none(), requestOptions);
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public WebhookEndpointsEndpointsListDeliveriesPage listDeliveries(
            final String endpointId,
            final WebhookEndpointsEndpointsListDeliveriesOptions options,
            final RequestOptions requestOptions) {
        return pageOfListDeliveries(
                exchangeListDeliveries(endpointId, options, requestOptions).send(),
                endpointId,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<WebhookDeliveryListResponse> exchangeListDeliveries(
            final String endpointId,
            final WebhookEndpointsEndpointsListDeliveriesOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .addPathSegments("deliveries");
        WebhookDeliveryStatus value1 = options.status().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("status", Utils.serializeQueryParam(value1));
        }
        Integer value2 = options.page().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value2));
        }
        Integer value3 = options.perPage().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value3));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookDeliveryListResponse.class);
    }

    private WebhookEndpointsEndpointsListDeliveriesPage pageOfListDeliveries(
            WebhookDeliveryListResponse response,
            final String endpointId,
            final WebhookEndpointsEndpointsListDeliveriesOptions options,
            final RequestOptions requestOptions) {
        List<WebhookDelivery> items = itemsOfListDeliveries(response);
        Integer next = nextOfListDeliveries(response, items, options.page().orElse(0));
        return new WebhookEndpointsEndpointsListDeliveriesPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                listDeliveries(
                                        endpointId,
                                        options.toBuilder().page(next).build(),
                                        requestOptions));
    }

    static List<WebhookDelivery> itemsOfListDeliveries(WebhookDeliveryListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfListDeliveries(
            WebhookDeliveryListResponse response, List<WebhookDelivery> items, Integer current) {
        if (items.isEmpty()) {
            return null;
        }
        long pages =
                Utils.optional(response.paginationMeta())
                        .flatMap(v2 -> Utils.optional(v2.totalPages()))
                        .map(Number::longValue)
                        .orElse(Long.MAX_VALUE);
        if (current - 0 + 1 >= pages) {
            return null;
        }
        return current + 1;
    }

    /**
     * Rotate a webhook endpoint secret
     *
     * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
     * roll over without dropping events.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body
     */
    public WebhookEndpointSecret rotateSecret(final String endpointId) {
        return rotateSecret(endpointId, RequestOptions.none());
    }

    /**
     * Rotate a webhook endpoint secret
     *
     * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
     * roll over without dropping events.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookEndpointSecret rotateSecret(
            final String endpointId, final RequestOptions requestOptions) {
        return exchangeRotateSecret(endpointId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookEndpointSecret> exchangeRotateSecret(
            final String endpointId, final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .addPathSegments("rotate-secret")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookEndpointSecret.class);
    }

    /**
     * Reveal a webhook endpoint secret
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body
     */
    public WebhookEndpointSecret retrieveSecret(final String endpointId) {
        return retrieveSecret(endpointId, RequestOptions.none());
    }

    /**
     * Reveal a webhook endpoint secret
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookEndpointSecret retrieveSecret(
            final String endpointId, final RequestOptions requestOptions) {
        return exchangeRetrieveSecret(endpointId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookEndpointSecret> exchangeRetrieveSecret(
            final String endpointId, final RequestOptions requestOptions) {
        Objects.requireNonNull(endpointId, "endpoint_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/endpoints")
                        .addPathSegment(Utils.pathSegment("endpoint_id", endpointId))
                        .addPathSegments("secret")
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookEndpointSecret.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List webhook endpoints
         *
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointListResponse> list() {
            return list(RequestOptions.none());
        }

        /**
         * List webhook endpoints
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointListResponse> list(final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this.exchangeList(requestOptions).sendRaw();
        }

        /**
         * Create a webhook endpoint
         *
         * <p>The signing secret is returned once, in this response only.
         *
         * @param createWebhookEndpointRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<CreatedWebhookEndpoint> create(
                final CreateWebhookEndpointRequest createWebhookEndpointRequest) {
            return create(createWebhookEndpointRequest, RequestOptions.none());
        }

        /**
         * Create a webhook endpoint
         *
         * <p>The signing secret is returned once, in this response only.
         *
         * @param createWebhookEndpointRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<CreatedWebhookEndpoint> create(
                final CreateWebhookEndpointRequest createWebhookEndpointRequest,
                final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeCreate(createWebhookEndpointRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Get a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpoint> retrieve(final String endpointId) {
            return retrieve(endpointId, RequestOptions.none());
        }

        /**
         * Get a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpoint> retrieve(
                final String endpointId, final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeRetrieve(endpointId, requestOptions)
                    .sendRaw();
        }

        /**
         * Delete a webhook endpoint
         *
         * <p>The endpoint is archived and its pending deliveries are cancelled.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> delete(final String endpointId) {
            return delete(endpointId, RequestOptions.none());
        }

        /**
         * Delete a webhook endpoint
         *
         * <p>The endpoint is archived and its pending deliveries are cancelled.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> delete(
                final String endpointId, final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeDelete(endpointId, requestOptions)
                    .sendRaw();
        }

        /**
         * Update a webhook endpoint
         *
         * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its
         * consecutive failure count.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param updateWebhookEndpointRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpoint> update(
                final String endpointId,
                final UpdateWebhookEndpointRequest updateWebhookEndpointRequest) {
            return update(endpointId, updateWebhookEndpointRequest, RequestOptions.none());
        }

        /**
         * Update a webhook endpoint
         *
         * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its
         * consecutive failure count.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param updateWebhookEndpointRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpoint> update(
                final String endpointId,
                final UpdateWebhookEndpointRequest updateWebhookEndpointRequest,
                final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeUpdate(endpointId, updateWebhookEndpointRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<WebhookEndpointsEndpointsListDeliveriesPage> listDeliveries(
                final String endpointId) {
            return listDeliveries(
                    endpointId,
                    WebhookEndpointsEndpointsListDeliveriesOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<WebhookEndpointsEndpointsListDeliveriesPage> listDeliveries(
                final String endpointId,
                final WebhookEndpointsEndpointsListDeliveriesOptions options) {
            return listDeliveries(endpointId, options, RequestOptions.none());
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<WebhookEndpointsEndpointsListDeliveriesPage> listDeliveries(
                final String endpointId, final RequestOptions requestOptions) {
            return listDeliveries(
                    endpointId,
                    WebhookEndpointsEndpointsListDeliveriesOptions.none(),
                    requestOptions);
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<WebhookEndpointsEndpointsListDeliveriesPage> listDeliveries(
                final String endpointId,
                final WebhookEndpointsEndpointsListDeliveriesOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<WebhookDeliveryListResponse> response =
                    exchangeListDeliveries(endpointId, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfListDeliveries(response.body(), endpointId, options, requestOptions));
        }

        /**
         * Rotate a webhook endpoint secret
         *
         * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
         * roll over without dropping events.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointSecret> rotateSecret(final String endpointId) {
            return rotateSecret(endpointId, RequestOptions.none());
        }

        /**
         * Rotate a webhook endpoint secret
         *
         * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
         * roll over without dropping events.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointSecret> rotateSecret(
                final String endpointId, final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeRotateSecret(endpointId, requestOptions)
                    .sendRaw();
        }

        /**
         * Reveal a webhook endpoint secret
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointSecret> retrieveSecret(final String endpointId) {
            return retrieveSecret(endpointId, RequestOptions.none());
        }

        /**
         * Reveal a webhook endpoint secret
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookEndpointSecret> retrieveSecret(
                final String endpointId, final RequestOptions requestOptions) {
            return WebhookEndpointsEndpoints.this
                    .exchangeRetrieveSecret(endpointId, requestOptions)
                    .sendRaw();
        }
    }
}
