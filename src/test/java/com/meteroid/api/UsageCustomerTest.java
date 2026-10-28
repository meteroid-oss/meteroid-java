// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class UsageCustomerTest {

    @Test
    void retrieveUnattributed() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"period_end\":\"1999-12-31\",\"period_start\":\"2024-02-29\",\"usage\":[{\"from\":\"2024-03-15T10:30:45.123+02:00\",\"metric_code\":\"sample\",\"metric_id\":\"billable_metric_id_44\",\"metric_name\":\"sample\",\"total_value\":\"12345.6789\",\"until\":\"2023-12-31T23:59:59.999-05:30\"}]}");
        mock.client.usage().customer().retrieveUnattributed("customer_id");
        assertEquals(List.of("GET /api/v1/usage/customer/customer_id/unattributed"), mock.requests);
    }
}
