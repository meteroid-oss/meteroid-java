// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class CreditUnitsPricesTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}]}");
        mock.client.creditUnits().prices().list("id");
        assertEquals(List.of("GET /api/v1/credit-units/id/prices"), mock.requests);
    }

    @Test
    void update() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}");
        mock.client
                .creditUnits()
                .prices()
                .update(
                        "id",
                        "currency",
                        PerseidMock.decode(
                                com.meteroid.models.CreditUnitPriceSetRequest.class,
                                "{\"unit_price\":\"sample\"}"));
        assertEquals(List.of("PUT /api/v1/credit-units/id/prices/currency"), mock.requests);
    }

    @Test
    void archive() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}");
        mock.client.creditUnits().prices().archive("id", "currency");
        assertEquals(List.of("DELETE /api/v1/credit-units/id/prices/currency"), mock.requests);
    }
}
