// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.Customer;
import com.meteroid.models.CustomerListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CustomersAsync#list}: the {@link Customer} items of one response, and the
 * properties of its body, {@link CustomerListResponse}.
 */
public final class CustomersListAsyncPage extends AsyncPage<CustomersListAsyncPage, Customer> {
    private final CustomerListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CustomersListAsyncPage(
            CustomerListResponse body,
            List<Customer> items,
            Supplier<CompletableFuture<CustomersListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public CustomerListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Customer> data() {
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
        return "CustomersListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
