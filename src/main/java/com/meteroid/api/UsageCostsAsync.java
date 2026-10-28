// this file is @generated
package com.meteroid.api;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code usage_costs} operations, without blocking: each method returns a {@link
 * CompletableFuture}. Obtained from {@code client.async()}.
 */
public final class UsageCostsAsync {
    private final UsageCosts sync;
    private final WithRawResponse withRawResponse;

    private final UsageCostsCustomerAsync customer;

    private final UsageCostsSubscriptionAsync subscription;

    /**
     * The operations, sending through {@code sync}.
     *
     * @param sync the blocking operations
     */
    public UsageCostsAsync(UsageCosts sync) {
        this.sync = sync;
        this.withRawResponse = new WithRawResponse();

        this.customer = new UsageCostsCustomerAsync(sync.customer());

        this.subscription = new UsageCostsSubscriptionAsync(sync.subscription());
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
    public UsageCostsCustomerAsync customer() {
        return customer;
    }

    /**
     * The {@code subscription} operations.
     *
     * @return the operations
     */
    public UsageCostsSubscriptionAsync subscription() {
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
        public UsageCostsCustomerAsync.WithRawResponse customer() {
            return UsageCostsAsync.this.customer.withRawResponse();
        }

        /**
         * The {@code subscription} operations.
         *
         * @return the operations
         */
        public UsageCostsSubscriptionAsync.WithRawResponse subscription() {
            return UsageCostsAsync.this.subscription.withRawResponse();
        }
    }
}
