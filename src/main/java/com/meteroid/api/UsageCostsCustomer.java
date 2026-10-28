// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.ListCustomerUsageCostsGranularity;
import com.meteroid.models.UsageCostListResponse;
import com.meteroid.models.UsageEventListResponse;

import okhttp3.HttpUrl;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The {@code usage_costs.customer} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class UsageCostsCustomer {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public UsageCostsCustomer(MeteroidHttpClient client) {
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListCostsOptions options,
            final RequestOptions requestOptions) {
        return exchangeListCosts(customerId, metric, granularity, from, to, options, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<UsageCostListResponse> exchangeListCosts(
            final String customerId,
            final String metric,
            final ListCustomerUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListCostsOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(customerId, "customer_id");
        Objects.requireNonNull(metric, "metric");
        Objects.requireNonNull(granularity, "granularity");
        Objects.requireNonNull(from, "from");
        Objects.requireNonNull(to, "to");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/customer")
                        .addPathSegment(Utils.pathSegment("customer_id", customerId))
                        .addPathSegments("costs");
        url.addQueryParameter("metric", metric);
        String value2 = options.groupBy().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("group_by", value2);
        }
        url.addQueryParameter("granularity", Utils.serializeQueryParam(granularity));
        url.addQueryParameter("from", Utils.serializeQueryParam(from));
        url.addQueryParameter("to", Utils.serializeQueryParam(to));
        return client.call("GET", url.build())
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(UsageCostListResponse.class);
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListEventsOptions options,
            final RequestOptions requestOptions) {
        return exchangeListEvents(customerId, metric, from, to, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<UsageEventListResponse> exchangeListEvents(
            final String customerId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsCustomerListEventsOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(customerId, "customer_id");
        Objects.requireNonNull(metric, "metric");
        Objects.requireNonNull(from, "from");
        Objects.requireNonNull(to, "to");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/customer")
                        .addPathSegment(Utils.pathSegment("customer_id", customerId))
                        .addPathSegments("events");
        url.addQueryParameter("metric", metric);
        url.addQueryParameter("from", Utils.serializeQueryParam(from));
        url.addQueryParameter("to", Utils.serializeQueryParam(to));
        String value4 = options.cursor().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("cursor", value4);
        }
        Integer value5 = options.limit().orElse(null);
        if (value5 != null) {
            url.addQueryParameter("limit", Utils.serializeQueryParam(value5));
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
                .returning(UsageEventListResponse.class);
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
                final String customerId,
                final String metric,
                final ListCustomerUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListCostsOptions options,
                final RequestOptions requestOptions) {
            return UsageCostsCustomer.this
                    .exchangeListCosts(
                            customerId, metric, granularity, from, to, options, requestOptions)
                    .sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
                final String customerId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsCustomerListEventsOptions options,
                final RequestOptions requestOptions) {
            return UsageCostsCustomer.this
                    .exchangeListEvents(customerId, metric, from, to, options, requestOptions)
                    .sendRaw();
        }
    }
}
