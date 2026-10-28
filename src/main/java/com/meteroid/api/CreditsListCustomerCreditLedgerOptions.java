// this file is @generated
package com.meteroid.api;

import com.meteroid.models.Currency;

import java.util.Objects;
import java.util.Optional;

/**
 * Optional parameters of {@code listCustomerCreditLedger}, immutable: build them with {@link
 * #builder()}.
 */
public final class CreditsListCustomerCreditLedgerOptions {
    private final Currency currency;
    private final String creditUnit;
    private final Integer page;
    private final Integer perPage;

    private CreditsListCustomerCreditLedgerOptions(Builder builder) {
        this.currency = builder.currency;
        this.creditUnit = builder.creditUnit;
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
    public static CreditsListCustomerCreditLedgerOptions none() {
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
        builder.page = page;
        builder.perPage = perPage;
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
     * The ledger of this credit unit (its code) instead of a currency; excludes <code>currency
     * </code>.
     *
     * @return the value, empty when unset
     */
    public Optional<String> creditUnit() {
        return Optional.ofNullable(creditUnit);
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
        CreditsListCustomerCreditLedgerOptions that = (CreditsListCustomerCreditLedgerOptions) o;
        return Objects.equals(currency, that.currency)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(page, that.page)
                && Objects.equals(perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, creditUnit, page, perPage);
    }

    @Override
    public String toString() {
        return "CreditsListCustomerCreditLedgerOptions{"
                + "currency="
                + currency
                + ", creditUnit="
                + creditUnit
                + ", page="
                + page
                + ", perPage="
                + perPage
                + "}";
    }

    /** Builds {@link CreditsListCustomerCreditLedgerOptions}. */
    public static final class Builder {
        private Currency currency;
        private String creditUnit;
        private Integer page;
        private Integer perPage;

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
         * The ledger of this credit unit (its code) instead of a currency; excludes <code>currency
         * </code>.
         *
         * @param creditUnit the value, null to leave it out
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = creditUnit;
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
        public CreditsListCustomerCreditLedgerOptions build() {
            return new CreditsListCustomerCreditLedgerOptions(this);
        }
    }
}
