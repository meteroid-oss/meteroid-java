// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.BatchJobDetailResponse;
import com.meteroid.models.BatchJobFailuresResponse;
import com.meteroid.models.BatchJobItemFailureResponse;
import com.meteroid.models.BatchJobListResponse;
import com.meteroid.models.BatchJobResponse;
import com.meteroid.models.BatchJobStatus;
import com.meteroid.models.BatchJobType;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code batch_jobs} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class BatchJobs {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public BatchJobs(MeteroidHttpClient client) {
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
     * List batch jobs with optional filtering by type and status.
     *
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListPage list() {
        return list(BatchJobsListOptions.none(), RequestOptions.none());
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListPage list(final BatchJobsListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListPage list(final RequestOptions requestOptions) {
        return list(BatchJobsListOptions.none(), requestOptions);
    }

    /**
     * List batch jobs with optional filtering by type and status.
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListPage list(
            final BatchJobsListOptions options, final RequestOptions requestOptions) {
        return pageOfList(exchangeList(options, requestOptions).send(), options, requestOptions);
    }

    MeteroidHttpClient.Exchange<BatchJobListResponse> exchangeList(
            final BatchJobsListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/batch-jobs");
        BatchJobType value1 = options.jobType().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("job_type", Utils.serializeQueryParam(value1));
        }
        List<BatchJobStatus> value2 = options.status().orElse(null);
        if (value2 != null) {
            Utils.addExplodedQueryParameter(url, "status", value2);
        }
        Integer value3 = options.page().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value3));
        }
        Integer value4 = options.perPage().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value4));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429", "500")
                .options(requestOptions)
                .returning(BatchJobListResponse.class);
    }

    private BatchJobsListPage pageOfList(
            BatchJobListResponse response,
            final BatchJobsListOptions options,
            final RequestOptions requestOptions) {
        List<BatchJobResponse> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new BatchJobsListPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    static List<BatchJobResponse> itemsOfList(BatchJobListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(
            BatchJobListResponse response, List<BatchJobResponse> items, Integer current) {
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
     * Get batch job detail
     *
     * <p>Retrieve a single batch job with its chunks and failures.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @return the response body
     */
    public BatchJobDetailResponse retrieve(final String batchJobId) {
        return retrieve(batchJobId, RequestOptions.none());
    }

    /**
     * Get batch job detail
     *
     * <p>Retrieve a single batch job with its chunks and failures.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public BatchJobDetailResponse retrieve(
            final String batchJobId, final RequestOptions requestOptions) {
        return exchangeRetrieve(batchJobId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<BatchJobDetailResponse> exchangeRetrieve(
            final String batchJobId, final RequestOptions requestOptions) {
        Objects.requireNonNull(batchJobId, "batch_job_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/batch-jobs")
                        .addPathSegment(Utils.pathSegment("batch_job_id", batchJobId))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(BatchJobDetailResponse.class);
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListFailuresPage listFailures(final String batchJobId) {
        return listFailures(batchJobId, BatchJobsListFailuresOptions.none(), RequestOptions.none());
    }

    /**
     * List batch job failures
     *
     * <p>Retrieve paginated failures for a batch job.
     *
     * @param batchJobId the {@code batch_job_id} path parameter
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListFailuresPage listFailures(
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
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListFailuresPage listFailures(
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
     * @return the page: the response body, its items and the way to the next pages
     */
    public BatchJobsListFailuresPage listFailures(
            final String batchJobId,
            final BatchJobsListFailuresOptions options,
            final RequestOptions requestOptions) {
        return pageOfListFailures(
                exchangeListFailures(batchJobId, options, requestOptions).send(),
                batchJobId,
                options,
                requestOptions);
    }

    MeteroidHttpClient.Exchange<BatchJobFailuresResponse> exchangeListFailures(
            final String batchJobId,
            final BatchJobsListFailuresOptions options,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(batchJobId, "batch_job_id");
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/batch-jobs")
                        .addPathSegment(Utils.pathSegment("batch_job_id", batchJobId))
                        .addPathSegments("failures");
        String value1 = options.chunkId().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("chunk_id", value1);
        }
        Integer value2 = options.limit().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("limit", Utils.serializeQueryParam(value2));
        }
        Integer value3 = options.offset().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("offset", Utils.serializeQueryParam(value3));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429", "500")
                .options(requestOptions)
                .returning(BatchJobFailuresResponse.class);
    }

    private BatchJobsListFailuresPage pageOfListFailures(
            BatchJobFailuresResponse response,
            final String batchJobId,
            final BatchJobsListFailuresOptions options,
            final RequestOptions requestOptions) {
        List<BatchJobItemFailureResponse> items = itemsOfListFailures(response);
        Integer next = nextOfListFailures(response, items, options.offset().orElse(0));
        return new BatchJobsListFailuresPage(
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

    static List<BatchJobItemFailureResponse> itemsOfListFailures(
            BatchJobFailuresResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfListFailures(
            BatchJobFailuresResponse response,
            List<BatchJobItemFailureResponse> items,
            Integer current) {
        if (items.isEmpty()) {
            return null;
        }
        Integer next = current + items.size();
        long total =
                Utils.optional(response.totalCount()).map(Number::longValue).orElse(Long.MAX_VALUE);
        if (next >= total) {
            return null;
        }
        return next;
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListPage> list() {
            return list(BatchJobsListOptions.none(), RequestOptions.none());
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListPage> list(final BatchJobsListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListPage> list(final RequestOptions requestOptions) {
            return list(BatchJobsListOptions.none(), requestOptions);
        }

        /**
         * List batch jobs with optional filtering by type and status.
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListPage> list(
                final BatchJobsListOptions options, final RequestOptions requestOptions) {
            ApiResponse<BatchJobListResponse> response =
                    exchangeList(options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), options, requestOptions));
        }

        /**
         * Get batch job detail
         *
         * <p>Retrieve a single batch job with its chunks and failures.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<BatchJobDetailResponse> retrieve(final String batchJobId) {
            return retrieve(batchJobId, RequestOptions.none());
        }

        /**
         * Get batch job detail
         *
         * <p>Retrieve a single batch job with its chunks and failures.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<BatchJobDetailResponse> retrieve(
                final String batchJobId, final RequestOptions requestOptions) {
            return BatchJobs.this.exchangeRetrieve(batchJobId, requestOptions).sendRaw();
        }

        /**
         * List batch job failures
         *
         * <p>Retrieve paginated failures for a batch job.
         *
         * @param batchJobId the {@code batch_job_id} path parameter
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListFailuresPage> listFailures(final String batchJobId) {
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
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListFailuresPage> listFailures(
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
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListFailuresPage> listFailures(
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
         * @return the status, headers and page
         */
        public ApiResponse<BatchJobsListFailuresPage> listFailures(
                final String batchJobId,
                final BatchJobsListFailuresOptions options,
                final RequestOptions requestOptions) {
            ApiResponse<BatchJobFailuresResponse> response =
                    exchangeListFailures(batchJobId, options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfListFailures(response.body(), batchJobId, options, requestOptions));
        }
    }
}
