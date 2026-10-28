// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class CreditsWalletsTest {

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"credit_on_account\":9007199254740993,\"credit_on_account_usage_only\":-9007199254740993,\"low_balance_thresholds\":[-9007199254740993],\"pauses_at_zero\":false,\"subscription_credit\":[{\"credit_on_account\":-9007199254740993,\"subscription_id\":\"sample\"}],\"upcoming_credit\":9007199254740993,\"usage_at_zero\":\"FOLLOW_PLAN\"}]}");
        mock.client.credits().wallets().list("id_or_alias");
        assertEquals(List.of("GET /api/v1/customers/id_or_alias/wallets"), mock.requests);
    }

    @Test
    void check() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"as_of\":\"2023-12-31T23:59:59.999-05:30\",\"balance\":9007199254740993,\"exact\":true,\"exhausted\":false,\"has_access\":true,\"lag_ms\":-9007199254740993,\"pauses_at_zero\":true}");
        mock.client.credits().wallets().check("id_or_alias");
        assertEquals(List.of("GET /api/v1/customers/id_or_alias/wallets/check"), mock.requests);
    }
}
