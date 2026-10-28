// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.Currency;
import com.meteroid.models.PatchWalletRequest;
import com.meteroid.models.Wallet;
import com.meteroid.models.WalletCheck;
import com.meteroid.models.WalletListResponse;

import okhttp3.Headers;
import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code credits.wallets} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class CreditsWallets {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public CreditsWallets(MeteroidHttpClient client) {
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
     * List wallets
     *
     * <p>A customer's credit per currency and credit unit: the credit on account, the usage not
     * invoiced yet and the balance left after it, with the wallet's alerts and automatic top-up.
     * The customer's own currency comes first, even when empty. With <code>subscription_id</code>,
     * each wallet counts only the credit that subscription can use.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the response body
     */
    public WalletListResponse list(final String idOrAlias) {
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
     * @return the response body
     */
    public WalletListResponse list(
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
     * @return the response body
     */
    public WalletListResponse list(final String idOrAlias, final RequestOptions requestOptions) {
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
     * @return the response body
     */
    public WalletListResponse list(
            final String idOrAlias,
            final CreditsWalletsListOptions options,
            final RequestOptions requestOptions) {
        return exchangeList(idOrAlias, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WalletListResponse> exchangeList(
            final String idOrAlias,
            final CreditsWalletsListOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("wallets");
        String value1 = options.subscriptionId().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("subscription_id", value1);
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
                .returning(WalletListResponse.class);
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
     * @return the response body
     */
    public WalletCheck check(final String idOrAlias) {
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
     * @return the response body
     */
    public WalletCheck check(final String idOrAlias, final CreditsWalletsCheckOptions options) {
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
     * @return the response body
     */
    public WalletCheck check(final String idOrAlias, final RequestOptions requestOptions) {
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
     * @return the response body
     */
    public WalletCheck check(
            final String idOrAlias,
            final CreditsWalletsCheckOptions options,
            final RequestOptions requestOptions) {
        return exchangeCheck(idOrAlias, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<WalletCheck> exchangeCheck(
            final String idOrAlias,
            final CreditsWalletsCheckOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("wallets/check");
        Currency value1 = options.currency().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("currency", Utils.serializeQueryParam(value1));
        }
        String value2 = options.creditUnit().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("credit_unit", value2);
        }
        String value3 = options.productId().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("product_id", value3);
        }
        String value4 = options.subscriptionId().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("subscription_id", value4);
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
                .returning(WalletCheck.class);
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
     * @return the response body
     */
    public Wallet update(
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
     * @return the response body
     */
    public Wallet update(
            final String idOrAlias,
            final String currency,
            final String idempotencyKey,
            final PatchWalletRequest patchWalletRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(
                        idOrAlias, currency, idempotencyKey, patchWalletRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<Wallet> exchangeUpdate(
            final String idOrAlias,
            final String currency,
            final String idempotencyKey,
            final PatchWalletRequest patchWalletRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(currency, "currency");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(patchWalletRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("wallets")
                        .addPathSegment(Utils.pathSegment("currency", currency))
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("PATCH", url)
                .headers(headers.build())
                .json(patchWalletRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Wallet.class);
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletListResponse> list(final String idOrAlias) {
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletListResponse> list(
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletListResponse> list(
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletListResponse> list(
                final String idOrAlias,
                final CreditsWalletsListOptions options,
                final RequestOptions requestOptions) {
            return CreditsWallets.this.exchangeList(idOrAlias, options, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletCheck> check(final String idOrAlias) {
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletCheck> check(
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletCheck> check(
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
         * @return the status, headers and body
         */
        public ApiResponse<WalletCheck> check(
                final String idOrAlias,
                final CreditsWalletsCheckOptions options,
                final RequestOptions requestOptions) {
            return CreditsWallets.this.exchangeCheck(idOrAlias, options, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<Wallet> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<Wallet> update(
                final String idOrAlias,
                final String currency,
                final String idempotencyKey,
                final PatchWalletRequest patchWalletRequest,
                final RequestOptions requestOptions) {
            return CreditsWallets.this
                    .exchangeUpdate(
                            idOrAlias, currency, idempotencyKey, patchWalletRequest, requestOptions)
                    .sendRaw();
        }
    }
}
