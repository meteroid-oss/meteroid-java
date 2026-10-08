// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateEntitlementsRequest;
import com.meteroid.models.CreatePlanRequest;
import com.meteroid.models.EntitlementListResponse;
import com.meteroid.models.PatchPlanRequest;
import com.meteroid.models.Plan;
import com.meteroid.models.PlanListResponse;
import com.meteroid.models.ReplacePlanRequest;
import com.meteroid.models.ResolvedEntitlementListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code plans} operations, without blocking: each method returns a {@link CompletableFuture}.
 * Obtained from {@code client.async()}.
 */
public final class PlansAsync {
    private final Plans sync;
    private final WithRawResponse withRawResponse;

    private final PlansVersionsAsync versions;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public PlansAsync(Plans sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.versions = new PlansVersionsAsync(sync.versions());
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
     * The {@code versions} operations.
     *
     * @return the operations
     */
    public PlansVersionsAsync versions() {
        return versions;
    }

    /**
     * List plan version entitlements
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> listPlanVersionEntitlements(
            final String planVersionId) {
        return listPlanVersionEntitlements(planVersionId, RequestOptions.none());
    }

    /**
     * List plan version entitlements
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<ResolvedEntitlementListResponse> listPlanVersionEntitlements(
            final String planVersionId, final RequestOptions requestOptions) {
        return sync.exchangeListPlanVersionEntitlements(planVersionId, requestOptions).sendAsync();
    }

    /**
     * Create plan version entitlements
     *
     * <p>Entitlements already present on this plan version are skipped.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param createEntitlementsRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> createPlanVersionEntitlement(
            final String planVersionId, final CreateEntitlementsRequest createEntitlementsRequest) {
        return createPlanVersionEntitlement(
                planVersionId, createEntitlementsRequest, RequestOptions.none());
    }

    /**
     * Create plan version entitlements
     *
     * <p>Entitlements already present on this plan version are skipped.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param createEntitlementsRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EntitlementListResponse> createPlanVersionEntitlement(
            final String planVersionId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreatePlanVersionEntitlement(
                        planVersionId, createEntitlementsRequest, requestOptions)
                .sendAsync();
    }

    /**
     * List plans
     *
     * @return the page, once received
     */
    public CompletableFuture<PlansListAsyncPage> list() {
        return list(PlansListOptions.none(), RequestOptions.none());
    }

    /**
     * List plans
     *
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<PlansListAsyncPage> list(final PlansListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List plans
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<PlansListAsyncPage> list(final RequestOptions requestOptions) {
        return list(PlansListOptions.none(), requestOptions);
    }

    /**
     * List plans
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<PlansListAsyncPage> list(
            final PlansListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, options, requestOptions));
    }

    private PlansListAsyncPage pageOfList(
            PlanListResponse response,
            final PlansListOptions options,
            final RequestOptions requestOptions) {
        List<Plan> items = Plans.itemsOfList(response);
        Integer next = Plans.nextOfList(response, items, options.page().orElse(0));
        return new PlansListAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    /**
     * Create a plan
     *
     * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
     * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
     *
     * @param createPlanRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Plan> create(final CreatePlanRequest createPlanRequest) {
        return create(createPlanRequest, RequestOptions.none());
    }

    /**
     * Create a plan
     *
     * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
     * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
     *
     * @param createPlanRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> create(
            final CreatePlanRequest createPlanRequest, final RequestOptions requestOptions) {
        return sync.exchangeCreate(createPlanRequest, requestOptions).sendAsync();
    }

    /**
     * Get plan details
     *
     * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version, <code>
     * ?version=2</code> for a specific version number, or omit for the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Plan> retrieve(final String planId) {
        return retrieve(planId, PlansRetrieveOptions.none(), RequestOptions.none());
    }

    /**
     * Get plan details
     *
     * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version, <code>
     * ?version=2</code> for a specific version number, or omit for the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<Plan> retrieve(
            final String planId, final PlansRetrieveOptions options) {
        return retrieve(planId, options, RequestOptions.none());
    }

    /**
     * Get plan details
     *
     * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version, <code>
     * ?version=2</code> for a specific version number, or omit for the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> retrieve(
            final String planId, final RequestOptions requestOptions) {
        return retrieve(planId, PlansRetrieveOptions.none(), requestOptions);
    }

    /**
     * Get plan details
     *
     * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version, <code>
     * ?version=2</code> for a specific version number, or omit for the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> retrieve(
            final String planId,
            final PlansRetrieveOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(planId, options, requestOptions).sendAsync();
    }

    /**
     * Replace a plan
     *
     * <p>Full replacement of a plan's version. On a draft plan, updates in-place. On a published
     * plan, creates a new version. Set <code>status</code> to <code>DRAFT</code> to stage as a new
     * draft without publishing.
     *
     * @param planId the {@code plan_id} path parameter
     * @param replacePlanRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Plan> replace(
            final String planId, final ReplacePlanRequest replacePlanRequest) {
        return replace(planId, replacePlanRequest, RequestOptions.none());
    }

    /**
     * Replace a plan
     *
     * <p>Full replacement of a plan's version. On a draft plan, updates in-place. On a published
     * plan, creates a new version. Set <code>status</code> to <code>DRAFT</code> to stage as a new
     * draft without publishing.
     *
     * @param planId the {@code plan_id} path parameter
     * @param replacePlanRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> replace(
            final String planId,
            final ReplacePlanRequest replacePlanRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeReplace(planId, replacePlanRequest, requestOptions).sendAsync();
    }

    /**
     * Update plan metadata
     *
     * <p>Partially update plan-level fields (name, description, self_service_rank). Does not modify
     * version-level configuration or components.
     *
     * @param planId the {@code plan_id} path parameter
     * @param patchPlanRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Plan> update(
            final String planId, final PatchPlanRequest patchPlanRequest) {
        return update(planId, patchPlanRequest, RequestOptions.none());
    }

    /**
     * Update plan metadata
     *
     * <p>Partially update plan-level fields (name, description, self_service_rank). Does not modify
     * version-level configuration or components.
     *
     * @param planId the {@code plan_id} path parameter
     * @param patchPlanRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> update(
            final String planId,
            final PatchPlanRequest patchPlanRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(planId, patchPlanRequest, requestOptions).sendAsync();
    }

    /**
     * Archive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> archive(final String planId) {
        return archive(planId, RequestOptions.none());
    }

    /**
     * Archive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> archive(
            final String planId, final RequestOptions requestOptions) {
        return sync.exchangeArchive(planId, requestOptions).sendAsync();
    }

    /**
     * Publish a draft plan version
     *
     * <p>Publishes the current draft version, making it the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Plan> publish(final String planId) {
        return publish(planId, RequestOptions.none());
    }

    /**
     * Publish a draft plan version
     *
     * <p>Publishes the current draft version, making it the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Plan> publish(
            final String planId, final RequestOptions requestOptions) {
        return sync.exchangePublish(planId, requestOptions).sendAsync();
    }

    /**
     * Unarchive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> unarchive(final String planId) {
        return unarchive(planId, RequestOptions.none());
    }

    /**
     * Unarchive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> unarchive(
            final String planId, final RequestOptions requestOptions) {
        return sync.exchangeUnarchive(planId, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code versions} operations.
         *
         * @return the operations
         */
        public PlansVersionsAsync.WithRawResponse versions() {
            return PlansAsync.this.versions.withRawResponse();
        }

        /**
         * List plan version entitlements
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>>
                listPlanVersionEntitlements(final String planVersionId) {
            return listPlanVersionEntitlements(planVersionId, RequestOptions.none());
        }

        /**
         * List plan version entitlements
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ResolvedEntitlementListResponse>>
                listPlanVersionEntitlements(
                        final String planVersionId, final RequestOptions requestOptions) {
            return sync.exchangeListPlanVersionEntitlements(planVersionId, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Create plan version entitlements
         *
         * <p>Entitlements already present on this plan version are skipped.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param createEntitlementsRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> createPlanVersionEntitlement(
                final String planVersionId,
                final CreateEntitlementsRequest createEntitlementsRequest) {
            return createPlanVersionEntitlement(
                    planVersionId, createEntitlementsRequest, RequestOptions.none());
        }

        /**
         * Create plan version entitlements
         *
         * <p>Entitlements already present on this plan version are skipped.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param createEntitlementsRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EntitlementListResponse>> createPlanVersionEntitlement(
                final String planVersionId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreatePlanVersionEntitlement(
                            planVersionId, createEntitlementsRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * List plans
         *
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansListAsyncPage>> list() {
            return list(PlansListOptions.none(), RequestOptions.none());
        }

        /**
         * List plans
         *
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansListAsyncPage>> list(
                final PlansListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List plans
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansListAsyncPage>> list(
                final RequestOptions requestOptions) {
            return list(PlansListOptions.none(), requestOptions);
        }

        /**
         * List plans
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<PlansListAsyncPage>> list(
                final PlansListOptions options, final RequestOptions requestOptions) {
            return sync.exchangeList(options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfList(response.body(), options, requestOptions)));
        }

        /**
         * Create a plan
         *
         * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
         * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
         *
         * @param createPlanRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> create(
                final CreatePlanRequest createPlanRequest) {
            return create(createPlanRequest, RequestOptions.none());
        }

        /**
         * Create a plan
         *
         * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
         * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
         *
         * @param createPlanRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> create(
                final CreatePlanRequest createPlanRequest, final RequestOptions requestOptions) {
            return sync.exchangeCreate(createPlanRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get plan details
         *
         * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version,
         * <code>?version=2</code> for a specific version number, or omit for the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> retrieve(final String planId) {
            return retrieve(planId, PlansRetrieveOptions.none(), RequestOptions.none());
        }

        /**
         * Get plan details
         *
         * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version,
         * <code>?version=2</code> for a specific version number, or omit for the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> retrieve(
                final String planId, final PlansRetrieveOptions options) {
            return retrieve(planId, options, RequestOptions.none());
        }

        /**
         * Get plan details
         *
         * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version,
         * <code>?version=2</code> for a specific version number, or omit for the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> retrieve(
                final String planId, final RequestOptions requestOptions) {
            return retrieve(planId, PlansRetrieveOptions.none(), requestOptions);
        }

        /**
         * Get plan details
         *
         * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version,
         * <code>?version=2</code> for a specific version number, or omit for the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> retrieve(
                final String planId,
                final PlansRetrieveOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(planId, options, requestOptions).sendRawAsync();
        }

        /**
         * Replace a plan
         *
         * <p>Full replacement of a plan's version. On a draft plan, updates in-place. On a
         * published plan, creates a new version. Set <code>status</code> to <code>DRAFT</code> to
         * stage as a new draft without publishing.
         *
         * @param planId the {@code plan_id} path parameter
         * @param replacePlanRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> replace(
                final String planId, final ReplacePlanRequest replacePlanRequest) {
            return replace(planId, replacePlanRequest, RequestOptions.none());
        }

        /**
         * Replace a plan
         *
         * <p>Full replacement of a plan's version. On a draft plan, updates in-place. On a
         * published plan, creates a new version. Set <code>status</code> to <code>DRAFT</code> to
         * stage as a new draft without publishing.
         *
         * @param planId the {@code plan_id} path parameter
         * @param replacePlanRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> replace(
                final String planId,
                final ReplacePlanRequest replacePlanRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeReplace(planId, replacePlanRequest, requestOptions).sendRawAsync();
        }

        /**
         * Update plan metadata
         *
         * <p>Partially update plan-level fields (name, description, self_service_rank). Does not
         * modify version-level configuration or components.
         *
         * @param planId the {@code plan_id} path parameter
         * @param patchPlanRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> update(
                final String planId, final PatchPlanRequest patchPlanRequest) {
            return update(planId, patchPlanRequest, RequestOptions.none());
        }

        /**
         * Update plan metadata
         *
         * <p>Partially update plan-level fields (name, description, self_service_rank). Does not
         * modify version-level configuration or components.
         *
         * @param planId the {@code plan_id} path parameter
         * @param patchPlanRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> update(
                final String planId,
                final PatchPlanRequest patchPlanRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(planId, patchPlanRequest, requestOptions).sendRawAsync();
        }

        /**
         * Archive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> archive(final String planId) {
            return archive(planId, RequestOptions.none());
        }

        /**
         * Archive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> archive(
                final String planId, final RequestOptions requestOptions) {
            return sync.exchangeArchive(planId, requestOptions).sendRawAsync();
        }

        /**
         * Publish a draft plan version
         *
         * <p>Publishes the current draft version, making it the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> publish(final String planId) {
            return publish(planId, RequestOptions.none());
        }

        /**
         * Publish a draft plan version
         *
         * <p>Publishes the current draft version, making it the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Plan>> publish(
                final String planId, final RequestOptions requestOptions) {
            return sync.exchangePublish(planId, requestOptions).sendRawAsync();
        }

        /**
         * Unarchive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> unarchive(final String planId) {
            return unarchive(planId, RequestOptions.none());
        }

        /**
         * Unarchive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> unarchive(
                final String planId, final RequestOptions requestOptions) {
            return sync.exchangeUnarchive(planId, requestOptions).sendRawAsync();
        }
    }
}
