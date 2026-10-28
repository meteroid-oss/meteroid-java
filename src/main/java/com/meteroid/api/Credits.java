// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateTopUpRequest;
import com.meteroid.models.Currency;
import com.meteroid.models.LedgerEntry;
import com.meteroid.models.LedgerListResponse;
import com.meteroid.models.TopUpResponse;

import okhttp3.Headers;
import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code credits} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Credits {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final CreditsGrants grants;

    private final CreditsWallets wallets;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Credits(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.grants = new CreditsGrants(client);

        this.wallets = new CreditsWallets(client);
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
     * The {@code grants} operations.
     *
     * @return the operations
     */
    public CreditsGrants grants() {
        return grants;
    }

    /**
     * The {@code wallets} operations.
     *
     * @return the operations
     */
    public CreditsWallets wallets() {
        return wallets;
    }

    /**
     * List credit ledger entries
     *
     * <p>Every movement of a customer's credit in one currency or credit unit, newest first, with
     * the credit on account after it: credit granted, applied to invoices, given back, expired or
     * rolled over.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsListCustomerCreditLedgerPage listCustomerCreditLedger(final String idOrAlias) {
        return listCustomerCreditLedger(
                idOrAlias, CreditsListCustomerCreditLedgerOptions.none(), RequestOptions.none());
    }

    /**
     * List credit ledger entries
     *
     * <p>Every movement of a customer's credit in one currency or credit unit, newest first, with
     * the credit on account after it: credit granted, applied to invoices, given back, expired or
     * rolled over.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsListCustomerCreditLedgerPage listCustomerCreditLedger(
            final String idOrAlias, final CreditsListCustomerCreditLedgerOptions options) {
        return listCustomerCreditLedger(idOrAlias, options, RequestOptions.none());
    }

    /**
     * List credit ledger entries
     *
     * <p>Every movement of a customer's credit in one currency or credit unit, newest first, with
     * the credit on account after it: credit granted, applied to invoices, given back, expired or
     * rolled over.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsListCustomerCreditLedgerPage listCustomerCreditLedger(
            final String idOrAlias, final RequestOptions requestOptions) {
        return listCustomerCreditLedger(
                idOrAlias, CreditsListCustomerCreditLedgerOptions.none(), requestOptions);
    }

    /**
     * List credit ledger entries
     *
     * <p>Every movement of a customer's credit in one currency or credit unit, newest first, with
     * the credit on account after it: credit granted, applied to invoices, given back, expired or
     * rolled over.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public CreditsListCustomerCreditLedgerPage listCustomerCreditLedger(
            final String idOrAlias,
            final CreditsListCustomerCreditLedgerOptions options,
            final RequestOptions requestOptions) {
        return pageOfListCustomerCreditLedger(
                exchangeListCustomerCreditLedger(idOrAlias, options, requestOptions).send(),
                idOrAlias,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<LedgerListResponse> exchangeListCustomerCreditLedger(
            final String idOrAlias,
            final CreditsListCustomerCreditLedgerOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("credit-ledger");
        Currency value1 = options.currency().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("currency", Utils.serializeQueryParam(value1));
        }
        String value2 = options.creditUnit().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("credit_unit", value2);
        }
        Integer value3 = options.page().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value3));
        }
        Integer value4 = options.perPage().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value4));
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
                .returning(LedgerListResponse.class);
    }

    private CreditsListCustomerCreditLedgerPage pageOfListCustomerCreditLedger(
            LedgerListResponse response,
            final String idOrAlias,
            final CreditsListCustomerCreditLedgerOptions options,
            final RequestOptions requestOptions) {
        List<LedgerEntry> items = itemsOfListCustomerCreditLedger(response);
        Integer next = nextOfListCustomerCreditLedger(response, items, options.page().orElse(0));
        return new CreditsListCustomerCreditLedgerPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                listCustomerCreditLedger(
                                        idOrAlias,
                                        options.toBuilder().page(next).build(),
                                        requestOptions));
    }

    static List<LedgerEntry> itemsOfListCustomerCreditLedger(LedgerListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfListCustomerCreditLedger(
            LedgerListResponse response, List<LedgerEntry> items, Integer current) {
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
     * Create a top-up
     *
     * <p>Sells credit: CHARGE bills a saved payment method now, SEND_INVOICE grants it once paid.
     * The credit is PAID and applies to ALL charges. Currency credit is sold one for one, untaxed,
     * as its usage is taxed when invoiced. With <code>credit_unit</code>, sells credits of that
     * unit at its selling price in the customer's currency, taxed at purchase under the unit's
     * product; refused when the unit has no price in that currency or no product. Without a saved
     * payment method, CHARGE returns a hosted <code>checkout_url</code> where the customer pays.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createTopUpRequest the request body
     * @return the response body
     */
    public TopUpResponse createCustomerTopUp(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateTopUpRequest createTopUpRequest) {
        return createCustomerTopUp(
                idOrAlias, idempotencyKey, createTopUpRequest, RequestOptions.none());
    }

    /**
     * Create a top-up
     *
     * <p>Sells credit: CHARGE bills a saved payment method now, SEND_INVOICE grants it once paid.
     * The credit is PAID and applies to ALL charges. Currency credit is sold one for one, untaxed,
     * as its usage is taxed when invoiced. With <code>credit_unit</code>, sells credits of that
     * unit at its selling price in the customer's currency, taxed at purchase under the unit's
     * product; refused when the unit has no price in that currency or no product. Without a saved
     * payment method, CHARGE returns a hosted <code>checkout_url</code> where the customer pays.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createTopUpRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public TopUpResponse createCustomerTopUp(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateTopUpRequest createTopUpRequest,
            final RequestOptions requestOptions) {
        return exchangeCreateCustomerTopUp(
                        idOrAlias, idempotencyKey, createTopUpRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<TopUpResponse> exchangeCreateCustomerTopUp(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateTopUpRequest createTopUpRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(createTopUpRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("top-ups")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .json(createTopUpRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(TopUpResponse.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code grants} operations.
         *
         * @return the operations
         */
        public CreditsGrants.WithRawResponse grants() {
            return Credits.this.grants.withRawResponse();
        }

        /**
         * The {@code wallets} operations.
         *
         * @return the operations
         */
        public CreditsWallets.WithRawResponse wallets() {
            return Credits.this.wallets.withRawResponse();
        }

        /**
         * List credit ledger entries
         *
         * <p>Every movement of a customer's credit in one currency or credit unit, newest first,
         * with the credit on account after it: credit granted, applied to invoices, given back,
         * expired or rolled over.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<CreditsListCustomerCreditLedgerPage> listCustomerCreditLedger(
                final String idOrAlias) {
            return listCustomerCreditLedger(
                    idOrAlias,
                    CreditsListCustomerCreditLedgerOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List credit ledger entries
         *
         * <p>Every movement of a customer's credit in one currency or credit unit, newest first,
         * with the credit on account after it: credit granted, applied to invoices, given back,
         * expired or rolled over.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<CreditsListCustomerCreditLedgerPage> listCustomerCreditLedger(
                final String idOrAlias, final CreditsListCustomerCreditLedgerOptions options) {
            return listCustomerCreditLedger(idOrAlias, options, RequestOptions.none());
        }

        /**
         * List credit ledger entries
         *
         * <p>Every movement of a customer's credit in one currency or credit unit, newest first,
         * with the credit on account after it: credit granted, applied to invoices, given back,
         * expired or rolled over.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<CreditsListCustomerCreditLedgerPage> listCustomerCreditLedger(
                final String idOrAlias, final RequestOptions requestOptions) {
            return listCustomerCreditLedger(
                    idOrAlias, CreditsListCustomerCreditLedgerOptions.none(), requestOptions);
        }

        /**
         * List credit ledger entries
         *
         * <p>Every movement of a customer's credit in one currency or credit unit, newest first,
         * with the credit on account after it: credit granted, applied to invoices, given back,
         * expired or rolled over.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<CreditsListCustomerCreditLedgerPage> listCustomerCreditLedger(
                final String idOrAlias,
                final CreditsListCustomerCreditLedgerOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<LedgerListResponse> response =
                    exchangeListCustomerCreditLedger(idOrAlias, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfListCustomerCreditLedger(
                            response.body(), idOrAlias, options, requestOptions));
        }

        /**
         * Create a top-up
         *
         * <p>Sells credit: CHARGE bills a saved payment method now, SEND_INVOICE grants it once
         * paid. The credit is PAID and applies to ALL charges. Currency credit is sold one for one,
         * untaxed, as its usage is taxed when invoiced. With <code>credit_unit</code>, sells
         * credits of that unit at its selling price in the customer's currency, taxed at purchase
         * under the unit's product; refused when the unit has no price in that currency or no
         * product. Without a saved payment method, CHARGE returns a hosted <code>checkout_url
         * </code> where the customer pays.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createTopUpRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<TopUpResponse> createCustomerTopUp(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateTopUpRequest createTopUpRequest) {
            return createCustomerTopUp(
                    idOrAlias, idempotencyKey, createTopUpRequest, RequestOptions.none());
        }

        /**
         * Create a top-up
         *
         * <p>Sells credit: CHARGE bills a saved payment method now, SEND_INVOICE grants it once
         * paid. The credit is PAID and applies to ALL charges. Currency credit is sold one for one,
         * untaxed, as its usage is taxed when invoiced. With <code>credit_unit</code>, sells
         * credits of that unit at its selling price in the customer's currency, taxed at purchase
         * under the unit's product; refused when the unit has no price in that currency or no
         * product. Without a saved payment method, CHARGE returns a hosted <code>checkout_url
         * </code> where the customer pays.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createTopUpRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<TopUpResponse> createCustomerTopUp(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateTopUpRequest createTopUpRequest,
                final RequestOptions requestOptions) {
            return Credits.this
                    .exchangeCreateCustomerTopUp(
                            idOrAlias, idempotencyKey, createTopUpRequest, requestOptions)
                    .sendRaw();
        }
    }
}
