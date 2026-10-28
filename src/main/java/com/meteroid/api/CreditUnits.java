// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreditUnit;
import com.meteroid.models.CreditUnitCreateRequest;
import com.meteroid.models.CreditUnitListResponse;
import com.meteroid.models.CreditUnitUpdateRequest;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code credit_units} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class CreditUnits {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final CreditUnitsPrices prices;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public CreditUnits(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.prices = new CreditUnitsPrices(client);
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
    public CreditUnitsPrices prices() {
        return prices;
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @return the response body
     */
    public CreditUnitListResponse list() {
        return list(CreditUnitsListOptions.none(), RequestOptions.none());
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @param options the optional parameters
     * @return the response body
     */
    public CreditUnitListResponse list(final CreditUnitsListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List credit units
     *
     * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced and
     * credit granted in, instead of money, each with its selling prices.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public CreditUnitListResponse list(final RequestOptions requestOptions) {
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
     * @return the response body
     */
    public CreditUnitListResponse list(
            final CreditUnitsListOptions options, final RequestOptions requestOptions) {
        return exchangeList(options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnitListResponse> exchangeList(
            final CreditUnitsListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/credit-units");
        Boolean value1 = options.includeArchived().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("include_archived", Utils.serializeQueryParam(value1));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429", "500")
                .options(requestOptions)
                .returning(CreditUnitListResponse.class);
    }

    /**
     * Create a credit unit <code>code</code> and <code>precision</code> are immutable once created.
     * Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it with a credit
     * pack or a credit grant, and sell it with a top-up once it has a <code>product_id</code> and a
     * selling price.
     *
     * @param creditUnitCreateRequest the request body
     * @return the response body
     */
    public CreditUnit create(final CreditUnitCreateRequest creditUnitCreateRequest) {
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
     * @return the response body
     */
    public CreditUnit create(
            final CreditUnitCreateRequest creditUnitCreateRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(creditUnitCreateRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnit> exchangeCreate(
            final CreditUnitCreateRequest creditUnitCreateRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(creditUnitCreateRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/credit-units").build();
        return client.call("POST", url)
                .json(creditUnitCreateRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(CreditUnit.class);
    }

    /**
     * Get a credit unit
     *
     * <p>The unit with its active selling prices.
     *
     * @param id the {@code id} path parameter
     * @return the response body
     */
    public CreditUnit retrieve(final String id) {
        return retrieve(id, RequestOptions.none());
    }

    /**
     * Get a credit unit
     *
     * <p>The unit with its active selling prices.
     *
     * @param id the {@code id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public CreditUnit retrieve(final String id, final RequestOptions requestOptions) {
        return exchangeRetrieve(id, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnit> exchangeRetrieve(
            final String id, final RequestOptions requestOptions) {
        Objects.requireNonNull(id, "id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/credit-units")
                        .addPathSegment(Utils.pathSegment("id", id))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(CreditUnit.class);
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
     * @return the response body
     */
    public CreditUnit update(
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
     * @return the response body
     */
    public CreditUnit update(
            final String id,
            final CreditUnitUpdateRequest creditUnitUpdateRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(id, creditUnitUpdateRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<CreditUnit> exchangeUpdate(
            final String id,
            final CreditUnitUpdateRequest creditUnitUpdateRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(creditUnitUpdateRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/credit-units")
                        .addPathSegment(Utils.pathSegment("id", id))
                        .build();
        return client.call("PATCH", url)
                .json(creditUnitUpdateRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(CreditUnit.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code prices} operations.
         *
         * @return the operations
         */
        public CreditUnitsPrices.WithRawResponse prices() {
            return CreditUnits.this.prices.withRawResponse();
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitListResponse> list() {
            return list(CreditUnitsListOptions.none(), RequestOptions.none());
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @param options the optional parameters
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitListResponse> list(final CreditUnitsListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List credit units
         *
         * <p>The tenant's credit units (e.g. "Halyard credits"): denominations usage can be priced
         * and credit granted in, instead of money, each with its selling prices.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitListResponse> list(final RequestOptions requestOptions) {
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnitListResponse> list(
                final CreditUnitsListOptions options, final RequestOptions requestOptions) {
            return CreditUnits.this.exchangeList(options, requestOptions).sendRaw();
        }

        /**
         * Create a credit unit <code>code</code> and <code>precision</code> are immutable once
         * created. Price usage in the unit with a plan fee's <code>credit_unit</code>, grant it
         * with a credit pack or a credit grant, and sell it with a top-up once it has a <code>
         * product_id</code> and a selling price.
         *
         * @param creditUnitCreateRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> create(
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> create(
                final CreditUnitCreateRequest creditUnitCreateRequest,
                final RequestOptions requestOptions) {
            return CreditUnits.this
                    .exchangeCreate(creditUnitCreateRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Get a credit unit
         *
         * <p>The unit with its active selling prices.
         *
         * @param id the {@code id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> retrieve(final String id) {
            return retrieve(id, RequestOptions.none());
        }

        /**
         * Get a credit unit
         *
         * <p>The unit with its active selling prices.
         *
         * @param id the {@code id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> retrieve(
                final String id, final RequestOptions requestOptions) {
            return CreditUnits.this.exchangeRetrieve(id, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<CreditUnit> update(
                final String id,
                final CreditUnitUpdateRequest creditUnitUpdateRequest,
                final RequestOptions requestOptions) {
            return CreditUnits.this
                    .exchangeUpdate(id, creditUnitUpdateRequest, requestOptions)
                    .sendRaw();
        }
    }
}
