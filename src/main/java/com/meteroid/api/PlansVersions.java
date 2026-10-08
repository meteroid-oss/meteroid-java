// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.MinimumCommitment;
import com.meteroid.models.PlanVersionListResponse;
import com.meteroid.models.PlanVersionSummary;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code plans.versions} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class PlansVersions {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public PlansVersions(MeteroidHttpClient client) {
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
     * Set or replace the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param minimumCommitment the request body
     * @return the response body
     */
    public MinimumCommitment updateMinimum(
            final String planVersionId, final MinimumCommitment minimumCommitment) {
        return updateMinimum(planVersionId, minimumCommitment, RequestOptions.none());
    }

    /**
     * Set or replace the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param minimumCommitment the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public MinimumCommitment updateMinimum(
            final String planVersionId,
            final MinimumCommitment minimumCommitment,
            final RequestOptions requestOptions) {
        return exchangeUpdateMinimum(planVersionId, minimumCommitment, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<MinimumCommitment> exchangeUpdateMinimum(
            final String planVersionId,
            final MinimumCommitment minimumCommitment,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planVersionId, "plan_version_id");
        Objects.requireNonNull(minimumCommitment, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans/versions")
                        .addPathSegment(Utils.pathSegment("plan_version_id", planVersionId))
                        .addPathSegments("minimum")
                        .build();
        return client.call("PUT", url)
                .json(minimumCommitment)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(MinimumCommitment.class);
    }

    /**
     * Remove the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     */
    public void deleteMinimum(final String planVersionId) {
        deleteMinimum(planVersionId, RequestOptions.none());
    }

    /**
     * Remove the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void deleteMinimum(final String planVersionId, final RequestOptions requestOptions) {
        exchangeDeleteMinimum(planVersionId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeDeleteMinimum(
            final String planVersionId, final RequestOptions requestOptions) {
        Objects.requireNonNull(planVersionId, "plan_version_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans/versions")
                        .addPathSegment(Utils.pathSegment("plan_version_id", planVersionId))
                        .addPathSegments("minimum")
                        .build();
        return client.call("DELETE", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansVersionsListPage list(final String planId) {
        return list(planId, PlansVersionsListOptions.none(), RequestOptions.none());
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansVersionsListPage list(final String planId, final PlansVersionsListOptions options) {
        return list(planId, options, RequestOptions.none());
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansVersionsListPage list(final String planId, final RequestOptions requestOptions) {
        return list(planId, PlansVersionsListOptions.none(), requestOptions);
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansVersionsListPage list(
            final String planId,
            final PlansVersionsListOptions options,
            final RequestOptions requestOptions) {
        return pageOfList(
                exchangeList(planId, options, requestOptions).send(),
                planId,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<PlanVersionListResponse> exchangeList(
            final String planId,
            final PlansVersionsListOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .addPathSegments("versions");
        Integer value1 = options.page().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value1));
        }
        Integer value2 = options.perPage().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value2));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(PlanVersionListResponse.class);
    }

    private PlansVersionsListPage pageOfList(
            PlanVersionListResponse response,
            final String planId,
            final PlansVersionsListOptions options,
            final RequestOptions requestOptions) {
        List<PlanVersionSummary> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new PlansVersionsListPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                list(
                                        planId,
                                        options.toBuilder().page(next).build(),
                                        requestOptions));
    }

    static List<PlanVersionSummary> itemsOfList(PlanVersionListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(
            PlanVersionListResponse response, List<PlanVersionSummary> items, Integer current) {
        if (items.isEmpty()) {
            return null;
        }
        long pages =
                Utils.optional(response.paginationMeta())
                        .flatMap(v2 -> Utils.optional(v2.totalPages()))
                        .map(Number::longValue)
                        .orElse(Long.MAX_VALUE);
        if (current - 0 + 1 >= pages) {
            return null;
        }
        return current + 1;
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Set or replace the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param minimumCommitment the request body
         * @return the status, headers and body
         */
        public ApiResponse<MinimumCommitment> updateMinimum(
                final String planVersionId, final MinimumCommitment minimumCommitment) {
            return updateMinimum(planVersionId, minimumCommitment, RequestOptions.none());
        }

        /**
         * Set or replace the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param minimumCommitment the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<MinimumCommitment> updateMinimum(
                final String planVersionId,
                final MinimumCommitment minimumCommitment,
                final RequestOptions requestOptions) {
            return PlansVersions.this
                    .exchangeUpdateMinimum(planVersionId, minimumCommitment, requestOptions)
                    .sendRaw();
        }

        /**
         * Remove the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> deleteMinimum(final String planVersionId) {
            return deleteMinimum(planVersionId, RequestOptions.none());
        }

        /**
         * Remove the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> deleteMinimum(
                final String planVersionId, final RequestOptions requestOptions) {
            return PlansVersions.this
                    .exchangeDeleteMinimum(planVersionId, requestOptions)
                    .sendRaw();
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<PlansVersionsListPage> list(final String planId) {
            return list(planId, PlansVersionsListOptions.none(), RequestOptions.none());
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<PlansVersionsListPage> list(
                final String planId, final PlansVersionsListOptions options) {
            return list(planId, options, RequestOptions.none());
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<PlansVersionsListPage> list(
                final String planId, final RequestOptions requestOptions) {
            return list(planId, PlansVersionsListOptions.none(), requestOptions);
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<PlansVersionsListPage> list(
                final String planId,
                final PlansVersionsListOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<PlanVersionListResponse> response =
                    exchangeList(planId, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), planId, options, requestOptions));
        }
    }
}
