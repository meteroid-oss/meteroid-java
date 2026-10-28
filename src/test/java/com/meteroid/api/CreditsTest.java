// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class CreditsTest {

    @Test
    void listCustomerCreditLedger() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"amount\":-9007199254740993,\"applies_to\":\"USAGE\",\"balance_after\":9007199254740993,\"credit_grant_id\":\"sample\",\"effective_at\":\"2023-12-31T23:59:59.999-05:30\",\"id\":\"sample\",\"reason\":\"sample\",\"recorded_at\":\"2023-12-31T23:59:59.999-05:30\",\"sequence\":9007199254740993,\"type\":\"CREDIT\"}],\"pagination_meta\":{\"page\":-123456789,\"per_page\":-123456789,\"total_items\":-9007199254740993,\"total_pages\":123456789}}");
        mock.client.credits().listCustomerCreditLedger("id_or_alias");
        assertEquals(List.of("GET /api/v1/customers/id_or_alias/credit-ledger"), mock.requests);
    }
}
