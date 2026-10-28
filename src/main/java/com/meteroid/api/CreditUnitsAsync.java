// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreditUnit;
import com.meteroid.models.CreditUnitCreateRequest;
import com.meteroid.models.CreditUnitListResponse;
import com.meteroid.models.CreditUnitUpdateRequest;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code credit_units} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class CreditUnitsAsync {
    private final CreditUnits sync;
    private final WithRawResponse withRawResponse;

    private final CreditUnitsPricesAsync prices;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public CreditUnitsAsync(CreditUnits sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.prices = new CreditUnitsPricesAsync(sync.prices());
    }

    /**
     * The same operations, returning the status and headers along with the body.
     *
     * @return the operations
     */
    public WithRawResponse withRawResponse() {
        return withRawResponse;
    }

    /**
     * The {@code prices} operations.
     *
     * @return the operations
     */
    public CreditUnitsPricesAsync prices() {
        return prices;
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitListResponse> list() {
        return list(CreditUnitsListOptions.none(), RequestOptions.none());
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitListResponse> list(final CreditUnitsListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitListResponse> list(final RequestOptions requestOptions) {
        return list(CreditUnitsListOptions.none(), requestOptions);
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitListResponse> list(
            final CreditUnitsListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions).sendAsync();
    }

    /**
     * Create a credit unit <code>code</code> and <code>precision</code> are immutable once created.
     * Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it with a credit
     * pack or a credit grant, and sell it with a top-up once it has a <code>product_id</code> and a
     * selling price.
     *
     * @param creditUnitCreateRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> create(
            final CreditUnitCreateRequest creditUnitCreateRequest) {
        return create(creditUnitCreateRequest, RequestOptions.none());
    }

    /**
     * Create a credit unit <code>code</code> and <code>precision</code> are immutable once created.
     * Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it with a credit
     * pack or a credit grant, and sell it with a top-up once it has a <code>product_id</code> and a
     * selling price.
     *
     * @param creditUnitCreateRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> create(
            final CreditUnitCreateRequest creditUnitCreateRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(creditUnitCreateRequest, requestOptions).sendAsync();
    }

    /**
     * Get a credit unit
     *
     * <p>The unit with its active selling prices.
     *
     * @param id the {@code id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> retrieve(final String id) {
        return retrieve(id, RequestOptions.none());
    }

    /**
     * Get a credit unit
     *
     * <p>The unit with its active selling prices.
     *
     * @param id the {@code id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> retrieve(
            final String id, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(id, requestOptions).sendAsync();
    }

    /**
     * Update a credit unit
     *
     * <p>Partial update: an absent field is left unchanged. <code>code</code> and <code>precision
     * </code> are immutable and cannot be changed here. Setting <code>archived: true</code> blocks
     * the unit from new prices, packs and grants; existing ones keep working.
     *
     * @param id the {@code id} path parameter
     * @param creditUnitUpdateRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> update(
            final String id, final CreditUnitUpdateRequest creditUnitUpdateRequest) {
        return update(id, creditUnitUpdateRequest, RequestOptions.none());
    }

    /**
     * Update a credit unit
     *
     * <p>Partial update: an absent field is left unchanged. <code>code</code> and <code>precision
     * </code> are immutable and cannot be changed here. Setting <code>archived: true</code> blocks
     * the unit from new prices, packs and grants; existing ones keep working.
     *
     * @param id the {@code id} path parameter
     * @param creditUnitUpdateRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnit> update(
            final String id,
            final CreditUnitUpdateRequest creditUnitUpdateRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(id, creditUnitUpdateRequest, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code prices} operations.
         *
         * @return the operations
         */
        public CreditUnitsPricesAsync.WithRawResponse prices() {
            return CreditUnitsAsync.this.prices.withRawResponse();
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitListResponse>> list() {
            return list(CreditUnitsListOptions.none(), RequestOptions.none());
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitListResponse>> list(
                final CreditUnitsListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitListResponse>> list(
                final RequestOptions requestOptions) {
            return list(CreditUnitsListOptions.none(), requestOptions);
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitListResponse>> list(
                final CreditUnitsListOptions options, final RequestOptions requestOptions) {
            return sync.exchangeList(options, requestOptions).sendRawAsync();
        }

        /**
         * Create a credit unit <code>code</code> and <code>precision</code> are immutable once
         * created. Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it
         * with a credit pack or a credit grant, and sell it with a top-up once it has a <code>
         * product_id</code> and a selling price.
         *
         * @param creditUnitCreateRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> create(
                final CreditUnitCreateRequest creditUnitCreateRequest) {
            return create(creditUnitCreateRequest, RequestOptions.none());
        }

        /**
         * Create a credit unit <code>code</code> and <code>precision</code> are immutable once
         * created. Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it
         * with a credit pack or a credit grant, and sell it with a top-up once it has a <code>
         * product_id</code> and a selling price.
         *
         * @param creditUnitCreateRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> create(
                final CreditUnitCreateRequest creditUnitCreateRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(creditUnitCreateRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get a credit unit
         *
         * <p>The unit with its active selling prices.
         *
         * @param id the {@code id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> retrieve(final String id) {
            return retrieve(id, RequestOptions.none());
        }

        /**
         * Get a credit unit
         *
         * <p>The unit with its active selling prices.
         *
         * @param id the {@code id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> retrieve(
                final String id, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(id, requestOptions).sendRawAsync();
        }

        /**
         * Update a credit unit
         *
         * <p>Partial update: an absent field is left unchanged. <code>code</code> and <code>
         * precision</code> are immutable and cannot be changed here. Setting <code>archived: true
         * </code> blocks the unit from new prices, packs and grants; existing ones keep working.
         *
         * @param id the {@code id} path parameter
         * @param creditUnitUpdateRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> update(
                final String id, final CreditUnitUpdateRequest creditUnitUpdateRequest) {
            return update(id, creditUnitUpdateRequest, RequestOptions.none());
        }

        /**
         * Update a credit unit
         *
         * <p>Partial update: an absent field is left unchanged. <code>code</code> and <code>
         * precision</code> are immutable and cannot be changed here. Setting <code>archived: true
         * </code> blocks the unit from new prices, packs and grants; existing ones keep working.
         *
         * @param id the {@code id} path parameter
         * @param creditUnitUpdateRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnit>> update(
                final String id,
                final CreditUnitUpdateRequest creditUnitUpdateRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(id, creditUnitUpdateRequest, requestOptions).sendRawAsync();
        }
    }
}
