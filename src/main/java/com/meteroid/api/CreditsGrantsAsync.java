// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateCreditGrantRequest;
import com.meteroid.models.CreditGrant;
import com.meteroid.models.CreditGrantListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code credits.grants} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class CreditsGrantsAsync {
    private final CreditsGrants sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public CreditsGrantsAsync(CreditsGrants sync) {
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
     * List credit grants
     *
     * <p>A customer's credit grants, newest first, in every currency and credit unit unless
     * filtered.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the page, once received
     */
    public CompletableFuture<CreditsGrantsListAsyncPage> list(final String idOrAlias) {
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsGrantsListAsyncPage> list(
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsGrantsListAsyncPage> list(
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
     * @return the page, once received
     */
    public CompletableFuture<CreditsGrantsListAsyncPage> list(
            final String idOrAlias,
            final CreditsGrantsListOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeList(idOrAlias, options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, idOrAlias, options, requestOptions));
    }

    private CreditsGrantsListAsyncPage pageOfList(
            CreditGrantListResponse response,
            final String idOrAlias,
            final CreditsGrantsListOptions options,
            final RequestOptions requestOptions) {
        List<CreditGrant> items = CreditsGrants.itemsOfList(response);
        Integer next = CreditsGrants.nextOfList(response, items, options.page().orElse(0));
        return new CreditsGrantsListAsyncPage(
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
     * @return the response body, once received
     */
    public CompletableFuture<CreditGrant> create(
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
     * @return the response body, once received
     */
    public CompletableFuture<CreditGrant> create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateCreditGrantRequest createCreditGrantRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(
                        idOrAlias, idempotencyKey, createCreditGrantRequest, requestOptions)
                .sendAsync();
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsGrantsListAsyncPage>> list(
                final String idOrAlias) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsGrantsListAsyncPage>> list(
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsGrantsListAsyncPage>> list(
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<CreditsGrantsListAsyncPage>> list(
                final String idOrAlias,
                final CreditsGrantsListOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeList(idOrAlias, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfList(
                                                    response.body(),
                                                    idOrAlias,
                                                    options,
                                                    requestOptions)));
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditGrant>> create(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<CreditGrant>> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateCreditGrantRequest createCreditGrantRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(
                            idOrAlias, idempotencyKey, createCreditGrantRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
