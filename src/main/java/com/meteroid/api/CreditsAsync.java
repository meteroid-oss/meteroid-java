// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateTopUpRequest;
import com.meteroid.models.LedgerEntry;
import com.meteroid.models.LedgerListResponse;
import com.meteroid.models.TopUpResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code credits} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class CreditsAsync {
    private final Credits sync;
    private final WithRawResponse withRawResponse;

    private final CreditsGrantsAsync grants;

    private final CreditsWalletsAsync wallets;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public CreditsAsync(Credits sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.grants = new CreditsGrantsAsync(sync.grants());

        this.wallets = new CreditsWalletsAsync(sync.wallets());
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
    public CreditsGrantsAsync grants() {
        return grants;
    }

    /**
     * The {@code wallets} operations.
     *
     * @return the operations
     */
    public CreditsWalletsAsync wallets() {
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsListCustomerCreditLedgerAsyncPage> listCustomerCreditLedger(
            final String idOrAlias) {
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsListCustomerCreditLedgerAsyncPage> listCustomerCreditLedger(
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsListCustomerCreditLedgerAsyncPage> listCustomerCreditLedger(
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsListCustomerCreditLedgerAsyncPage> listCustomerCreditLedger(
            final String idOrAlias,
            final CreditsListCustomerCreditLedgerOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListCustomerCreditLedger(idOrAlias, options, requestOptions)
                .sendAsync()
                .thenApply(
                        response ->
                                pageOfListCustomerCreditLedger(
                                        response, idOrAlias, options, requestOptions));
    }

    private CreditsListCustomerCreditLedgerAsyncPage pageOfListCustomerCreditLedger(
            LedgerListResponse response,
            final String idOrAlias,
            final CreditsListCustomerCreditLedgerOptions options,
            final RequestOptions requestOptions) {
        List<LedgerEntry> items = Credits.itemsOfListCustomerCreditLedger(response);
        Integer next =
                Credits.nextOfListCustomerCreditLedger(response, items, options.page().orElse(0));
        return new CreditsListCustomerCreditLedgerAsyncPage(
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
     * @return the response body, once received
     */
    public CompletableFuture<TopUpResponse> createCustomerTopUp(
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
     * @return the response body, once received
     */
    public CompletableFuture<TopUpResponse> createCustomerTopUp(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateTopUpRequest createTopUpRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreateCustomerTopUp(
                        idOrAlias, idempotencyKey, createTopUpRequest, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code grants} operations.
         *
         * @return the operations
         */
        public CreditsGrantsAsync.WithRawResponse grants() {
            return CreditsAsync.this.grants.withRawResponse();
        }

        /**
         * The {@code wallets} operations.
         *
         * @return the operations
         */
        public CreditsWalletsAsync.WithRawResponse wallets() {
            return CreditsAsync.this.wallets.withRawResponse();
        }

        /**
         * List credit ledger entries
         *
         * <p>Every movement of a customer's credit in one currency or credit unit, newest first,
         * with the credit on account after it: credit granted, applied to invoices, given back,
         * expired or rolled over.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsListCustomerCreditLedgerAsyncPage>>
                listCustomerCreditLedger(final String idOrAlias) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsListCustomerCreditLedgerAsyncPage>>
                listCustomerCreditLedger(
                        final String idOrAlias,
                        final CreditsListCustomerCreditLedgerOptions options) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsListCustomerCreditLedgerAsyncPage>>
                listCustomerCreditLedger(
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsListCustomerCreditLedgerAsyncPage>>
                listCustomerCreditLedger(
                        final String idOrAlias,
                        final CreditsListCustomerCreditLedgerOptions options,
                        final RequestOptions requestOptions) {
            return sync.exchangeListCustomerCreditLedger(idOrAlias, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfListCustomerCreditLedger(
                                                    response.body(),
                                                    idOrAlias,
                                                    options,
                                                    requestOptions)));
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<TopUpResponse>> createCustomerTopUp(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<TopUpResponse>> createCustomerTopUp(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateTopUpRequest createTopUpRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreateCustomerTopUp(
                            idOrAlias, idempotencyKey, createTopUpRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
