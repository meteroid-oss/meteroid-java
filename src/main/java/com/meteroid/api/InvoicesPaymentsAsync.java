// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.RecordInvoicePaymentRequest;
import com.meteroid.models.ReverseInvoicePaymentRequest;
import com.meteroid.models.Transaction;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code invoices.payments} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class InvoicesPaymentsAsync {
    private final InvoicesPayments sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public InvoicesPaymentsAsync(InvoicesPayments sync) {
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
     * Record an invoice payment
     *
     * <p>Record a partial or full payment received outside Meteroid against a finalized invoice.
     * Paying the remaining balance marks the invoice paid.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param recordInvoicePaymentRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> create(
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
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> create(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeCreate(
                        invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                .sendAsync();
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
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> reverse(
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
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> reverse(
            final String invoiceId,
            final String transactionId,
            final String idempotencyKey,
            final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeReverse(
                        invoiceId,
                        transactionId,
                        idempotencyKey,
                        reverseInvoicePaymentRequest,
                        requestOptions)
                .sendAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> create(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> create(
                final String invoiceId,
                final String idempotencyKey,
                final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeCreate(
                            invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                    .sendRawAsync();
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> reverse(
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
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> reverse(
                final String invoiceId,
                final String transactionId,
                final String idempotencyKey,
                final ReverseInvoicePaymentRequest reverseInvoicePaymentRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeReverse(
                            invoiceId,
                            transactionId,
                            idempotencyKey,
                            reverseInvoicePaymentRequest,
                            requestOptions)
                    .sendRawAsync();
        }
    }
}
