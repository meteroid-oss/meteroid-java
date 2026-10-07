// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.PaginationResponse;
import com.meteroid.models.ProductFamily;
import com.meteroid.models.ProductFamilyListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link ProductFamiliesAsync#list}: the {@link ProductFamily} items of one response, and
 * the properties of its body, {@link ProductFamilyListResponse}.
 */
public final class ProductFamiliesListAsyncPage
        extends AsyncPage<ProductFamiliesListAsyncPage, ProductFamily> {
    private final ProductFamilyListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public ProductFamiliesListAsyncPage(
            ProductFamilyListResponse body,
            List<ProductFamily> items,
            Supplier<CompletableFuture<ProductFamiliesListAsyncPage>> next) {
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
        return "ProductFamiliesListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
