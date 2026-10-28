// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code retrieve}, immutable: build them with {@link #builder()}. */
public final class UsageCustomerRetrieveOptions {
    private final String metricId;

    private UsageCustomerRetrieveOptions(Builder builder) {
        this.metricId = builder.metricId;
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
    public static UsageCustomerRetrieveOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.metricId = metricId;
        return builder;
    }

    /**
     * The {@code metric_id} parameter.
     *
     * @return the value, empty when unset
     */
    public Optional<String> metricId() {
        return Optional.ofNullable(metricId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageCustomerRetrieveOptions that = (UsageCustomerRetrieveOptions) o;
        return Objects.equals(metricId, that.metricId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricId);
    }

    @Override
    public String toString() {
        return "UsageCustomerRetrieveOptions{" + "metricId=" + metricId + "}";
    }

    /** Builds {@link UsageCustomerRetrieveOptions}. */
    public static final class Builder {
        private String metricId;

        private Builder() {}

        /**
         * The {@code metric_id} parameter.
         *
         * @param metricId the value, null to leave it out
         * @return this builder
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public UsageCustomerRetrieveOptions build() {
            return new UsageCustomerRetrieveOptions(this);
        }
    }
}
