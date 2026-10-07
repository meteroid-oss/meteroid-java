// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.Coupon;
import com.meteroid.models.CouponListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CouponsAsync#list}: the {@link Coupon} items of one response, and the properties
 * of its body, {@link CouponListResponse}.
 */
public final class CouponsListAsyncPage extends AsyncPage<CouponsListAsyncPage, Coupon> {
    private final CouponListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CouponsListAsyncPage(
            CouponListResponse body,
            List<Coupon> items,
            Supplier<CompletableFuture<CouponsListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public CouponListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<Coupon> data() {
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
        return "CouponsListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
