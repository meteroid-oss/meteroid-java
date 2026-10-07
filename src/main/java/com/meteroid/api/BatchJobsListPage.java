// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.BatchJobListResponse;
import com.meteroid.models.BatchJobResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link BatchJobs#list}: the {@link BatchJobResponse} items of one response, and the
 * properties of its body, {@link BatchJobListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class BatchJobsListPage extends Page<BatchJobsListPage, BatchJobResponse> {
    private final BatchJobListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public BatchJobsListPage(
            BatchJobListResponse body,
            List<BatchJobResponse> items,
            Supplier<BatchJobsListPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public BatchJobListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<BatchJobResponse> data() {
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
        return "BatchJobsListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
