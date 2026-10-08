// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateEntitlementsRequest;
import com.meteroid.models.CreatePlanRequest;
import com.meteroid.models.EntitlementListResponse;
import com.meteroid.models.PatchPlanRequest;
import com.meteroid.models.Plan;
import com.meteroid.models.PlanListResponse;
import com.meteroid.models.PlanStatusEnum;
import com.meteroid.models.PlanTypeEnum;
import com.meteroid.models.ReplacePlanRequest;
import com.meteroid.models.ResolvedEntitlementListResponse;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code plans} operations, blocking. {@link #withRawResponse()} has the same methods returning
 * the status and headers along with the body.
 */
public final class Plans {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final PlansVersions versions;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Plans(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.versions = new PlansVersions(client);
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
    public PlansVersions versions() {
        return versions;
    }

    /**
     * List plan version entitlements
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @return the response body
     */
    public ResolvedEntitlementListResponse listPlanVersionEntitlements(final String planVersionId) {
        return listPlanVersionEntitlements(planVersionId, RequestOptions.none());
    }

    /**
     * List plan version entitlements
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public ResolvedEntitlementListResponse listPlanVersionEntitlements(
            final String planVersionId, final RequestOptions requestOptions) {
        return exchangeListPlanVersionEntitlements(planVersionId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<ResolvedEntitlementListResponse>
            exchangeListPlanVersionEntitlements(
                    final String planVersionId, final RequestOptions requestOptions) {
        Objects.requireNonNull(planVersionId, "plan_version_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plan-versions")
                        .addPathSegment(Utils.pathSegment("plan_version_id", planVersionId))
                        .addPathSegments("entitlements")
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(ResolvedEntitlementListResponse.class);
    }

    /**
     * Create plan version entitlements
     *
     * <p>Entitlements already present on this plan version are skipped.
     *
     * @param planVersionId the {@code plan_version_id} path parameter
     * @param createEntitlementsRequest the request body
     * @return the response body
     */
    public EntitlementListResponse createPlanVersionEntitlement(
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
     * @return the response body
     */
    public EntitlementListResponse createPlanVersionEntitlement(
            final String planVersionId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        return exchangeCreatePlanVersionEntitlement(
                        planVersionId, createEntitlementsRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<EntitlementListResponse> exchangeCreatePlanVersionEntitlement(
            final String planVersionId,
            final CreateEntitlementsRequest createEntitlementsRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planVersionId, "plan_version_id");
        Objects.requireNonNull(createEntitlementsRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plan-versions")
                        .addPathSegment(Utils.pathSegment("plan_version_id", planVersionId))
                        .addPathSegments("entitlements")
                        .build();
        return client.call("POST", url)
                .json(createEntitlementsRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(EntitlementListResponse.class);
    }

    /**
     * List plans
     *
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansListPage list() {
        return list(PlansListOptions.none(), RequestOptions.none());
    }

    /**
     * List plans
     *
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansListPage list(final PlansListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List plans
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansListPage list(final RequestOptions requestOptions) {
        return list(PlansListOptions.none(), requestOptions);
    }

    /**
     * List plans
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public PlansListPage list(final PlansListOptions options, final RequestOptions requestOptions) {
        return pageOfList(exchangeList(options, requestOptions).send(), options, requestOptions);
    }

    MeteroidHttpClient.Exchange<PlanListResponse> exchangeList(
            final PlansListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/plans");
        String value1 = options.productFamilyId().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("product_family_id", value1);
        }
        String value2 = options.search().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("search", value2);
        }
        List<PlanStatusEnum> value3 = options.status().orElse(null);
        if (value3 != null) {
            Utils.addExplodedQueryParameter(url, "status", value3);
        }
        List<PlanTypeEnum> value4 = options.planType().orElse(null);
        if (value4 != null) {
            Utils.addExplodedQueryParameter(url, "plan_type", value4);
        }
        String value5 = options.orderBy().orElse(null);
        if (value5 != null) {
            url.addQueryParameter("order_by", value5);
        }
        Integer value6 = options.page().orElse(null);
        if (value6 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value6));
        }
        Integer value7 = options.perPage().orElse(null);
        if (value7 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value7));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429")
                .options(requestOptions)
                .returning(PlanListResponse.class);
    }

    private PlansListPage pageOfList(
            PlanListResponse response,
            final PlansListOptions options,
            final RequestOptions requestOptions) {
        List<Plan> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new PlansListPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    static List<Plan> itemsOfList(PlanListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(PlanListResponse response, List<Plan> items, Integer current) {
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

    /**
     * Create a plan
     *
     * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
     * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
     *
     * @param createPlanRequest the request body
     * @return the response body
     */
    public Plan create(final CreatePlanRequest createPlanRequest) {
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
     * @return the response body
     */
    public Plan create(
            final CreatePlanRequest createPlanRequest, final RequestOptions requestOptions) {
        return exchangeCreate(createPlanRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Plan> exchangeCreate(
            final CreatePlanRequest createPlanRequest, final RequestOptions requestOptions) {
        Objects.requireNonNull(createPlanRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/plans").build();
        return client.call("POST", url)
                .json(createPlanRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "409", "429")
                .options(requestOptions)
                .returning(Plan.class);
    }

    /**
     * Get plan details
     *
     * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version, <code>
     * ?version=2</code> for a specific version number, or omit for the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body
     */
    public Plan retrieve(final String planId) {
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
     * @return the response body
     */
    public Plan retrieve(final String planId, final PlansRetrieveOptions options) {
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
     * @return the response body
     */
    public Plan retrieve(final String planId, final RequestOptions requestOptions) {
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
     * @return the response body
     */
    public Plan retrieve(
            final String planId,
            final PlansRetrieveOptions options,
            final RequestOptions requestOptions) {
        return exchangeRetrieve(planId, options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Plan> exchangeRetrieve(
            final String planId,
            final PlansRetrieveOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId));
        String value1 = options.version().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("version", value1);
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(Plan.class);
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
     * @return the response body
     */
    public Plan replace(final String planId, final ReplacePlanRequest replacePlanRequest) {
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
     * @return the response body
     */
    public Plan replace(
            final String planId,
            final ReplacePlanRequest replacePlanRequest,
            final RequestOptions requestOptions) {
        return exchangeReplace(planId, replacePlanRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Plan> exchangeReplace(
            final String planId,
            final ReplacePlanRequest replacePlanRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        Objects.requireNonNull(replacePlanRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .build();
        return client.call("PUT", url)
                .json(replacePlanRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(Plan.class);
    }

    /**
     * Update plan metadata
     *
     * <p>Partially update plan-level fields (name, description, self_service_rank). Does not modify
     * version-level configuration or components.
     *
     * @param planId the {@code plan_id} path parameter
     * @param patchPlanRequest the request body
     * @return the response body
     */
    public Plan update(final String planId, final PatchPlanRequest patchPlanRequest) {
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
     * @return the response body
     */
    public Plan update(
            final String planId,
            final PatchPlanRequest patchPlanRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(planId, patchPlanRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Plan> exchangeUpdate(
            final String planId,
            final PatchPlanRequest patchPlanRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        Objects.requireNonNull(patchPlanRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .build();
        return client.call("PATCH", url)
                .json(patchPlanRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(Plan.class);
    }

    /**
     * Archive a plan
     *
     * @param planId the {@code plan_id} path parameter
     */
    public void archive(final String planId) {
        archive(planId, RequestOptions.none());
    }

    /**
     * Archive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void archive(final String planId, final RequestOptions requestOptions) {
        exchangeArchive(planId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeArchive(
            final String planId, final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .addPathSegments("archive")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * Publish a draft plan version
     *
     * <p>Publishes the current draft version, making it the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @return the response body
     */
    public Plan publish(final String planId) {
        return publish(planId, RequestOptions.none());
    }

    /**
     * Publish a draft plan version
     *
     * <p>Publishes the current draft version, making it the active version.
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Plan publish(final String planId, final RequestOptions requestOptions) {
        return exchangePublish(planId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Plan> exchangePublish(
            final String planId, final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .addPathSegments("publish")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "409", "429")
                .options(requestOptions)
                .returning(Plan.class);
    }

    /**
     * Unarchive a plan
     *
     * @param planId the {@code plan_id} path parameter
     */
    public void unarchive(final String planId) {
        unarchive(planId, RequestOptions.none());
    }

    /**
     * Unarchive a plan
     *
     * @param planId the {@code plan_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void unarchive(final String planId, final RequestOptions requestOptions) {
        exchangeUnarchive(planId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeUnarchive(
            final String planId, final RequestOptions requestOptions) {
        Objects.requireNonNull(planId, "plan_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/plans")
                        .addPathSegment(Utils.pathSegment("plan_id", planId))
                        .addPathSegments("unarchive")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code versions} operations.
         *
         * @return the operations
         */
        public PlansVersions.WithRawResponse versions() {
            return Plans.this.versions.withRawResponse();
        }

        /**
         * List plan version entitlements
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> listPlanVersionEntitlements(
                final String planVersionId) {
            return listPlanVersionEntitlements(planVersionId, RequestOptions.none());
        }

        /**
         * List plan version entitlements
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<ResolvedEntitlementListResponse> listPlanVersionEntitlements(
                final String planVersionId, final RequestOptions requestOptions) {
            return Plans.this
                    .exchangeListPlanVersionEntitlements(planVersionId, requestOptions)
                    .sendRaw();
        }

        /**
         * Create plan version entitlements
         *
         * <p>Entitlements already present on this plan version are skipped.
         *
         * @param planVersionId the {@code plan_version_id} path parameter
         * @param createEntitlementsRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> createPlanVersionEntitlement(
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
         * @return the status, headers and body
         */
        public ApiResponse<EntitlementListResponse> createPlanVersionEntitlement(
                final String planVersionId,
                final CreateEntitlementsRequest createEntitlementsRequest,
                final RequestOptions requestOptions) {
            return Plans.this
                    .exchangeCreatePlanVersionEntitlement(
                            planVersionId, createEntitlementsRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * List plans
         *
         * @return the status, headers and page
         */
        public ApiResponse<PlansListPage> list() {
            return list(PlansListOptions.none(), RequestOptions.none());
        }

        /**
         * List plans
         *
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<PlansListPage> list(final PlansListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List plans
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<PlansListPage> list(final RequestOptions requestOptions) {
            return list(PlansListOptions.none(), requestOptions);
        }

        /**
         * List plans
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<PlansListPage> list(
                final PlansListOptions options, final RequestOptions requestOptions) {
            ApiResponse<PlanListResponse> response =
                    exchangeList(options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), options, requestOptions));
        }

        /**
         * Create a plan
         *
         * <p>Create a new plan with components and pricing. Set <code>status</code> to <code>ACTIVE
         * </code> to publish immediately, or <code>DRAFT</code> to stage for review.
         *
         * @param createPlanRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Plan> create(final CreatePlanRequest createPlanRequest) {
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> create(
                final CreatePlanRequest createPlanRequest, final RequestOptions requestOptions) {
            return Plans.this.exchangeCreate(createPlanRequest, requestOptions).sendRaw();
        }

        /**
         * Get plan details
         *
         * <p>Retrieve a specific plan. Use <code>?version=draft</code> for the draft version,
         * <code>?version=2</code> for a specific version number, or omit for the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Plan> retrieve(final String planId) {
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> retrieve(final String planId, final PlansRetrieveOptions options) {
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> retrieve(
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> retrieve(
                final String planId,
                final PlansRetrieveOptions options,
                final RequestOptions requestOptions) {
            return Plans.this.exchangeRetrieve(planId, options, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> replace(
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> replace(
                final String planId,
                final ReplacePlanRequest replacePlanRequest,
                final RequestOptions requestOptions) {
            return Plans.this.exchangeReplace(planId, replacePlanRequest, requestOptions).sendRaw();
        }

        /**
         * Update plan metadata
         *
         * <p>Partially update plan-level fields (name, description, self_service_rank). Does not
         * modify version-level configuration or components.
         *
         * @param planId the {@code plan_id} path parameter
         * @param patchPlanRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Plan> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<Plan> update(
                final String planId,
                final PatchPlanRequest patchPlanRequest,
                final RequestOptions requestOptions) {
            return Plans.this.exchangeUpdate(planId, patchPlanRequest, requestOptions).sendRaw();
        }

        /**
         * Archive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(final String planId) {
            return archive(planId, RequestOptions.none());
        }

        /**
         * Archive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(final String planId, final RequestOptions requestOptions) {
            return Plans.this.exchangeArchive(planId, requestOptions).sendRaw();
        }

        /**
         * Publish a draft plan version
         *
         * <p>Publishes the current draft version, making it the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Plan> publish(final String planId) {
            return publish(planId, RequestOptions.none());
        }

        /**
         * Publish a draft plan version
         *
         * <p>Publishes the current draft version, making it the active version.
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Plan> publish(final String planId, final RequestOptions requestOptions) {
            return Plans.this.exchangePublish(planId, requestOptions).sendRaw();
        }

        /**
         * Unarchive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(final String planId) {
            return unarchive(planId, RequestOptions.none());
        }

        /**
         * Unarchive a plan
         *
         * @param planId the {@code plan_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(
                final String planId, final RequestOptions requestOptions) {
            return Plans.this.exchangeUnarchive(planId, requestOptions).sendRaw();
        }
    }
}
