// this file is @generated
package com.meteroid.api;

import com.meteroid.models.CreditGrantStatus;
import com.meteroid.models.Currency;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code list}, immutable: build them with {@link #builder()}. */
public final class CreditsGrantsListOptions {
    private final Currency currency;
    private final String creditUnit;
    private final CreditGrantStatus status;
    private final String subscriptionId;
    private final String usableBySubscriptionId;
    private final Integer page;
    private final Integer perPage;

    private CreditsGrantsListOptions(Builder builder) {
        this.currency = builder.currency;
        this.creditUnit = builder.creditUnit;
        this.status = builder.status;
        this.subscriptionId = builder.subscriptionId;
        this.usableBySubscriptionId = builder.usableBySubscriptionId;
        this.page = builder.page;
        this.perPage = builder.perPage;
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
    public static CreditsGrantsListOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.currency = currency;
        builder.creditUnit = creditUnit;
        builder.status = status;
        builder.subscriptionId = subscriptionId;
        builder.usableBySubscriptionId = usableBySubscriptionId;
        builder.page = page;
        builder.perPage = perPage;
        return builder;
    }

    /**
     * Only grants in this currency.
     *
     * @return the value, empty when unset
     */
    public Optional<Currency> currency() {
        return Optional.ofNullable(currency);
    }

    /**
     * Only grants in this credit unit (its code); excludes <code>currency</code>.
     *
     * @return the value, empty when unset
     */
    public Optional<String> creditUnit() {
        return Optional.ofNullable(creditUnit);
    }

    /**
     * The {@code status} parameter.
     *
     * @return the value, empty when unset
     */
    public Optional<CreditGrantStatus> status() {
        return Optional.ofNullable(status);
    }

    /**
     * Only the grants that belong to this subscription (<code>sub_…</code>); excludes <code>
     * usable_by_subscription_id</code>.
     *
     * @return the value, empty when unset
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(subscriptionId);
    }

    /**
     * Only the credit this subscription (<code>sub_…</code>) can use: its own grants and the
     * customer's grants that belong to no subscription. Excludes <code>subscription_id</code>.
     *
     * @return the value, empty when unset
     */
    public Optional<String> usableBySubscriptionId() {
        return Optional.ofNullable(usableBySubscriptionId);
    }

    /**
     * Page number (0-indexed)
     *
     * @return the value, empty when unset
     */
    public Optional<Integer> page() {
        return Optional.ofNullable(page);
    }

    /**
     * Number of items per page
     *
     * @return the value, empty when unset
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(perPage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditsGrantsListOptions that = (CreditsGrantsListOptions) o;
        return Objects.equals(currency, that.currency)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(status, that.status)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(usableBySubscriptionId, that.usableBySubscriptionId)
                && Objects.equals(page, that.page)
                && Objects.equals(perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currency,
                creditUnit,
                status,
                subscriptionId,
                usableBySubscriptionId,
                page,
                perPage);
    }

    @Override
    public String toString() {
        return "CreditsGrantsListOptions{"
                + "currency="
                + currency
                + ", creditUnit="
                + creditUnit
                + ", status="
                + status
                + ", subscriptionId="
                + subscriptionId
                + ", usableBySubscriptionId="
                + usableBySubscriptionId
                + ", page="
                + page
                + ", perPage="
                + perPage
                + "}";
    }

    /** Builds {@link CreditsGrantsListOptions}. */
    public static final class Builder {
        private Currency currency;
        private String creditUnit;
        private CreditGrantStatus status;
        private String subscriptionId;
        private String usableBySubscriptionId;
        private Integer page;
        private Integer perPage;

        private Builder() {}

        /**
         * Only grants in this currency.
         *
         * @param currency the value, null to leave it out
         * @return this builder
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Only grants in this credit unit (its code); excludes <code>currency</code>.
         *
         * @param creditUnit the value, null to leave it out
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = creditUnit;
            return this;
        }

        /**
         * The {@code status} parameter.
         *
         * @param status the value, null to leave it out
         * @return this builder
         */
        public Builder status(CreditGrantStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Only the grants that belong to this subscription (<code>sub_…</code>); excludes <code>
         * usable_by_subscription_id</code>.
         *
         * @param subscriptionId the value, null to leave it out
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Only the credit this subscription (<code>sub_…</code>) can use: its own grants and the
         * customer's grants that belong to no subscription. Excludes <code>subscription_id</code>.
         *
         * @param usableBySubscriptionId the value, null to leave it out
         * @return this builder
         */
        public Builder usableBySubscriptionId(String usableBySubscriptionId) {
            this.usableBySubscriptionId = usableBySubscriptionId;
            return this;
        }

        /**
         * Page number (0-indexed)
         *
         * @param page the value, null to leave it out
         * @return this builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Number of items per page
         *
         * @param perPage the value, null to leave it out
         * @return this builder
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public CreditsGrantsListOptions build() {
            return new CreditsGrantsListOptions(this);
        }
    }
}
