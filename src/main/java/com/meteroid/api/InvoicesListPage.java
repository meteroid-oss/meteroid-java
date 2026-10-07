// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.Invoice;
import com.meteroid.models.InvoiceListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Invoices#list}: the {@link Invoice} items of one response, and the properties of
 * its body, {@link InvoiceListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class InvoicesListPage extends Page<InvoicesListPage, Invoice> {
    private final InvoiceListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public InvoicesListPage(
            InvoiceListResponse body, List<Invoice> items, Supplier<InvoicesListPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public InvoiceListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Invoice> data() {
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
        return "InvoicesListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
