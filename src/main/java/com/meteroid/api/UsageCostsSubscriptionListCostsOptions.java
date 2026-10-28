// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code listCosts}, immutable: build them with {@link #builder()}. */
public final class UsageCostsSubscriptionListCostsOptions {
    private final String groupBy;

    private UsageCostsSubscriptionListCostsOptions(Builder builder) {
        this.groupBy = builder.groupBy;
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
    public static UsageCostsSubscriptionListCostsOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.groupBy = groupBy;
        return builder;
    }

    /**
     * Event property to split the usage by.
     *
     * @return the value, empty when unset
     */
    public Optional<String> groupBy() {
        return Optional.ofNullable(groupBy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageCostsSubscriptionListCostsOptions that = (UsageCostsSubscriptionListCostsOptions) o;
        return Objects.equals(groupBy, that.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupBy);
    }

    @Override
    public String toString() {
        return "UsageCostsSubscriptionListCostsOptions{" + "groupBy=" + groupBy + "}";
    }

    /** Builds {@link UsageCostsSubscriptionListCostsOptions}. */
    public static final class Builder {
        private String groupBy;

        private Builder() {}

        /**
         * Event property to split the usage by.
         *
         * @param groupBy the value, null to leave it out
         * @return this builder
         */
        public Builder groupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public UsageCostsSubscriptionListCostsOptions build() {
            return new UsageCostsSubscriptionListCostsOptions(this);
        }
    }
}
