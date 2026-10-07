// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.Invoice;
import com.meteroid.models.InvoiceListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link InvoicesAsync#list}: the {@link Invoice} items of one response, and the
 * properties of its body, {@link InvoiceListResponse}.
 */
public final class InvoicesListAsyncPage extends AsyncPage<InvoicesListAsyncPage, Invoice> {
    private final InvoiceListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public InvoicesListAsyncPage(
            InvoiceListResponse body,
            List<Invoice> items,
            Supplier<CompletableFuture<InvoicesListAsyncPage>> next) {
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
        return "InvoicesListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
