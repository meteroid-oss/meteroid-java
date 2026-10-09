// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.WebhookDelivery;
import com.meteroid.models.WebhookDeliveryListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link WebhookEndpointsEndpointsAsync#listDeliveries}: the {@link WebhookDelivery}
 * items of one response, and the properties of its body, {@link WebhookDeliveryListResponse}.
 */
public final class WebhookEndpointsEndpointsListDeliveriesAsyncPage
        extends AsyncPage<WebhookEndpointsEndpointsListDeliveriesAsyncPage, WebhookDelivery> {
    private final WebhookDeliveryListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public WebhookEndpointsEndpointsListDeliveriesAsyncPage(
            WebhookDeliveryListResponse body,
            List<WebhookDelivery> items,
            Supplier<CompletableFuture<WebhookEndpointsEndpointsListDeliveriesAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public WebhookDeliveryListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<WebhookDelivery> data() {
        return body.data();
    }

    /**
     * The {@code pagination_meta} property.
     *
     * @return the value, never null
     */
    public PaginationResponse paginationMeta() {
        return body.paginationMeta();
    }

    @Override
    public String toString() {
        return "WebhookEndpointsEndpointsListDeliveriesAsyncPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
