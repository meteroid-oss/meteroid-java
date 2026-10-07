// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.Subscription;
import com.meteroid.models.SubscriptionListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link SubscriptionsAsync#list}: the {@link Subscription} items of one response, and
 * the properties of its body, {@link SubscriptionListResponse}.
 */
public final class SubscriptionsListAsyncPage
        extends AsyncPage<SubscriptionsListAsyncPage, Subscription> {
    private final SubscriptionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public SubscriptionsListAsyncPage(
            SubscriptionListResponse body,
            List<Subscription> items,
            Supplier<CompletableFuture<SubscriptionsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public SubscriptionListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Subscription> data() {
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
        return "SubscriptionsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
