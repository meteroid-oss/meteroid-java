// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.LedgerEntry;
import com.meteroid.models.LedgerListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CreditsAsync#listCustomerCreditLedger}: the {@link LedgerEntry} items of one
 * response, and the properties of its body, {@link LedgerListResponse}.
 */
public final class CreditsListCustomerCreditLedgerAsyncPage
        extends AsyncPage<CreditsListCustomerCreditLedgerAsyncPage, LedgerEntry> {
    private final LedgerListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CreditsListCustomerCreditLedgerAsyncPage(
            LedgerListResponse body,
            List<LedgerEntry> items,
            Supplier<CompletableFuture<CreditsListCustomerCreditLedgerAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public LedgerListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<LedgerEntry> data() {
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
        return "CreditsListCustomerCreditLedgerAsyncPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
