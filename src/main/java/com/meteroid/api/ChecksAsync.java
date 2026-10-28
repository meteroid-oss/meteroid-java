// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.EntitlementCheck;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code checks} operations, without blocking: each method returns a {@link CompletableFuture}.
 * Obtained from {@code client.async()}.
 */
public final class ChecksAsync {
    private final Checks sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public ChecksAsync(Checks sync) {
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
     * Check customer entitlement
     *
     * <p>Whether the customer may consume <code>requested</code> more of a feature right now, given
     * their entitlement, the hard budgets that count the feature's usage, and their prepaid credit.
     * Boolean features answer from their enabled state; config features grant access and return
     * their <code>value</code>. An <code>ALLOW</code> limit never refuses: <code>in_overage</code>
     * tells when the requested units go beyond it. Sliding windows send no threshold webhooks. Pass
     * the group as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: it is required when the
     * entitlement is grouped. Pass <code>subscription_id</code> when the usage belongs to one
     * subscription, so that a hard budget on another subscription does not refuse it.
     *
     * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old, and
     * less than 10 seconds old once <code>near_limit</code> is true. A hard limit can therefore be
     * exceeded by the usage of those few seconds. While <code>near_limit</code> is true, check
     * before every request with its actual <code>requested</code> and do not cache the answer;
     * <code>retry_after_ms</code> says when to check again. Use the check to gate access, not to
     * bill.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param featureIdOrCode the {@code feature_id_or_code} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementCheck> checkEntitlement(
            final String idOrAlias, final String featureIdOrCode) {
        return checkEntitlement(
                idOrAlias,
                featureIdOrCode,
                ChecksCheckEntitlementOptions.none(),
                RequestOptions.none());
    }

    /**
     * Check customer entitlement
     *
     * <p>Whether the customer may consume <code>requested</code> more of a feature right now, given
     * their entitlement, the hard budgets that count the feature's usage, and their prepaid credit.
     * Boolean features answer from their enabled state; config features grant access and return
     * their <code>value</code>. An <code>ALLOW</code> limit never refuses: <code>in_overage</code>
     * tells when the requested units go beyond it. Sliding windows send no threshold webhooks. Pass
     * the group as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: it is required when the
     * entitlement is grouped. Pass <code>subscription_id</code> when the usage belongs to one
     * subscription, so that a hard budget on another subscription does not refuse it.
     *
     * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old, and
     * less than 10 seconds old once <code>near_limit</code> is true. A hard limit can therefore be
     * exceeded by the usage of those few seconds. While <code>near_limit</code> is true, check
     * before every request with its actual <code>requested</code> and do not cache the answer;
     * <code>retry_after_ms</code> says when to check again. Use the check to gate access, not to
     * bill.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param featureIdOrCode the {@code feature_id_or_code} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementCheck> checkEntitlement(
            final String idOrAlias,
            final String featureIdOrCode,
            final ChecksCheckEntitlementOptions options) {
        return checkEntitlement(idOrAlias, featureIdOrCode, options, RequestOptions.none());
    }

    /**
     * Check customer entitlement
     *
     * <p>Whether the customer may consume <code>requested</code> more of a feature right now, given
     * their entitlement, the hard budgets that count the feature's usage, and their prepaid credit.
     * Boolean features answer from their enabled state; config features grant access and return
     * their <code>value</code>. An <code>ALLOW</code> limit never refuses: <code>in_overage</code>
     * tells when the requested units go beyond it. Sliding windows send no threshold webhooks. Pass
     * the group as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: it is required when the
     * entitlement is grouped. Pass <code>subscription_id</code> when the usage belongs to one
     * subscription, so that a hard budget on another subscription does not refuse it.
     *
     * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old, and
     * less than 10 seconds old once <code>near_limit</code> is true. A hard limit can therefore be
     * exceeded by the usage of those few seconds. While <code>near_limit</code> is true, check
     * before every request with its actual <code>requested</code> and do not cache the answer;
     * <code>retry_after_ms</code> says when to check again. Use the check to gate access, not to
     * bill.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param featureIdOrCode the {@code feature_id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementCheck> checkEntitlement(
            final String idOrAlias,
            final String featureIdOrCode,
            final RequestOptions requestOptions) {
        return checkEntitlement(
                idOrAlias, featureIdOrCode, ChecksCheckEntitlementOptions.none(), requestOptions);
    }

    /**
     * Check customer entitlement
     *
     * <p>Whether the customer may consume <code>requested</code> more of a feature right now, given
     * their entitlement, the hard budgets that count the feature's usage, and their prepaid credit.
     * Boolean features answer from their enabled state; config features grant access and return
     * their <code>value</code>. An <code>ALLOW</code> limit never refuses: <code>in_overage</code>
     * tells when the requested units go beyond it. Sliding windows send no threshold webhooks. Pass
     * the group as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: it is required when the
     * entitlement is grouped. Pass <code>subscription_id</code> when the usage belongs to one
     * subscription, so that a hard budget on another subscription does not refuse it.
     *
     * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old, and
     * less than 10 seconds old once <code>near_limit</code> is true. A hard limit can therefore be
     * exceeded by the usage of those few seconds. While <code>near_limit</code> is true, check
     * before every request with its actual <code>requested</code> and do not cache the answer;
     * <code>retry_after_ms</code> says when to check again. Use the check to gate access, not to
     * bill.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param featureIdOrCode the {@code feature_id_or_code} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementCheck> checkEntitlement(
            final String idOrAlias,
            final String featureIdOrCode,
            final ChecksCheckEntitlementOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeCheckEntitlement(idOrAlias, featureIdOrCode, options, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Check customer entitlement
         *
         * <p>Whether the customer may consume <code>requested</code> more of a feature right now,
         * given their entitlement, the hard budgets that count the feature's usage, and their
         * prepaid credit. Boolean features answer from their enabled state; config features grant
         * access and return their <code>value</code>. An <code>ALLOW</code> limit never refuses:
         * <code>in_overage</code> tells when the requested units go beyond it. Sliding windows send
         * no threshold webhooks. Pass the group as <code>group[&lt;property&gt;]=&lt;value&gt;
         * </code>: it is required when the entitlement is grouped. Pass <code>subscription_id
         * </code> when the usage belongs to one subscription, so that a hard budget on another
         * subscription does not refuse it.
         *
         * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old,
         * and less than 10 seconds old once <code>near_limit</code> is true. A hard limit can
         * therefore be exceeded by the usage of those few seconds. While <code>near_limit</code> is
         * true, check before every request with its actual <code>requested</code> and do not cache
         * the answer; <code>retry_after_ms</code> says when to check again. Use the check to gate
         * access, not to bill.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param featureIdOrCode the {@code feature_id_or_code} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementCheck>> checkEntitlement(
                final String idOrAlias, final String featureIdOrCode) {
            return checkEntitlement(
                    idOrAlias,
                    featureIdOrCode,
                    ChecksCheckEntitlementOptions.none(),
                    RequestOptions.none());
        }

        /**
         * Check customer entitlement
         *
         * <p>Whether the customer may consume <code>requested</code> more of a feature right now,
         * given their entitlement, the hard budgets that count the feature's usage, and their
         * prepaid credit. Boolean features answer from their enabled state; config features grant
         * access and return their <code>value</code>. An <code>ALLOW</code> limit never refuses:
         * <code>in_overage</code> tells when the requested units go beyond it. Sliding windows send
         * no threshold webhooks. Pass the group as <code>group[&lt;property&gt;]=&lt;value&gt;
         * </code>: it is required when the entitlement is grouped. Pass <code>subscription_id
         * </code> when the usage belongs to one subscription, so that a hard budget on another
         * subscription does not refuse it.
         *
         * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old,
         * and less than 10 seconds old once <code>near_limit</code> is true. A hard limit can
         * therefore be exceeded by the usage of those few seconds. While <code>near_limit</code> is
         * true, check before every request with its actual <code>requested</code> and do not cache
         * the answer; <code>retry_after_ms</code> says when to check again. Use the check to gate
         * access, not to bill.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param featureIdOrCode the {@code feature_id_or_code} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementCheck>> checkEntitlement(
                final String idOrAlias,
                final String featureIdOrCode,
                final ChecksCheckEntitlementOptions options) {
            return checkEntitlement(idOrAlias, featureIdOrCode, options, RequestOptions.none());
        }

        /**
         * Check customer entitlement
         *
         * <p>Whether the customer may consume <code>requested</code> more of a feature right now,
         * given their entitlement, the hard budgets that count the feature's usage, and their
         * prepaid credit. Boolean features answer from their enabled state; config features grant
         * access and return their <code>value</code>. An <code>ALLOW</code> limit never refuses:
         * <code>in_overage</code> tells when the requested units go beyond it. Sliding windows send
         * no threshold webhooks. Pass the group as <code>group[&lt;property&gt;]=&lt;value&gt;
         * </code>: it is required when the entitlement is grouped. Pass <code>subscription_id
         * </code> when the usage belongs to one subscription, so that a hard budget on another
         * subscription does not refuse it.
         *
         * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old,
         * and less than 10 seconds old once <code>near_limit</code> is true. A hard limit can
         * therefore be exceeded by the usage of those few seconds. While <code>near_limit</code> is
         * true, check before every request with its actual <code>requested</code> and do not cache
         * the answer; <code>retry_after_ms</code> says when to check again. Use the check to gate
         * access, not to bill.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param featureIdOrCode the {@code feature_id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementCheck>> checkEntitlement(
                final String idOrAlias,
                final String featureIdOrCode,
                final RequestOptions requestOptions) {
            return checkEntitlement(
                    idOrAlias,
                    featureIdOrCode,
                    ChecksCheckEntitlementOptions.none(),
                    requestOptions);
        }

        /**
         * Check customer entitlement
         *
         * <p>Whether the customer may consume <code>requested</code> more of a feature right now,
         * given their entitlement, the hard budgets that count the feature's usage, and their
         * prepaid credit. Boolean features answer from their enabled state; config features grant
         * access and return their <code>value</code>. An <code>ALLOW</code> limit never refuses:
         * <code>in_overage</code> tells when the requested units go beyond it. Sliding windows send
         * no threshold webhooks. Pass the group as <code>group[&lt;property&gt;]=&lt;value&gt;
         * </code>: it is required when the entitlement is grouped. Pass <code>subscription_id
         * </code> when the usage belongs to one subscription, so that a hard budget on another
         * subscription does not refuse it.
         *
         * <p>The answer reflects usage up to <code>as_of</code>: typically less than a minute old,
         * and less than 10 seconds old once <code>near_limit</code> is true. A hard limit can
         * therefore be exceeded by the usage of those few seconds. While <code>near_limit</code> is
         * true, check before every request with its actual <code>requested</code> and do not cache
         * the answer; <code>retry_after_ms</code> says when to check again. Use the check to gate
         * access, not to bill.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param featureIdOrCode the {@code feature_id_or_code} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementCheck>> checkEntitlement(
                final String idOrAlias,
                final String featureIdOrCode,
                final ChecksCheckEntitlementOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeCheckEntitlement(
                            idOrAlias, featureIdOrCode, options, requestOptions)
                    .sendRawAsync();
        }
    }
}
