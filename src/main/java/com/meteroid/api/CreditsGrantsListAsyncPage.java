// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.CreditGrant;
import com.meteroid.models.CreditGrantListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CreditsGrantsAsync#list}: the {@link CreditGrant} items of one response, and the
 * properties of its body, {@link CreditGrantListResponse}.
 */
public final class CreditsGrantsListAsyncPage
        extends AsyncPage<CreditsGrantsListAsyncPage, CreditGrant> {
    private final CreditGrantListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CreditsGrantsListAsyncPage(
            CreditGrantListResponse body,
            List<CreditGrant> items,
            Supplier<CompletableFuture<CreditsGrantsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public CreditGrantListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<CreditGrant> data() {
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
        return "CreditsGrantsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
