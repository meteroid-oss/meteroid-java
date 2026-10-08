// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateProductRequest;
import com.meteroid.models.Product;
import com.meteroid.models.ProductListResponse;
import com.meteroid.models.UpdateProductRequest;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code products} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Products {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final ProductsEntitlements entitlements;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Products(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.entitlements = new ProductsEntitlements(client);
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
     * The {@code entitlements} operations.
     *
     * @return the operations
     */
    public ProductsEntitlements entitlements() {
        return entitlements;
    }

    /**
     * List products
     *
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductsListPage list() {
        return list(ProductsListOptions.none(), RequestOptions.none());
    }

    /**
     * List products
     *
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductsListPage list(final ProductsListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List products
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductsListPage list(final RequestOptions requestOptions) {
        return list(ProductsListOptions.none(), requestOptions);
    }

    /**
     * List products
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductsListPage list(
            final ProductsListOptions options, final RequestOptions requestOptions) {
        return pageOfList(exchangeList(options, requestOptions).send(), options, requestOptions);
    }

    MeteroidHttpClient.Exchange<ProductListResponse> exchangeList(
            final ProductsListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/products");
        String value1 = options.productFamilyId().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("product_family_id", value1);
        }
        String value2 = options.search().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("search", value2);
        }
        String value3 = options.orderBy().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("order_by", value3);
        }
        Integer value4 = options.page().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value4));
        }
        Integer value5 = options.perPage().orElse(null);
        if (value5 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value5));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429")
                .options(requestOptions)
                .returning(ProductListResponse.class);
    }

    private ProductsListPage pageOfList(
            ProductListResponse response,
            final ProductsListOptions options,
            final RequestOptions requestOptions) {
        List<Product> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new ProductsListPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    static List<Product> itemsOfList(ProductListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(ProductListResponse response, List<Product> items, Integer current) {
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
     * Create a product
     *
     * @param createProductRequest the request body
     * @return the response body
     */
    public Product create(final CreateProductRequest createProductRequest) {
        return create(createProductRequest, RequestOptions.none());
    }

    /**
     * Create a product
     *
     * @param createProductRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Product create(
            final CreateProductRequest createProductRequest, final RequestOptions requestOptions) {
        return exchangeCreate(createProductRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Product> exchangeCreate(
            final CreateProductRequest createProductRequest, final RequestOptions requestOptions) {
        Objects.requireNonNull(createProductRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/products").build();
        return client.call("POST", url)
                .json(createProductRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "429")
                .options(requestOptions)
                .returning(Product.class);
    }

    /**
     * Get product details
     *
     * @param productId the {@code product_id} path parameter
     * @return the response body
     */
    public Product retrieve(final String productId) {
        return retrieve(productId, RequestOptions.none());
    }

    /**
     * Get product details
     *
     * @param productId the {@code product_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Product retrieve(final String productId, final RequestOptions requestOptions) {
        return exchangeRetrieve(productId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Product> exchangeRetrieve(
            final String productId, final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(Product.class);
    }

    /**
     * Update a product
     *
     * <p>Partially update product fields. The fee_type is immutable and cannot be changed.
     *
     * @param productId the {@code product_id} path parameter
     * @param updateProductRequest the request body
     * @return the response body
     */
    public Product update(final String productId, final UpdateProductRequest updateProductRequest) {
        return update(productId, updateProductRequest, RequestOptions.none());
    }

    /**
     * Update a product
     *
     * <p>Partially update product fields. The fee_type is immutable and cannot be changed.
     *
     * @param productId the {@code product_id} path parameter
     * @param updateProductRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Product update(
            final String productId,
            final UpdateProductRequest updateProductRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(productId, updateProductRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Product> exchangeUpdate(
            final String productId,
            final UpdateProductRequest updateProductRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        Objects.requireNonNull(updateProductRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
                        .build();
        return client.call("PATCH", url)
                .json(updateProductRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(Product.class);
    }

    /**
     * Archive a product
     *
     * @param productId the {@code product_id} path parameter
     */
    public void archive(final String productId) {
        archive(productId, RequestOptions.none());
    }

    /**
     * Archive a product
     *
     * @param productId the {@code product_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void archive(final String productId, final RequestOptions requestOptions) {
        exchangeArchive(productId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeArchive(
            final String productId, final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
                        .addPathSegments("archive")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * Unarchive a product
     *
     * @param productId the {@code product_id} path parameter
     */
    public void unarchive(final String productId) {
        unarchive(productId, RequestOptions.none());
    }

    /**
     * Unarchive a product
     *
     * @param productId the {@code product_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void unarchive(final String productId, final RequestOptions requestOptions) {
        exchangeUnarchive(productId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeUnarchive(
            final String productId, final RequestOptions requestOptions) {
        Objects.requireNonNull(productId, "product_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/products")
                        .addPathSegment(Utils.pathSegment("product_id", productId))
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
         * The {@code entitlements} operations.
         *
         * @return the operations
         */
        public ProductsEntitlements.WithRawResponse entitlements() {
            return Products.this.entitlements.withRawResponse();
        }

        /**
         * List products
         *
         * @return the status, headers and page
         */
        public ApiResponse<ProductsListPage> list() {
            return list(ProductsListOptions.none(), RequestOptions.none());
        }

        /**
         * List products
         *
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<ProductsListPage> list(final ProductsListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List products
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<ProductsListPage> list(final RequestOptions requestOptions) {
            return list(ProductsListOptions.none(), requestOptions);
        }

        /**
         * List products
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<ProductsListPage> list(
                final ProductsListOptions options, final RequestOptions requestOptions) {
            ApiResponse<ProductListResponse> response =
                    exchangeList(options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), options, requestOptions));
        }

        /**
         * Create a product
         *
         * @param createProductRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Product> create(final CreateProductRequest createProductRequest) {
            return create(createProductRequest, RequestOptions.none());
        }

        /**
         * Create a product
         *
         * @param createProductRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Product> create(
                final CreateProductRequest createProductRequest,
                final RequestOptions requestOptions) {
            return Products.this.exchangeCreate(createProductRequest, requestOptions).sendRaw();
        }

        /**
         * Get product details
         *
         * @param productId the {@code product_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Product> retrieve(final String productId) {
            return retrieve(productId, RequestOptions.none());
        }

        /**
         * Get product details
         *
         * @param productId the {@code product_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Product> retrieve(
                final String productId, final RequestOptions requestOptions) {
            return Products.this.exchangeRetrieve(productId, requestOptions).sendRaw();
        }

        /**
         * Update a product
         *
         * <p>Partially update product fields. The fee_type is immutable and cannot be changed.
         *
         * @param productId the {@code product_id} path parameter
         * @param updateProductRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Product> update(
                final String productId, final UpdateProductRequest updateProductRequest) {
            return update(productId, updateProductRequest, RequestOptions.none());
        }

        /**
         * Update a product
         *
         * <p>Partially update product fields. The fee_type is immutable and cannot be changed.
         *
         * @param productId the {@code product_id} path parameter
         * @param updateProductRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Product> update(
                final String productId,
                final UpdateProductRequest updateProductRequest,
                final RequestOptions requestOptions) {
            return Products.this
                    .exchangeUpdate(productId, updateProductRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Archive a product
         *
         * @param productId the {@code product_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(final String productId) {
            return archive(productId, RequestOptions.none());
        }

        /**
         * Archive a product
         *
         * @param productId the {@code product_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(
                final String productId, final RequestOptions requestOptions) {
            return Products.this.exchangeArchive(productId, requestOptions).sendRaw();
        }

        /**
         * Unarchive a product
         *
         * @param productId the {@code product_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(final String productId) {
            return unarchive(productId, RequestOptions.none());
        }

        /**
         * Unarchive a product
         *
         * @param productId the {@code product_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(
                final String productId, final RequestOptions requestOptions) {
            return Products.this.exchangeUnarchive(productId, requestOptions).sendRaw();
        }
    }
}
