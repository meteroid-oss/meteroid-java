// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.PatchWalletRequest;
import com.meteroid.models.Wallet;
import com.meteroid.models.WalletCheck;
import com.meteroid.models.WalletListResponse;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code credits.wallets} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class CreditsWalletsAsync {
    private final CreditsWallets sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public CreditsWalletsAsync(CreditsWallets sync) {
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
     * List wallets
     *
     * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
     * invoiced yet and the balance left after it, with the wallet's alerts and automatic top-up.
     * The customer's own currency comes first, even when empty. With <code>subscription_id</code>,
     * each wallet counts only the credit that subscription can use.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WalletListResponse> list(final String idOrAlias) {
        return list(idOrAlias, CreditsWalletsListOptions.none(), RequestOptions.none());
    }

    /**
     * List wallets
     *
     * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
     * invoiced yet and the balance left after it, with the wallet's alerts and automatic top-up.
     * The customer's own currency comes first, even when empty. With <code>subscription_id</code>,
     * each wallet counts only the credit that subscription can use.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<WalletListResponse> list(
            final String idOrAlias, final CreditsWalletsListOptions options) {
        return list(idOrAlias, options, RequestOptions.none());
    }

    /**
     * List wallets
     *
     * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
     * invoiced yet and the balance left after it, with the wallet's alerts and automatic top-up.
     * The customer's own currency comes first, even when empty. With <code>subscription_id</code>,
     * each wallet counts only the credit that subscription can use.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WalletListResponse> list(
            final String idOrAlias, final RequestOptions requestOptions) {
        return list(idOrAlias, CreditsWalletsListOptions.none(), requestOptions);
    }

    /**
     * List wallets
     *
     * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
     * invoiced yet and the balance left after it, with the wallet's alerts and automatic top-up.
     * The customer's own currency comes first, even when empty. With <code>subscription_id</code>,
     * each wallet counts only the credit that subscription can use.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WalletListResponse> list(
            final String idOrAlias,
            final CreditsWalletsListOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeList(idOrAlias, options, requestOptions).sendAsync();
    }

    /**
     * Check wallet access
     *
     * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them, net
     * of usage not invoiced yet. Denies only when the wallet blocks usage once its credit is used
     * up; otherwise access stays allowed and <code>exhausted</code> signals the empty balance on
     * its own. With <code>subscription_id</code>, only the credit that subscription can use counts:
     * pass it when the customer has several subscriptions, since one subscription's credit cannot
     * pay another's usage. The balance follows usage within a few seconds near zero or a threshold,
     * within a minute otherwise, and the answer is cached for one second: use it to gate
     * consumption, not to bill.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<WalletCheck> check(final String idOrAlias) {
        return check(idOrAlias, CreditsWalletsCheckOptions.none(), RequestOptions.none());
    }

    /**
     * Check wallet access
     *
     * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them, net
     * of usage not invoiced yet. Denies only when the wallet blocks usage once its credit is used
     * up; otherwise access stays allowed and <code>exhausted</code> signals the empty balance on
     * its own. With <code>subscription_id</code>, only the credit that subscription can use counts:
     * pass it when the customer has several subscriptions, since one subscription's credit cannot
     * pay another's usage. The balance follows usage within a few seconds near zero or a threshold,
     * within a minute otherwise, and the answer is cached for one second: use it to gate
     * consumption, not to bill.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<WalletCheck> check(
            final String idOrAlias, final CreditsWalletsCheckOptions options) {
        return check(idOrAlias, options, RequestOptions.none());
    }

    /**
     * Check wallet access
     *
     * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them, net
     * of usage not invoiced yet. Denies only when the wallet blocks usage once its credit is used
     * up; otherwise access stays allowed and <code>exhausted</code> signals the empty balance on
     * its own. With <code>subscription_id</code>, only the credit that subscription can use counts:
     * pass it when the customer has several subscriptions, since one subscription's credit cannot
     * pay another's usage. The balance follows usage within a few seconds near zero or a threshold,
     * within a minute otherwise, and the answer is cached for one second: use it to gate
     * consumption, not to bill.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WalletCheck> check(
            final String idOrAlias, final RequestOptions requestOptions) {
        return check(idOrAlias, CreditsWalletsCheckOptions.none(), requestOptions);
    }

    /**
     * Check wallet access
     *
     * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them, net
     * of usage not invoiced yet. Denies only when the wallet blocks usage once its credit is used
     * up; otherwise access stays allowed and <code>exhausted</code> signals the empty balance on
     * its own. With <code>subscription_id</code>, only the credit that subscription can use counts:
     * pass it when the customer has several subscriptions, since one subscription's credit cannot
     * pay another's usage. The balance follows usage within a few seconds near zero or a threshold,
     * within a minute otherwise, and the answer is cached for one second: use it to gate
     * consumption, not to bill.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<WalletCheck> check(
            final String idOrAlias,
            final CreditsWalletsCheckOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeCheck(idOrAlias, options, requestOptions).sendAsync();
    }

    /**
     * Configure a wallet
     *
     * <p>Settings of a customer's wallet in one currency or credit unit: whether usage is refused
     * once its credit is used up, the balances that fire <code>wallet.balance_low</code>, and its
     * automatic top-up. Opens the wallet if it does not exist yet. Partial update: omit a field to
     * leave it unchanged.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param currency the {@code currency} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param patchWalletRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Wallet> update(
            final String idOrAlias,
            final String currency,
            final String idempotencyKey,
            final PatchWalletRequest patchWalletRequest) {
        return update(
                idOrAlias, currency, idempotencyKey, patchWalletRequest, RequestOptions.none());
    }

    /**
     * Configure a wallet
     *
     * <p>Settings of a customer's wallet in one currency or credit unit: whether usage is refused
     * once its credit is used up, the balances that fire <code>wallet.balance_low</code>, and its
     * automatic top-up. Opens the wallet if it does not exist yet. Partial update: omit a field to
     * leave it unchanged.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param currency the {@code currency} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param patchWalletRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Wallet> update(
            final String idOrAlias,
            final String currency,
            final String idempotencyKey,
            final PatchWalletRequest patchWalletRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(
                        idOrAlias, currency, idempotencyKey, patchWalletRequest, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List wallets
         *
         * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
         * invoiced yet and the balance left after it, with the wallet's alerts and automatic
         * top-up. The customer's own currency comes first, even when empty. With <code>
         * subscription_id</code>, each wallet counts only the credit that subscription can use.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletListResponse>> list(final String idOrAlias) {
            return list(idOrAlias, CreditsWalletsListOptions.none(), RequestOptions.none());
        }

        /**
         * List wallets
         *
         * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
         * invoiced yet and the balance left after it, with the wallet's alerts and automatic
         * top-up. The customer's own currency comes first, even when empty. With <code>
         * subscription_id</code>, each wallet counts only the credit that subscription can use.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletListResponse>> list(
                final String idOrAlias, final CreditsWalletsListOptions options) {
            return list(idOrAlias, options, RequestOptions.none());
        }

        /**
         * List wallets
         *
         * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
         * invoiced yet and the balance left after it, with the wallet's alerts and automatic
         * top-up. The customer's own currency comes first, even when empty. With <code>
         * subscription_id</code>, each wallet counts only the credit that subscription can use.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletListResponse>> list(
                final String idOrAlias, final RequestOptions requestOptions) {
            return list(idOrAlias, CreditsWalletsListOptions.none(), requestOptions);
        }

        /**
         * List wallets
         *
         * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
         * invoiced yet and the balance left after it, with the wallet's alerts and automatic
         * top-up. The customer's own currency comes first, even when empty. With <code>
         * subscription_id</code>, each wallet counts only the credit that subscription can use.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletListResponse>> list(
                final String idOrAlias,
                final CreditsWalletsListOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeList(idOrAlias, options, requestOptions).sendRawAsync();
        }

        /**
         * Check wallet access
         *
         * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them,
         * net of usage not invoiced yet. Denies only when the wallet blocks usage once its credit
         * is used up; otherwise access stays allowed and <code>exhausted</code> signals the empty
         * balance on its own. With <code>subscription_id</code>, only the credit that subscription
         * can use counts: pass it when the customer has several subscriptions, since one
         * subscription's credit cannot pay another's usage. The balance follows usage within a few
         * seconds near zero or a threshold, within a minute otherwise, and the answer is cached for
         * one second: use it to gate consumption, not to bill.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletCheck>> check(final String idOrAlias) {
            return check(idOrAlias, CreditsWalletsCheckOptions.none(), RequestOptions.none());
        }

        /**
         * Check wallet access
         *
         * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them,
         * net of usage not invoiced yet. Denies only when the wallet blocks usage once its credit
         * is used up; otherwise access stays allowed and <code>exhausted</code> signals the empty
         * balance on its own. With <code>subscription_id</code>, only the credit that subscription
         * can use counts: pass it when the customer has several subscriptions, since one
         * subscription's credit cannot pay another's usage. The balance follows usage within a few
         * seconds near zero or a threshold, within a minute otherwise, and the answer is cached for
         * one second: use it to gate consumption, not to bill.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletCheck>> check(
                final String idOrAlias, final CreditsWalletsCheckOptions options) {
            return check(idOrAlias, options, RequestOptions.none());
        }

        /**
         * Check wallet access
         *
         * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them,
         * net of usage not invoiced yet. Denies only when the wallet blocks usage once its credit
         * is used up; otherwise access stays allowed and <code>exhausted</code> signals the empty
         * balance on its own. With <code>subscription_id</code>, only the credit that subscription
         * can use counts: pass it when the customer has several subscriptions, since one
         * subscription's credit cannot pay another's usage. The balance follows usage within a few
         * seconds near zero or a threshold, within a minute otherwise, and the answer is cached for
         * one second: use it to gate consumption, not to bill.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletCheck>> check(
                final String idOrAlias, final RequestOptions requestOptions) {
            return check(idOrAlias, CreditsWalletsCheckOptions.none(), requestOptions);
        }

        /**
         * Check wallet access
         *
         * <p>Whether the customer's prepaid credit in a currency or credit unit still covers them,
         * net of usage not invoiced yet. Denies only when the wallet blocks usage once its credit
         * is used up; otherwise access stays allowed and <code>exhausted</code> signals the empty
         * balance on its own. With <code>subscription_id</code>, only the credit that subscription
         * can use counts: pass it when the customer has several subscriptions, since one
         * subscription's credit cannot pay another's usage. The balance follows usage within a few
         * seconds near zero or a threshold, within a minute otherwise, and the answer is cached for
         * one second: use it to gate consumption, not to bill.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<WalletCheck>> check(
                final String idOrAlias,
                final CreditsWalletsCheckOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeCheck(idOrAlias, options, requestOptions).sendRawAsync();
        }

        /**
         * Configure a wallet
         *
         * <p>Settings of a customer's wallet in one currency or credit unit: whether usage is
         * refused once its credit is used up, the balances that fire <code>wallet.balance_low
         * </code>, and its automatic top-up. Opens the wallet if it does not exist yet. Partial
         * update: omit a field to leave it unchanged.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param currency the {@code currency} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param patchWalletRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Wallet>> update(
                final String idOrAlias,
                final String currency,
                final String idempotencyKey,
                final PatchWalletRequest patchWalletRequest) {
            return update(
                    idOrAlias, currency, idempotencyKey, patchWalletRequest, RequestOptions.none());
        }

        /**
         * Configure a wallet
         *
         * <p>Settings of a customer's wallet in one currency or credit unit: whether usage is
         * refused once its credit is used up, the balances that fire <code>wallet.balance_low
         * </code>, and its automatic top-up. Opens the wallet if it does not exist yet. Partial
         * update: omit a field to leave it unchanged.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param currency the {@code currency} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param patchWalletRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Wallet>> update(
                final String idOrAlias,
                final String currency,
                final String idempotencyKey,
                final PatchWalletRequest patchWalletRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(
                            idOrAlias, currency, idempotencyKey, patchWalletRequest, requestOptions)
                    .sendRawAsync();
        }
    }
}
