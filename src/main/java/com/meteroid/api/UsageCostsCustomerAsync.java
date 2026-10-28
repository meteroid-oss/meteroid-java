// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.ListCustomerUsageCostsGranularity;
import com.meteroid.models.UsageCostListResponse;
import com.meteroid.models.UsageEventListResponse;

import java.time.OffsetDateTime;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code usage_costs.customer} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class UsageCostsCustomerAsync {
    private final UsageCostsCustomer sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public UsageCostsCustomerAsync(UsageCostsCustomer sync) {
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
     * List a customer's usage costs over time
     *
     * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
     * optionally split by an event property, summed across the subscriptions that bill it. Buckets
     * are cut at UTC boundaries and only cover the customer's billing periods. Per-unit and matrix
     * pricing give exact costs. For pricing that depends on the whole period's usage (tiered,
     * volume, package, capacity), a bucket's cost is what it adds to the period's price so far and
     * <code>exact</code> is false. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to) {
        return listCosts(
                customerId,
                metric,
                granularity,
                from,
                to,
                UsageCostsCustomerListCostsOptions.none(),
                RequestOptions.none());
    }

    /**
     * List a customer's usage costs over time
     *
     * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
     * optionally split by an event property, summed across the subscriptions that bill it. Buckets
     * are cut at UTC boundaries and only cover the customer's billing periods. Per-unit and matrix
     * pricing give exact costs. For pricing that depends on the whole period's usage (tiered,
     * volume, package, capacity), a bucket's cost is what it adds to the period's price so far and
     * <code>exact</code> is false. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListCostsOptions options) {
        return listCosts(customerId, metric, granularity, from, to, options, RequestOptions.none());
    }

    /**
     * List a customer's usage costs over time
     *
     * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
     * optionally split by an event property, summed across the subscriptions that bill it. Buckets
     * are cut at UTC boundaries and only cover the customer's billing periods. Per-unit and matrix
     * pricing give exact costs. For pricing that depends on the whole period's usage (tiered,
     * volume, package, capacity), a bucket's cost is what it adds to the period's price so far and
     * <code>exact</code> is false. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final RequestOptions requestOptions) {
        return listCosts(
                customerId,
                metric,
                granularity,
                from,
                to,
                UsageCostsCustomerListCostsOptions.none(),
                requestOptions);
    }

    /**
     * List a customer's usage costs over time
     *
     * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
     * optionally split by an event property, summed across the subscriptions that bill it. Buckets
     * are cut at UTC boundaries and only cover the customer's billing periods. Per-unit and matrix
     * pricing give exact costs. For pricing that depends on the whole period's usage (tiered,
     * volume, package, capacity), a bucket's cost is what it adds to the period's price so far and
     * <code>exact</code> is false. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListCostsOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListCosts(
                        customerId, metric, granularity, from, to, options, requestOptions)
                .sendAsync();
    }

    /**
     * List a customer's usage events with their cost
     *
     * <p>A customer's events for one billable metric, oldest first, each with the units it adds and
     * what they cost at the price in force. The cost is exact for per-unit and matrix pricing and
     * absent for pricing that depends on the whole period's usage (tiered, volume, package,
     * capacity) and for aggregations that cannot be split per event. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to) {
        return listEvents(
                customerId,
                metric,
                from,
                to,
                UsageCostsCustomerListEventsOptions.none(),
                RequestOptions.none());
    }

    /**
     * List a customer's usage events with their cost
     *
     * <p>A customer's events for one billable metric, oldest first, each with the units it adds and
     * what they cost at the price in force. The cost is exact for per-unit and matrix pricing and
     * absent for pricing that depends on the whole period's usage (tiered, volume, package,
     * capacity) and for aggregations that cannot be split per event. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListEventsOptions options) {
        return listEvents(customerId, metric, from, to, options, RequestOptions.none());
    }

    /**
     * List a customer's usage events with their cost
     *
     * <p>A customer's events for one billable metric, oldest first, each with the units it adds and
     * what they cost at the price in force. The cost is exact for per-unit and matrix pricing and
     * absent for pricing that depends on the whole period's usage (tiered, volume, package,
     * capacity) and for aggregations that cannot be split per event. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final RequestOptions requestOptions) {
        return listEvents(
                customerId,
                metric,
                from,
                to,
                UsageCostsCustomerListEventsOptions.none(),
                requestOptions);
    }

    /**
     * List a customer's usage events with their cost
     *
     * <p>A customer's events for one billable metric, oldest first, each with the units it adds and
     * what they cost at the price in force. The cost is exact for per-unit and matrix pricing and
     * absent for pricing that depends on the whole period's usage (tiered, volume, package,
     * capacity) and for aggregations that cannot be split per event. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListEventsOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListEvents(customerId, metric, from, to, options, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List a customer's usage costs over time
         *
         * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
         * optionally split by an event property, summed across the subscriptions that bill it.
         * Buckets are cut at UTC boundaries and only cover the customer's billing periods. Per-unit
         * and matrix pricing give exact costs. For pricing that depends on the whole period's usage
         * (tiered, volume, package, capacity), a bucket's cost is what it adds to the period's
         * price so far and <code>exact</code> is false. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String customerId,
                final String metric,
                final ListCustomerUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to) {
            return listCosts(
                    customerId,
                    metric,
                    granularity,
                    from,
                    to,
                    UsageCostsCustomerListCostsOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List a customer's usage costs over time
         *
         * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
         * optionally split by an event property, summed across the subscriptions that bill it.
         * Buckets are cut at UTC boundaries and only cover the customer's billing periods. Per-unit
         * and matrix pricing give exact costs. For pricing that depends on the whole period's usage
         * (tiered, volume, package, capacity), a bucket's cost is what it adds to the period's
         * price so far and <code>exact</code> is false. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String customerId,
                final String metric,
                final ListCustomerUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListCostsOptions options) {
            return listCosts(
                    customerId, metric, granularity, from, to, options, RequestOptions.none());
        }

        /**
         * List a customer's usage costs over time
         *
         * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
         * optionally split by an event property, summed across the subscriptions that bill it.
         * Buckets are cut at UTC boundaries and only cover the customer's billing periods. Per-unit
         * and matrix pricing give exact costs. For pricing that depends on the whole period's usage
         * (tiered, volume, package, capacity), a bucket's cost is what it adds to the period's
         * price so far and <code>exact</code> is false. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String customerId,
                final String metric,
                final ListCustomerUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final RequestOptions requestOptions) {
            return listCosts(
                    customerId,
                    metric,
                    granularity,
                    from,
                    to,
                    UsageCostsCustomerListCostsOptions.none(),
                    requestOptions);
        }

        /**
         * List a customer's usage costs over time
         *
         * <p>A customer's usage of one billable metric and what it costs, per hour, day or month,
         * optionally split by an event property, summed across the subscriptions that bill it.
         * Buckets are cut at UTC boundaries and only cover the customer's billing periods. Per-unit
         * and matrix pricing give exact costs. For pricing that depends on the whole period's usage
         * (tiered, volume, package, capacity), a bucket's cost is what it adds to the period's
         * price so far and <code>exact</code> is false. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String customerId,
                final String metric,
                final ListCustomerUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListCostsOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeListCosts(
                            customerId, metric, granularity, from, to, options, requestOptions)
                    .sendRawAsync();
        }

        /**
         * List a customer's usage events with their cost
         *
         * <p>A customer's events for one billable metric, oldest first, each with the units it adds
         * and what they cost at the price in force. The cost is exact for per-unit and matrix
         * pricing and absent for pricing that depends on the whole period's usage (tiered, volume,
         * package, capacity) and for aggregations that cannot be split per event. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String customerId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to) {
            return listEvents(
                    customerId,
                    metric,
                    from,
                    to,
                    UsageCostsCustomerListEventsOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List a customer's usage events with their cost
         *
         * <p>A customer's events for one billable metric, oldest first, each with the units it adds
         * and what they cost at the price in force. The cost is exact for per-unit and matrix
         * pricing and absent for pricing that depends on the whole period's usage (tiered, volume,
         * package, capacity) and for aggregations that cannot be split per event. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String customerId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListEventsOptions options) {
            return listEvents(customerId, metric, from, to, options, RequestOptions.none());
        }

        /**
         * List a customer's usage events with their cost
         *
         * <p>A customer's events for one billable metric, oldest first, each with the units it adds
         * and what they cost at the price in force. The cost is exact for per-unit and matrix
         * pricing and absent for pricing that depends on the whole period's usage (tiered, volume,
         * package, capacity) and for aggregations that cannot be split per event. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String customerId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final RequestOptions requestOptions) {
            return listEvents(
                    customerId,
                    metric,
                    from,
                    to,
                    UsageCostsCustomerListEventsOptions.none(),
                    requestOptions);
        }

        /**
         * List a customer's usage events with their cost
         *
         * <p>A customer's events for one billable metric, oldest first, each with the units it adds
         * and what they cost at the price in force. The cost is exact for per-unit and matrix
         * pricing and absent for pricing that depends on the whole period's usage (tiered, volume,
         * package, capacity) and for aggregations that cannot be split per event. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param customerId the {@code customer_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String customerId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListEventsOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeListEvents(customerId, metric, from, to, options, requestOptions)
                    .sendRawAsync();
        }
    }
}
