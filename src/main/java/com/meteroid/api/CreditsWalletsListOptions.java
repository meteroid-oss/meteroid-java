// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code list}, immutable: build them with {@link #builder()}. */
public final class CreditsWalletsListOptions {
    private final String subscriptionId;

    private CreditsWalletsListOptions(Builder builder) {
        this.subscriptionId = builder.subscriptionId;
    }

    /**
     * A builder of parameters.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * No parameters.
     *
     * @return empty parameters
     */
    public static CreditsWalletsListOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.subscriptionId = subscriptionId;
        return builder;
    }

    /**
     * Only the credit this subscription (<code>sub_…</code>) can use: the credit that belongs to it
     * and the customer's credit that belongs to no subscription. Every wallet is still listed.
     *
     * @return the value, empty when unset
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(subscriptionId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditsWalletsListOptions that = (CreditsWalletsListOptions) o;
        return Objects.equals(subscriptionId, that.subscriptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId);
    }

    @Override
    public String toString() {
        return "CreditsWalletsListOptions{" + "subscriptionId=" + subscriptionId + "}";
    }

    /** Builds {@link CreditsWalletsListOptions}. */
    public static final class Builder {
        private String subscriptionId;

        private Builder() {}

        /**
         * Only the credit this subscription (<code>sub_…</code>) can use: the credit that belongs
         * to it and the customer's credit that belongs to no subscription. Every wallet is still
         * listed.
         *
         * @param subscriptionId the value, null to leave it out
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public CreditsWalletsListOptions build() {
            return new CreditsWalletsListOptions(this);
        }
    }
}
