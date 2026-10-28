// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.UnattributedUsageResponse;
import com.meteroid.models.UsageResponse;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code usage.customer} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class UsageCustomerAsync {
    private final UsageCustomer sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public UsageCustomerAsync(UsageCustomer sync) {
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
     * Get customer usage
     *
     * <p>Retrieve aggregated usage data for a customer over a specified period.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieve(
            final String customerId, final LocalDate startDate, final LocalDate endDate) {
        return retrieve(
                customerId,
                startDate,
                endDate,
                UsageCustomerRetrieveOptions.none(),
                RequestOptions.none());
    }

    /**
     * Get customer usage
     *
     * <p>Retrieve aggregated usage data for a customer over a specified period.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieve(
            final String customerId,
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageCustomerRetrieveOptions options) {
        return retrieve(customerId, startDate, endDate, options, RequestOptions.none());
    }

    /**
     * Get customer usage
     *
     * <p>Retrieve aggregated usage data for a customer over a specified period.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieve(
            final String customerId,
            final LocalDate startDate,
            final LocalDate endDate,
            final RequestOptions requestOptions) {
        return retrieve(
                customerId,
                startDate,
                endDate,
                UsageCustomerRetrieveOptions.none(),
                requestOptions);
    }

    /**
     * Get customer usage
     *
     * <p>Retrieve aggregated usage data for a customer over a specified period.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageResponse> retrieve(
            final String customerId,
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageCustomerRetrieveOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(customerId, startDate, endDate, options, requestOptions)
                .sendAsync();
    }

    /**
     * Get unattributed usage
     *
     * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the customer
     * pricing a metric set a usage filter, events matching none of the filters are billed by a
     * subscription without one; when every such subscription has a filter, those events are kept
     * and reported here instead of being billed.
     *
     * @param customerId the {@code customer_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<UnattributedUsageResponse> retrieveUnattributed(
            final String customerId) {
        return retrieveUnattributed(
                customerId, UsageCustomerRetrieveUnattributedOptions.none(), RequestOptions.none());
    }

    /**
     * Get unattributed usage
     *
     * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the customer
     * pricing a metric set a usage filter, events matching none of the filters are billed by a
     * subscription without one; when every such subscription has a filter, those events are kept
     * and reported here instead of being billed.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UnattributedUsageResponse> retrieveUnattributed(
            final String customerId, final UsageCustomerRetrieveUnattributedOptions options) {
        return retrieveUnattributed(customerId, options, RequestOptions.none());
    }

    /**
     * Get unattributed usage
     *
     * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the customer
     * pricing a metric set a usage filter, events matching none of the filters are billed by a
     * subscription without one; when every such subscription has a filter, those events are kept
     * and reported here instead of being billed.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UnattributedUsageResponse> retrieveUnattributed(
            final String customerId, final RequestOptions requestOptions) {
        return retrieveUnattributed(
                customerId, UsageCustomerRetrieveUnattributedOptions.none(), requestOptions);
    }

    /**
     * Get unattributed usage
     *
     * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the customer
     * pricing a metric set a usage filter, events matching none of the filters are billed by a
     * subscription without one; when every such subscription has a filter, those events are kept
     * and reported here instead of being billed.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UnattributedUsageResponse> retrieveUnattributed(
            final String customerId,
            final UsageCustomerRetrieveUnattributedOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeRetrieveUnattributed(customerId, options, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Get customer usage
         *
         * <p>Retrieve aggregated usage data for a customer over a specified period.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieve(
                final String customerId, final LocalDate startDate, final LocalDate endDate) {
            return retrieve(
                    customerId,
                    startDate,
                    endDate,
                    UsageCustomerRetrieveOptions.none(),
                    RequestOptions.none());
        }

        /**
         * Get customer usage
         *
         * <p>Retrieve aggregated usage data for a customer over a specified period.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieve(
                final String customerId,
                final LocalDate startDate,
                final LocalDate endDate,
                final UsageCustomerRetrieveOptions options) {
            return retrieve(customerId, startDate, endDate, options, RequestOptions.none());
        }

        /**
         * Get customer usage
         *
         * <p>Retrieve aggregated usage data for a customer over a specified period.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieve(
                final String customerId,
                final LocalDate startDate,
                final LocalDate endDate,
                final RequestOptions requestOptions) {
            return retrieve(
                    customerId,
                    startDate,
                    endDate,
                    UsageCustomerRetrieveOptions.none(),
                    requestOptions);
        }

        /**
         * Get customer usage
         *
         * <p>Retrieve aggregated usage data for a customer over a specified period.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param startDate the {@code start_date} required parameter
         * @param endDate the {@code end_date} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageResponse>> retrieve(
                final String customerId,
                final LocalDate startDate,
                final LocalDate endDate,
                final UsageCustomerRetrieveOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(customerId, startDate, endDate, options, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Get unattributed usage
         *
         * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the
         * customer pricing a metric set a usage filter, events matching none of the filters are
         * billed by a subscription without one; when every such subscription has a filter, those
         * events are kept and reported here instead of being billed.
         *
         * @param customerId the {@code customer_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UnattributedUsageResponse>> retrieveUnattributed(
                final String customerId) {
            return retrieveUnattributed(
                    customerId,
                    UsageCustomerRetrieveUnattributedOptions.none(),
                    RequestOptions.none());
        }

        /**
         * Get unattributed usage
         *
         * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the
         * customer pricing a metric set a usage filter, events matching none of the filters are
         * billed by a subscription without one; when every such subscription has a filter, those
         * events are kept and reported here instead of being billed.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UnattributedUsageResponse>> retrieveUnattributed(
                final String customerId, final UsageCustomerRetrieveUnattributedOptions options) {
            return retrieveUnattributed(customerId, options, RequestOptions.none());
        }

        /**
         * Get unattributed usage
         *
         * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the
         * customer pricing a metric set a usage filter, events matching none of the filters are
         * billed by a subscription without one; when every such subscription has a filter, those
         * events are kept and reported here instead of being billed.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UnattributedUsageResponse>> retrieveUnattributed(
                final String customerId, final RequestOptions requestOptions) {
            return retrieveUnattributed(
                    customerId, UsageCustomerRetrieveUnattributedOptions.none(), requestOptions);
        }

        /**
         * Get unattributed usage
         *
         * <p>Retrieve a customer's usage that no subscription bills. When subscriptions of the
         * customer pricing a metric set a usage filter, events matching none of the filters are
         * billed by a subscription without one; when every such subscription has a filter, those
         * events are kept and reported here instead of being billed.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UnattributedUsageResponse>> retrieveUnattributed(
                final String customerId,
                final UsageCustomerRetrieveUnattributedOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeRetrieveUnattributed(customerId, options, requestOptions)
                    .sendRawAsync();
        }
    }
}
