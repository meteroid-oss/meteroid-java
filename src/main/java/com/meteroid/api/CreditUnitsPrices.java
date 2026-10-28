// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreditUnitPrice;
import com.meteroid.models.CreditUnitPriceListResponse;
import com.meteroid.models.CreditUnitPriceSetRequest;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code credit_units.prices} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class CreditUnitsPrices {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public CreditUnitsPrices(MeteroidHttpClient client) {
        this.client = client;
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
     * @return the response body
     */
    public CreditUnitPriceListResponse list(final String id) {
        return list(id, CreditUnitsPricesListOptions.none(), RequestOptions.none());
    }

    /**
     * List a credit unit's selling prices
     *
     * <p>The active price per currency, and archived ones when asked, newest first.
     *
     * @param id the {@code id} path parameter
     * @param options the optional parameters
     * @return the response body
     */
    public CreditUnitPriceListResponse list(
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
     * @return the response body
     */
    public CreditUnitPriceListResponse list(final String id, final RequestOptions requestOptions) {
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
     * @return the response body
     */
    public CreditUnitPriceListResponse list(
            final String id,
            final CreditUnitsPricesListOptions options,
            final RequestOptions requestOptions) {
        return exchangeList(id, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnitPriceListResponse> exchangeList(
            final String id,
            final CreditUnitsPricesListOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/credit-units")
                        .addPathSegment(Utils.pathSegment("id", id))
                        .addPathSegments("prices");
        Boolean value1 = options.includeArchived().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("include_archived", Utils.serializeQueryParam(value1));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(CreditUnitPriceListResponse.class);
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
     * @return the response body
     */
    public CreditUnitPrice update(
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
     * @return the response body
     */
    public CreditUnitPrice update(
            final String id,
            final String currency,
            final CreditUnitPriceSetRequest creditUnitPriceSetRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(id, currency, creditUnitPriceSetRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnitPrice> exchangeUpdate(
            final String id,
            final String currency,
            final CreditUnitPriceSetRequest creditUnitPriceSetRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(currency, "currency");
        Objects.requireNonNull(creditUnitPriceSetRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/credit-units")
                        .addPathSegment(Utils.pathSegment("id", id))
                        .addPathSegments("prices")
                        .addPathSegment(Utils.pathSegment("currency", currency))
                        .build();
        return client.call("PUT", url)
                .json(creditUnitPriceSetRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(CreditUnitPrice.class);
    }

    /**
     * Remove a credit unit's selling price
     *
     * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups and
     * automatic top-ups included) until a new price is set.
     *
     * @param id the {@code id} path parameter
     * @param currency the {@code currency} path parameter
     * @return the response body
     */
    public CreditUnitPrice archive(final String id, final String currency) {
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
     * @return the response body
     */
    public CreditUnitPrice archive(
            final String id, final String currency, final RequestOptions requestOptions) {
        return exchangeArchive(id, currency, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnitPrice> exchangeArchive(
            final String id, final String currency, final RequestOptions requestOptions) {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(currency, "currency");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/credit-units")
                        .addPathSegment(Utils.pathSegment("id", id))
                        .addPathSegments("prices")
                        .addPathSegment(Utils.pathSegment("currency", currency))
                        .build();
        return client.call("DELETE", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(CreditUnitPrice.class);
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPriceListResponse> list(final String id) {
            return list(id, CreditUnitsPricesListOptions.none(), RequestOptions.none());
        }

        /**
         * List a credit unit's selling prices
         *
         * <p>The active price per currency, and archived ones when asked, newest first.
         *
         * @param id the {@code id} path parameter
         * @param options the optional parameters
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPriceListResponse> list(
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPriceListResponse> list(
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPriceListResponse> list(
                final String id,
                final CreditUnitsPricesListOptions options,
                final RequestOptions requestOptions) {
            return CreditUnitsPrices.this.exchangeList(id, options, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPrice> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPrice> update(
                final String id,
                final String currency,
                final CreditUnitPriceSetRequest creditUnitPriceSetRequest,
                final RequestOptions requestOptions) {
            return CreditUnitsPrices.this
                    .exchangeUpdate(id, currency, creditUnitPriceSetRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Remove a credit unit's selling price
         *
         * <p>Archives the active price in a currency: the unit can no longer be sold in it (top-ups
         * and automatic top-ups included) until a new price is set.
         *
         * @param id the {@code id} path parameter
         * @param currency the {@code currency} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPrice> archive(final String id, final String currency) {
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitPrice> archive(
                final String id, final String currency, final RequestOptions requestOptions) {
            return CreditUnitsPrices.this.exchangeArchive(id, currency, requestOptions).sendRaw();
        }
    }
}
