// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.ProductFamily;
import com.meteroid.models.ProductFamilyCreateRequest;
import com.meteroid.models.ProductFamilyListResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code product_families} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class ProductFamiliesAsync {
    private final ProductFamilies sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public ProductFamiliesAsync(ProductFamilies sync) {
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
     * List product families
     *
     * @return the page, once received
     */
    public CompletableFuture<ProductFamiliesListAsyncPage> list() {
        return list(ProductFamiliesListOptions.none(), RequestOptions.none());
    }

    /**
     * List product families
     *
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<ProductFamiliesListAsyncPage> list(
            final ProductFamiliesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List product families
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<ProductFamiliesListAsyncPage> list(
            final RequestOptions requestOptions) {
        return list(ProductFamiliesListOptions.none(), requestOptions);
    }

    /**
     * List product families
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<ProductFamiliesListAsyncPage> list(
            final ProductFamiliesListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, options, requestOptions));
    }

    private ProductFamiliesListAsyncPage pageOfList(
            ProductFamilyListResponse response,
            final ProductFamiliesListOptions options,
            final RequestOptions requestOptions) {
        List<ProductFamily> items = ProductFamilies.itemsOfList(response);
        Integer next = ProductFamilies.nextOfList(response, items, options.page().orElse(0));
        return new ProductFamiliesListAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    /**
     * Create product family
     *
     * @param productFamilyCreateRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<ProductFamily> create(
            final ProductFamilyCreateRequest productFamilyCreateRequest) {
        return create(productFamilyCreateRequest, RequestOptions.none());
    }

    /**
     * Create product family
     *
     * @param productFamilyCreateRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<ProductFamily> create(
            final ProductFamilyCreateRequest productFamilyCreateRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(productFamilyCreateRequest, requestOptions).sendAsync();
    }

    /**
     * Get product family
     *
     * <p>Retrieve a single product family by ID or alias.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<ProductFamily> retrieve(final String idOrAlias) {
        return retrieve(idOrAlias, RequestOptions.none());
    }

    /**
     * Get product family
     *
     * <p>Retrieve a single product family by ID or alias.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<ProductFamily> retrieve(
            final String idOrAlias, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(idOrAlias, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List product families
         *
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<ProductFamiliesListAsyncPage>> list() {
            return list(ProductFamiliesListOptions.none(), RequestOptions.none());
        }

        /**
         * List product families
         *
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<ProductFamiliesListAsyncPage>> list(
                final ProductFamiliesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List product families
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<ProductFamiliesListAsyncPage>> list(
                final RequestOptions requestOptions) {
            return list(ProductFamiliesListOptions.none(), requestOptions);
        }

        /**
         * List product families
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<ProductFamiliesListAsyncPage>> list(
                final ProductFamiliesListOptions options, final RequestOptions requestOptions) {
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
         * Create product family
         *
         * @param productFamilyCreateRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ProductFamily>> create(
                final ProductFamilyCreateRequest productFamilyCreateRequest) {
            return create(productFamilyCreateRequest, RequestOptions.none());
        }

        /**
         * Create product family
         *
         * @param productFamilyCreateRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ProductFamily>> create(
                final ProductFamilyCreateRequest productFamilyCreateRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(productFamilyCreateRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get product family
         *
         * <p>Retrieve a single product family by ID or alias.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ProductFamily>> retrieve(final String idOrAlias) {
            return retrieve(idOrAlias, RequestOptions.none());
        }

        /**
         * Get product family
         *
         * <p>Retrieve a single product family by ID or alias.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<ProductFamily>> retrieve(
                final String idOrAlias, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(idOrAlias, requestOptions).sendRawAsync();
        }
    }
}
