// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class EventsTest {

    @Test
    void ingest() throws Exception {
        PerseidMock mock = new PerseidMock(200, "application/json", "{}");
        mock.client
                .events()
                .ingest(
                        PerseidMock.decode(
                                com.meteroid.models.IngestEventsRequest.class,
                                "{\"events\":[{\"code\":\"sample\",\"customer_id\":\"sample\",\"event_id\":\"sample\"}]}"));
        assertEquals(List.of("POST /api/v1/events/ingest"), mock.requests);
    }

    @Test
    void amend() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"ingested_at\":\"2023-12-31T23:59:59.999-05:30\"}");
        mock.client
                .events()
                .amend(
                        "event_id",
                        PerseidMock.decode(
                                com.meteroid.models.AmendEventRequest.class,
                                "{\"properties\":{\"alpha\":\"sample\"},\"timestamp\":\"2023-12-31T23:59:59.999-05:30\"}"));
        assertEquals(List.of("POST /api/v1/events/event_id/amend"), mock.requests);
    }

    @Test
    void void_() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"ingested_at\":\"2023-12-31T23:59:59.999-05:30\"}");
        mock.client
                .events()
                .void_(
                        "event_id",
                        PerseidMock.decode(com.meteroid.models.VoidEventRequest.class, "{}"));
        assertEquals(List.of("POST /api/v1/events/event_id/void"), mock.requests);
    }
}
