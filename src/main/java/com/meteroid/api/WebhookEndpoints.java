// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.WebhookDelivery;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code webhook_endpoints} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class WebhookEndpoints {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final WebhookEndpointsEndpoints endpoints;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public WebhookEndpoints(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.endpoints = new WebhookEndpointsEndpoints(client);
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
    public WebhookEndpointsEndpoints endpoints() {
        return endpoints;
    }

    /**
     * Resend a webhook delivery
     *
     * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
     *
     * @param deliveryId the {@code delivery_id} path parameter
     * @return the response body
     */
    public WebhookDelivery resendWebhookDelivery(final String deliveryId) {
        return resendWebhookDelivery(deliveryId, RequestOptions.none());
    }

    /**
     * Resend a webhook delivery
     *
     * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
     *
     * @param deliveryId the {@code delivery_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public WebhookDelivery resendWebhookDelivery(
            final String deliveryId, final RequestOptions requestOptions) {
        return exchangeResendWebhookDelivery(deliveryId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WebhookDelivery> exchangeResendWebhookDelivery(
            final String deliveryId, final RequestOptions requestOptions) {
        Objects.requireNonNull(deliveryId, "delivery_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/webhooks/deliveries")
                        .addPathSegment(Utils.pathSegment("delivery_id", deliveryId))
                        .addPathSegments("resend")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(WebhookDelivery.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code endpoints} operations.
         *
         * @return the operations
         */
        public WebhookEndpointsEndpoints.WithRawResponse endpoints() {
            return WebhookEndpoints.this.endpoints.withRawResponse();
        }

        /**
         * Resend a webhook delivery
         *
         * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
         *
         * @param deliveryId the {@code delivery_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<WebhookDelivery> resendWebhookDelivery(final String deliveryId) {
            return resendWebhookDelivery(deliveryId, RequestOptions.none());
        }

        /**
         * Resend a webhook delivery
         *
         * <p>Re-queues the same event for the same endpoint. Fails if the endpoint is disabled.
         *
         * @param deliveryId the {@code delivery_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<WebhookDelivery> resendWebhookDelivery(
                final String deliveryId, final RequestOptions requestOptions) {
            return WebhookEndpoints.this
                    .exchangeResendWebhookDelivery(deliveryId, requestOptions)
                    .sendRaw();
        }
    }
}
