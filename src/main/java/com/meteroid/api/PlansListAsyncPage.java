// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.Plan;
import com.meteroid.models.PlanListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link PlansAsync#list}: the {@link Plan} items of one response, and the properties of
 * its body, {@link PlanListResponse}.
 */
public final class PlansListAsyncPage extends AsyncPage<PlansListAsyncPage, Plan> {
    private final PlanListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public PlansListAsyncPage(
            PlanListResponse body,
            List<Plan> items,
            Supplier<CompletableFuture<PlansListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public PlanListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Plan> data() {
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
        return "PlansListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
