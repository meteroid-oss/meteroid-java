// this file is @generated
package com.meteroid.api;

import com.meteroid.ApiResponse;
import com.meteroid.RequestOptions;
import com.meteroid.internal.MeteroidHttpClient;
import com.meteroid.internal.Utils;
import com.meteroid.models.AmendEventRequest;
import com.meteroid.models.EventChangeResponse;
import com.meteroid.models.IngestEventsRequest;
import com.meteroid.models.IngestEventsResponse;
import com.meteroid.models.VoidEventRequest;

import okhttp3.HttpUrl;

import java.util.Objects;

/**
 * The {@code events} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class Events {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public Events(MeteroidHttpClient client) {
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
     * @return the response body
     */
    public IngestEventsResponse ingest(final IngestEventsRequest ingestEventsRequest) {
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
     * @return the response body
     */
    public IngestEventsResponse ingest(
            final IngestEventsRequest ingestEventsRequest, final RequestOptions requestOptions) {
        return exchangeIngest(ingestEventsRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<IngestEventsResponse> exchangeIngest(
            final IngestEventsRequest ingestEventsRequest, final RequestOptions requestOptions) {
        Objects.requireNonNull(ingestEventsRequest, "body");
        HttpUrl url = client.newUrlBuilder().addPathSegments("api/v1/events/ingest").build();
        return client.call("POST", url)
                .json(ingestEventsRequest)
                .errors(com.meteroid.models.RestErrorResponse.class, "401", "429", "500")
                .options(requestOptions)
                .returning(IngestEventsResponse.class);
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
     * @return the response body
     */
    public EventChangeResponse amend(
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
     * @return the response body
     */
    public EventChangeResponse amend(
            final String eventId,
            final AmendEventRequest amendEventRequest,
            final RequestOptions requestOptions) {
        return exchangeAmend(eventId, amendEventRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<EventChangeResponse> exchangeAmend(
            final String eventId,
            final AmendEventRequest amendEventRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(eventId, "event_id");
        Objects.requireNonNull(amendEventRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/events")
                        .addPathSegment(Utils.pathSegment("event_id", eventId))
                        .addPathSegments("amend")
                        .build();
        return client.call("POST", url)
                .json(amendEventRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429",
                        "500",
                        "503")
                .options(requestOptions)
                .returning(EventChangeResponse.class);
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
     * @return the response body
     */
    public EventChangeResponse void_(
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
     * @return the response body
     */
    public EventChangeResponse void_(
            final String eventId,
            final VoidEventRequest voidEventRequest,
            final RequestOptions requestOptions) {
        return exchangeVoid(eventId, voidEventRequest, requestOptions).send();
    }

    MeteroidHttpClient.Exchange<EventChangeResponse> exchangeVoid(
            final String eventId,
            final VoidEventRequest voidEventRequest,
            final RequestOptions requestOptions) {
        Objects.requireNonNull(eventId, "event_id");
        Objects.requireNonNull(voidEventRequest, "body");
        HttpUrl url =
                client.newUrlBuilder()
                        .addPathSegments("api/v1/events")
                        .addPathSegment(Utils.pathSegment("event_id", eventId))
                        .addPathSegments("void")
                        .build();
        return client.call("POST", url)
                .json(voidEventRequest)
                .errors(
                        com.meteroid.models.RestErrorResponse.class,
                        "400",
                        "401",
                        "403",
                        "404",
                        "409",
                        "429",
                        "500",
                        "503")
                .options(requestOptions)
                .returning(EventChangeResponse.class);
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
         * @return the status, headers and body
         */
        public ApiResponse<IngestEventsResponse> ingest(
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
         * @return the status, headers and body
         */
        public ApiResponse<IngestEventsResponse> ingest(
                final IngestEventsRequest ingestEventsRequest,
                final RequestOptions requestOptions) {
            return Events.this.exchangeIngest(ingestEventsRequest, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<EventChangeResponse> amend(
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
         * @return the status, headers and body
         */
        public ApiResponse<EventChangeResponse> amend(
                final String eventId,
                final AmendEventRequest amendEventRequest,
                final RequestOptions requestOptions) {
            return Events.this.exchangeAmend(eventId, amendEventRequest, requestOptions).sendRaw();
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
         * @return the status, headers and body
         */
        public ApiResponse<EventChangeResponse> void_(
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
         * @return the status, headers and body
         */
        public ApiResponse<EventChangeResponse> void_(
                final String eventId,
                final VoidEventRequest voidEventRequest,
                final RequestOptions requestOptions) {
            return Events.this.exchangeVoid(eventId, voidEventRequest, requestOptions).sendRaw();
        }
    }
}
