// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.WebhookDelivery;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code webhook_endpoints} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class WebhookEndpointsAsync {
    private final WebhookEndpoints sync;
    private final WithRawResponse withRawResponse;

    private final WebhookEndpointsEndpointsAsync endpoints;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public WebhookEndpointsAsync(WebhookEndpoints sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.endpoints = new WebhookEndpointsEndpointsAsync(sync.endpoints());
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
     * The {@code endpoints} operations.
     *
     * @return the operations
     */
    public WebhookEndpointsEndpointsAsync endpoints() {
        return endpoints;
    }

    /**
     * Resend a webhook delivery
     *
     * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
     *
     * @param deliveryId the {@code delivery_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WebhookDelivery> resendWebhookDelivery(final String deliveryId) {
        return resendWebhookDelivery(deliveryId, RequestOptions.none());
    }

    /**
     * Resend a webhook delivery
     *
     * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
     *
     * @param deliveryId the {@code delivery_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WebhookDelivery> resendWebhookDelivery(
            final String deliveryId, final RequestOptions requestOptions) {
        return sync.exchangeResendWebhookDelivery(deliveryId, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code endpoints} operations.
         *
         * @return the operations
         */
        public WebhookEndpointsEndpointsAsync.WithRawResponse endpoints() {
            return WebhookEndpointsAsync.this.endpoints.withRawResponse();
        }

        /**
         * Resend a webhook delivery
         *
         * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
         *
         * @param deliveryId the {@code delivery_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookDelivery>> resendWebhookDelivery(
                final String deliveryId) {
            return resendWebhookDelivery(deliveryId, RequestOptions.none());
        }

        /**
         * Resend a webhook delivery
         *
         * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
         *
         * @param deliveryId the {@code delivery_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WebhookDelivery>> resendWebhookDelivery(
                final String deliveryId, final RequestOptions requestOptions) {
            return sync.exchangeResendWebhookDelivery(deliveryId, requestOptions).sendRawAsync();
        }
    }
}
