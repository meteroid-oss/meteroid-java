// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.CreateFeatureRequest;
import com.meteroid.models.Feature;
import com.meteroid.models.FeatureListResponse;
import com.meteroid.models.FeatureStatus;
import com.meteroid.models.UpdateFeatureRequest;

import okhttp3.HttpUrl;

import java.util.List;
import java.util.Objects;

/**
 * The {@code features} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Features {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Features(MeteroidHttpClient client) {
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
     * List features
     *
     * @return the page: the response body, its items and the way to the next pages
     */
    public FeaturesListPage list() {
        return list(FeaturesListOptions.none(), RequestOptions.none());
    }

    /**
     * List features
     *
     * @param options the optional parameters
     * @return the page: the response body, its items and the way to the next pages
     */
    public FeaturesListPage list(final FeaturesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List features
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public FeaturesListPage list(final RequestOptions requestOptions) {
        return list(FeaturesListOptions.none(), requestOptions);
    }

    /**
     * List features
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page: the response body, its items and the way to the next pages
     */
    public FeaturesListPage list(
            final FeaturesListOptions options, final RequestOptions requestOptions) {
        return pageOfList(exchangeList(options, requestOptions).send(), options, requestOptions);
    }

    MeteroidHttpClient.Exchange<FeatureListResponse> exchangeList(
            final FeaturesListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/features");
        List<FeatureStatus> value1 = options.statuses().orElse(null);
        if (value1 != null) {
            Utils.addExplodedQueryParameter(url, "statuses", value1);
        }
        String value2 = options.productId().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("product_id", value2);
        }
        String value3 = options.search().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("search", value3);
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
                .returning(FeatureListResponse.class);
    }

    private FeaturesListPage pageOfList(
            FeatureListResponse response,
            final FeaturesListOptions options,
            final RequestOptions requestOptions) {
        List<Feature> items = itemsOfList(response);
        Integer next = nextOfList(response, items, options.page().orElse(0));
        return new FeaturesListPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    static List<Feature> itemsOfList(FeatureListResponse response) {
        return Utils.optional(response.data()).orElse(List.of());
    }

    /** The parameter of the page after {@code response}, null after the last one. */
    static Integer nextOfList(FeatureListResponse response, List<Feature> items, Integer current) {
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
     * Create a feature
     *
     * @param createFeatureRequest the request body
     * @return the response body
     */
    public Feature create(final CreateFeatureRequest createFeatureRequest) {
        return create(createFeatureRequest, RequestOptions.none());
    }

    /**
     * Create a feature
     *
     * @param createFeatureRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Feature create(
            final CreateFeatureRequest createFeatureRequest, final RequestOptions requestOptions) {
        return exchangeCreate(createFeatureRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Feature> exchangeCreate(
            final CreateFeatureRequest createFeatureRequest, final RequestOptions requestOptions) {
        Objects.requireNonNull(createFeatureRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/features").build();
        return client.call("POST", url)
                .json(createFeatureRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "409", "429")
                .options(requestOptions)
                .returning(Feature.class);
    }

    /**
     * Get feature details
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @return the response body
     */
    public Feature retrieve(final String idOrCode) {
        return retrieve(idOrCode, RequestOptions.none());
    }

    /**
     * Get feature details
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Feature retrieve(final String idOrCode, final RequestOptions requestOptions) {
        return exchangeRetrieve(idOrCode, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Feature> exchangeRetrieve(
            final String idOrCode, final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrCode, "id_or_code");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/features")
                        .addPathSegment(Utils.pathSegment("id_or_code", idOrCode))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(Feature.class);
    }

    /**
     * Update a feature
     *
     * <p>Partially update feature fields. Code, feature type and product are immutable.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param updateFeatureRequest the request body
     * @return the response body
     */
    public Feature update(final String idOrCode, final UpdateFeatureRequest updateFeatureRequest) {
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
     * @return the response body
     */
    public Feature update(
            final String idOrCode,
            final UpdateFeatureRequest updateFeatureRequest,
            final RequestOptions requestOptions) {
        return exchangeUpdate(idOrCode, updateFeatureRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Feature> exchangeUpdate(
            final String idOrCode,
            final UpdateFeatureRequest updateFeatureRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrCode, "id_or_code");
        Objects.requireNonNull(updateFeatureRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/features")
                        .addPathSegment(Utils.pathSegment("id_or_code", idOrCode))
                        .build();
        return client.call("PATCH", url)
                .json(updateFeatureRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "400", "401", "404", "429")
                .options(requestOptions)
                .returning(Feature.class);
    }

    /**
     * Archive a feature
     *
     * <p>Keeps the feature and its entitlements but hides them from resolution.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     */
    public void archive(final String idOrCode) {
        archive(idOrCode, RequestOptions.none());
    }

    /**
     * Archive a feature
     *
     * <p>Keeps the feature and its entitlements but hides them from resolution.
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void archive(final String idOrCode, final RequestOptions requestOptions) {
        exchangeArchive(idOrCode, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeArchive(
            final String idOrCode, final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrCode, "id_or_code");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/features")
                        .addPathSegment(Utils.pathSegment("id_or_code", idOrCode))
                        .addPathSegments("archive")
                        .build();
        return client.call("POST", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returningNothing();
    }

    /**
     * Unarchive a feature
     *
     * @param idOrCode the {@code id_or_code} path parameter
     */
    public void unarchive(final String idOrCode) {
        unarchive(idOrCode, RequestOptions.none());
    }

    /**
     * Unarchive a feature
     *
     * @param idOrCode the {@code id_or_code} path parameter
     * @param requestOptions headers, timeout and retries of this call
     */
    public void unarchive(final String idOrCode, final RequestOptions requestOptions) {
        exchangeUnarchive(idOrCode, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<Void> exchangeUnarchive(
            final String idOrCode, final RequestOptions requestOptions) {
        Objects.requireNonNull(idOrCode, "id_or_code");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/features")
                        .addPathSegment(Utils.pathSegment("id_or_code", idOrCode))
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
         * List features
         *
         * @return the status, headers and page
         */
        public ApiResponse<FeaturesListPage> list() {
            return list(FeaturesListOptions.none(), RequestOptions.none());
        }

        /**
         * List features
         *
         * @param options the optional parameters
         * @return the status, headers and page
         */
        public ApiResponse<FeaturesListPage> list(final FeaturesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List features
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<FeaturesListPage> list(final RequestOptions requestOptions) {
            return list(FeaturesListOptions.none(), requestOptions);
        }

        /**
         * List features
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page
         */
        public ApiResponse<FeaturesListPage> list(
                final FeaturesListOptions options, final RequestOptions requestOptions) {
            ApiResponse<FeatureListResponse> response =
                    exchangeList(options, requestOptions).sendRaw();
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers(),
                    pageOfList(response.body(), options, requestOptions));
        }

        /**
         * Create a feature
         *
         * @param createFeatureRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Feature> create(final CreateFeatureRequest createFeatureRequest) {
            return create(createFeatureRequest, RequestOptions.none());
        }

        /**
         * Create a feature
         *
         * @param createFeatureRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Feature> create(
                final CreateFeatureRequest createFeatureRequest,
                final RequestOptions requestOptions) {
            return Features.this.exchangeCreate(createFeatureRequest, requestOptions).sendRaw();
        }

        /**
         * Get feature details
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Feature> retrieve(final String idOrCode) {
            return retrieve(idOrCode, RequestOptions.none());
        }

        /**
         * Get feature details
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Feature> retrieve(
                final String idOrCode, final RequestOptions requestOptions) {
            return Features.this.exchangeRetrieve(idOrCode, requestOptions).sendRaw();
        }

        /**
         * Update a feature
         *
         * <p>Partially update feature fields. Code, feature type and product are immutable.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param updateFeatureRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Feature> update(
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
         * @return the status, headers and body
         */
        public ApiResponse<Feature> update(
                final String idOrCode,
                final UpdateFeatureRequest updateFeatureRequest,
                final RequestOptions requestOptions) {
            return Features.this
                    .exchangeUpdate(idOrCode, updateFeatureRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Archive a feature
         *
         * <p>Keeps the feature and its entitlements but hides them from resolution.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(final String idOrCode) {
            return archive(idOrCode, RequestOptions.none());
        }

        /**
         * Archive a feature
         *
         * <p>Keeps the feature and its entitlements but hides them from resolution.
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> archive(
                final String idOrCode, final RequestOptions requestOptions) {
            return Features.this.exchangeArchive(idOrCode, requestOptions).sendRaw();
        }

        /**
         * Unarchive a feature
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(final String idOrCode) {
            return unarchive(idOrCode, RequestOptions.none());
        }

        /**
         * Unarchive a feature
         *
         * @param idOrCode the {@code id_or_code} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Void> unarchive(
                final String idOrCode, final RequestOptions requestOptions) {
            return Features.this.exchangeUnarchive(idOrCode, requestOptions).sendRaw();
        }
    }
}
