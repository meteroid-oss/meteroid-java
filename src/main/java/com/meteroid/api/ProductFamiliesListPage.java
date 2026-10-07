// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.ProductFamily;
import com.meteroid.models.ProductFamilyListResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link ProductFamilies#list}: the {@link ProductFamily} items of one response, and the
 * properties of its body, {@link ProductFamilyListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class ProductFamiliesListPage extends Page<ProductFamiliesListPage, ProductFamily> {
    private final ProductFamilyListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public ProductFamiliesListPage(
            ProductFamilyListResponse body,
            List<ProductFamily> items,
            Supplier<ProductFamiliesListPage> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public ProductFamilyListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<ProductFamily> data() {
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
        return "ProductFamiliesListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
