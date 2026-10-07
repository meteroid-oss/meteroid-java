// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.Subscription;
import com.meteroid.models.SubscriptionListResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Subscriptions#list}: the {@link Subscription} items of one response, and the
 * properties of its body, {@link SubscriptionListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class SubscriptionsListPage extends Page<SubscriptionsListPage, Subscription> {
    private final SubscriptionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public SubscriptionsListPage(
            SubscriptionListResponse body,
            List<Subscription> items,
            Supplier<SubscriptionsListPage> next) {
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
        return "SubscriptionsListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
