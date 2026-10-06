// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class EntitlementsTest {

    @Test
    void retrieve() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"feature_id\":\"feature_id_0\",\"id\":\"entitlement_id_79\",\"updated_at\":\"2024-03-15T10:30:45.123+02:00\",\"value\":{\"type\":\"BOOLEAN\",\"enabled\":true}}");
        mock.client.entitlements().retrieve("entitlement_id");
        assertEquals(List.of("GET /api/v1/entitlements/entitlement_id"), mock.requests);
    }

    @Test
    void delete() throws Exception {
        PerseidMock mock = new PerseidMock(204, null, "");
        mock.client.entitlements().delete("entitlement_id");
        assertEquals(List.of("DELETE /api/v1/entitlements/entitlement_id"), mock.requests);
    }

    @Test
    void update() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"feature_id\":\"feature_id_0\",\"id\":\"entitlement_id_79\",\"updated_at\":\"2024-03-15T10:30:45.123+02:00\",\"value\":{\"type\":\"BOOLEAN\",\"enabled\":true}}");
        mock.client
                .entitlements()
                .update(
                        "entitlement_id",
                        PerseidMock.decode(
                                com.meteroid.models.UpdateEntitlementRequest.class, "{}"));
        assertEquals(List.of("PATCH /api/v1/entitlements/entitlement_id"), mock.requests);
    }
}
