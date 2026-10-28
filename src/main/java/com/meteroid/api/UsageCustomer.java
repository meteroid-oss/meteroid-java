// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.UnattributedUsageResponse;
import com.meteroid.models.UsageResponse;

import okhttp3.HttpUrl;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The {@code usage.customer} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class UsageCustomer {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public UsageCustomer(MeteroidHttpClient client) {
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
     * Get customer usage
     *
     * <p>Retrieve aggregated usage data for a customer over a specified period.
     *
     * @param customerId the {@code customer_id} path parameter
     * @param startDate the {@code start_date} required parameter
     * @param endDate the {@code end_date} required parameter
     * @return the response body
     */
    public UsageResponse retrieve(
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
     * @return the response body
     */
    public UsageResponse retrieve(
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
     * @return the response body
     */
    public UsageResponse retrieve(
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
     * @return the response body
     */
    public UsageResponse retrieve(
            final String customerId,
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageCustomerRetrieveOptions options,
            final RequestOptions requestOptions) {
        return exchangeRetrieve(customerId, startDate, endDate, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<UsageResponse> exchangeRetrieve(
            final String customerId,
            final LocalDate startDate,
            final LocalDate endDate,
            final UsageCustomerRetrieveOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(customerId, "customer_id");
        Objects.requireNonNull(startDate, "start_date");
        Objects.requireNonNull(endDate, "end_date");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/customer")
                        .addPathSegment(Utils.pathSegment("customer_id", customerId));
        url.addQueryParameter("start_date", Utils.serializeQueryParam(startDate));
        url.addQueryParameter("end_date", Utils.serializeQueryParam(endDate));
        String value3 = options.metricId().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("metric_id", value3);
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(UsageResponse.class);
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
     * @return the response body
     */
    public UnattributedUsageResponse retrieveUnattributed(final String customerId) {
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
     * @return the response body
     */
    public UnattributedUsageResponse retrieveUnattributed(
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
     * @return the response body
     */
    public UnattributedUsageResponse retrieveUnattributed(
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
     * @return the response body
     */
    public UnattributedUsageResponse retrieveUnattributed(
            final String customerId,
            final UsageCustomerRetrieveUnattributedOptions options,
            final RequestOptions requestOptions) {
        return exchangeRetrieveUnattributed(customerId, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<UnattributedUsageResponse> exchangeRetrieveUnattributed(
            final String customerId,
            final UsageCustomerRetrieveUnattributedOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(customerId, "customer_id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/usage/customer")
                        .addPathSegment(Utils.pathSegment("customer_id", customerId))
                        .addPathSegments("unattributed");
        LocalDate value1 = options.startDate().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("start_date", Utils.serializeQueryParam(value1));
        }
        LocalDate value2 = options.endDate().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("end_date", Utils.serializeQueryParam(value2));
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
                .returning(UnattributedUsageResponse.class);
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageResponse> retrieve(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageResponse> retrieve(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageResponse> retrieve(
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
         * @return the status, headers and body
         */
        public ApiResponse<UsageResponse> retrieve(
                final String customerId,
                final LocalDate startDate,
                final LocalDate endDate,
                final UsageCustomerRetrieveOptions options,
                final RequestOptions requestOptions) {
            return UsageCustomer.this
                    .exchangeRetrieve(customerId, startDate, endDate, options, requestOptions)
                    .sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<UnattributedUsageResponse> retrieveUnattributed(
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
         * @return the status, headers and body
         */
        public ApiResponse<UnattributedUsageResponse> retrieveUnattributed(
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
         * @return the status, headers and body
         */
        public ApiResponse<UnattributedUsageResponse> retrieveUnattributed(
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
         * @return the status, headers and body
         */
        public ApiResponse<UnattributedUsageResponse> retrieveUnattributed(
                final String customerId,
                final UsageCustomerRetrieveUnattributedOptions options,
                final RequestOptions requestOptions) {
            return UsageCustomer.this
                    .exchangeRetrieveUnattributed(customerId, options, requestOptions)
                    .sendRaw();
        }
    }
}
