// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.Feature;
import com.meteroid.models.FeatureListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link Features#list}: the {@link Feature} items of one response, and the properties of
 * its body, {@link FeatureListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class FeaturesListPage extends Page<FeaturesListPage, Feature> {
    private final FeatureListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public FeaturesListPage(
            FeatureListResponse body, List<Feature> items, Supplier<FeaturesListPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public FeatureListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Feature> data() {
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
        return "FeaturesListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
