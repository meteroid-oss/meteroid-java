// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreditUnitPrice;
import com.meteroid.models.CreditUnitPriceListResponse;
import com.meteroid.models.CreditUnitPriceSetRequest;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code credit_units.prices} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class CreditUnitsPricesAsync {
    private final CreditUnitsPrices sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public CreditUnitsPricesAsync(CreditUnitsPrices sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();
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
     * List a credit unit's selling prices
     *
     * <p>The active price per currency, and archived ones when asked, newest first.
     *
     * @param id the {@code id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPriceListResponse> list(final String id) {
        return list(id, CreditUnitsPricesListOptions.none(), RequestOptions.none());
    }

    /**
     * List a credit unit's selling prices
     *
     * <p>The active price per currency, and archived ones when asked, newest first.
     *
     * @param id the {@code id} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPriceListResponse> list(
            final String id, final CreditUnitsPricesListOptions options) {
        return list(id, options, RequestOptions.none());
    }

    /**
     * List a credit unit's selling prices
     *
     * <p>The active price per currency, and archived ones when asked, newest first.
     *
     * @param id the {@code id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPriceListResponse> list(
            final String id, final RequestOptions requestOptions) {
        return list(id, CreditUnitsPricesListOptions.none(), requestOptions);
    }

    /**
     * List a credit unit's selling prices
     *
     * <p>The active price per currency, and archived ones when asked, newest first.
     *
     * @param id the {@code id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPriceListResponse> list(
            final String id,
            final CreditUnitsPricesListOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeList(id, options, requestOptions).sendAsync();
    }

    /**
     * Set a credit unit's selling price
     *
     * <p>The price of one credit in a currency, used to sell the unit through top-ups and automatic
     * top-ups (taxed at purchase under the unit's <code>product_id</code>). Replaces the active
     * price in that currency, which is archived: a top-up already priced keeps its terms.
     *
     * @param id the {@code id} path parameter
     * @param currency the {@code currency} path parameter
     * @param creditUnitPriceSetRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPrice> update(
            final String id,
            final String currency,
            final CreditUnitPriceSetRequest creditUnitPriceSetRequest) {
        return update(id, currency, creditUnitPriceSetRequest, RequestOptions.none());
    }

    /**
     * Set a credit unit's selling price
     *
     * <p>The price of one credit in a currency, used to sell the unit through top-ups and automatic
     * top-ups (taxed at purchase under the unit's <code>product_id</code>). Replaces the active
     * price in that currency, which is archived: a top-up already priced keeps its terms.
     *
     * @param id the {@code id} path parameter
     * @param currency the {@code currency} path parameter
     * @param creditUnitPriceSetRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPrice> update(
            final String id,
            final String currency,
            final CreditUnitPriceSetRequest creditUnitPriceSetRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(id, currency, creditUnitPriceSetRequest, requestOptions)
                .sendAsync();
    }

    /**
     * Remove a credit unit's selling price
     *
     * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups and
     * automatic top-ups included) until a new price is set.
     *
     * @param id the {@code id} path parameter
     * @param currency the {@code currency} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPrice> archive(final String id, final String currency) {
        return archive(id, currency, RequestOptions.none());
    }

    /**
     * Remove a credit unit's selling price
     *
     * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups and
     * automatic top-ups included) until a new price is set.
     *
     * @param id the {@code id} path parameter
     * @param currency the {@code currency} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<CreditUnitPrice> archive(
            final String id, final String currency, final RequestOptions requestOptions) {
        return sync.exchangeArchive(id, currency, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List a credit unit's selling prices
         *
         * <p>The active price per currency, and archived ones when asked, newest first.
         *
         * @param id the {@code id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPriceListResponse>> list(final String id) {
            return list(id, CreditUnitsPricesListOptions.none(), RequestOptions.none());
        }

        /**
         * List a credit unit's selling prices
         *
         * <p>The active price per currency, and archived ones when asked, newest first.
         *
         * @param id the {@code id} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPriceListResponse>> list(
                final String id, final CreditUnitsPricesListOptions options) {
            return list(id, options, RequestOptions.none());
        }

        /**
         * List a credit unit's selling prices
         *
         * <p>The active price per currency, and archived ones when asked, newest first.
         *
         * @param id the {@code id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPriceListResponse>> list(
                final String id, final RequestOptions requestOptions) {
            return list(id, CreditUnitsPricesListOptions.none(), requestOptions);
        }

        /**
         * List a credit unit's selling prices
         *
         * <p>The active price per currency, and archived ones when asked, newest first.
         *
         * @param id the {@code id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPriceListResponse>> list(
                final String id,
                final CreditUnitsPricesListOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeList(id, options, requestOptions).sendRawAsync();
        }

        /**
         * Set a credit unit's selling price
         *
         * <p>The price of one credit in a currency, used to sell the unit through top-ups and
         * automatic top-ups (taxed at purchase under the unit's <code>product_id</code>). Replaces
         * the active price in that currency, which is archived: a top-up already priced keeps its
         * terms.
         *
         * @param id the {@code id} path parameter
         * @param currency the {@code currency} path parameter
         * @param creditUnitPriceSetRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPrice>> update(
                final String id,
                final String currency,
                final CreditUnitPriceSetRequest creditUnitPriceSetRequest) {
            return update(id, currency, creditUnitPriceSetRequest, RequestOptions.none());
        }

        /**
         * Set a credit unit's selling price
         *
         * <p>The price of one credit in a currency, used to sell the unit through top-ups and
         * automatic top-ups (taxed at purchase under the unit's <code>product_id</code>). Replaces
         * the active price in that currency, which is archived: a top-up already priced keeps its
         * terms.
         *
         * @param id the {@code id} path parameter
         * @param currency the {@code currency} path parameter
         * @param creditUnitPriceSetRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPrice>> update(
                final String id,
                final String currency,
                final CreditUnitPriceSetRequest creditUnitPriceSetRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(id, currency, creditUnitPriceSetRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Remove a credit unit's selling price
         *
         * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups
         * and automatic top-ups included) until a new price is set.
         *
         * @param id the {@code id} path parameter
         * @param currency the {@code currency} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPrice>> archive(
                final String id, final String currency) {
            return archive(id, currency, RequestOptions.none());
        }

        /**
         * Remove a credit unit's selling price
         *
         * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups
         * and automatic top-ups included) until a new price is set.
         *
         * @param id the {@code id} path parameter
         * @param currency the {@code currency} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditUnitPrice>> archive(
                final String id, final String currency, final RequestOptions requestOptions) {
            return sync.exchangeArchive(id, currency, requestOptions).sendRawAsync();
        }
    }
}
