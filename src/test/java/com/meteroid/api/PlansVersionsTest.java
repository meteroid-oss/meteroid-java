// this file is @generated
package com.meteroid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class PlansVersionsTest {

    @Test
    void updateMinimum() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"amount\":\"sample\",\"scope\":{\"type\":\"all_components\"}}");
        mock.client
                .plans()
                .versions()
                .updateMinimum(
                        "plan_version_id",
                        PerseidMock.decode(
                                com.meteroid.models.MinimumCommitment.class,
                                "{\"amount\":\"sample\",\"scope\":{\"type\":\"all_components\"}}"));
        assertEquals(List.of("PUT /api/v1/plans/versions/plan_version_id/minimum"), mock.requests);
    }

    @Test
    void deleteMinimum() throws Exception {
        PerseidMock mock = new PerseidMock(204, null, "");
        mock.client.plans().versions().deleteMinimum("plan_version_id");
        assertEquals(
                List.of("DELETE /api/v1/plans/versions/plan_version_id/minimum"), mock.requests);
    }

    @Test
    void list() throws Exception {
        PerseidMock mock =
                new PerseidMock(
                        200,
                        "application/json",
                        "{\"data\":[{\"created_at\":\"2023-12-31T23:59:59.999-05:30\",\"currency\":\"CVE\",\"id\":\"plan_version_id_2\",\"is_draft\":true,\"version\":-2147483648}],\"pagination_meta\":{\"page\":-123456789,\"per_page\":-123456789,\"total_items\":-9007199254740993,\"total_pages\":123456789}}");
        mock.client.plans().versions().list("plan_id");
        assertEquals(List.of("GET /api/v1/plans/plan_id/versions"), mock.requests);
    }
}
