// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.AddOn;
import com.meteroid.models.AddOnListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link AddOns#list}: the {@link AddOn} items of one response, and the properties of its
 * body, {@link AddOnListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class AddOnsListPage extends Page<AddOnsListPage, AddOn> {
    private final AddOnListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public AddOnsListPage(
            AddOnListResponse body, List<AddOn> items, Supplier<AddOnsListPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public AddOnListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<AddOn> data() {
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
        return "AddOnsListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
