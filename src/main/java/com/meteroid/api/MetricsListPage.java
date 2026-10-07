// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.MetricListResponse;
import com.meteroid.models.MetricSummary;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Metrics#list}: the {@link MetricSummary} items of one response, and the
 * properties of its body, {@link MetricListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class MetricsListPage extends Page<MetricsListPage, MetricSummary> {
    private final MetricListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public MetricsListPage(
            MetricListResponse body, List<MetricSummary> items, Supplier<MetricsListPage> next) {
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
        return "MetricsListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
