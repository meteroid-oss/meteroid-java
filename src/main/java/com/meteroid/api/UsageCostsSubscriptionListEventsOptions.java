// this file is @generated
package com.meteroid.api;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code listEvents}, immutable: build them with {@link #builder()}. */
public final class UsageCostsSubscriptionListEventsOptions {
    private final String cursor;
    private final Integer limit;

    private UsageCostsSubscriptionListEventsOptions(Builder builder) {
        this.cursor = builder.cursor;
        this.limit = builder.limit;
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
    public static UsageCostsSubscriptionListEventsOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.cursor = cursor;
        builder.limit = limit;
        return builder;
    }

    /**
     * The <code>next_cursor</code> of the previous page.
     *
     * @return the value, empty when unset
     */
    public Optional<String> cursor() {
        return Optional.ofNullable(cursor);
    }

    /**
     * Page size, 100 by default and 500 at most.
     *
     * @return the value, empty when unset
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(limit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageCostsSubscriptionListEventsOptions that = (UsageCostsSubscriptionListEventsOptions) o;
        return Objects.equals(cursor, that.cursor) && Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, limit);
    }

    @Override
    public String toString() {
        return "UsageCostsSubscriptionListEventsOptions{"
                + "cursor="
                + cursor
                + ", limit="
                + limit
                + "}";
    }

    /** Builds {@link UsageCostsSubscriptionListEventsOptions}. */
    public static final class Builder {
        private String cursor;
        private Integer limit;

        private Builder() {}

        /**
         * The <code>next_cursor</code> of the previous page.
         *
         * @param cursor the value, null to leave it out
         * @return this builder
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Page size, 100 by default and 500 at most.
         *
         * @param limit the value, null to leave it out
         * @return this builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public UsageCostsSubscriptionListEventsOptions build() {
            return new UsageCostsSubscriptionListEventsOptions(this);
        }
    }
}
