// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code list}, immutable: build them with {@link #builder()}. */
public final class LicensesListOptions {
    private final String customerId;
    private final String subscriptionId;
    private final Boolean includeRevoked;

    private LicensesListOptions(Builder builder) {
        this.customerId = builder.customerId;
        this.subscriptionId = builder.subscriptionId;
        this.includeRevoked = builder.includeRevoked;
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
    public static LicensesListOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.customerId = customerId;
        builder.subscriptionId = subscriptionId;
        builder.includeRevoked = includeRevoked;
        return builder;
    }

    /**
     * Filter by customer ID or alias
     *
     * @return the value, empty when unset
     */
    public Optional<String> customerId() {
        return Optional.ofNullable(customerId);
    }

    /**
     * The {@code subscription_id} parameter.
     *
     * @return the value, empty when unset
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(subscriptionId);
    }

    /**
     * Include revoked licenses. Default: false.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> includeRevoked() {
        return Optional.ofNullable(includeRevoked);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicensesListOptions that = (LicensesListOptions) o;
        return Objects.equals(customerId, that.customerId)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(includeRevoked, that.includeRevoked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, subscriptionId, includeRevoked);
    }

    @Override
    public String toString() {
        return "LicensesListOptions{"
                + "customerId="
                + customerId
                + ", subscriptionId="
                + subscriptionId
                + ", includeRevoked="
                + includeRevoked
                + "}";
    }

    /** Builds {@link LicensesListOptions}. */
    public static final class Builder {
        private String customerId;
        private String subscriptionId;
        private Boolean includeRevoked;

        private Builder() {}

        /**
         * Filter by customer ID or alias
         *
         * @param customerId the value, null to leave it out
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * The {@code subscription_id} parameter.
         *
         * @param subscriptionId the value, null to leave it out
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Include revoked licenses. Default: false.
         *
         * @param includeRevoked the value, null to leave it out
         * @return this builder
         */
        public Builder includeRevoked(Boolean includeRevoked) {
            this.includeRevoked = includeRevoked;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public LicensesListOptions build() {
            return new LicensesListOptions(this);
        }
    }
}
