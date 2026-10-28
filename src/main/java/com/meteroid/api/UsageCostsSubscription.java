// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.ListSubscriptionUsageCostsGranularity;
import com.meteroid.models.UsageCostListResponse;
import com.meteroid.models.UsageEventListResponse;

import okhttp3.HttpUrl;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The {@code usage_costs.subscription} operations, blocking. {@link #withRawResponse()} has the
 * same methods returning the status and headers along with the body.
 */
public final class UsageCostsSubscription {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public UsageCostsSubscription(MeteroidHttpClient client) {
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
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
     * @return the response body
     */
    public UsageCostListResponse listCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListCostsOptions options,
            final RequestOptions requestOptions) {
        return exchangeListCosts(
                        subscriptionId, metric, granularity, from, to, options, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<UsageCostListResponse> exchangeListCosts(
            final String subscriptionId,
            final String metric,
            final ListSubscriptionUsageCostsGranularity granularity,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListCostsOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(subscriptionId, "subscription_id");
        Objects.requireNonNull(metric, "metric");
        Objects.requireNonNull(granularity, "granularity");
        Objects.requireNonNull(from, "from");
        Objects.requireNonNull(to, "to");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/subscription")
                        .addPathSegment(Utils.pathSegment("subscription_id", subscriptionId))
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
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
     * @return the response body
     */
    public UsageEventListResponse listEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListEventsOptions options,
            final RequestOptions requestOptions) {
        return exchangeListEvents(subscriptionId, metric, from, to, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<UsageEventListResponse> exchangeListEvents(
            final String subscriptionId,
            final String metric,
            final OffsetDateTime from,
            final OffsetDateTime to,
            final UsageCostsSubscriptionListEventsOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(subscriptionId, "subscription_id");
        Objects.requireNonNull(metric, "metric");
        Objects.requireNonNull(from, "from");
        Objects.requireNonNull(to, "to");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/subscription")
                        .addPathSegment(Utils.pathSegment("subscription_id", subscriptionId))
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageCostListResponse> listCosts(
                final String subscriptionId,
                final String metric,
                final ListSubscriptionUsageCostsGranularity granularity,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListCostsOptions options,
                final RequestOptions requestOptions) {
            return UsageCostsSubscription.this
                    .exchangeListCosts(
                            subscriptionId, metric, granularity, from, to, options, requestOptions)
                    .sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageEventListResponse> listEvents(
                final String subscriptionId,
                final String metric,
                final OffsetDateTime from,
                final OffsetDateTime to,
                final UsageCostsSubscriptionListEventsOptions options,
                final RequestOptions requestOptions) {
            return UsageCostsSubscription.this
                    .exchangeListEvents(subscriptionId, metric, from, to, options, requestOptions)
                    .sendRaw();
        }
    }
}
