// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.Budget;
import com.meteroid.models.BudgetListResponse;
import com.meteroid.models.CreateBudgetRequest;
import com.meteroid.models.PatchBudgetRequest;

import okhttp3.Headers;
import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code budgets} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Budgets {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Budgets(MeteroidHttpClient client) {
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
     * List budgets
     *
     * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
     * period. Archived ones are left out unless requested.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public BudgetsListPage list(final String idOrAlias) {
        return list(idOrAlias, BudgetsListOptions.none(), RequestOptions.none());
    }

    /**
     * List budgets
     *
     * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
     * period. Archived ones are left out unless requested.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public BudgetsListPage list(final String idOrAlias, final BudgetsListOptions options) {
        return list(idOrAlias, options, RequestOptions.none());
    }

    /**
     * List budgets
     *
     * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
     * period. Archived ones are left out unless requested.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public BudgetsListPage list(final String idOrAlias, final RequestOptions requestOptions) {
        return list(idOrAlias, BudgetsListOptions.none(), requestOptions);
    }

    /**
     * List budgets
     *
     * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
     * period. Archived ones are left out unless requested.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public BudgetsListPage list(
            final String idOrAlias,
            final BudgetsListOptions options,
            final RequestOptions requestOptions) {
        return pageOfList(
                exchangeList(idOrAlias, options, requestOptions).send(),
                idOrAlias,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<BudgetListResponse> exchangeList(
            final String idOrAlias,
            final BudgetsListOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("budgets");
        Boolean value1 = options.includeArchived().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("include_archived", Utils.serializeQueryParam(value1));
        }
        Integer value2 = options.page().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value2));
        }
        Integer value3 = options.perPage().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value3));
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
                .returning(BudgetListResponse.class);
    }

    private BudgetsListPage pageOfList(
            BudgetListResponse response,
            final String idOrAlias,
            final BudgetsListOptions options,
            final RequestOptions requestOptions) {
        List<Budget> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new BudgetsListPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                list(
                                        idOrAlias,
                                        options.toBuilder().page(next).build(),
                                        requestOptions));
    }

    static List<Budget> itemsOfList(BudgetListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(BudgetListResponse response, List<Budget> items, Integer current) {
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
     * Create a budget
     *
     * <p>Sets a spending limit for one currency the customer is billed in, with alerts at
     * percentages of it, on the customer's whole spend or on one subscription's. A customer has one
     * active budget per currency, and per subscription.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createBudgetRequest the request body
     * @return the response body
     */
    public Budget create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateBudgetRequest createBudgetRequest) {
        return create(idOrAlias, idempotencyKey, createBudgetRequest, RequestOptions.none());
    }

    /**
     * Create a budget
     *
     * <p>Sets a spending limit for one currency the customer is billed in, with alerts at
     * percentages of it, on the customer's whole spend or on one subscription's. A customer has one
     * active budget per currency, and per subscription.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param createBudgetRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Budget create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateBudgetRequest createBudgetRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(idOrAlias, idempotencyKey, createBudgetRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<Budget> exchangeCreate(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateBudgetRequest createBudgetRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(createBudgetRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("budgets")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .json(createBudgetRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Budget.class);
    }

    /**
     * Update a budget
     *
     * <p>Changes the amount, thresholds or behavior. Send the <code>version</code> you read as
     * <code>expected_version</code>; a newer stored version, for instance after the customer edited
     * it, is refused with 409.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param budgetId the {@code budget_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param patchBudgetRequest the request body
     * @return the response body
     */
    public Budget update(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final PatchBudgetRequest patchBudgetRequest) {
        return update(
                idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, RequestOptions.none());
    }

    /**
     * Update a budget
     *
     * <p>Changes the amount, thresholds or behavior. Send the <code>version</code> you read as
     * <code>expected_version</code>; a newer stored version, for instance after the customer edited
     * it, is refused with 409.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param budgetId the {@code budget_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param patchBudgetRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Budget update(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final PatchBudgetRequest patchBudgetRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(
                        idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<Budget> exchangeUpdate(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final PatchBudgetRequest patchBudgetRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(budgetId, "budget_id");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(patchBudgetRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("budgets")
                        .addPathSegment(Utils.pathSegment("budget_id", budgetId))
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("PATCH", url)
                .headers(headers.build())
                .json(patchBudgetRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Budget.class);
    }

    /**
     * Archive a budget
     *
     * <p>Stops the budget from sending alerts and, for a HARD budget, from refusing access.
     * Archiving an archived budget returns it unchanged.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param budgetId the {@code budget_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @return the response body
     */
    public Budget archive(
            final String idOrAlias, final String budgetId, final String idempotencyKey) {
        return archive(idOrAlias, budgetId, idempotencyKey, RequestOptions.none());
    }

    /**
     * Archive a budget
     *
     * <p>Stops the budget from sending alerts and, for a HARD budget, from refusing access.
     * Archiving an archived budget returns it unchanged.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param budgetId the {@code budget_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Budget archive(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final RequestOptions requestOptions) {
        return exchangeArchive(idOrAlias, budgetId, idempotencyKey, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Budget> exchangeArchive(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        Objects.requireNonNull(budgetId, "budget_id");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/customers")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .addPathSegments("budgets")
                        .addPathSegment(Utils.pathSegment("budget_id", budgetId))
                        .addPathSegments("archive")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Budget.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List budgets
         *
         * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
         * period. Archived ones are left out unless requested.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<BudgetsListPage> list(final String idOrAlias) {
            return list(idOrAlias, BudgetsListOptions.none(), RequestOptions.none());
        }

        /**
         * List budgets
         *
         * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
         * period. Archived ones are left out unless requested.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<BudgetsListPage> list(
                final String idOrAlias, final BudgetsListOptions options) {
            return list(idOrAlias, options, RequestOptions.none());
        }

        /**
         * List budgets
         *
         * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
         * period. Archived ones are left out unless requested.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<BudgetsListPage> list(
                final String idOrAlias, final RequestOptions requestOptions) {
            return list(idOrAlias, BudgetsListOptions.none(), requestOptions);
        }

        /**
         * List budgets
         *
         * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
         * period. Archived ones are left out unless requested.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<BudgetsListPage> list(
                final String idOrAlias,
                final BudgetsListOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<BudgetListResponse> response =
                    exchangeList(idOrAlias, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), idOrAlias, options, requestOptions));
        }

        /**
         * Create a budget
         *
         * <p>Sets a spending limit for one currency the customer is billed in, with alerts at
         * percentages of it, on the customer's whole spend or on one subscription's. A customer has
         * one active budget per currency, and per subscription.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createBudgetRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Budget> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateBudgetRequest createBudgetRequest) {
            return create(idOrAlias, idempotencyKey, createBudgetRequest, RequestOptions.none());
        }

        /**
         * Create a budget
         *
         * <p>Sets a spending limit for one currency the customer is billed in, with alerts at
         * percentages of it, on the customer's whole spend or on one subscription's. A customer has
         * one active budget per currency, and per subscription.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param createBudgetRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Budget> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateBudgetRequest createBudgetRequest,
                final RequestOptions requestOptions) {
            return Budgets.this
                    .exchangeCreate(idOrAlias, idempotencyKey, createBudgetRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Update a budget
         *
         * <p>Changes the amount, thresholds or behavior. Send the <code>version</code> you read as
         * <code>expected_version</code>; a newer stored version, for instance after the customer
         * edited it, is refused with 409.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param budgetId the {@code budget_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param patchBudgetRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Budget> update(
                final String idOrAlias,
                final String budgetId,
                final String idempotencyKey,
                final PatchBudgetRequest patchBudgetRequest) {
            return update(
                    idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, RequestOptions.none());
        }

        /**
         * Update a budget
         *
         * <p>Changes the amount, thresholds or behavior. Send the <code>version</code> you read as
         * <code>expected_version</code>; a newer stored version, for instance after the customer
         * edited it, is refused with 409.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param budgetId the {@code budget_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param patchBudgetRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Budget> update(
                final String idOrAlias,
                final String budgetId,
                final String idempotencyKey,
                final PatchBudgetRequest patchBudgetRequest,
                final RequestOptions requestOptions) {
            return Budgets.this
                    .exchangeUpdate(
                            idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Archive a budget
         *
         * <p>Stops the budget from sending alerts and, for a HARD budget, from refusing access.
         * Archiving an archived budget returns it unchanged.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param budgetId the {@code budget_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @return the status, headers and body
         */
        public ApiResponse<Budget> archive(
                final String idOrAlias, final String budgetId, final String idempotencyKey) {
            return archive(idOrAlias, budgetId, idempotencyKey, RequestOptions.none());
        }

        /**
         * Archive a budget
         *
         * <p>Stops the budget from sending alerts and, for a HARD budget, from refusing access.
         * Archiving an archived budget returns it unchanged.
         *
         * <p>Beta: the request and response shapes of this endpoint may change before general
         * availability.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param budgetId the {@code budget_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Budget> archive(
                final String idOrAlias,
                final String budgetId,
                final String idempotencyKey,
                final RequestOptions requestOptions) {
            return Budgets.this
                    .exchangeArchive(idOrAlias, budgetId, idempotencyKey, requestOptions)
                    .sendRaw();
        }
    }
}
