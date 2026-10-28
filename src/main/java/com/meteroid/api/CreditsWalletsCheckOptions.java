// this file is @generated
package com.meteroid.api;

import com.meteroid.models.Currency;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code check}, immutable: build them with {@link #builder()}. */
public final class CreditsWalletsCheckOptions {
    private final Currency currency;
    private final String creditUnit;
    private final String productId;
    private final String subscriptionId;

    private CreditsWalletsCheckOptions(Builder builder) {
        this.currency = builder.currency;
        this.creditUnit = builder.creditUnit;
        this.productId = builder.productId;
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
    public static CreditsWalletsCheckOptions none() {
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
        builder.productId = productId;
        builder.subscriptionId = subscriptionId;
        return builder;
    }

    /**
     * Defaults to the customer's currency.
     *
     * @return the value, empty when unset
     */
    public Optional<Currency> currency() {
        return Optional.ofNullable(currency);
    }

    /**
     * Checks the wallet of this credit unit (its code) instead of a currency.
     *
     * @return the value, empty when unset
     */
    public Optional<String> creditUnit() {
        return Optional.ofNullable(creditUnit);
    }

    /**
     * Checks only the credit that can pay for this product: credit not restricted to products, and
     * credit restricted to it. Absent checks all credit.
     *
     * @return the value, empty when unset
     */
    public Optional<String> productId() {
        return Optional.ofNullable(productId);
    }

    /**
     * Checks only the credit this subscription (<code>sub_…</code>) can spend, net of its own usage
     * no credit pays: the credit that belongs to it and the customer's credit that belongs to no
     * subscription, once every subscription's unbilled usage is paid. <code>has_access</code> is
     * then the decision the access gate makes for that subscription's usage. Absent checks the
     * customer's credit as a whole.
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
        CreditsWalletsCheckOptions that = (CreditsWalletsCheckOptions) o;
        return Objects.equals(currency, that.currency)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(productId, that.productId)
                && Objects.equals(subscriptionId, that.subscriptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, creditUnit, productId, subscriptionId);
    }

    @Override
    public String toString() {
        return "CreditsWalletsCheckOptions{"
                + "currency="
                + currency
                + ", creditUnit="
                + creditUnit
                + ", productId="
                + productId
                + ", subscriptionId="
                + subscriptionId
                + "}";
    }

    /** Builds {@link CreditsWalletsCheckOptions}. */
    public static final class Builder {
        private Currency currency;
        private String creditUnit;
        private String productId;
        private String subscriptionId;

        private Builder() {}

        /**
         * Defaults to the customer's currency.
         *
         * @param currency the value, null to leave it out
         * @return this builder
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Checks the wallet of this credit unit (its code) instead of a currency.
         *
         * @param creditUnit the value, null to leave it out
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = creditUnit;
            return this;
        }

        /**
         * Checks only the credit that can pay for this product: credit not restricted to products,
         * and credit restricted to it. Absent checks all credit.
         *
         * @param productId the value, null to leave it out
         * @return this builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Checks only the credit this subscription (<code>sub_…</code>) can spend, net of its own
         * usage no credit pays: the credit that belongs to it and the customer's credit that
         * belongs to no subscription, once every subscription's unbilled usage is paid. <code>
         * has_access</code> is then the decision the access gate makes for that subscription's
         * usage. Absent checks the customer's credit as a whole.
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
        public CreditsWalletsCheckOptions build() {
            return new CreditsWalletsCheckOptions(this);
        }
    }
}
