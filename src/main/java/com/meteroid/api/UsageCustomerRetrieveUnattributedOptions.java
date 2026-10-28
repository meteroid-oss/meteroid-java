// this file is @generated
package com.meteroid.api;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

/**
 * Optional parameters of {@code retrieveUnattributed}, immutable: build them with {@link
 * #builder()}.
 */
public final class UsageCustomerRetrieveUnattributedOptions {
    private final LocalDate startDate;
    private final LocalDate endDate;

    private UsageCustomerRetrieveUnattributedOptions(Builder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
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
    public static UsageCustomerRetrieveUnattributedOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.startDate = startDate;
        builder.endDate = endDate;
        return builder;
    }

    /**
     * First day of the range. Defaults to the first day of the current month (UTC).
     *
     * @return the value, empty when unset
     */
    public Optional<LocalDate> startDate() {
        return Optional.ofNullable(startDate);
    }

    /**
     * Day after the range (exclusive). Defaults to the first day of the next month.
     *
     * @return the value, empty when unset
     */
    public Optional<LocalDate> endDate() {
        return Optional.ofNullable(endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageCustomerRetrieveUnattributedOptions that =
                (UsageCustomerRetrieveUnattributedOptions) o;
        return Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate);
    }

    @Override
    public String toString() {
        return "UsageCustomerRetrieveUnattributedOptions{"
                + "startDate="
                + startDate
                + ", endDate="
                + endDate
                + "}";
    }

    /** Builds {@link UsageCustomerRetrieveUnattributedOptions}. */
    public static final class Builder {
        private LocalDate startDate;
        private LocalDate endDate;

        private Builder() {}

        /**
         * First day of the range. Defaults to the first day of the current month (UTC).
         *
         * @param startDate the value, null to leave it out
         * @return this builder
         */
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Day after the range (exclusive). Defaults to the first day of the next month.
         *
         * @param endDate the value, null to leave it out
         * @return this builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public UsageCustomerRetrieveUnattributedOptions build() {
            return new UsageCustomerRetrieveUnattributedOptions(this);
        }
    }
}
