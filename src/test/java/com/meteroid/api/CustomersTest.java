// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class CustomersTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"currency\":\"BHD\",\"custom_properties\":{\"key\":\"value\",\"count\":3,\"ratio\":0.5,\"flags\":[true,false],\"nested\":{\"ok\":true}},\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"id\":\"customer_id_39\",\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_23\",\"name\":\"sample\",\"preferred_locales\":[\"sample\"]}],\"pagination_meta\":{\"page\":-123456789,\"per_page\":-123456789,\"total_items\":-9007199254740993,\"total_pages\":123456789}}");
        mock.client.customers().list();
        assertEquals(List.of("GET /api/v1/customers"), mock.requests);
    }

    @Test
    void create() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"currency\":\"ERN\",\"custom_properties\":{\"key\":\"value\",\"count\":3,\"ratio\":0.5,\"flags\":[true,false],\"nested\":{\"ok\":true}},\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"id\":\"customer_id_1\",\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_83\",\"name\":\"sample\",\"preferred_locales\":[\"sample\"]}");
        mock.client
                .customers()
                .create(
                        PerseidMock.decode(
                                com.meteroid.models.CustomerCreateRequest.class,
                                "{\"currency\":\"ERN\"}"));
        assertEquals(List.of("POST /api/v1/customers"), mock.requests);
    }

    @Test
    void retrieve() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"currency\":\"ERN\",\"custom_properties\":{\"key\":\"value\",\"count\":3,\"ratio\":0.5,\"flags\":[true,false],\"nested\":{\"ok\":true}},\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"id\":\"customer_id_1\",\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_83\",\"name\":\"sample\",\"preferred_locales\":[\"sample\"]}");
        mock.client.customers().retrieve("id_or_alias");
        assertEquals(List.of("GET /api/v1/customers/id_or_alias"), mock.requests);
    }

    @Test
    void replace() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"currency\":\"ERN\",\"custom_properties\":{\"key\":\"value\",\"count\":3,\"ratio\":0.5,\"flags\":[true,false],\"nested\":{\"ok\":true}},\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"id\":\"customer_id_1\",\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_83\",\"name\":\"sample\",\"preferred_locales\":[\"sample\"]}");
        mock.client
                .customers()
                .replace(
                        "id_or_alias",
                        PerseidMock.decode(
                                com.meteroid.models.CustomerUpdateRequest.class,
                                "{\"currency\":\"MMK\",\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_26\"}"));
        assertEquals(List.of("PUT /api/v1/customers/id_or_alias"), mock.requests);
    }

    @Test
    void archive() throws Exception {
        PerseidMock mock = new PerseidMock(204, null, "");
        mock.client.customers().archive("id_or_alias");
        assertEquals(List.of("DELETE /api/v1/customers/id_or_alias"), mock.requests);
    }

    @Test
    void update() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"currency\":\"ERN\",\"custom_properties\":{\"key\":\"value\",\"count\":3,\"ratio\":0.5,\"flags\":[true,false],\"nested\":{\"ok\":true}},\"custom_taxes\":[{\"name\":\"sample\",\"rate\":\"sample\",\"tax_code\":\"sample\"}],\"id\":\"customer_id_1\",\"invoicing_emails\":[\"sample\"],\"invoicing_entity_id\":\"invoicing_entity_id_83\",\"name\":\"sample\",\"preferred_locales\":[\"sample\"]}");
        mock.client
                .customers()
                .update(
                        "id_or_alias",
                        PerseidMock.decode(com.meteroid.models.CustomerPatchRequest.class, "{}"));
        assertEquals(List.of("PATCH /api/v1/customers/id_or_alias"), mock.requests);
    }

    @Test
    void listEntitlements() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"feature\":{\"code\":\"sample\",\"id\":\"feature_id_53\",\"name\":\"sample\"},\"value\":{\"type\":\"BOOLEAN\",\"enabled\":false}}]}");
        mock.client.customers().listEntitlements("id_or_alias");
        assertEquals(List.of("GET /api/v1/customers/id_or_alias/entitlements"), mock.requests);
    }

    @Test
    void createPortalToken() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"api_url\":\"sample\",\"expires_at\":\"2024-03-15T10:30:45.123+02:00\",\"portal_link\":\"sample\",\"portal_url\":\"sample\",\"token\":\"sample\"}");
        mock.client
                .customers()
                .createPortalToken(
                        "id_or_alias",
                        PerseidMock.decode(
                                com.meteroid.models.CustomerPortalTokenRequest.class, "{}"));
        assertEquals(List.of("POST /api/v1/customers/id_or_alias/portal-token"), mock.requests);
    }

    @Test
    void unarchive() throws Exception {
        PerseidMock mock = new PerseidMock(204, null, "");
        mock.client.customers().unarchive("id_or_alias");
        assertEquals(List.of("POST /api/v1/customers/id_or_alias/unarchive"), mock.requests);
    }
}
