// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.CreateFeatureRequest;
import com.meteroid.models.Feature;
import com.meteroid.models.FeatureListResponse;
import com.meteroid.models.UpdateFeatureRequest;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code features} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class FeaturesAsync {
    private final Features sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public FeaturesAsync(Features sync) {
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
     * List features
     *
     * @return the page, once received
     */
    public CompletableFuture<FeaturesListAsyncPage> list() {
        return list(FeaturesListOptions.none(), RequestOptions.none());
    }

    /**
     * List features
     *
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<FeaturesListAsyncPage> list(final FeaturesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List features
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<FeaturesListAsyncPage> list(final RequestOptions requestOptions) {
        return list(FeaturesListOptions.none(), requestOptions);
    }

    /**
     * List features
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<FeaturesListAsyncPage> list(
            final FeaturesListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, options, requestOptions));
    }

    private FeaturesListAsyncPage pageOfList(
            FeatureListResponse response,
            final FeaturesListOptions options,
            final RequestOptions requestOptions) {
        List<Feature> items = Features.itemsOfList(response);
        Integer next = Features.nextOfList(response, items, options.page().orElse(0));
        return new FeaturesListAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    /**
     * Create a feature
     *
     * @param createFeatureRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Feature> create(final CreateFeatureRequest createFeatureRequest) {
        return create(createFeatureRequest, RequestOptions.none());
    }

    /**
     * Create a feature
     *
     * @param createFeatureRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Feature> create(
            final CreateFeatureRequest createFeatureRequest, final RequestOptions requestOptions) {
        return sync.exchangeCreate(createFeatureRequest, requestOptions).sendAsync();
    }

    /**
     * Get feature details
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Feature> retrieve(final String idOrCode) {
        return retrieve(idOrCode, RequestOptions.none());
    }

    /**
     * Get feature details
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Feature> retrieve(
            final String idOrCode, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(idOrCode, requestOptions).sendAsync();
    }

    /**
     * Update a feature
     *
     * <p>Partially update feature fields. Code, feature type and product are immutable.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param updateFeatureRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Feature> update(
            final String idOrCode, final UpdateFeatureRequest updateFeatureRequest) {
        return update(idOrCode, updateFeatureRequest, RequestOptions.none());
    }

    /**
     * Update a feature
     *
     * <p>Partially update feature fields. Code, feature type and product are immutable.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param updateFeatureRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Feature> update(
            final String idOrCode,
            final UpdateFeatureRequest updateFeatureRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdate(idOrCode, updateFeatureRequest, requestOptions).sendAsync();
    }

    /**
     * Archive a feature
     *
     * <p>Keeps the feature and its entitlements but hides them from resolution.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> archive(final String idOrCode) {
        return archive(idOrCode, RequestOptions.none());
    }

    /**
     * Archive a feature
     *
     * <p>Keeps the feature and its entitlements but hides them from resolution.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> archive(
            final String idOrCode, final RequestOptions requestOptions) {
        return sync.exchangeArchive(idOrCode, requestOptions).sendAsync();
    }

    /**
     * Unarchive a feature
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> unarchive(final String idOrCode) {
        return unarchive(idOrCode, RequestOptions.none());
    }

    /**
     * Unarchive a feature
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> unarchive(
            final String idOrCode, final RequestOptions requestOptions) {
        return sync.exchangeUnarchive(idOrCode, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List features
         *
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<FeaturesListAsyncPage>> list() {
            return list(FeaturesListOptions.none(), RequestOptions.none());
        }

        /**
         * List features
         *
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<FeaturesListAsyncPage>> list(
                final FeaturesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List features
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<FeaturesListAsyncPage>> list(
                final RequestOptions requestOptions) {
            return list(FeaturesListOptions.none(), requestOptions);
        }

        /**
         * List features
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<FeaturesListAsyncPage>> list(
                final FeaturesListOptions options, final RequestOptions requestOptions) {
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
         * Create a feature
         *
         * @param createFeatureRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> create(
                final CreateFeatureRequest createFeatureRequest) {
            return create(createFeatureRequest, RequestOptions.none());
        }

        /**
         * Create a feature
         *
         * @param createFeatureRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> create(
                final CreateFeatureRequest createFeatureRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(createFeatureRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get feature details
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> retrieve(final String idOrCode) {
            return retrieve(idOrCode, RequestOptions.none());
        }

        /**
         * Get feature details
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> retrieve(
                final String idOrCode, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(idOrCode, requestOptions).sendRawAsync();
        }

        /**
         * Update a feature
         *
         * <p>Partially update feature fields. Code, feature type and product are immutable.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param updateFeatureRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> update(
                final String idOrCode, final UpdateFeatureRequest updateFeatureRequest) {
            return update(idOrCode, updateFeatureRequest, RequestOptions.none());
        }

        /**
         * Update a feature
         *
         * <p>Partially update feature fields. Code, feature type and product are immutable.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param updateFeatureRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Feature>> update(
                final String idOrCode,
                final UpdateFeatureRequest updateFeatureRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdate(idOrCode, updateFeatureRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Archive a feature
         *
         * <p>Keeps the feature and its entitlements but hides them from resolution.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> archive(final String idOrCode) {
            return archive(idOrCode, RequestOptions.none());
        }

        /**
         * Archive a feature
         *
         * <p>Keeps the feature and its entitlements but hides them from resolution.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> archive(
                final String idOrCode, final RequestOptions requestOptions) {
            return sync.exchangeArchive(idOrCode, requestOptions).sendRawAsync();
        }

        /**
         * Unarchive a feature
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> unarchive(final String idOrCode) {
            return unarchive(idOrCode, RequestOptions.none());
        }

        /**
         * Unarchive a feature
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> unarchive(
                final String idOrCode, final RequestOptions requestOptions) {
            return sync.exchangeUnarchive(idOrCode, requestOptions).sendRawAsync();
        }
    }
}
