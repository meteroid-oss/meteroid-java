// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.BatchJobFailuresResponse;
import com.meteroid.models.BatchJobItemFailureResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link BatchJobs#listFailures}: the {@link BatchJobItemFailureResponse} items of one
 * response, and the properties of its body, {@link BatchJobFailuresResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class BatchJobsListFailuresPage
        extends Page<BatchJobsListFailuresPage, BatchJobItemFailureResponse> {
    private final BatchJobFailuresResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public BatchJobsListFailuresPage(
            BatchJobFailuresResponse body,
            List<BatchJobItemFailureResponse> items,
            Supplier<BatchJobsListFailuresPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public BatchJobFailuresResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<BatchJobItemFailureResponse> data() {
        return body.data();
    }

    /**
     * The {@code total_count} property.
     *
     * @return the value, never null
     */
    public Long totalCount() {
        return body.totalCount();
    }

    @Override
    public String toString() {
        return "BatchJobsListFailuresPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
