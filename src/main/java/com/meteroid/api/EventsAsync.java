// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.models.AmendEventRequest;
import com.meteroid.models.EventChangeResponse;
import com.meteroid.models.IngestEventsRequest;
import com.meteroid.models.IngestEventsResponse;
import com.meteroid.models.VoidEventRequest;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code events} operations, without blocking: each method returns a {@link CompletableFuture}.
 * Obtained from {@code client.async()}.
 */
public final class EventsAsync {
    private final Events sync;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public EventsAsync(Events sync) {
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
     * Ingest events
     *
     * <p>Ingest usage events for metering and billing purposes.
     *
     * <p>Events are deduplicated by <code>(event_id, customer_id)</code> — re-sending the same pair
     * will not be double-counted. The first copy received is kept and later copies are ignored,
     * whatever they change.
     *
     * <p>By default, any invalid event rejects the entire batch. Set <code>allow_partial_failures
     * </code> to <code>true</code> to ingest valid events and receive per-event failure details in
     * the response body.
     *
     * @param ingestEventsRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<IngestEventsResponse> ingest(
            final IngestEventsRequest ingestEventsRequest) {
        return ingest(ingestEventsRequest, RequestOptions.none());
    }

    /**
     * Ingest events
     *
     * <p>Ingest usage events for metering and billing purposes.
     *
     * <p>Events are deduplicated by <code>(event_id, customer_id)</code> — re-sending the same pair
     * will not be double-counted. The first copy received is kept and later copies are ignored,
     * whatever they change.
     *
     * <p>By default, any invalid event rejects the entire batch. Set <code>allow_partial_failures
     * </code> to <code>true</code> to ingest valid events and receive per-event failure details in
     * the response body.
     *
     * @param ingestEventsRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<IngestEventsResponse> ingest(
            final IngestEventsRequest ingestEventsRequest, final RequestOptions requestOptions) {
        return sync.exchangeIngest(ingestEventsRequest, requestOptions).sendAsync();
    }

    /**
     * Amend an event
     *
     * <p>Replaces the timestamp and the properties of an ingested event. The code and the customer
     * cannot change: void the event and send a new one instead. The change is applied
     * asynchronously, in order with the event's other copies.
     *
     * <p>Only events ingested in the last 35 days can be amended, and neither their current nor
     * their new timestamp can be in an invoiced period. Tenants that keep the last copy of an event
     * correct it by sending it again instead.
     *
     * <p>An event is found once metering has stored it: a just-ingested event can still return
     * <code>404</code>. Wait until an amend is visible before sending the next change to the same
     * event; concurrent changes resolve by <code>ingested_at</code>, the latest wins.
     *
     * @param eventId the {@code event_id} path parameter
     * @param amendEventRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<EventChangeResponse> amend(
            final String eventId, final AmendEventRequest amendEventRequest) {
        return amend(eventId, amendEventRequest, RequestOptions.none());
    }

    /**
     * Amend an event
     *
     * <p>Replaces the timestamp and the properties of an ingested event. The code and the customer
     * cannot change: void the event and send a new one instead. The change is applied
     * asynchronously, in order with the event's other copies.
     *
     * <p>Only events ingested in the last 35 days can be amended, and neither their current nor
     * their new timestamp can be in an invoiced period. Tenants that keep the last copy of an event
     * correct it by sending it again instead.
     *
     * <p>An event is found once metering has stored it: a just-ingested event can still return
     * <code>404</code>. Wait until an amend is visible before sending the next change to the same
     * event; concurrent changes resolve by <code>ingested_at</code>, the latest wins.
     *
     * @param eventId the {@code event_id} path parameter
     * @param amendEventRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EventChangeResponse> amend(
            final String eventId,
            final AmendEventRequest amendEventRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeAmend(eventId, amendEventRequest, requestOptions).sendAsync();
    }

    /**
     * Void an event
     *
     * <p>Cancels an ingested event: it no longer counts in usage. The change is applied
     * asynchronously, in order with the event's other copies.
     *
     * <p>Only events ingested in the last 35 days, outside an invoiced period, can be voided.
     * Tenants that keep the last copy of an event correct it by sending it again instead.
     *
     * <p>An event is found once metering has stored it: a just-ingested event can still return
     * <code>404</code>, and so does a retried void once the first one is applied. Wait until a
     * change is visible before sending the next one to the same event; concurrent changes resolve
     * by <code>ingested_at</code>.
     *
     * @param eventId the {@code event_id} path parameter
     * @param voidEventRequest the request body
     * @return the response body, once received
     */
    public CompletableFuture<EventChangeResponse> void_(
            final String eventId, final VoidEventRequest voidEventRequest) {
        return void_(eventId, voidEventRequest, RequestOptions.none());
    }

    /**
     * Void an event
     *
     * <p>Cancels an ingested event: it no longer counts in usage. The change is applied
     * asynchronously, in order with the event's other copies.
     *
     * <p>Only events ingested in the last 35 days, outside an invoiced period, can be voided.
     * Tenants that keep the last copy of an event correct it by sending it again instead.
     *
     * <p>An event is found once metering has stored it: a just-ingested event can still return
     * <code>404</code>, and so does a retried void once the first one is applied. Wait until a
     * change is visible before sending the next one to the same event; concurrent changes resolve
     * by <code>ingested_at</code>.
     *
     * @param eventId the {@code event_id} path parameter
     * @param voidEventRequest the request body
     * @param requestOptions headers, timeout and retries of this call
     * @return the response body, once received
     */
    public CompletableFuture<EventChangeResponse> void_(
            final String eventId,
            final VoidEventRequest voidEventRequest,
            final RequestOptions requestOptions) {
        return sync.exchangeVoid(eventId, voidEventRequest, requestOptions).sendAsync();
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * Ingest events
         *
         * <p>Ingest usage events for metering and billing purposes.
         *
         * <p>Events are deduplicated by <code>(event_id, customer_id)</code> — re-sending the same
         * pair will not be double-counted. The first copy received is kept and later copies are
         * ignored, whatever they change.
         *
         * <p>By default, any invalid event rejects the entire batch. Set <code>
         * allow_partial_failures</code> to <code>true</code> to ingest valid events and receive
         * per-event failure details in the response body.
         *
         * @param ingestEventsRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<IngestEventsResponse>> ingest(
                final IngestEventsRequest ingestEventsRequest) {
            return ingest(ingestEventsRequest, RequestOptions.none());
        }

        /**
         * Ingest events
         *
         * <p>Ingest usage events for metering and billing purposes.
         *
         * <p>Events are deduplicated by <code>(event_id, customer_id)</code> — re-sending the same
         * pair will not be double-counted. The first copy received is kept and later copies are
         * ignored, whatever they change.
         *
         * <p>By default, any invalid event rejects the entire batch. Set <code>
         * allow_partial_failures</code> to <code>true</code> to ingest valid events and receive
         * per-event failure details in the response body.
         *
         * @param ingestEventsRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<IngestEventsResponse>> ingest(
                final IngestEventsRequest ingestEventsRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeIngest(ingestEventsRequest, requestOptions).sendRawAsync();
        }

        /**
         * Amend an event
         *
         * <p>Replaces the timestamp and the properties of an ingested event. The code and the
         * customer cannot change: void the event and send a new one instead. The change is applied
         * asynchronously, in order with the event's other copies.
         *
         * <p>Only events ingested in the last 35 days can be amended, and neither their current nor
         * their new timestamp can be in an invoiced period. Tenants that keep the last copy of an
         * event correct it by sending it again instead.
         *
         * <p>An event is found once metering has stored it: a just-ingested event can still return
         * <code>404</code>. Wait until an amend is visible before sending the next change to the
         * same event; concurrent changes resolve by <code>ingested_at</code>, the latest wins.
         *
         * @param eventId the {@code event_id} path parameter
         * @param amendEventRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EventChangeResponse>> amend(
                final String eventId, final AmendEventRequest amendEventRequest) {
            return amend(eventId, amendEventRequest, RequestOptions.none());
        }

        /**
         * Amend an event
         *
         * <p>Replaces the timestamp and the properties of an ingested event. The code and the
         * customer cannot change: void the event and send a new one instead. The change is applied
         * asynchronously, in order with the event's other copies.
         *
         * <p>Only events ingested in the last 35 days can be amended, and neither their current nor
         * their new timestamp can be in an invoiced period. Tenants that keep the last copy of an
         * event correct it by sending it again instead.
         *
         * <p>An event is found once metering has stored it: a just-ingested event can still return
         * <code>404</code>. Wait until an amend is visible before sending the next change to the
         * same event; concurrent changes resolve by <code>ingested_at</code>, the latest wins.
         *
         * @param eventId the {@code event_id} path parameter
         * @param amendEventRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EventChangeResponse>> amend(
                final String eventId,
                final AmendEventRequest amendEventRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeAmend(eventId, amendEventRequest, requestOptions).sendRawAsync();
        }

        /**
         * Void an event
         *
         * <p>Cancels an ingested event: it no longer counts in usage. The change is applied
         * asynchronously, in order with the event's other copies.
         *
         * <p>Only events ingested in the last 35 days, outside an invoiced period, can be voided.
         * Tenants that keep the last copy of an event correct it by sending it again instead.
         *
         * <p>An event is found once metering has stored it: a just-ingested event can still return
         * <code>404</code>, and so does a retried void once the first one is applied. Wait until a
         * change is visible before sending the next one to the same event; concurrent changes
         * resolve by <code>ingested_at</code>.
         *
         * @param eventId the {@code event_id} path parameter
         * @param voidEventRequest the request body
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EventChangeResponse>> void_(
                final String eventId, final VoidEventRequest voidEventRequest) {
            return void_(eventId, voidEventRequest, RequestOptions.none());
        }

        /**
         * Void an event
         *
         * <p>Cancels an ingested event: it no longer counts in usage. The change is applied
         * asynchronously, in order with the event's other copies.
         *
         * <p>Only events ingested in the last 35 days, outside an invoiced period, can be voided.
         * Tenants that keep the last copy of an event correct it by sending it again instead.
         *
         * <p>An event is found once metering has stored it: a just-ingested event can still return
         * <code>404</code>, and so does a retried void once the first one is applied. Wait until a
         * change is visible before sending the next one to the same event; concurrent changes
         * resolve by <code>ingested_at</code>.
         *
         * @param eventId the {@code event_id} path parameter
         * @param voidEventRequest the request body
         * @param requestOptions headers, timeout and retries of this call
         * @return the status, headers and body, once received
         */
        public CompletableFuture<ApiResponse<EventChangeResponse>> void_(
                final String eventId,
                final VoidEventRequest voidEventRequest,
                final RequestOptions requestOptions) {
            return sync.exchangeVoid(eventId, voidEventRequest, requestOptions).sendRawAsync();
        }
    }
}
