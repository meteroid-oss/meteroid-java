// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.IssueLicenseRequest;
import com.meteroid.models.IssueLicenseResponse;
import com.meteroid.models.IssueOfflineLicenseRequest;
import com.meteroid.models.License;
import com.meteroid.models.LicenseActivationCode;
import com.meteroid.models.LicenseListResponse;
import com.meteroid.models.LicenseSigningKeysResponse;
import com.meteroid.models.OfflineLicense;
import com.meteroid.models.RevokeLicenseRequest;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code licenses} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class LicensesAsync {
    private final Licenses sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public LicensesAsync(Licenses sync) {
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
     * List licenses
     *
     * @return the response body, once received
     */
    public CompletableFuture<LicenseListResponse> list() {
        return list(LicensesListOptions.none(), RequestOptions.none());
    }

    /**
     * List licenses
     *
     * @param options the optional parameters
     * @return the response body, once received
     */
    public CompletableFuture<LicenseListResponse> list(final LicensesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List licenses
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<LicenseListResponse> list(final RequestOptions requestOptions) {
        return list(LicensesListOptions.none(), requestOptions);
    }

    /**
     * List licenses
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<LicenseListResponse> list(
            final LicensesListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions).sendAsync();
    }

    /**
     * Issue a license
     *
     * <p>Issues a license to a customer, optionally tied to one of its subscriptions. Online, the
     * license is pending until their installation activates it with the returned one-time code.
     * Offline, it is returned signed at once, for an installation that can't reach the server.
     *
     * @param issueLicenseRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<IssueLicenseResponse> create(
            final IssueLicenseRequest issueLicenseRequest) {
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
     * @return the response body, once received
     */
    public CompletableFuture<IssueLicenseResponse> create(
            final IssueLicenseRequest issueLicenseRequest, final RequestOptions requestOptions) {
        return sync.exchangeCreate(issueLicenseRequest, requestOptions).sendAsync();
    }

    /**
     * Get a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<License> retrieve(final String licenseId) {
        return retrieve(licenseId, RequestOptions.none());
    }

    /**
     * Get a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<License> retrieve(
            final String licenseId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(licenseId, requestOptions).sendAsync();
    }

    /**
     * Get a license's activation code
     *
     * <p>Available until the license is activated or revoked.
     *
     * @param licenseId the {@code license_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<LicenseActivationCode> retrieveActivationCode(final String licenseId) {
        return retrieveActivationCode(licenseId, RequestOptions.none());
    }

    /**
     * Get a license's activation code
     *
     * <p>Available until the license is activated or revoked.
     *
     * @param licenseId the {@code license_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<LicenseActivationCode> retrieveActivationCode(
            final String licenseId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieveActivationCode(licenseId, requestOptions).sendAsync();
    }

    /**
     * Issue an offline license
     *
     * <p>Signs a long-lived license for an air-gapped installation from an existing license, e.g.
     * to renew an offline license before it expires. Given an instance id, binds the license to it.
     *
     * @param licenseId the {@code license_id} path parameter
     * @param issueOfflineLicenseRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<OfflineLicense> offline(
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
     * @return the response body, once received
     */
    public CompletableFuture<OfflineLicense> offline(
            final String licenseId,
            final IssueOfflineLicenseRequest issueOfflineLicenseRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeOffline(licenseId, issueOfflineLicenseRequest, requestOptions)
                .sendAsync();
    }

    /**
     * Revoke a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param revokeLicenseRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<License> revoke(
            final String licenseId, final RevokeLicenseRequest revokeLicenseRequest) {
        return revoke(licenseId, revokeLicenseRequest, RequestOptions.none());
    }

    /**
     * Revoke a license
     *
     * @param licenseId the {@code license_id} path parameter
     * @param revokeLicenseRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<License> revoke(
            final String licenseId,
            final RevokeLicenseRequest revokeLicenseRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeRevoke(licenseId, revokeLicenseRequest, requestOptions).sendAsync();
    }

    /**
     * Get the licensing signing keys
     *
     * <p>The keys licenses are signed with, and the public endpoints installations talk to.
     *
     * @return the response body, once received
     */
    public CompletableFuture<LicenseSigningKeysResponse> listLicensingSigningKeys() {
        return listLicensingSigningKeys(RequestOptions.none());
    }

    /**
     * Get the licensing signing keys
     *
     * <p>The keys licenses are signed with, and the public endpoints installations talk to.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<LicenseSigningKeysResponse> listLicensingSigningKeys(
            final RequestOptions requestOptions) {
        return sync.exchangeListLicensingSigningKeys(requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * List licenses
         *
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseListResponse>> list() {
            return list(LicensesListOptions.none(), RequestOptions.none());
        }

        /**
         * List licenses
         *
         * @param options the optional parameters
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseListResponse>> list(
                final LicensesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List licenses
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseListResponse>> list(
                final RequestOptions requestOptions) {
            return list(LicensesListOptions.none(), requestOptions);
        }

        /**
         * List licenses
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseListResponse>> list(
                final LicensesListOptions options, final RequestOptions requestOptions) {
            return sync.exchangeList(options, requestOptions).sendRawAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<IssueLicenseResponse>> create(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<IssueLicenseResponse>> create(
                final IssueLicenseRequest issueLicenseRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(issueLicenseRequest, requestOptions).sendRawAsync();
        }

        /**
         * Get a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<License>> retrieve(final String licenseId) {
            return retrieve(licenseId, RequestOptions.none());
        }

        /**
         * Get a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<License>> retrieve(
                final String licenseId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(licenseId, requestOptions).sendRawAsync();
        }

        /**
         * Get a license's activation code
         *
         * <p>Available until the license is activated or revoked.
         *
         * @param licenseId the {@code license_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseActivationCode>> retrieveActivationCode(
                final String licenseId) {
            return retrieveActivationCode(licenseId, RequestOptions.none());
        }

        /**
         * Get a license's activation code
         *
         * <p>Available until the license is activated or revoked.
         *
         * @param licenseId the {@code license_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseActivationCode>> retrieveActivationCode(
                final String licenseId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieveActivationCode(licenseId, requestOptions).sendRawAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<OfflineLicense>> offline(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<OfflineLicense>> offline(
                final String licenseId,
                final IssueOfflineLicenseRequest issueOfflineLicenseRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeOffline(licenseId, issueOfflineLicenseRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Revoke a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param revokeLicenseRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<License>> revoke(
                final String licenseId, final RevokeLicenseRequest revokeLicenseRequest) {
            return revoke(licenseId, revokeLicenseRequest, RequestOptions.none());
        }

        /**
         * Revoke a license
         *
         * @param licenseId the {@code license_id} path parameter
         * @param revokeLicenseRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<License>> revoke(
                final String licenseId,
                final RevokeLicenseRequest revokeLicenseRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeRevoke(licenseId, revokeLicenseRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Get the licensing signing keys
         *
         * <p>The keys licenses are signed with, and the public endpoints installations talk to.
         *
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseSigningKeysResponse>>
                listLicensingSigningKeys() {
            return listLicensingSigningKeys(RequestOptions.none());
        }

        /**
         * Get the licensing signing keys
         *
         * <p>The keys licenses are signed with, and the public endpoints installations talk to.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<LicenseSigningKeysResponse>> listLicensingSigningKeys(
                final RequestOptions requestOptions) {
            return sync.exchangeListLicensingSigningKeys(requestOptions).sendRawAsync();
        }
    }
}
