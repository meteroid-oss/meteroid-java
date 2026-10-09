// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class WebhookEndpointsTest {

    @Test
    void resendWebhookDelivery() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"attempt_count\":-2147483648,\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"endpoint_id\":\"webhook_endpoint_id_44\",\"event_type\":\"sample\",\"id\":\"webhook_delivery_id_90\",\"manual\":false,\"message_id\":\"event_id_90\",\"status\":\"IN_FLIGHT\"}");
        mock.client.webhookEndpoints().resendWebhookDelivery("delivery_id");
        assertEquals(List.of("POST /api/v1/webhooks/deliveries/delivery_id/resend"), mock.requests);
    }
}
