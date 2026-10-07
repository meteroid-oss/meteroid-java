// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.MetricListResponse;
import com.meteroid.models.MetricSummary;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link MetricsAsync#list}: the {@link MetricSummary} items of one response, and the
 * properties of its body, {@link MetricListResponse}.
 */
public final class MetricsListAsyncPage extends AsyncPage<MetricsListAsyncPage, MetricSummary> {
    private final MetricListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public MetricsListAsyncPage(
            MetricListResponse body,
            List<MetricSummary> items,
            Supplier<CompletableFuture<MetricsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public MetricListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<MetricSummary> data() {
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
        return "MetricsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
