// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.ProductFamily;
import com.meteroid.models.ProductFamilyCreateRequest;
import com.meteroid.models.ProductFamilyListResponse;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code product_families} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class ProductFamilies {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public ProductFamilies(MeteroidHttpClient client) {
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
     * List product families
     *
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductFamiliesListPage list() {
        return list(ProductFamiliesListOptions.none(), RequestOptions.none());
    }

    /**
     * List product families
     *
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductFamiliesListPage list(final ProductFamiliesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List product families
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductFamiliesListPage list(final RequestOptions requestOptions) {
        return list(ProductFamiliesListOptions.none(), requestOptions);
    }

    /**
     * List product families
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public ProductFamiliesListPage list(
            final ProductFamiliesListOptions options, final RequestOptions requestOptions) {
        return pageOfList(exchangeList(options, requestOptions).send(), options, requestOptions);
    }

    MeteroidHttpClient.Exchange<ProductFamilyListResponse> exchangeList(
            final ProductFamiliesListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/product_families");
        String value1 = options.orderBy().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("order_by", value1);
        }
        Integer value2 = options.page().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("page", Utils.serializeQueryParam(value2));
        }
        Integer value3 = options.perPage().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("per_page", Utils.serializeQueryParam(value3));
        }
        String value4 = options.search().orElse(null);
        if (value4 != null) {
            url.addQueryParameter("search", value4);
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "429")
                .options(requestOptions)
                .returning(ProductFamilyListResponse.class);
    }

    private ProductFamiliesListPage pageOfList(
            ProductFamilyListResponse response,
            final ProductFamiliesListOptions options,
            final RequestOptions requestOptions) {
        List<ProductFamily> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new ProductFamiliesListPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    static List<ProductFamily> itemsOfList(ProductFamilyListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(
            ProductFamilyListResponse response, List<ProductFamily> items, Integer current) {
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
     * Create product family
     *
     * @param productFamilyCreateRequest the request body
     * @return the response body
     */
    public ProductFamily create(final ProductFamilyCreateRequest productFamilyCreateRequest) {
        return create(productFamilyCreateRequest, RequestOptions.none());
    }

    /**
     * Create product family
     *
     * @param productFamilyCreateRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public ProductFamily create(
            final ProductFamilyCreateRequest productFamilyCreateRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(productFamilyCreateRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<ProductFamily> exchangeCreate(
            final ProductFamilyCreateRequest productFamilyCreateRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(productFamilyCreateRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/product_families").build();
        return client.call("POST", url)
                .json(productFamilyCreateRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "429")
                .options(requestOptions)
                .returning(ProductFamily.class);
    }

    /**
     * Get product family
     *
     * <p>Retrieve a single product family by ID or alias.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @return the response body
     */
    public ProductFamily retrieve(final String idOrAlias) {
        return retrieve(idOrAlias, RequestOptions.none());
    }

    /**
     * Get product family
     *
     * <p>Retrieve a single product family by ID or alias.
     *
     * @param idOrAlias the {@code id_or_alias} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public ProductFamily retrieve(final String idOrAlias, final RequestOptions requestOptions) {
        return exchangeRetrieve(idOrAlias, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<ProductFamily> exchangeRetrieve(
            final String idOrAlias, final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrAlias, "id_or_alias");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/product_families")
                        .addPathSegment(Utils.pathSegment("id_or_alias", idOrAlias))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "429")
                .options(requestOptions)
                .returning(ProductFamily.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List product families
         *
         * @return the status, headers and page
         */
        public ApiResponse<ProductFamiliesListPage> list() {
            return list(ProductFamiliesListOptions.none(), RequestOptions.none());
        }

        /**
         * List product families
         *
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<ProductFamiliesListPage> list(final ProductFamiliesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List product families
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<ProductFamiliesListPage> list(final RequestOptions requestOptions) {
            return list(ProductFamiliesListOptions.none(), requestOptions);
        }

        /**
         * List product families
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<ProductFamiliesListPage> list(
                final ProductFamiliesListOptions options, final RequestOptions requestOptions) {
            ApiResponse<ProductFamilyListResponse> response =
                    exchangeList(options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), options, requestOptions));
        }

        /**
         * Create product family
         *
         * @param productFamilyCreateRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<ProductFamily> create(
                final ProductFamilyCreateRequest productFamilyCreateRequest) {
            return create(productFamilyCreateRequest, RequestOptions.none());
        }

        /**
         * Create product family
         *
         * @param productFamilyCreateRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<ProductFamily> create(
                final ProductFamilyCreateRequest productFamilyCreateRequest,
                final RequestOptions requestOptions) {
            return ProductFamilies.this
                    .exchangeCreate(productFamilyCreateRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Get product family
         *
         * <p>Retrieve a single product family by ID or alias.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<ProductFamily> retrieve(final String idOrAlias) {
            return retrieve(idOrAlias, RequestOptions.none());
        }

        /**
         * Get product family
         *
         * <p>Retrieve a single product family by ID or alias.
         *
         * @param idOrAlias the {@code id_or_alias} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<ProductFamily> retrieve(
                final String idOrAlias, final RequestOptions requestOptions) {
            return ProductFamilies.this.exchangeRetrieve(idOrAlias, requestOptions).sendRaw();
        }
    }
}
