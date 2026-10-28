// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class CreditUnitsTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"archived\":false,\"code\":\"sample\",\"id\":\"sample\",\"name\":\"sample\",\"plural_name\":\"sample\",\"precision\":123456789,\"prices\":[{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}]}]}");
        mock.client.creditUnits().list();
        assertEquals(List.of("GET /api/v1/credit-units"), mock.requests);
    }

    @Test
    void create() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"archived\":false,\"code\":\"sample\",\"id\":\"sample\",\"name\":\"sample\",\"plural_name\":\"sample\",\"precision\":2147483647,\"prices\":[{\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}]}");
        mock.client
                .creditUnits()
                .create(
                        PerseidMock.decode(
                                com.meteroid.models.CreditUnitCreateRequest.class,
                                "{\"code\":\"sample\",\"name\":\"sample\",\"plural_name\":\"sample\",\"precision\":123456789}"));
        assertEquals(List.of("POST /api/v1/credit-units"), mock.requests);
    }

    @Test
    void retrieve() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"archived\":false,\"code\":\"sample\",\"id\":\"sample\",\"name\":\"sample\",\"plural_name\":\"sample\",\"precision\":2147483647,\"prices\":[{\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}]}");
        mock.client.creditUnits().retrieve("id");
        assertEquals(List.of("GET /api/v1/credit-units/id"), mock.requests);
    }

    @Test
    void update() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"archived\":false,\"code\":\"sample\",\"id\":\"sample\",\"name\":\"sample\",\"plural_name\":\"sample\",\"precision\":2147483647,\"prices\":[{\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"currency\":\"sample\",\"id\":\"sample\",\"unit_price\":\"sample\"}]}");
        mock.client
                .creditUnits()
                .update(
                        "id",
                        PerseidMock.decode(
                                com.meteroid.models.CreditUnitUpdateRequest.class, "{}"));
        assertEquals(List.of("PATCH /api/v1/credit-units/id"), mock.requests);
    }
}
