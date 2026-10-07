// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.PlanVersionListResponse;
import com.meteroid.models.PlanVersionSummary;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Plans#listVersions}: the {@link PlanVersionSummary} items of one response, and
 * the properties of its body, {@link PlanVersionListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class PlansListVersionsPage extends Page<PlansListVersionsPage, PlanVersionSummary> {
    private final PlanVersionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public PlansListVersionsPage(
            PlanVersionListResponse body,
            List<PlanVersionSummary> items,
            Supplier<PlansListVersionsPage> next) {
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
        return "PlansListVersionsPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
