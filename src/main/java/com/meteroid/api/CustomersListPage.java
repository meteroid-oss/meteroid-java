// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.Customer;
import com.meteroid.models.CustomerListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Customers#list}: the {@link Customer} items of one response, and the properties
 * of its body, {@link CustomerListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class CustomersListPage extends Page<CustomersListPage, Customer> {
    private final CustomerListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CustomersListPage(
            CustomerListResponse body, List<Customer> items, Supplier<CustomersListPage> next) {
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
        return "CustomersListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
