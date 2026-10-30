// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.IssueLicenseRequest;
import com.meteroid.models.IssueLicenseResponse;
import com.meteroid.models.IssueOfflineLicenseRequest;
import com.meteroid.models.License;
import com.meteroid.models.LicenseActivationCode;
import com.meteroid.models.LicenseListResponse;
import com.meteroid.models.LicenseSigningKeysResponse;
import com.meteroid.models.OfflineLicense;
import com.meteroid.models.RevokeLicenseRequest;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code licenses} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Licenses {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Licenses(MeteroidHttpClient client) {
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
     * List licenses
     *
     * @return the response body
     */
    public LicenseListResponse list() {
        return list(LicensesListOptions.none(), RequestOptions.none());
    }

    /**
     * List licenses
     *
     * @param options the optional parameters
     * @return the response body
     */
    public LicenseListResponse list(final LicensesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List licenses
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public LicenseListResponse list(final RequestOptions requestOptions) {
        return list(LicensesListOptions.none(), requestOptions);
    }

    /**
     * List licenses
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public LicenseListResponse list(
            final LicensesListOptions options, final RequestOptions requestOptions) {
        return exchangeList(options, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<LicenseListResponse> exchangeList(
            final LicensesListOptions options, final RequestOptions requestOptions) {
        Objects.requireNonNull(options, "options");
        HttpUrl.Builder url = client.newUrlBuilder().addPathSegments("api/v1/licenses");
        String value1 = options.customerId().orElse(null);
        if (value1 != null) {
            url.addQueryParameter("customer_id", value1);
        }
        String value2 = options.subscriptionId().orElse(null);
        if (value2 != null) {
            url.addQueryParameter("subscription_id", value2);
        }
        Boolean value3 = options.includeRevoked().orElse(null);
        if (value3 != null) {
            url.addQueryParameter("include_revoked", Utils.serializeQueryParam(value3));
        }
        return client.call("GET", url.build())
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(LicenseListResponse.class);
    }

    /**
     * Issue a license
     *
     * <p>Issues a license to a customer, optionally tied to one of its subscriptions. Online, the
     * license is pending until their installation activates it with the returned one-time code.
     * Offline, it is returned signed at once, for an installation that can't reach the server.
     *
     * @param issueLicenseRequest the request body
     * @return the response body
     */
    public IssueLicenseResponse create(final IssueLicenseRequest issueLicenseRequest) {
        return create(issueLicenseRequest, RequestOptions.none());
    }

    /**
     * Issue a license
     *
     * <p>Issues a license to a customer, optionally tied to one of its subscriptions. Online, the
     * license is pending until their installation activates it with the returned one-time code.
     * Offline, it is returned signed at once, for an installation that can't reach the server.
     *
     * @param issueLicenseRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public IssueLicenseResponse create(
            final IssueLicenseRequest issueLicenseRequest, final RequestOptions requestOptions) {
        return exchangeCreate(issueLicenseRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<IssueLicenseResponse> exchangeCreate(
            final IssueLicenseRequest issueLicenseRequest, final RequestOptions requestOptions) {
        Objects.requireNonNull(issueLicenseRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/licenses").build();
        return client.call("POST", url)
                .json(issueLicenseRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429")
                .options(requestOptions)
                .returning(IssueLicenseResponse.class);
    }

    /**
     * Get a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @return the response body
     */
    public License retrieve(final String licenseId) {
        return retrieve(licenseId, RequestOptions.none());
    }

    /**
     * Get a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public License retrieve(final String licenseId, final RequestOptions requestOptions) {
        return exchangeRetrieve(licenseId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<License> exchangeRetrieve(
            final String licenseId, final RequestOptions requestOptions) {
        Objects.requireNonNull(licenseId, "license_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/licenses")
                        .addPathSegment(Utils.pathSegment("license_id", licenseId))
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(License.class);
    }

    /**
     * Get a license's activation code
     *
     * <p>Available until the license is activated or revoked.
     *
     * @param licenseId the {@code license_id} path parameter
     * @return the response body
     */
    public LicenseActivationCode retrieveActivationCode(final String licenseId) {
        return retrieveActivationCode(licenseId, RequestOptions.none());
    }

    /**
     * Get a license's activation code
     *
     * <p>Available until the license is activated or revoked.
     *
     * @param licenseId the {@code license_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public LicenseActivationCode retrieveActivationCode(
            final String licenseId, final RequestOptions requestOptions) {
        return exchangeRetrieveActivationCode(licenseId, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<LicenseActivationCode> exchangeRetrieveActivationCode(
            final String licenseId, final RequestOptions requestOptions) {
        Objects.requireNonNull(licenseId, "license_id");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/licenses")
                        .addPathSegment(Utils.pathSegment("license_id", licenseId))
                        .addPathSegments("activation-code")
                        .build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(LicenseActivationCode.class);
    }

    /**
     * Issue an offline license
     *
     * <p>Signs a long-lived license for an air-gapped installation from an existing license, e.g.
     * to renew an offline license before it expires. Given an instance id, binds the license to it.
     *
     * @param licenseId the {@code license_id} path parameter
     * @param issueOfflineLicenseRequest the request body
     * @return the response body
     */
    public OfflineLicense offline(
            final String licenseId, final IssueOfflineLicenseRequest issueOfflineLicenseRequest) {
        return offline(licenseId, issueOfflineLicenseRequest, RequestOptions.none());
    }

    /**
     * Issue an offline license
     *
     * <p>Signs a long-lived license for an air-gapped installation from an existing license, e.g.
     * to renew an offline license before it expires. Given an instance id, binds the license to it.
     *
     * @param licenseId the {@code license_id} path parameter
     * @param issueOfflineLicenseRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public OfflineLicense offline(
            final String licenseId,
            final IssueOfflineLicenseRequest issueOfflineLicenseRequest,
            final RequestOptions requestOptions) {
        return exchangeOffline(licenseId, issueOfflineLicenseRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<OfflineLicense> exchangeOffline(
            final String licenseId,
            final IssueOfflineLicenseRequest issueOfflineLicenseRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(licenseId, "license_id");
        Objects.requireNonNull(issueOfflineLicenseRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/licenses")
                        .addPathSegment(Utils.pathSegment("license_id", licenseId))
                        .addPathSegments("offline")
                        .build();
        return client.call("POST", url)
                .json(issueOfflineLicenseRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429")
                .options(requestOptions)
                .returning(OfflineLicense.class);
    }

    /**
     * Revoke a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param revokeLicenseRequest the request body
     * @return the response body
     */
    public License revoke(final String licenseId, final RevokeLicenseRequest revokeLicenseRequest) {
        return revoke(licenseId, revokeLicenseRequest, RequestOptions.none());
    }

    /**
     * Revoke a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param revokeLicenseRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public License revoke(
            final String licenseId,
            final RevokeLicenseRequest revokeLicenseRequest,
            final RequestOptions requestOptions) {
        return exchangeRevoke(licenseId, revokeLicenseRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<License> exchangeRevoke(
            final String licenseId,
            final RevokeLicenseRequest revokeLicenseRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(licenseId, "license_id");
        Objects.requireNonNull(revokeLicenseRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/licenses")
                        .addPathSegment(Utils.pathSegment("license_id", licenseId))
                        .addPathSegments("revoke")
                        .build();
        return client.call("POST", url)
                .json(revokeLicenseRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "404", "429")
                .options(requestOptions)
                .returning(License.class);
    }

    /**
     * Get the licensing signing keys
     *
     * <p>The keys licenses are signed with, and the public endpoints installations talk to.
     *
     * @return the response body
     */
    public LicenseSigningKeysResponse listLicensingSigningKeys() {
        return listLicensingSigningKeys(RequestOptions.none());
    }

    /**
     * Get the licensing signing keys
     *
     * <p>The keys licenses are signed with, and the public endpoints installations talk to.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public LicenseSigningKeysResponse listLicensingSigningKeys(
            final RequestOptions requestOptions) {
        return exchangeListLicensingSigningKeys(requestOptions).send();
    }

    MeteroidHttpClient.Exchange<LicenseSigningKeysResponse> exchangeListLicensingSigningKeys(
            final RequestOptions requestOptions) {
        HttpUrl url =
                client.newUrlBuilder().addPathSegments("api/v1/licensing/signing-keys").build();
        return client.call("GET", url)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "403", "429")
                .options(requestOptions)
                .returning(LicenseSigningKeysResponse.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List licenses
         *
         * @return the status, headers and body
         */
        public ApiResponse<LicenseListResponse> list() {
            return list(LicensesListOptions.none(), RequestOptions.none());
        }

        /**
         * List licenses
         *
         * @param options the optional parameters
         * @return the status, headers and body
         */
        public ApiResponse<LicenseListResponse> list(final LicensesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List licenses
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<LicenseListResponse> list(final RequestOptions requestOptions) {
            return list(LicensesListOptions.none(), requestOptions);
        }

        /**
         * List licenses
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<LicenseListResponse> list(
                final LicensesListOptions options, final RequestOptions requestOptions) {
            return Licenses.this.exchangeList(options, requestOptions).sendRaw();
        }

        /**
         * Issue a license
         *
         * <p>Issues a license to a customer, optionally tied to one of its subscriptions. Online,
         * the license is pending until their installation activates it with the returned one-time
         * code. Offline, it is returned signed at once, for an installation that can't reach the
         * server.
         *
         * @param issueLicenseRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<IssueLicenseResponse> create(
                final IssueLicenseRequest issueLicenseRequest) {
            return create(issueLicenseRequest, RequestOptions.none());
        }

        /**
         * Issue a license
         *
         * <p>Issues a license to a customer, optionally tied to one of its subscriptions. Online,
         * the license is pending until their installation activates it with the returned one-time
         * code. Offline, it is returned signed at once, for an installation that can't reach the
         * server.
         *
         * @param issueLicenseRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<IssueLicenseResponse> create(
                final IssueLicenseRequest issueLicenseRequest,
                final RequestOptions requestOptions) {
            return Licenses.this.exchangeCreate(issueLicenseRequest, requestOptions).sendRaw();
        }

        /**
         * Get a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<License> retrieve(final String licenseId) {
            return retrieve(licenseId, RequestOptions.none());
        }

        /**
         * Get a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<License> retrieve(
                final String licenseId, final RequestOptions requestOptions) {
            return Licenses.this.exchangeRetrieve(licenseId, requestOptions).sendRaw();
        }

        /**
         * Get a license's activation code
         *
         * <p>Available until the license is activated or revoked.
         *
         * @param licenseId the {@code license_id} path parameter
         * @return the status, headers and body
         */
        public ApiResponse<LicenseActivationCode> retrieveActivationCode(final String licenseId) {
            return retrieveActivationCode(licenseId, RequestOptions.none());
        }

        /**
         * Get a license's activation code
         *
         * <p>Available until the license is activated or revoked.
         *
         * @param licenseId the {@code license_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<LicenseActivationCode> retrieveActivationCode(
                final String licenseId, final RequestOptions requestOptions) {
            return Licenses.this
                    .exchangeRetrieveActivationCode(licenseId, requestOptions)
                    .sendRaw();
        }

        /**
         * Issue an offline license
         *
         * <p>Signs a long-lived license for an air-gapped installation from an existing license,
         * e.g. to renew an offline license before it expires. Given an instance id, binds the
         * license to it.
         *
         * @param licenseId the {@code license_id} path parameter
         * @param issueOfflineLicenseRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<OfflineLicense> offline(
                final String licenseId,
                final IssueOfflineLicenseRequest issueOfflineLicenseRequest) {
            return offline(licenseId, issueOfflineLicenseRequest, RequestOptions.none());
        }

        /**
         * Issue an offline license
         *
         * <p>Signs a long-lived license for an air-gapped installation from an existing license,
         * e.g. to renew an offline license before it expires. Given an instance id, binds the
         * license to it.
         *
         * @param licenseId the {@code license_id} path parameter
         * @param issueOfflineLicenseRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<OfflineLicense> offline(
                final String licenseId,
                final IssueOfflineLicenseRequest issueOfflineLicenseRequest,
                final RequestOptions requestOptions) {
            return Licenses.this
                    .exchangeOffline(licenseId, issueOfflineLicenseRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Revoke a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param revokeLicenseRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<License> revoke(
                final String licenseId, final RevokeLicenseRequest revokeLicenseRequest) {
            return revoke(licenseId, revokeLicenseRequest, RequestOptions.none());
        }

        /**
         * Revoke a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param revokeLicenseRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<License> revoke(
                final String licenseId,
                final RevokeLicenseRequest revokeLicenseRequest,
                final RequestOptions requestOptions) {
            return Licenses.this
                    .exchangeRevoke(licenseId, revokeLicenseRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Get the licensing signing keys
         *
         * <p>The keys licenses are signed with, and the public endpoints installations talk to.
         *
         * @return the status, headers and body
         */
        public ApiResponse<LicenseSigningKeysResponse> listLicensingSigningKeys() {
            return listLicensingSigningKeys(RequestOptions.none());
        }

        /**
         * Get the licensing signing keys
         *
         * <p>The keys licenses are signed with, and the public endpoints installations talk to.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<LicenseSigningKeysResponse> listLicensingSigningKeys(
                final RequestOptions requestOptions) {
            return Licenses.this.exchangeListLicensingSigningKeys(requestOptions).sendRaw();
        }
    }
}
