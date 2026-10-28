// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.Budget;
import com.meteroid.models.BudgetListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link BudgetsAsync#list}: the {@link Budget} items of one response, and the properties
 * of its body, {@link BudgetListResponse}.
 */
public final class BudgetsListAsyncPage extends AsyncPage<BudgetsListAsyncPage, Budget> {
    private final BudgetListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public BudgetsListAsyncPage(
            BudgetListResponse body,
            List<Budget> items,
            Supplier<CompletableFuture<BudgetsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public BudgetListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Budget> data() {
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
        return "BudgetsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
