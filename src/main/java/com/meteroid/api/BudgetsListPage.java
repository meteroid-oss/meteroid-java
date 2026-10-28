// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.Budget;
import com.meteroid.models.BudgetListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Budgets#list}: the {@link Budget} items of one response, and the properties of
 * its body, {@link BudgetListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class BudgetsListPage extends Page<BudgetsListPage, Budget> {
    private final BudgetListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public BudgetsListPage(
            BudgetListResponse body, List<Budget> items, Supplier<BudgetsListPage> next) {
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
        return "BudgetsListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
