// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.PlanVersionListResponse;
import com.meteroid.models.PlanVersionSummary;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link PlansVersionsAsync#list}: the {@link PlanVersionSummary} items of one response,
 * and the properties of its body, {@link PlanVersionListResponse}.
 */
public final class PlansVersionsListAsyncPage
        extends AsyncPage<PlansVersionsListAsyncPage, PlanVersionSummary> {
    private final PlanVersionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public PlansVersionsListAsyncPage(
            PlanVersionListResponse body,
            List<PlanVersionSummary> items,
            Supplier<CompletableFuture<PlansVersionsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public PlanVersionListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<PlanVersionSummary> data() {
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
        return "PlansVersionsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
