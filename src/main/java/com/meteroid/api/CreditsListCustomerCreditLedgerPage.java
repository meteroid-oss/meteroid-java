// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.LedgerEntry;
import com.meteroid.models.LedgerListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Credits#listCustomerCreditLedger}: the {@link LedgerEntry} items of one
 * response, and the properties of its body, {@link LedgerListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class CreditsListCustomerCreditLedgerPage
        extends Page<CreditsListCustomerCreditLedgerPage, LedgerEntry> {
    private final LedgerListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CreditsListCustomerCreditLedgerPage(
            LedgerListResponse body,
            List<LedgerEntry> items,
            Supplier<CreditsListCustomerCreditLedgerPage> next) {
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
        return "CreditsListCustomerCreditLedgerPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
