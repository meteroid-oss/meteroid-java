// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code list}, immutable: build them with {@link #builder()}. */
public final class CreditUnitsListOptions {
    private final Boolean includeArchived;

    private CreditUnitsListOptions(Builder builder) {
        this.includeArchived = builder.includeArchived;
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
    public static CreditUnitsListOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.includeArchived = includeArchived;
        return builder;
    }

    /**
     * Include archived units. Defaults to false.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> includeArchived() {
        return Optional.ofNullable(includeArchived);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditUnitsListOptions that = (CreditUnitsListOptions) o;
        return Objects.equals(includeArchived, that.includeArchived);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeArchived);
    }

    @Override
    public String toString() {
        return "CreditUnitsListOptions{" + "includeArchived=" + includeArchived + "}";
    }

    /** Builds {@link CreditUnitsListOptions}. */
    public static final class Builder {
        private Boolean includeArchived;

        private Builder() {}

        /**
         * Include archived units. Defaults to false.
         *
         * @param includeArchived the value, null to leave it out
         * @return this builder
         */
        public Builder includeArchived(Boolean includeArchived) {
            this.includeArchived = includeArchived;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public CreditUnitsListOptions build() {
            return new CreditUnitsListOptions(this);
        }
    }
}
