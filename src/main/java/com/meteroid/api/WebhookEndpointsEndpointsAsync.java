// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateWebhookEndpointRequest;
import com.meteroid.models.CreatedWebhookEndpoint;
import com.meteroid.models.UpdateWebhookEndpointRequest;
import com.meteroid.models.WebhookDelivery;
import com.meteroid.models.WebhookDeliveryListResponse;
import com.meteroid.models.WebhookEndpoint;
import com.meteroid.models.WebhookEndpointListResponse;
import com.meteroid.models.WebhookEndpointSecret;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code webhook_endpoints.endpoints} operations, without blocking: each method returns a
 * {@link CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class WebhookEndpointsEndpointsAsync {
    private final WebhookEndpointsEndpoints sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public WebhookEndpointsEndpointsAsync(WebhookEndpointsEndpoints sync) {
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
     * List webhook endpoints
     *
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointListResponse> list() {
        return list(RequestOptions.none());
    }

    /**
     * List webhook endpoints
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointListResponse> list(
            final RequestOptions requestOptions) {
        return sync.exchangeList(requestOptions).sendAsync();
    }

    /**
     * Create a webhook endpoint
     *
     * <p>The signing secret is returned once, in this response only.
     *
     * @param createWebhookEndpointRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<CreatedWebhookEndpoint> create(
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
     * @return the response body, once received
     */
    public CompletableFuture<CreatedWebhookEndpoint> create(
            final CreateWebhookEndpointRequest createWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(createWebhookEndpointRequest, requestOptions).sendAsync();
    }

    /**
     * Get a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpoint> retrieve(final String endpointId) {
        return retrieve(endpointId, RequestOptions.none());
    }

    /**
     * Get a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpoint> retrieve(
            final String endpointId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(endpointId, requestOptions).sendAsync();
    }

    /**
     * Delete a webhook endpoint
     *
     * <p>The endpoint is archived and its pending deliveries are cancelled.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> delete(final String endpointId) {
        return delete(endpointId, RequestOptions.none());
    }

    /**
     * Delete a webhook endpoint
     *
     * <p>The endpoint is archived and its pending deliveries are cancelled.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> delete(
            final String endpointId, final RequestOptions requestOptions) {
        return sync.exchangeDelete(endpointId, requestOptions).sendAsync();
    }

    /**
     * Update a webhook endpoint
     *
     * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its consecutive
     * failure count.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param updateWebhookEndpointRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpoint> update(
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
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpoint> update(
            final String endpointId,
            final UpdateWebhookEndpointRequest updateWebhookEndpointRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(endpointId, updateWebhookEndpointRequest, requestOptions)
                .sendAsync();
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the page, once received
     */
    public CompletableFuture<WebhookEndpointsEndpointsListDeliveriesAsyncPage> listDeliveries(
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
     * @return the page, once received
     */
    public CompletableFuture<WebhookEndpointsEndpointsListDeliveriesAsyncPage> listDeliveries(
            final String endpointId, final WebhookEndpointsEndpointsListDeliveriesOptions options) {
        return listDeliveries(endpointId, options, RequestOptions.none());
    }

    /**
     * List deliveries for a webhook endpoint
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<WebhookEndpointsEndpointsListDeliveriesAsyncPage> listDeliveries(
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
     * @return the page, once received
     */
    public CompletableFuture<WebhookEndpointsEndpointsListDeliveriesAsyncPage> listDeliveries(
            final String endpointId,
            final WebhookEndpointsEndpointsListDeliveriesOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListDeliveries(endpointId, options, requestOptions)
                .sendAsync()
                .thenApply(
                        response ->
                                pageOfListDeliveries(
                                        response, endpointId, options, requestOptions));
    }

    private WebhookEndpointsEndpointsListDeliveriesAsyncPage pageOfListDeliveries(
            WebhookDeliveryListResponse response,
            final String endpointId,
            final WebhookEndpointsEndpointsListDeliveriesOptions options,
            final RequestOptions requestOptions) {
        List<WebhookDelivery> items = WebhookEndpointsEndpoints.itemsOfListDeliveries(response);
        Integer next =
                WebhookEndpointsEndpoints.nextOfListDeliveries(
                        response, items, options.page().orElse(0));
        return new WebhookEndpointsEndpointsListDeliveriesAsyncPage(
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

    /**
     * Rotate a webhook endpoint secret
     *
     * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
     * roll over without dropping events.
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointSecret> rotateSecret(final String endpointId) {
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
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointSecret> rotateSecret(
            final String endpointId, final RequestOptions requestOptions) {
        return sync.exchangeRotateSecret(endpointId, requestOptions).sendAsync();
    }

    /**
     * Reveal a webhook endpoint secret
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointSecret> retrieveSecret(final String endpointId) {
        return retrieveSecret(endpointId, RequestOptions.none());
    }

    /**
     * Reveal a webhook endpoint secret
     *
     * @param endpointId the {@code endpoint_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WebhookEndpointSecret> retrieveSecret(
            final String endpointId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieveSecret(endpointId, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List webhook endpoints
         *
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointListResponse>> list() {
            return list(RequestOptions.none());
        }

        /**
         * List webhook endpoints
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointListResponse>> list(
                final RequestOptions requestOptions) {
            return sync.exchangeList(requestOptions).sendRawAsync();
        }

        /**
         * Create a webhook endpoint
         *
         * <p>The signing secret is returned once, in this response only.
         *
         * @param createWebhookEndpointRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreatedWebhookEndpoint>> create(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreatedWebhookEndpoint>> create(
                final CreateWebhookEndpointRequest createWebhookEndpointRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(createWebhookEndpointRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpoint>> retrieve(final String endpointId) {
            return retrieve(endpointId, RequestOptions.none());
        }

        /**
         * Get a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpoint>> retrieve(
                final String endpointId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(endpointId, requestOptions).sendRawAsync();
        }

        /**
         * Delete a webhook endpoint
         *
         * <p>The endpoint is archived and its pending deliveries are cancelled.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> delete(final String endpointId) {
            return delete(endpointId, RequestOptions.none());
        }

        /**
         * Delete a webhook endpoint
         *
         * <p>The endpoint is archived and its pending deliveries are cancelled.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> delete(
                final String endpointId, final RequestOptions requestOptions) {
            return sync.exchangeDelete(endpointId, requestOptions).sendRawAsync();
        }

        /**
         * Update a webhook endpoint
         *
         * <p>Omitted fields are left untouched. Re-enabling a disabled endpoint resets its
         * consecutive failure count.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param updateWebhookEndpointRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpoint>> update(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpoint>> update(
                final String endpointId,
                final UpdateWebhookEndpointRequest updateWebhookEndpointRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(endpointId, updateWebhookEndpointRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointsEndpointsListDeliveriesAsyncPage>>
                listDeliveries(final String endpointId) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointsEndpointsListDeliveriesAsyncPage>>
                listDeliveries(
                        final String endpointId,
                        final WebhookEndpointsEndpointsListDeliveriesOptions options) {
            return listDeliveries(endpointId, options, RequestOptions.none());
        }

        /**
         * List deliveries for a webhook endpoint
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointsEndpointsListDeliveriesAsyncPage>>
                listDeliveries(final String endpointId, final RequestOptions requestOptions) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointsEndpointsListDeliveriesAsyncPage>>
                listDeliveries(
                        final String endpointId,
                        final WebhookEndpointsEndpointsListDeliveriesOptions options,
                        final RequestOptions requestOptions) {
            return sync.exchangeListDeliveries(endpointId, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfListDeliveries(
                                                    response.body(),
                                                    endpointId,
                                                    options,
                                                    requestOptions)));
        }

        /**
         * Rotate a webhook endpoint secret
         *
         * <p>The previous secret keeps signing alongside the new one for 24 hours, so consumers can
         * roll over without dropping events.
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointSecret>> rotateSecret(
                final String endpointId) {
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointSecret>> rotateSecret(
                final String endpointId, final RequestOptions requestOptions) {
            return sync.exchangeRotateSecret(endpointId, requestOptions).sendRawAsync();
        }

        /**
         * Reveal a webhook endpoint secret
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointSecret>> retrieveSecret(
                final String endpointId) {
            return retrieveSecret(endpointId, RequestOptions.none());
        }

        /**
         * Reveal a webhook endpoint secret
         *
         * @param endpointId the {@code endpoint_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookEndpointSecret>> retrieveSecret(
                final String endpointId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieveSecret(endpointId, requestOptions).sendRawAsync();
        }
    }
}
