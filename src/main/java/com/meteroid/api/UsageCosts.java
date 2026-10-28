// this file is @generated
package com.meteroid.api;

import com.meteroid.internal.MeteroidHttpClient;

/**
 * The {@code usage_costs} operations, blocking. {@link #withRawResponse()} has the same methods
 * returning the status and headers along with the body.
 */
public final class UsageCosts {
    private final MeteroidHttpClient client;
    private final WithRawResponse withRawResponse;

    private final UsageCostsCustomer customer;

    private final UsageCostsSubscription subscription;

    /**
     * The operations, sending through {@code client}.
     *
     * @param client the HTTP client of the SDK
     */
    public UsageCosts(MeteroidHttpClient client) {
        this.client = client;
        this.withRawResponse = new WithRawResponse();

        this.customer = new UsageCostsCustomer(client);

        this.subscription = new UsageCostsSubscription(client);
    }

    /**
     * The same operations, returning the status and headers along with the body.
     *
     * @return the operations
     */
    public WithRawResponse withRawResponse() {
        return withRawResponse;
    }

    /**
     * The {@code customer} operations.
     *
     * @return the operations
     */
    public UsageCostsCustomer customer() {
        return customer;
    }

    /**
     * The {@code subscription} operations.
     *
     * @return the operations
     */
    public UsageCostsSubscription subscription() {
        return subscription;
    }

    /** The operations, returning the status and headers along with the body. */
    public final class WithRawResponse {
        private WithRawResponse() {}

        /**
         * The {@code customer} operations.
         *
         * @return the operations
         */
        public UsageCostsCustomer.WithRawResponse customer() {
            return UsageCosts.this.customer.withRawResponse();
        }

        /**
         * The {@code subscription} operations.
         *
         * @return the operations
         */
        public UsageCostsSubscription.WithRawResponse subscription() {
            return UsageCosts.this.subscription.withRawResponse();
        }
    }
}
