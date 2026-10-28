// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.ListSubscriptionUsageCostsGranularity;
import com.meteroid.models.UsageCostListResponse;
import com.meteroid.models.UsageEventListResponse;

import java.time.OffsetDateTime;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code usage_costs.subscription} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class UsageCostsSubscriptionAsync {
    private final UsageCostsSubscription sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public UsageCostsSubscriptionAsync(UsageCostsSubscription sync) {
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
     * List a subscription's usage costs over time
     *
     * <p>The subscription's usage of one billable metric and what it costs, as for a customer but
     * counting only the events the subscription bills (see its usage filter) and only its own
     * billing periods. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to) {
        return listCosts(
                subscriptionId,
                metric,
                granularity,
                from,
                to,
                UsageCostsSubscriptionListCostsOptions.none(),
                RequestOptions.none());
    }

    /**
     * List a subscription's usage costs over time
     *
     * <p>The subscription's usage of one billable metric and what it costs, as for a customer but
     * counting only the events the subscription bills (see its usage filter) and only its own
     * billing periods. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListCostsOptions options) {
        return listCosts(
                subscriptionId, metric, granularity, from, to, options, RequestOptions.none());
    }

    /**
     * List a subscription's usage costs over time
     *
     * <p>The subscription's usage of one billable metric and what it costs, as for a customer but
     * counting only the events the subscription bills (see its usage filter) and only its own
     * billing periods. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final RequestOptions requestOptions) {
        return listCosts(
                subscriptionId,
                metric,
                granularity,
                from,
                to,
                UsageCostsSubscriptionListCostsOptions.none(),
                requestOptions);
    }

    /**
     * List a subscription's usage costs over time
     *
     * <p>The subscription's usage of one billable metric and what it costs, as for a customer but
     * counting only the events the subscription bills (see its usage filter) and only its own
     * billing periods. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param granularity the {@code granularity} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageCostListResponse> listCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListCostsOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListCosts(
                        subscriptionId, metric, granularity, from, to, options, requestOptions)
                .sendAsync();
    }

    /**
     * List a subscription's usage events with their cost
     *
     * <p>The events of one billable metric that the subscription bills, oldest first: with a usage
     * filter, only the customer's events matching it; without, those no other subscription's filter
     * claims. Costs are as for the customer's events. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to) {
        return listEvents(
                subscriptionId,
                metric,
                from,
                to,
                UsageCostsSubscriptionListEventsOptions.none(),
                RequestOptions.none());
    }

    /**
     * List a subscription's usage events with their cost
     *
     * <p>The events of one billable metric that the subscription bills, oldest first: with a usage
     * filter, only the customer's events matching it; without, those no other subscription's filter
     * claims. Costs are as for the customer's events. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListEventsOptions options) {
        return listEvents(subscriptionId, metric, from, to, options, RequestOptions.none());
    }

    /**
     * List a subscription's usage events with their cost
     *
     * <p>The events of one billable metric that the subscription bills, oldest first: with a usage
     * filter, only the customer's events matching it; without, those no other subscription's filter
     * claims. Costs are as for the customer's events. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final RequestOptions requestOptions) {
        return listEvents(
                subscriptionId,
                metric,
                from,
                to,
                UsageCostsSubscriptionListEventsOptions.none(),
                requestOptions);
    }

    /**
     * List a subscription's usage events with their cost
     *
     * <p>The events of one billable metric that the subscription bills, oldest first: with a usage
     * filter, only the customer's events matching it; without, those no other subscription's filter
     * claims. Costs are as for the customer's events. The range is at most 93 days.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param subscriptionId the {@code subscription_id} path parameter
     * @param metric the {@code metric} required parameter
     * @param from the {@code from} required parameter
     * @param to the {@code to} required parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<UsageEventListResponse> listEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListEventsOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListEvents(subscriptionId, metric, from, to, options, requestOptions)
                .sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List a subscription's usage costs over time
         *
         * <p>The subscription's usage of one billable metric and what it costs, as for a customer
         * but counting only the events the subscription bills (see its usage filter) and only its
         * own billing periods. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String subscriptionId,
                final String metric,
                final ListSubscriptionUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to) {
            return listCosts(
                    subscriptionId,
                    metric,
                    granularity,
                    from,
                    to,
                    UsageCostsSubscriptionListCostsOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List a subscription's usage costs over time
         *
         * <p>The subscription's usage of one billable metric and what it costs, as for a customer
         * but counting only the events the subscription bills (see its usage filter) and only its
         * own billing periods. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String subscriptionId,
                final String metric,
                final ListSubscriptionUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListCostsOptions options) {
            return listCosts(
                    subscriptionId, metric, granularity, from, to, options, RequestOptions.none());
        }

        /**
         * List a subscription's usage costs over time
         *
         * <p>The subscription's usage of one billable metric and what it costs, as for a customer
         * but counting only the events the subscription bills (see its usage filter) and only its
         * own billing periods. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String subscriptionId,
                final String metric,
                final ListSubscriptionUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final RequestOptions requestOptions) {
            return listCosts(
                    subscriptionId,
                    metric,
                    granularity,
                    from,
                    to,
                    UsageCostsSubscriptionListCostsOptions.none(),
                    requestOptions);
        }

        /**
         * List a subscription's usage costs over time
         *
         * <p>The subscription's usage of one billable metric and what it costs, as for a customer
         * but counting only the events the subscription bills (see its usage filter) and only its
         * own billing periods. The range is at most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param granularity the {@code granularity} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageCostListResponse>> listCosts(
                final String subscriptionId,
                final String metric,
                final ListSubscriptionUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListCostsOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeListCosts(
                            subscriptionId, metric, granularity, from, to, options, requestOptions)
                    .sendRawAsync();
        }

        /**
         * List a subscription's usage events with their cost
         *
         * <p>The events of one billable metric that the subscription bills, oldest first: with a
         * usage filter, only the customer's events matching it; without, those no other
         * subscription's filter claims. Costs are as for the customer's events. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String subscriptionId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to) {
            return listEvents(
                    subscriptionId,
                    metric,
                    from,
                    to,
                    UsageCostsSubscriptionListEventsOptions.none(),
                    RequestOptions.none());
        }

        /**
         * List a subscription's usage events with their cost
         *
         * <p>The events of one billable metric that the subscription bills, oldest first: with a
         * usage filter, only the customer's events matching it; without, those no other
         * subscription's filter claims. Costs are as for the customer's events. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String subscriptionId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListEventsOptions options) {
            return listEvents(subscriptionId, metric, from, to, options, RequestOptions.none());
        }

        /**
         * List a subscription's usage events with their cost
         *
         * <p>The events of one billable metric that the subscription bills, oldest first: with a
         * usage filter, only the customer's events matching it; without, those no other
         * subscription's filter claims. Costs are as for the customer's events. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String subscriptionId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final RequestOptions requestOptions) {
            return listEvents(
                    subscriptionId,
                    metric,
                    from,
                    to,
                    UsageCostsSubscriptionListEventsOptions.none(),
                    requestOptions);
        }

        /**
         * List a subscription's usage events with their cost
         *
         * <p>The events of one billable metric that the subscription bills, oldest first: with a
         * usage filter, only the customer's events matching it; without, those no other
         * subscription's filter claims. Costs are as for the customer's events. The range is at
         * most 93 days.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param subscriptionId the {@code subscription_id} path parameter
         * @param metric the {@code metric} required parameter
         * @param from the {@code from} required parameter
         * @param to the {@code to} required parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<UsageEventListResponse>> listEvents(
                final String subscriptionId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListEventsOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeListEvents(
                            subscriptionId, metric, from, to, options, requestOptions)
                    .sendRawAsync();
        }
    }
}
