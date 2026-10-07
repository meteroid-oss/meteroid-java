// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.BatchJobFailuresResponse;
import com.meteroid.models.BatchJobItemFailureResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link BatchJobsAsync#listFailures}: the {@link BatchJobItemFailureResponse} items of
 * one response, and the properties of its body, {@link BatchJobFailuresResponse}.
 */
public final class BatchJobsListFailuresAsyncPage
        extends AsyncPage<BatchJobsListFailuresAsyncPage, BatchJobItemFailureResponse> {
    private final BatchJobFailuresResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public BatchJobsListFailuresAsyncPage(
            BatchJobFailuresResponse body,
            List<BatchJobItemFailureResponse> items,
            Supplier<CompletableFuture<BatchJobsListFailuresAsyncPage>> next) {
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
        return "BatchJobsListFailuresAsyncPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
