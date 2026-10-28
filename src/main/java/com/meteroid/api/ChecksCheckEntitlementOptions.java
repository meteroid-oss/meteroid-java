// this file is @generated
package com.meteroid.api;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Optional parameters of {@code checkEntitlement}, immutable: build them with {@link #builder()}.
 */
public final class ChecksCheckEntitlementOptions {
    private final BigDecimal requested;
    private final String subscriptionId;
    private final Map<String, String> group;

    private ChecksCheckEntitlementOptions(Builder builder) {
        this.requested = builder.requested;
        this.subscriptionId = builder.subscriptionId;
        this.group = builder.group;
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
    public static ChecksCheckEntitlementOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.requested = requested;
        builder.subscriptionId = subscriptionId;
        builder.group = group;
        return builder;
    }

    /**
     * Units the customer is about to consume. Defaults to 1.
     *
     * @return the value, empty when unset
     */
    public Optional<BigDecimal> requested() {
        return Optional.ofNullable(requested);
    }

    /**
     * The subscription (<code>sub_…</code>) the usage belongs to: only its own budgets and the
     * customer-wide ones apply. Without it, a budget on one subscription refuses only once every
     * subscription charging the feature's metric is refused by its own budget.
     *
     * @return the value, empty when unset
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(subscriptionId);
    }

    /**
     * The group to check, as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: required when the
     * entitlement is grouped
     *
     * @return the value, empty when unset
     */
    public Optional<Map<String, String>> group() {
        return Optional.ofNullable(group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksCheckEntitlementOptions that = (ChecksCheckEntitlementOptions) o;
        return Objects.equals(requested, that.requested)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requested, subscriptionId, group);
    }

    @Override
    public String toString() {
        return "ChecksCheckEntitlementOptions{"
                + "requested="
                + requested
                + ", subscriptionId="
                + subscriptionId
                + ", group="
                + group
                + "}";
    }

    /** Builds {@link ChecksCheckEntitlementOptions}. */
    public static final class Builder {
        private BigDecimal requested;
        private String subscriptionId;
        private Map<String, String> group;

        private Builder() {}

        /**
         * Units the customer is about to consume. Defaults to 1.
         *
         * @param requested the value, null to leave it out
         * @return this builder
         */
        public Builder requested(BigDecimal requested) {
            this.requested = requested;
            return this;
        }

        /**
         * The subscription (<code>sub_…</code>) the usage belongs to: only its own budgets and the
         * customer-wide ones apply. Without it, a budget on one subscription refuses only once
         * every subscription charging the feature's metric is refused by its own budget.
         *
         * @param subscriptionId the value, null to leave it out
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * The group to check, as <code>group[&lt;property&gt;]=&lt;value&gt;</code>: required when
         * the entitlement is grouped
         *
         * @param group the value, null to leave it out
         * @return this builder
         */
        public Builder group(Map<String, String> group) {
            this.group = group;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public ChecksCheckEntitlementOptions build() {
            return new ChecksCheckEntitlementOptions(this);
        }
    }
}
