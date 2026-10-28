// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateCreditGrantRequest;
import com.meteroid.models.CreditGrant;
import com.meteroid.models.CreditGrantListResponse;
import com.meteroid.models.CreditGrantStatus;
import com.meteroid.models.Currency;

import okhttp3.Headers;
import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code credits.grants} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class CreditsGrants {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public CreditsGrants(MeteroidHttpClient client) {
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
     * List credit grants
     *
     * <p>A customer's credit grants, newest first, in every currency and credit unit unless
     * filtered.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsGrantsListPage list(final String idOrAlias) {
        return list(idOrAlias, CreditsGrantsListOptions.none(), RequestOptions.none());
    }

    /**
     * List credit grants
     *
     * <p>A customer's credit grants, newest first, in every currency and credit unit unless
     * filtered.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsGrantsListPage list(
            final String idOrAlias, final CreditsGrantsListOptions options) {
        return list(idOrAlias, options, RequestOptions.none());
    }

    /**
     * List credit grants
     *
     * <p>A customer's credit grants, newest first, in every currency and credit unit unless
     * filtered.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsGrantsListPage list(final String idOrAlias, final RequestOptions requestOptions) {
        return list(idOrAlias, CreditsGrantsListOptions.none(), requestOptions);
    }

    /**
     * List credit grants
     *
     * <p>A customer's credit grants, newest first, in every currency and credit unit unless
     * filtered.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsGrantsListPage list(
            final String idOrAlias,
            final CreditsGrantsListOptions options,
            final RequestOptions requestOptions) {
        return pageOfList(
                exchangeList(idOrAlias, options, requestOptions).send(),
                idOrAlias,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<CreditGrantListResponse> exchangeList(
            final String idOrAlias,
            final CreditsGrantsListOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("credit-grants");
        Currency value1 = options.currency().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("currency", Utils.serializeQueryParam(value1));
        }
        String value2 = options.creditUnit().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("credit_unit", value2);
        }
        CreditGrantStatus value3 = options.status().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("status", Utils.serializeQueryParam(value3));
        }
        String value4 = options.subscriptionId().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("subscription_id", value4);
        }
        String value5 = options.usableBySubscriptionId().orElse(null);
        if (value5 != null) {
            url.addQueryParameter("usable_by_subscription_id", value5);
        }
        Integer value6 = options.page().orElse(null);
        if (value6 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value6));
        }
        Integer value7 = options.perPage().orElse(null);
        if (value7 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value7));
        }
        return client.call("GET", url.build())
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(CreditGrantListResponse.class);
    }

    private CreditsGrantsListPage pageOfList(
            CreditGrantListResponse response,
            final String idOrAlias,
            final CreditsGrantsListOptions options,
            final RequestOptions requestOptions) {
        List<CreditGrant> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new CreditsGrantsListPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                list(
                                        idOrAlias,
                                        options.toBuilder().page(next).build(),
                                        requestOptions));
    }

    static List<CreditGrant> itemsOfList(CreditGrantListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(
            CreditGrantListResponse response, List<CreditGrant> items, Integer current) {
        if (items.isEmpty()) {
            return null;
        }
        long pages =
                Utils.optional(response.paginationMeta())
                        .flatMap(v2 -> Utils.optional(v2.totalPages()))
                        .map(Number::longValue)
                        .orElse(Long.MAX_VALUE);
        if (current - 0 + 1 >= pages) {
            return null;
        }
        return current + 1;
    }

    /**
     * Create a credit grant
     *
     * <p>Grants credit without charging or invoicing: PROMOTIONAL credit for free, or PAID credit
     * the customer paid for outside Meteroid ("Paid outside Meteroid"). A PAID currency grant whose
     * <code>cost</code> is below its <code>amount</code> is split into a PAID grant for the cost
     * and a PROMOTIONAL bonus grant for the rest, returned as <code>bonus_grant_id</code>; a <code>
     * cost</code> above the <code>amount</code> is refused. For a customer of a French invoicing
     * entity, PAID credit that cost more than zero needs a <code>reference</code> to the invoice or
     * receipt of its payment. Sell credit through Meteroid with a top-up.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createCreditGrantRequest the request body
     * @return the response body
     */
    public CreditGrant create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateCreditGrantRequest createCreditGrantRequest) {
        return create(idOrAlias, idempotencyKey, createCreditGrantRequest, RequestOptions.none());
    }

    /**
     * Create a credit grant
     *
     * <p>Grants credit without charging or invoicing: PROMOTIONAL credit for free, or PAID credit
     * the customer paid for outside Meteroid ("Paid outside Meteroid"). A PAID currency grant whose
     * <code>cost</code> is below its <code>amount</code> is split into a PAID grant for the cost
     * and a PROMOTIONAL bonus grant for the rest, returned as <code>bonus_grant_id</code>; a <code>
     * cost</code> above the <code>amount</code> is refused. For a customer of a French invoicing
     * entity, PAID credit that cost more than zero needs a <code>reference</code> to the invoice or
     * receipt of its payment. Sell credit through Meteroid with a top-up.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createCreditGrantRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public CreditGrant create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateCreditGrantRequest createCreditGrantRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(idOrAlias, idempotencyKey, createCreditGrantRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<CreditGrant> exchangeCreate(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateCreditGrantRequest createCreditGrantRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(createCreditGrantRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("credit-grants")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .json(createCreditGrantRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(CreditGrant.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List credit grants
         *
         * <p>A customer's credit grants, newest first, in every currency and credit unit unless
         * filtered.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<CreditsGrantsListPage> list(final String idOrAlias) {
            return list(idOrAlias, CreditsGrantsListOptions.none(), RequestOptions.none());
        }

        /**
         * List credit grants
         *
         * <p>A customer's credit grants, newest first, in every currency and credit unit unless
         * filtered.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<CreditsGrantsListPage> list(
                final String idOrAlias, final CreditsGrantsListOptions options) {
            return list(idOrAlias, options, RequestOptions.none());
        }

        /**
         * List credit grants
         *
         * <p>A customer's credit grants, newest first, in every currency and credit unit unless
         * filtered.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<CreditsGrantsListPage> list(
                final String idOrAlias, final RequestOptions requestOptions) {
            return list(idOrAlias, CreditsGrantsListOptions.none(), requestOptions);
        }

        /**
         * List credit grants
         *
         * <p>A customer's credit grants, newest first, in every currency and credit unit unless
         * filtered.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<CreditsGrantsListPage> list(
                final String idOrAlias,
                final CreditsGrantsListOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<CreditGrantListResponse> response =
                    exchangeList(idOrAlias, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), idOrAlias, options, requestOptions));
        }

        /**
         * Create a credit grant
         *
         * <p>Grants credit without charging or invoicing: PROMOTIONAL credit for free, or PAID
         * credit the customer paid for outside Meteroid ("Paid outside Meteroid"). A PAID currency
         * grant whose <code>cost</code> is below its <code>amount</code> is split into a PAID grant
         * for the cost and a PROMOTIONAL bonus grant for the rest, returned as <code>bonus_grant_id
         * </code>; a <code>cost</code> above the <code>amount</code> is refused. For a customer of
         * a French invoicing entity, PAID credit that cost more than zero needs a <code>reference
         * </code> to the invoice or receipt of its payment. Sell credit through Meteroid with a
         * top-up.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createCreditGrantRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<CreditGrant> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateCreditGrantRequest createCreditGrantRequest) {
            return create(
                    idOrAlias, idempotencyKey, createCreditGrantRequest, RequestOptions.none());
        }

        /**
         * Create a credit grant
         *
         * <p>Grants credit without charging or invoicing: PROMOTIONAL credit for free, or PAID
         * credit the customer paid for outside Meteroid ("Paid outside Meteroid"). A PAID currency
         * grant whose <code>cost</code> is below its <code>amount</code> is split into a PAID grant
         * for the cost and a PROMOTIONAL bonus grant for the rest, returned as <code>bonus_grant_id
         * </code>; a <code>cost</code> above the <code>amount</code> is refused. For a customer of
         * a French invoicing entity, PAID credit that cost more than zero needs a <code>reference
         * </code> to the invoice or receipt of its payment. Sell credit through Meteroid with a
         * top-up.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createCreditGrantRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<CreditGrant> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateCreditGrantRequest createCreditGrantRequest,
                final RequestOptions requestOptions) {
            return CreditsGrants.this
                    .exchangeCreate(
                            idOrAlias, idempotencyKey, createCreditGrantRequest, requestOptions)
                    .sendRaw();
        }
    }
}
