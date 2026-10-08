// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class AddOnsEntitlementsTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"feature\":{\"code\":\"sample\",\"id\":\"feature_id_53\",\"name\":\"sample\"},\"value\":{\"type\":\"BOOLEAN\",\"enabled\":false}}]}");
        mock.client.addOns().entitlements().list("addon_id");
        assertEquals(List.of("GET /api/v1/addons/addon_id/entitlements"), mock.requests);
    }

    @Test
    void create() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"feature_id\":\"feature_id_39\",\"id\":\"entitlement_id_2\",\"updated_at\":\"2024-03-15T10:30:45.123+02:00\",\"value\":{\"type\":\"BOOLEAN\",\"enabled\":false}}]}");
        mock.client
                .addOns()
                .entitlements()
                .create(
                        "addon_id",
                        PerseidMock.decode(
                                com.meteroid.models.CreateEntitlementsRequest.class,
                                "{\"entitlements\":[{\"feature_id\":\"feature_id_9\",\"value\":{\"type\":\"BOOLEAN\",\"enabled\":false}}]}"));
        assertEquals(List.of("POST /api/v1/addons/addon_id/entitlements"), mock.requests);
    }
}
