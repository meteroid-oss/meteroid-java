// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class LicensesTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"auto_issued\":false,\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"customer_id\":\"customer_id_2\",\"customer_name\":\"sample\",\"has_activation_code\":false,\"id\":\"license_id_0\",\"offline\":false,\"revoked_immediately\":false,\"status\":\"REVOKED\",\"validity_days\":-123456789}]}");
        mock.client.licenses().list();
        assertEquals(List.of("GET /api/v1/licenses"), mock.requests);
    }

    @Test
    void create() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"license\":{\"auto_issued\":false,\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"customer_id\":\"customer_id_37\",\"customer_name\":\"sample\",\"has_activation_code\":true,\"id\":\"license_id_40\",\"offline\":true,\"revoked_immediately\":true,\"status\":\"PENDING\",\"validity_days\":123456789}}");
        mock.client
                .licenses()
                .create(
                        PerseidMock.decode(
                                com.meteroid.models.IssueLicenseRequest.class,
                                "{\"customer_id\":\"sample\"}"));
        assertEquals(List.of("POST /api/v1/licenses"), mock.requests);
    }

    @Test
    void retrieve() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"auto_issued\":false,\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"customer_id\":\"customer_id_79\",\"customer_name\":\"sample\",\"has_activation_code\":false,\"id\":\"license_id_90\",\"offline\":false,\"revoked_immediately\":true,\"status\":\"PENDING\",\"validity_days\":-123456789}");
        mock.client.licenses().retrieve("license_id");
        assertEquals(List.of("GET /api/v1/licenses/license_id"), mock.requests);
    }

    @Test
    void retrieveActivationCode() throws Exception {
        PerseidMock mock =
                new PerseidMock(200, "application/json", "{\"activation_code\":\"sample\"}");
        mock.client.licenses().retrieveActivationCode("license_id");
        assertEquals(List.of("GET /api/v1/licenses/license_id/activation-code"), mock.requests);
    }

    @Test
    void offline() throws Exception {
        PerseidMock mock = new PerseidMock(200, "application/json", "{\"license\":\"sample\"}");
        mock.client
                .licenses()
                .offline(
                        "license_id",
                        PerseidMock.decode(
                                com.meteroid.models.IssueOfflineLicenseRequest.class,
                                "{\"valid_days\":123456789}"));
        assertEquals(List.of("POST /api/v1/licenses/license_id/offline"), mock.requests);
    }

    @Test
    void revoke() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"auto_issued\":false,\"created_at\":\"2024-03-15T10:30:45.123+02:00\",\"customer_id\":\"customer_id_79\",\"customer_name\":\"sample\",\"has_activation_code\":false,\"id\":\"license_id_90\",\"offline\":false,\"revoked_immediately\":true,\"status\":\"PENDING\",\"validity_days\":-123456789}");
        mock.client
                .licenses()
                .revoke(
                        "license_id",
                        PerseidMock.decode(com.meteroid.models.RevokeLicenseRequest.class, "{}"));
        assertEquals(List.of("POST /api/v1/licenses/license_id/revoke"), mock.requests);
    }

    @Test
    void listLicensingSigningKeys() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"endpoints\":{\"activate_url\":\"sample\",\"events_url\":\"sample\",\"jwks_url\":\"sample\",\"refresh_url\":\"sample\"},\"keys\":[{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"kid\":\"sample\",\"public_key_pem\":\"sample\",\"status\":\"ACTIVE\"}]}");
        mock.client.licenses().listLicensingSigningKeys();
        assertEquals(List.of("GET /api/v1/licensing/signing-keys"), mock.requests);
    }
}
