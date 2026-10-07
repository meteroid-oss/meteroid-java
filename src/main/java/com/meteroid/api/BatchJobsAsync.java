// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.BatchJobDetailResponse;
import com.meteroid.models.BatchJobFailuresResponse;
import com.meteroid.models.BatchJobItemFailureResponse;
import com.meteroid.models.BatchJobListResponse;
import com.meteroid.models.BatchJobResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code batch_jobs} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class BatchJobsAsync {
    private final BatchJobs sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public BatchJobsAsync(BatchJobs sync) {
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
     * List batch jobs with optional filtering by type and status.
     *
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListAsyncPage> list() {
        return list(BatchJobsListOptions.none(), RequestOptions.none());
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListAsyncPage> list(final BatchJobsListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListAsyncPage> list(final RequestOptions requestOptions) {
        return list(BatchJobsListOptions.none(), requestOptions);
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListAsyncPage> list(
            final BatchJobsListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, options, requestOptions));
    }

    private BatchJobsListAsyncPage pageOfList(
            BatchJobListResponse response,
            final BatchJobsListOptions options,
            final RequestOptions requestOptions) {
        List<BatchJobResponse> items = BatchJobs.itemsOfList(response);
        Integer next = BatchJobs.nextOfList(response, items, options.page().orElse(0));
        return new BatchJobsListAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    /**
     * Get batch job detail
     *
     * <p>Retrieve a single batch job with its chunks and failures.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<BatchJobDetailResponse> retrieve(final String batchJobId) {
        return retrieve(batchJobId, RequestOptions.none());
    }

    /**
     * Get batch job detail
     *
     * <p>Retrieve a single batch job with its chunks and failures.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<BatchJobDetailResponse> retrieve(
            final String batchJobId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(batchJobId, requestOptions).sendAsync();
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListFailuresAsyncPage> listFailures(final String batchJobId) {
        return listFailures(batchJobId, BatchJobsListFailuresOptions.none(), RequestOptions.none());
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListFailuresAsyncPage> listFailures(
            final String batchJobId, final BatchJobsListFailuresOptions options) {
        return listFailures(batchJobId, options, RequestOptions.none());
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListFailuresAsyncPage> listFailures(
            final String batchJobId, final RequestOptions requestOptions) {
        return listFailures(batchJobId, BatchJobsListFailuresOptions.none(), requestOptions);
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<BatchJobsListFailuresAsyncPage> listFailures(
            final String batchJobId,
            final BatchJobsListFailuresOptions options,
            final RequestOptions requestOptions) {
        return sync.exchangeListFailures(batchJobId, options, requestOptions)
                .sendAsync()
                .thenApply(
                        response ->
                                pageOfListFailures(response, batchJobId, options, requestOptions));
    }

    private BatchJobsListFailuresAsyncPage pageOfListFailures(
            BatchJobFailuresResponse response,
            final String batchJobId,
            final BatchJobsListFailuresOptions options,
            final RequestOptions requestOptions) {
        List<BatchJobItemFailureResponse> items = BatchJobs.itemsOfListFailures(response);
        Integer next = BatchJobs.nextOfListFailures(response, items, options.offset().orElse(0));
        return new BatchJobsListFailuresAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () ->
                                listFailures(
                                        batchJobId,
                                        options.toBuilder().offset(next).build(),
                                        requestOptions));
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListAsyncPage>> list() {
            return list(BatchJobsListOptions.none(), RequestOptions.none());
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListAsyncPage>> list(
                final BatchJobsListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListAsyncPage>> list(
                final RequestOptions requestOptions) {
            return list(BatchJobsListOptions.none(), requestOptions);
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListAsyncPage>> list(
                final BatchJobsListOptions options, final RequestOptions requestOptions) {
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
         * Get batch job detail
         *
         * <p>Retrieve a single batch job with its chunks and failures.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<BatchJobDetailResponse>> retrieve(
                final String batchJobId) {
            return retrieve(batchJobId, RequestOptions.none());
        }

        /**
         * Get batch job detail
         *
         * <p>Retrieve a single batch job with its chunks and failures.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<BatchJobDetailResponse>> retrieve(
                final String batchJobId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(batchJobId, requestOptions).sendRawAsync();
        }

        /**
         * List batch job failures
         *
         * <p>Retrieve paginated failures for a batch job.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListFailuresAsyncPage>> listFailures(
                final String batchJobId) {
            return listFailures(
                    batchJobId, BatchJobsListFailuresOptions.none(), RequestOptions.none());
        }

        /**
         * List batch job failures
         *
         * <p>Retrieve paginated failures for a batch job.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListFailuresAsyncPage>> listFailures(
                final String batchJobId, final BatchJobsListFailuresOptions options) {
            return listFailures(batchJobId, options, RequestOptions.none());
        }

        /**
         * List batch job failures
         *
         * <p>Retrieve paginated failures for a batch job.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListFailuresAsyncPage>> listFailures(
                final String batchJobId, final RequestOptions requestOptions) {
            return listFailures(batchJobId, BatchJobsListFailuresOptions.none(), requestOptions);
        }

        /**
         * List batch job failures
         *
         * <p>Retrieve paginated failures for a batch job.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<BatchJobsListFailuresAsyncPage>> listFailures(
                final String batchJobId,
                final BatchJobsListFailuresOptions options,
                final RequestOptions requestOptions) {
            return sync.exchangeListFailures(batchJobId, options, requestOptions)
                    .sendRawAsync()
                    .thenApply(
                            response ->
                                    new ApiResponse<>(
                                            response.statusCode(),
                                            response.headers(),
                                            pageOfListFailures(
                                                    response.body(),
                                                    batchJobId,
                                                    options,
                                                    requestOptions)));
        }
    }
}
