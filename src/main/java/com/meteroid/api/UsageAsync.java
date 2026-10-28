// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.UsageResponse;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code usage} operations, without blocking: each method returns a {@link CompletableFuture}.
 * Obtained from {@code client.async()}.
 */
public final class UsageAsync {
    private final Usage sync;
    private final WithRawResponse withRawResponse;

    private final UsageCustomerAsync customer;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public UsageAsync(Usage sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.customer = new UsageCustomerAsync(sync.customer());
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
     * The {@code customer} operations.
     *
     * @return the operations
     */
    public UsageCustomerAsync customer() {
        return customer;
    }

    /**
     * Get subscription usage
     *
     * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
     * start_date/end_date are omitted, defaults to the current billing period, and the response
     * then carries the running total (beta): what each metric's usage adds so far to the next
     * invoice, and what they add up to, before discounts and credits. That reading is shared for up
     * to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads' rate
     * limit.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSubscription(final String subscriptionId) {
        return retrieveSubscription(
                subscriptionId, UsageRetrieveSubscriptionOptions.none(), RequestOptions.none());
    }

    /**
     * Get subscription usage
     *
     * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
     * start_date/end_date are omitted, defaults to the current billing period, and the response
     * then carries the running total (beta): what each metric's usage adds so far to the next
     * invoice, and what they add up to, before discounts and credits. That reading is shared for up
     * to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads' rate
     * limit.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSubscription(
            final String subscriptionId, final UsageRetrieveSubscriptionOptions options) {
        return retrieveSubscription(subscriptionId, options, RequestOptions.none());
    }

    /**
     * Get subscription usage
     *
     * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
     * start_date/end_date are omitted, defaults to the current billing period, and the response
     * then carries the running total (beta): what each metric's usage adds so far to the next
     * invoice, and what they add up to, before discounts and credits. That reading is shared for up
     * to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads' rate
     * limit.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSubscription(
            final String subscriptionId, final RequestOptions requestOptions) {
        return retrieveSubscription(
                subscriptionId, UsageRetrieveSubscriptionOptions.none(), requestOptions);
    }

    /**
     * Get subscription usage
     *
     * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
     * start_date/end_date are omitted, defaults to the current billing period, and the response
     * then carries the running total (beta): what each metric's usage adds so far to the next
     * invoice, and what they add up to, before discounts and credits. That reading is shared for up
     * to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads' rate
     * limit.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSubscription(
            final String subscriptionId,
            final UsageRetrieveSubscriptionOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeRetrieveSubscription(subscriptionId, options, requestOptions)
                .sendAsync();
    }

    /**
     * Get usage summary
     *
     * <p>Retrieve aggregated usage data across all customers for the tenant.
     *
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSummary(
            final LocalDate startDate, final LocalDate endDate) {
        return retrieveSummary(
                startDate, endDate, UsageRetrieveSummaryOptions.none(), RequestOptions.none());
    }

    /**
     * Get usage summary
     *
     * <p>Retrieve aggregated usage data across all customers for the tenant.
     *
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSummary(
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageRetrieveSummaryOptions options) {
        return retrieveSummary(startDate, endDate, options, RequestOptions.none());
    }

    /**
     * Get usage summary
     *
     * <p>Retrieve aggregated usage data across all customers for the tenant.
     *
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSummary(
            final LocalDate startDate,
            final LocalDate endDate,
            final RequestOptions requestOptions) {
        return retrieveSummary(
                startDate, endDate, UsageRetrieveSummaryOptions.none(), requestOptions);
    }

    /**
     * Get usage summary
     *
     * <p>Retrieve aggregated usage data across all customers for the tenant.
     *
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieveSummary(
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageRetrieveSummaryOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeRetrieveSummary(startDate, endDate, options, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code customer} operations.
         *
         * @return the operations
         */
        public UsageCustomerAsync.WithRawResponse customer() {
            return UsageAsync.this.customer.withRawResponse();
        }

        /**
         * Get subscription usage
         *
         * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
         * start_date/end_date are omitted, defaults to the current billing period, and the response
         * then carries the running total (beta): what each metric's usage adds so far to the next
         * invoice, and what they add up to, before discounts and credits. That reading is shared
         * for up to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads'
         * rate limit.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSubscription(
                final String subscriptionId) {
            return retrieveSubscription(
                    subscriptionId, UsageRetrieveSubscriptionOptions.none(), RequestOptions.none());
        }

        /**
         * Get subscription usage
         *
         * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
         * start_date/end_date are omitted, defaults to the current billing period, and the response
         * then carries the running total (beta): what each metric's usage adds so far to the next
         * invoice, and what they add up to, before discounts and credits. That reading is shared
         * for up to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads'
         * rate limit.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSubscription(
                final String subscriptionId, final UsageRetrieveSubscriptionOptions options) {
            return retrieveSubscription(subscriptionId, options, RequestOptions.none());
        }

        /**
         * Get subscription usage
         *
         * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
         * start_date/end_date are omitted, defaults to the current billing period, and the response
         * then carries the running total (beta): what each metric's usage adds so far to the next
         * invoice, and what they add up to, before discounts and credits. That reading is shared
         * for up to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads'
         * rate limit.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSubscription(
                final String subscriptionId, final RequestOptions requestOptions) {
            return retrieveSubscription(
                    subscriptionId, UsageRetrieveSubscriptionOptions.none(), requestOptions);
        }

        /**
         * Get subscription usage
         *
         * <p>Retrieve aggregated usage data for a subscription's usage-based components. If
         * start_date/end_date are omitted, defaults to the current billing period, and the response
         * then carries the running total (beta): what each metric's usage adds so far to the next
         * invoice, and what they add up to, before discounts and credits. That reading is shared
         * for up to 30 seconds (see <code>computed_at</code>). Counts towards the usage cost reads'
         * rate limit.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSubscription(
                final String subscriptionId,
                final UsageRetrieveSubscriptionOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeRetrieveSubscription(subscriptionId, options, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Get usage summary
         *
         * <p>Retrieve aggregated usage data across all customers for the tenant.
         *
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSummary(
                final LocalDate startDate, final LocalDate endDate) {
            return retrieveSummary(
                    startDate, endDate, UsageRetrieveSummaryOptions.none(), RequestOptions.none());
        }

        /**
         * Get usage summary
         *
         * <p>Retrieve aggregated usage data across all customers for the tenant.
         *
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSummary(
                final LocalDate startDate,
                final LocalDate endDate,
                final UsageRetrieveSummaryOptions options) {
            return retrieveSummary(startDate, endDate, options, RequestOptions.none());
        }

        /**
         * Get usage summary
         *
         * <p>Retrieve aggregated usage data across all customers for the tenant.
         *
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSummary(
                final LocalDate startDate,
                final LocalDate endDate,
                final RequestOptions requestOptions) {
            return retrieveSummary(
                    startDate, endDate, UsageRetrieveSummaryOptions.none(), requestOptions);
        }

        /**
         * Get usage summary
         *
         * <p>Retrieve aggregated usage data across all customers for the tenant.
         *
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieveSummary(
                final LocalDate startDate,
                final LocalDate endDate,
                final UsageRetrieveSummaryOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeRetrieveSummary(startDate, endDate, options, requestOptions)
                    .sendRawAsync();
        }
    }
}
