// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class WebhookEndpointsEndpointsTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"consecutive_failures\":-123456789,\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"disabled\":true,\"event_types\":[\"sample\"],\"headers\":[{\"name\":\"sample\",\"sensitive\":false,\"set\":true}],\"id\":\"webhook_endpoint_id_25\",\"max_in_flight\":-2147483648,\"needs_setup\":false,\"url\":\"sample\"}]}");
        mock.client.webhookEndpoints().endpoints().list();
        assertEquals(List.of("GET /api/v1/webhooks/endpoints"), mock.requests);
    }

    @Test
    void create() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"consecutive_failures\":-123456789,\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"disabled\":true,\"event_types\":[\"sample\"],\"headers\":[{\"name\":\"sample\",\"sensitive\":false,\"set\":true}],\"id\":\"webhook_endpoint_id_25\",\"max_in_flight\":-2147483648,\"needs_setup\":false,\"url\":\"sample\",\"secret\":\"sample\"}");
        mock.client
                .webhookEndpoints()
                .endpoints()
                .create(
                        PerseidMock.decode(
                                com.meteroid.models.CreateWebhookEndpointRequest.class,
                                "{\"url\":\"sample\"}"));
        assertEquals(List.of("POST /api/v1/webhooks/endpoints"), mock.requests);
    }

    @Test
    void retrieve() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"consecutive_failures\":-2147483648,\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"disabled\":true,\"event_types\":[\"sample\"],\"headers\":[{\"name\":\"sample\",\"sensitive\":true,\"set\":true}],\"id\":\"webhook_endpoint_id_40\",\"max_in_flight\":-123456789,\"needs_setup\":true,\"url\":\"sample\"}");
        mock.client.webhookEndpoints().endpoints().retrieve("endpoint_id");
        assertEquals(List.of("GET /api/v1/webhooks/endpoints/endpoint_id"), mock.requests);
    }

    @Test
    void delete() throws Exception {
        PerseidMock mock = new PerseidMock(204, null, "");
        mock.client.webhookEndpoints().endpoints().delete("endpoint_id");
        assertEquals(List.of("DELETE /api/v1/webhooks/endpoints/endpoint_id"), mock.requests);
    }

    @Test
    void update() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"consecutive_failures\":-2147483648,\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"disabled\":true,\"event_types\":[\"sample\"],\"headers\":[{\"name\":\"sample\",\"sensitive\":true,\"set\":true}],\"id\":\"webhook_endpoint_id_40\",\"max_in_flight\":-123456789,\"needs_setup\":true,\"url\":\"sample\"}");
        mock.client
                .webhookEndpoints()
                .endpoints()
                .update(
                        "endpoint_id",
                        PerseidMock.decode(
                                com.meteroid.models.UpdateWebhookEndpointRequest.class, "{}"));
        assertEquals(List.of("PATCH /api/v1/webhooks/endpoints/endpoint_id"), mock.requests);
    }

    @Test
    void listDeliveries() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"attempt_count\":-123456789,\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"endpoint_id\":\"webhook_endpoint_id_90\",\"event_type\":\"sample\",\"id\":\"webhook_delivery_id_0\",\"manual\":false,\"message_id\":\"event_id_67\",\"status\":\"SUCCEEDED\"}],\"pagination_meta\":{\"page\":-123456789,\"per_page\":-123456789,\"total_items\":-9007199254740993,\"total_pages\":123456789}}");
        mock.client.webhookEndpoints().endpoints().listDeliveries("endpoint_id");
        assertEquals(
                List.of("GET /api/v1/webhooks/endpoints/endpoint_id/deliveries"), mock.requests);
    }

    @Test
    void rotateSecret() throws Exception {
        PerseidMock mock = new PerseidMock(200, "application/json", "{\"secret\":\"sample\"}");
        mock.client.webhookEndpoints().endpoints().rotateSecret("endpoint_id");
        assertEquals(
                List.of("POST /api/v1/webhooks/endpoints/endpoint_id/rotate-secret"),
                mock.requests);
    }

    @Test
    void retrieveSecret() throws Exception {
        PerseidMock mock = new PerseidMock(200, "application/json", "{\"secret\":\"sample\"}");
        mock.client.webhookEndpoints().endpoints().retrieveSecret("endpoint_id");
        assertEquals(List.of("GET /api/v1/webhooks/endpoints/endpoint_id/secret"), mock.requests);
    }
}
