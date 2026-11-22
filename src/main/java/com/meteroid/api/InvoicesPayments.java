// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.RecordInvoicePaymentRequest;
import com.meteroid.models.ReverseInvoicePaymentRequest;
import com.meteroid.models.Transaction;

import okhttp3.Headers;
import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code invoices.payments} operations, blocking. {@link #withRawResponse()} has the same
 * methods returning the status and headers along with the body.
 */
public final class InvoicesPayments {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public InvoicesPayments(MeteroidHttpClient client) {
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
     * Record an invoice payment
     *
     * <p>Record a partial or full payment received outside Meteroid against a finalized invoice.
     * Paying the remaining balance marks the invoice paid.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param recordInvoicePaymentRequest the request body
     * @return the response body
     */
    public Transaction create(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest) {
        return create(
                invoiceId, idempotencyKey, recordInvoicePaymentRequest, RequestOptions.none());
    }

    /**
     * Record an invoice payment
     *
     * <p>Record a partial or full payment received outside Meteroid against a finalized invoice.
     * Paying the remaining balance marks the invoice paid.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param recordInvoicePaymentRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Transaction create(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        return exchangeCreate(
                        invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<Transaction> exchangeCreate(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(invoiceId, "invoice_id");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(recordInvoicePaymentRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/invoices")
                        .addPathSegment(Utils.pathSegment("invoice_id", invoiceId))
                        .addPathSegments("payments")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .json(recordInvoicePaymentRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Transaction.class);
    }

    /**
     * Reverse an invoice payment
     *
     * <p>Record the full reversal of a settled manual payment.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param transactionId the {@code transaction_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param reverseInvoicePaymentRequest the request body
     * @return the response body
     */
    public Transaction reverse(
            final String invoiceId,
            final String transactionId,
            final String idempotencyKey,
            final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest) {
        return reverse(
                invoiceId,
                transactionId,
                idempotencyKey,
                reverseInvoicePaymentRequest,
                RequestOptions.none());
    }

    /**
     * Reverse an invoice payment
     *
     * <p>Record the full reversal of a settled manual payment.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param transactionId the {@code transaction_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param reverseInvoicePaymentRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body
     */
    public Transaction reverse(
            final String invoiceId,
            final String transactionId,
            final String idempotencyKey,
            final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        return exchangeReverse(
                        invoiceId,
                        transactionId,
                        idempotencyKey,
                        reverseInvoicePaymentRequest,
                        requestOptions)
                .send();
    }

    MeteroidHttpClient.Exchange<Transaction> exchangeReverse(
            final String invoiceId,
            final String transactionId,
            final String idempotencyKey,
            final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(invoiceId, "invoice_id");
        Objects.requireNonNull(transactionId, "transaction_id");
        Objects.requireNonNull(idempotencyKey, "Idempotency-Key");
        Objects.requireNonNull(reverseInvoicePaymentRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/invoices")
                        .addPathSegment(Utils.pathSegment("invoice_id", invoiceId))
                        .addPathSegments("payments")
                        .addPathSegment(Utils.pathSegment("transaction_id", transactionId))
                        .addPathSegments("reverse")
                        .build();
        Headers.Builder headers = new Headers.Builder();
        headers.set("Idempotency-Key", Utils.serializeQueryParam(idempotencyKey));
        return client.call("POST", url)
                .headers(headers.build())
                .json(reverseInvoicePaymentRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429",
                        "500")
                .options(requestOptions)
                .returning(Transaction.class);
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Record an invoice payment
         *
         * <p>Record a partial or full payment received outside Meteroid against a finalized
         * invoice. Paying the remaining balance marks the invoice paid.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param recordInvoicePaymentRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Transaction> create(
                final String invoiceId,
                final String idempotencyKey,
                final RecordInvoicePaymentRequest recordInvoicePaymentRequest) {
            return create(
                    invoiceId, idempotencyKey, recordInvoicePaymentRequest, RequestOptions.none());
        }

        /**
         * Record an invoice payment
         *
         * <p>Record a partial or full payment received outside Meteroid against a finalized
         * invoice. Paying the remaining balance marks the invoice paid.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param recordInvoicePaymentRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Transaction> create(
                final String invoiceId,
                final String idempotencyKey,
                final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
                final RequestOptions requestOptions) {
            return InvoicesPayments.this
                    .exchangeCreate(
                            invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                    .sendRaw();
        }

        /**
         * Reverse an invoice payment
         *
         * <p>Record the full reversal of a settled manual payment.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param transactionId the {@code transaction_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param reverseInvoicePaymentRequest the request body
         * @return the status, headers and body
         */
        public ApiResponse<Transaction> reverse(
                final String invoiceId,
                final String transactionId,
                final String idempotencyKey,
                final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest) {
            return reverse(
                    invoiceId,
                    transactionId,
                    idempotencyKey,
                    reverseInvoicePaymentRequest,
                    RequestOptions.none());
        }

        /**
         * Reverse an invoice payment
         *
         * <p>Record the full reversal of a settled manual payment.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param transactionId the {@code transaction_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param reverseInvoicePaymentRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body
         */
        public ApiResponse<Transaction> reverse(
                final String invoiceId,
                final String transactionId,
                final String idempotencyKey,
                final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest,
                final RequestOptions requestOptions) {
            return InvoicesPayments.this
                    .exchangeReverse(
                            invoiceId,
                            transactionId,
                            idempotencyKey,
                            reverseInvoicePaymentRequest,
                            requestOptions)
                    .sendRaw();
        }
    }
}
