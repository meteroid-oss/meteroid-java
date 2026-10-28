// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.Budget;
import com.meteroid.models.BudgetListResponse;
import com.meteroid.models.CreateBudgetRequest;
import com.meteroid.models.PatchBudgetRequest;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code budgets} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class BudgetsAsync {
    private final Budgets sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public BudgetsAsync(Budgets sync) {
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
     * List budgets
     *
     * <p>A customer's budgets, oldest first, with their estimated spend in the current billing
     * period. Archived ones are left out unless requested.
     *
     * <p>Beta: the request and response shapes of this endpoint may change before general
     * availability.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the page, once received
     */
    public CompletableFuture<BudgetsListAsyncPage> list(final String idOrAlias) {
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
     * @return the page, once received
     */
    public CompletableFuture<BudgetsListAsyncPage> list(
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
     * @return the page, once received
     */
    public CompletableFuture<BudgetsListAsyncPage> list(
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
     * @return the page, once received
     */
    public CompletableFuture<BudgetsListAsyncPage> list(
            final String idOrAlias,
            final BudgetsListOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeList(idOrAlias, options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, idOrAlias, options, requestOptions));
    }

    private BudgetsListAsyncPage pageOfList(
            BudgetListResponse response,
            final String idOrAlias,
            final BudgetsListOptions options,
            final RequestOptions requestOptions) {
        List<Budget> items = Budgets.itemsOfList(response);
        Integer next = Budgets.nextOfList(response, items, options.page().orElse(0));
        return new BudgetsListAsyncPage(
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> create(
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> create(
            final String idOrAlias,
            final String idempotencyKey,
            final CreateBudgetRequest createBudgetRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(idOrAlias, idempotencyKey, createBudgetRequest, requestOptions)
                .sendAsync();
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> update(
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> update(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final PatchBudgetRequest patchBudgetRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(
                        idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, requestOptions)
                .sendAsync();
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> archive(
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
     * @return the response body, once received
     */
    public CompletableFuture<Budget> archive(
            final String idOrAlias,
            final String budgetId,
            final String idempotencyKey,
            final RequestOptions requestOptions) {
        return sync.exchangeArchive(idOrAlias, budgetId, idempotencyKey, requestOptions)
                .sendAsync();
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BudgetsListAsyncPage>> list(final String idOrAlias) {
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BudgetsListAsyncPage>> list(
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BudgetsListAsyncPage>> list(
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
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BudgetsListAsyncPage>> list(
                final String idOrAlias,
                final BudgetsListOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeList(idOrAlias, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfList(
                                                    response.body(),
                                                    idOrAlias,
                                                    options,
                                                    requestOptions)));
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> create(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> create(
                final String idOrAlias,
                final String idempotencyKey,
                final CreateBudgetRequest createBudgetRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(
                            idOrAlias, idempotencyKey, createBudgetRequest, requestOptions)
                    .sendRawAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> update(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> update(
                final String idOrAlias,
                final String budgetId,
                final String idempotencyKey,
                final PatchBudgetRequest patchBudgetRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(
                            idOrAlias, budgetId, idempotencyKey, patchBudgetRequest, requestOptions)
                    .sendRawAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> archive(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Budget>> archive(
                final String idOrAlias,
                final String budgetId,
                final String idempotencyKey,
                final RequestOptions requestOptions) {
            return sync.exchangeArchive(idOrAlias, budgetId, idempotencyKey, requestOptions)
                    .sendRawAsync();
        }
    }
}
