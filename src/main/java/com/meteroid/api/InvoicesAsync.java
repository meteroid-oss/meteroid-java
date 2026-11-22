// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.Invoice;
import com.meteroid.models.InvoiceCustomPropertiesRequest;
import com.meteroid.models.InvoiceListResponse;
import com.meteroid.models.RecordInvoicePaymentRequest;
import com.meteroid.models.Transaction;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code invoices} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class InvoicesAsync {
    private final Invoices sync;
    private final WithRawResponse withRawResponse;

    private final InvoicesPaymentsAsync payments;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public InvoicesAsync(Invoices sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.payments = new InvoicesPaymentsAsync(sync.payments());
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
     * The {@code payments} operations.
     *
     * @return the operations
     */
    public InvoicesPaymentsAsync payments() {
        return payments;
    }

    /**
     * List invoices with optional filtering by customer, subscription, or status.
     *
     * @return the page, once received
     */
    public CompletableFuture<InvoicesListAsyncPage> list() {
        return list(InvoicesListOptions.none(), RequestOptions.none());
    }

    /**
     * List invoices with optional filtering by customer, subscription, or status.
     *
     * @param options the optional parameters
     * @return the page, once received
     */
    public CompletableFuture<InvoicesListAsyncPage> list(final InvoicesListOptions options) {
        return list(options, RequestOptions.none());
    }

    /**
     * List invoices with optional filtering by customer, subscription, or status.
     *
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<InvoicesListAsyncPage> list(final RequestOptions requestOptions) {
        return list(InvoicesListOptions.none(), requestOptions);
    }

    /**
     * List invoices with optional filtering by customer, subscription, or status.
     *
     * @param options the optional parameters
     * @param requestOptions headers, timeout and retries of this call
     * @return the page, once received
     */
    public CompletableFuture<InvoicesListAsyncPage> list(
            final InvoicesListOptions options, final RequestOptions requestOptions) {
        return sync.exchangeList(options, requestOptions)
                .sendAsync()
                .thenApply(response -> pageOfList(response, options, requestOptions));
    }

    private InvoicesListAsyncPage pageOfList(
            InvoiceListResponse response,
            final InvoicesListOptions options,
            final RequestOptions requestOptions) {
        List<Invoice> items = Invoices.itemsOfList(response);
        Integer next = Invoices.nextOfList(response, items, options.page().orElse(0));
        return new InvoicesListAsyncPage(
                response,
                items,
                next == null
                        ? null
                        : () -> list(options.toBuilder().page(next).build(), requestOptions));
    }

    /**
     * Get invoice
     *
     * <p>Retrieve a single invoice with its payment transactions.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> retrieve(final String invoiceId) {
        return retrieve(invoiceId, RequestOptions.none());
    }

    /**
     * Get invoice
     *
     * <p>Retrieve a single invoice with its payment transactions.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> retrieve(
            final String invoiceId, final RequestOptions requestOptions) {
        return sync.exchangeRetrieve(invoiceId, requestOptions).sendAsync();
    }

    /**
     * Update invoice custom properties
     *
     * <p>Merge custom property values onto an invoice (send a key with <code>null</code> to remove
     * it). Values are validated against the tenant's <code>INVOICE</code> property definitions.
     * Allowed at any status — custom properties are external workflow metadata and stay editable
     * after the invoice is finalized.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param invoiceCustomPropertiesRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> updateCustomProperties(
            final String invoiceId,
            final InvoiceCustomPropertiesRequest invoiceCustomPropertiesRequest) {
        return updateCustomProperties(
                invoiceId, invoiceCustomPropertiesRequest, RequestOptions.none());
    }

    /**
     * Update invoice custom properties
     *
     * <p>Merge custom property values onto an invoice (send a key with <code>null</code> to remove
     * it). Values are validated against the tenant's <code>INVOICE</code> property definitions.
     * Allowed at any status — custom properties are external workflow metadata and stay editable
     * after the invoice is finalized.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param invoiceCustomPropertiesRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> updateCustomProperties(
            final String invoiceId,
            final InvoiceCustomPropertiesRequest invoiceCustomPropertiesRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeUpdateCustomProperties(
                        invoiceId, invoiceCustomPropertiesRequest, requestOptions)
                .sendAsync();
    }

    /**
     * Download invoice PDF
     *
     * <p>Download the PDF document for an invoice.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<byte[]> download(final String invoiceId) {
        return download(invoiceId, RequestOptions.none());
    }

    /**
     * Download invoice PDF
     *
     * <p>Download the PDF document for an invoice.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<byte[]> download(
            final String invoiceId, final RequestOptions requestOptions) {
        return sync.exchangeDownload(invoiceId, requestOptions).sendAsync();
    }

    /**
     * Mark an invoice as paid
     *
     * <p>Record an external payment for the entire remaining balance of a finalized invoice. The
     * amount must match the remaining balance.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param recordInvoicePaymentRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> markPaid(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest) {
        return markPaid(
                invoiceId, idempotencyKey, recordInvoicePaymentRequest, RequestOptions.none());
    }

    /**
     * Mark an invoice as paid
     *
     * <p>Record an external payment for the entire remaining balance of a finalized invoice. The
     * amount must match the remaining balance.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param recordInvoicePaymentRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Transaction> markPaid(
            final String invoiceId,
            final String idempotencyKey,
            final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeMarkPaid(
                        invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                .sendAsync();
    }

    /**
     * Mark an invoice as uncollectible
     *
     * <p>Transition a finalized invoice to uncollectible and stop its payment reminders.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @return the response body, once received
     */
    public CompletableFuture<Void> markUncollectible(
            final String invoiceId, final String idempotencyKey) {
        return markUncollectible(invoiceId, idempotencyKey, RequestOptions.none());
    }

    /**
     * Mark an invoice as uncollectible
     *
     * <p>Transition a finalized invoice to uncollectible and stop its payment reminders.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param idempotencyKey the {@code Idempotency-Key} required parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Void> markUncollectible(
            final String invoiceId,
            final String idempotencyKey,
            final RequestOptions requestOptions) {
        return sync.exchangeMarkUncollectible(invoiceId, idempotencyKey, requestOptions)
                .sendAsync();
    }

    /**
     * Refresh invoice
     *
     * <p>Recompute a draft invoice against current usage, credits, coupons and tax, and return it.
     * Drafts are also refreshed periodically in the background; use this to force it, e.g. after
     * ingesting late events. Rejected while a payment for the invoice is in progress or when the
     * invoice was merged into a consolidated parent.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> refresh(final String invoiceId) {
        return refresh(invoiceId, RequestOptions.none());
    }

    /**
     * Refresh invoice
     *
     * <p>Recompute a draft invoice against current usage, credits, coupons and tax, and return it.
     * Drafts are also refreshed periodically in the background; use this to force it, e.g. after
     * ingesting late events. Rejected while a payment for the invoice is in progress or when the
     * invoice was merged into a consolidated parent.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<Invoice> refresh(
            final String invoiceId, final RequestOptions requestOptions) {
        return sync.exchangeRefresh(invoiceId, requestOptions).sendAsync();
    }

    /**
     * Download invoice e-invoice XML
     *
     * <p>Download the structured e-invoice (EN 16931 XML) issued with an invoice. For Factur-X the
     * same XML is also embedded in the PDF.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @return the response body, once received
     */
    public CompletableFuture<byte[]> downloadXml(final String invoiceId) {
        return downloadXml(invoiceId, RequestOptions.none());
    }

    /**
     * Download invoice e-invoice XML
     *
     * <p>Download the structured e-invoice (EN 16931 XML) issued with an invoice. For Factur-X the
     * same XML is also embedded in the PDF.
     *
     * @param invoiceId the {@code invoice_id} path parameter
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<byte[]> downloadXml(
            final String invoiceId, final RequestOptions requestOptions) {
        return sync.exchangeDownloadXml(invoiceId, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code payments} operations.
         *
         * @return the operations
         */
        public InvoicesPaymentsAsync.WithRawResponse payments() {
            return InvoicesAsync.this.payments.withRawResponse();
        }

        /**
         * List invoices with optional filtering by customer, subscription, or status.
         *
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<InvoicesListAsyncPage>> list() {
            return list(InvoicesListOptions.none(), RequestOptions.none());
        }

        /**
         * List invoices with optional filtering by customer, subscription, or status.
         *
         * @param options the optional parameters
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<InvoicesListAsyncPage>> list(
                final InvoicesListOptions options) {
            return list(options, RequestOptions.none());
        }

        /**
         * List invoices with optional filtering by customer, subscription, or status.
         *
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<InvoicesListAsyncPage>> list(
                final RequestOptions requestOptions) {
            return list(InvoicesListOptions.none(), requestOptions);
        }

        /**
         * List invoices with optional filtering by customer, subscription, or status.
         *
         * @param options the optional parameters
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and page, once received
         */
        public CompletableFuture<ApiResponse<InvoicesListAsyncPage>> list(
                final InvoicesListOptions options, final RequestOptions requestOptions) {
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
         * Get invoice
         *
         * <p>Retrieve a single invoice with its payment transactions.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> retrieve(final String invoiceId) {
            return retrieve(invoiceId, RequestOptions.none());
        }

        /**
         * Get invoice
         *
         * <p>Retrieve a single invoice with its payment transactions.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> retrieve(
                final String invoiceId, final RequestOptions requestOptions) {
            return sync.exchangeRetrieve(invoiceId, requestOptions).sendRawAsync();
        }

        /**
         * Update invoice custom properties
         *
         * <p>Merge custom property values onto an invoice (send a key with <code>null</code> to
         * remove it). Values are validated against the tenant's <code>INVOICE</code> property
         * definitions. Allowed at any status — custom properties are external workflow metadata and
         * stay editable after the invoice is finalized.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param invoiceCustomPropertiesRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> updateCustomProperties(
                final String invoiceId,
                final InvoiceCustomPropertiesRequest invoiceCustomPropertiesRequest) {
            return updateCustomProperties(
                    invoiceId, invoiceCustomPropertiesRequest, RequestOptions.none());
        }

        /**
         * Update invoice custom properties
         *
         * <p>Merge custom property values onto an invoice (send a key with <code>null</code> to
         * remove it). Values are validated against the tenant's <code>INVOICE</code> property
         * definitions. Allowed at any status — custom properties are external workflow metadata and
         * stay editable after the invoice is finalized.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param invoiceCustomPropertiesRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> updateCustomProperties(
                final String invoiceId,
                final InvoiceCustomPropertiesRequest invoiceCustomPropertiesRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeUpdateCustomProperties(
                            invoiceId, invoiceCustomPropertiesRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Download invoice PDF
         *
         * <p>Download the PDF document for an invoice.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<byte[]>> download(final String invoiceId) {
            return download(invoiceId, RequestOptions.none());
        }

        /**
         * Download invoice PDF
         *
         * <p>Download the PDF document for an invoice.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<byte[]>> download(
                final String invoiceId, final RequestOptions requestOptions) {
            return sync.exchangeDownload(invoiceId, requestOptions).sendRawAsync();
        }

        /**
         * Mark an invoice as paid
         *
         * <p>Record an external payment for the entire remaining balance of a finalized invoice.
         * The amount must match the remaining balance.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param recordInvoicePaymentRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> markPaid(
                final String invoiceId,
                final String idempotencyKey,
                final RecordInvoicePaymentRequest recordInvoicePaymentRequest) {
            return markPaid(
                    invoiceId, idempotencyKey, recordInvoicePaymentRequest, RequestOptions.none());
        }

        /**
         * Mark an invoice as paid
         *
         * <p>Record an external payment for the entire remaining balance of a finalized invoice.
         * The amount must match the remaining balance.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param recordInvoicePaymentRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Transaction>> markPaid(
                final String invoiceId,
                final String idempotencyKey,
                final RecordInvoicePaymentRequest recordInvoicePaymentRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeMarkPaid(
                            invoiceId, idempotencyKey, recordInvoicePaymentRequest, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Mark an invoice as uncollectible
         *
         * <p>Transition a finalized invoice to uncollectible and stop its payment reminders.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> markUncollectible(
                final String invoiceId, final String idempotencyKey) {
            return markUncollectible(invoiceId, idempotencyKey, RequestOptions.none());
        }

        /**
         * Mark an invoice as uncollectible
         *
         * <p>Transition a finalized invoice to uncollectible and stop its payment reminders.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param idempotencyKey the {@code Idempotency-Key} required parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Void>> markUncollectible(
                final String invoiceId,
                final String idempotencyKey,
                final RequestOptions requestOptions) {
            return sync.exchangeMarkUncollectible(invoiceId, idempotencyKey, requestOptions)
                    .sendRawAsync();
        }

        /**
         * Refresh invoice
         *
         * <p>Recompute a draft invoice against current usage, credits, coupons and tax, and return
         * it. Drafts are also refreshed periodically in the background; use this to force it, e.g.
         * after ingesting late events. Rejected while a payment for the invoice is in progress or
         * when the invoice was merged into a consolidated parent.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> refresh(final String invoiceId) {
            return refresh(invoiceId, RequestOptions.none());
        }

        /**
         * Refresh invoice
         *
         * <p>Recompute a draft invoice against current usage, credits, coupons and tax, and return
         * it. Drafts are also refreshed periodically in the background; use this to force it, e.g.
         * after ingesting late events. Rejected while a payment for the invoice is in progress or
         * when the invoice was merged into a consolidated parent.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<Invoice>> refresh(
                final String invoiceId, final RequestOptions requestOptions) {
            return sync.exchangeRefresh(invoiceId, requestOptions).sendRawAsync();
        }

        /**
         * Download invoice e-invoice XML
         *
         * <p>Download the structured e-invoice (EN 16931 XML) issued with an invoice. For Factur-X
         * the same XML is also embedded in the PDF.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<byte[]>> downloadXml(final String invoiceId) {
            return downloadXml(invoiceId, RequestOptions.none());
        }

        /**
         * Download invoice e-invoice XML
         *
         * <p>Download the structured e-invoice (EN 16931 XML) issued with an invoice. For Factur-X
         * the same XML is also embedded in the PDF.
         *
         * @param invoiceId the {@code invoice_id} path parameter
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<byte[]>> downloadXml(
                final String invoiceId, final RequestOptions requestOptions) {
            return sync.exchangeDownloadXml(invoiceId, requestOptions).sendRawAsync();
        }
    }
}
