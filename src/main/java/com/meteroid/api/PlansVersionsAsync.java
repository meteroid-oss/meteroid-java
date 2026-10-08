// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.MinimumCommitment;
import com.meteroid.models.PlanVersionListResponse;
import com.meteroid.models.PlanVersionSummary;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code plans.versions} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class PlansVersionsAsync {
    private final PlansVersions sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public PlansVersionsAsync(PlansVersions sync) {
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
     * Set or replace the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param minimumCommitment the request body
     * @return the response body, once received
     */
    public CompletableFuture<MinimumCommitment> updateMinimum(
            final String planVersionId, final MinimumCommitment minimumCommitment) {
        return updateMinimum(planVersionId, minimumCommitment, RequestOptions.none());
    }

    /**
     * Set or replace the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param minimumCommitment the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<MinimumCommitment> updateMinimum(
            final String planVersionId,
            final MinimumCommitment minimumCommitment,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdateMinimum(planVersionId, minimumCommitment, requestOptions)
                .sendAsync();
    }

    /**
     * Remove the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> deleteMinimum(final String planVersionId) {
        return deleteMinimum(planVersionId, RequestOptions.none());
    }

    /**
     * Remove the plan-level minimum commitment for a draft plan version.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> deleteMinimum(
            final String planVersionId, final RequestOptions requestOptions) {
        return sync.exchangeDeleteMinimum(planVersionId, requestOptions).sendAsync();
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @return the page, once received
     */
    public CompletableFuture<PlansVersionsListAsyncPage> list(final String planId) {
        return list(planId, PlansVersionsListOptions.none(), RequestOptions.none());
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<PlansVersionsListAsyncPage> list(
            final String planId, final PlansVersionsListOptions options) {
        return list(planId, options, RequestOptions.none());
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<PlansVersionsListAsyncPage> list(
            final String planId, final RequestOptions requestOptions) {
        return list(planId, PlansVersionsListOptions.none(), requestOptions);
    }

    /**
     * List plan versions
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<PlansVersionsListAsyncPage> list(
            final String planId,
            final PlansVersionsListOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeList(planId, options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, planId, options, requestOptions));
    }

    private PlansVersionsListAsyncPage pageOfList(
            PlanVersionListResponse response,
            final String planId,
            final PlansVersionsListOptions options,
            final RequestOptions requestOptions) {
        List<PlanVersionSummary> items = PlansVersions.itemsOfList(response);
        Integer next = PlansVersions.nextOfList(response, items, options.page().orElse(0));
        return new PlansVersionsListAsyncPage(
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

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Set or replace the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param minimumCommitment the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<MinimumCommitment>> updateMinimum(
                final String planVersionId, final MinimumCommitment minimumCommitment) {
            return updateMinimum(planVersionId, minimumCommitment, RequestOptions.none());
        }

        /**
         * Set or replace the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param minimumCommitment the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<MinimumCommitment>> updateMinimum(
                final String planVersionId,
                final MinimumCommitment minimumCommitment,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdateMinimum(planVersionId, minimumCommitment, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Remove the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> deleteMinimum(final String planVersionId) {
            return deleteMinimum(planVersionId, RequestOptions.none());
        }

        /**
         * Remove the plan-level minimum commitment for a draft plan version.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> deleteMinimum(
                final String planVersionId, final RequestOptions requestOptions) {
            return sync.exchangeDeleteMinimum(planVersionId, requestOptions).sendRawAsync();
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansVersionsListAsyncPage>> list(
                final String planId) {
            return list(planId, PlansVersionsListOptions.none(), RequestOptions.none());
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansVersionsListAsyncPage>> list(
                final String planId, final PlansVersionsListOptions options) {
            return list(planId, options, RequestOptions.none());
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansVersionsListAsyncPage>> list(
                final String planId, final RequestOptions requestOptions) {
            return list(planId, PlansVersionsListOptions.none(), requestOptions);
        }

        /**
         * List plan versions
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansVersionsListAsyncPage>> list(
                final String planId,
                final PlansVersionsListOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeList(planId, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfList(
                                                    response.body(),
                                                    planId,
                                                    options,
                                                    requestOptions)));
        }
    }
}
