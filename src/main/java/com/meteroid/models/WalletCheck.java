// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.meteroid.internal.JsonField;
import com.meteroid.internal.Utils;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Whether a customer may keep consuming what their prepaid credit pays for.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletCheck {
    @JsonProperty("as_of")
    private OffsetDateTime asOf;

    @JsonProperty("balance")
    private Long balance;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("exact")
    private Boolean exact;

    @JsonProperty("exhausted")
    private Boolean exhausted;

    @JsonProperty("has_access")
    private Boolean hasAccess;

    @JsonProperty("lag_ms")
    private Long lagMs;

    @JsonProperty("pauses_at_zero")
    private Boolean pausesAtZero;

    @JsonProperty("shared_balance")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> sharedBalance = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WalletCheck() {}

    private WalletCheck(Builder builder) {
        this.asOf = builder.asOf;
        this.balance = builder.balance;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.exact = builder.exact;
        this.exhausted = builder.exhausted;
        this.hasAccess = builder.hasAccess;
        this.lagMs = builder.lagMs;
        this.pausesAtZero = builder.pausesAtZero;
        this.sharedBalance = builder.sharedBalance;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletCheck}.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A builder starting from this value.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.asOf = asOf;
        builder.balance = balance;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.exact = exact;
        builder.exhausted = exhausted;
        builder.hasAccess = hasAccess;
        builder.lagMs = lagMs;
        builder.pausesAtZero = pausesAtZero;
        builder.sharedBalance = sharedBalance;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * When <code>balance</code> was computed.
     *
     * @return the value, never null
     */
    public OffsetDateTime asOf() {
        return Utils.required(asOf, "as_of");
    }

    /**
     * The balance: credit on account net of the usage not invoiced yet that it will pay, in minor
     * units of <code>currency</code> or <code>credit_unit</code>; never negative for the customer
     * as a whole, as <code>balance</code> of <code>GET /wallets</code>. With <code>product_id
     * </code>, only the credit that can pay for that product, net of its usage no credit covers.
     * With <code>subscription_id</code>, only the credit that subscription can spend (credit
     * restricted to products it is not charged for left out), net of its usage no credit covers;
     * credit that belongs to no subscription counts in every subscription's balance (see <code>
     * shared_balance</code>).
     *
     * @return the value, never null
     */
    public Long balance() {
        return Utils.required(balance, "balance");
    }

    /**
     * The credit unit (its code) checked; absent for a currency.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
    }

    /**
     * Decimal places of <code>credit_unit</code>: <code>balance</code> is in integers of
     * 10^-precision credit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> creditUnitPrecision() {
        return creditUnitPrecision.asOptional();
    }

    /**
     * The {@code currency} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Currency> currency() {
        return currency.asOptional();
    }

    /**
     * Always false: <code>balance</code> may lag usage by a few seconds (see <code>as_of</code>),
     * and the answer is cached for one second.
     *
     * @return the value, never null
     */
    public Boolean exact() {
        return Utils.required(exact, "exact");
    }

    /**
     * True once <code>balance</code> is at or below zero, or, with <code>subscription_id</code>,
     * once no credit is left for some of its usage. Independent of <code>has_access</code>: a
     * wallet that allows overage still reports this, so the caller can warn without refusing.
     *
     * @return the value, never null
     */
    public Boolean exhausted() {
        return Utils.required(exhausted, "exhausted");
    }

    /**
     * False only once <code>balance</code> is at or below zero and <code>blocks_when_exhausted
     * </code> is true. Customers without a wallet in <code>currency</code> do not prepay, and
     * always have access. With <code>subscription_id</code>: false when <code>blocks_when_exhausted
     * </code> is true and no credit that subscription can spend is left for some of its usage (of
     * <code>product_id</code> when given), as the access gate refuses it; a subscription charged no
     * usage in the wallet keeps access.
     *
     * @return the value, never null
     */
    public Boolean hasAccess() {
        return Utils.required(hasAccess, "has_access");
    }

    /**
     * Age of <code>balance</code>, in milliseconds.
     *
     * @return the value, never null
     */
    public Long lagMs() {
        return Utils.required(lagMs, "lag_ms");
    }

    /**
     * Whether usage is refused as soon as the credit is used up: the wallet's <code>usage_at_zero
     * </code>, else the plan of the subscription checked (of any active subscription without one).
     * A plan that invoices usage up to a cap refuses it past the cap only, as <code>has_access
     * </code> reports.
     *
     * @return the value, never null
     */
    public Boolean pausesAtZero() {
        return Utils.required(pausesAtZero, "pauses_at_zero");
    }

    /**
     * With <code>subscription_id</code> only: the part of <code>balance</code> that belongs to no
     * subscription, which the customer's other subscriptions can spend too.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> sharedBalance() {
        return sharedBalance.asOptional();
    }

    /**
     * Properties this version of the SDK does not know, kept as received and sent back.
     *
     * @return the properties by name, unmodifiable
     */
    public Map<String, JsonNode> additionalProperties() {
        return Collections.unmodifiableMap(additionalProperties);
    }

    @JsonAnyGetter
    private Map<String, JsonNode> anyProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    private void putAnyProperty(String name, JsonNode value) {
        additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WalletCheck that = (WalletCheck) o;
        return Objects.equals(asOf, that.asOf)
                && Objects.equals(balance, that.balance)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(exact, that.exact)
                && Objects.equals(exhausted, that.exhausted)
                && Objects.equals(hasAccess, that.hasAccess)
                && Objects.equals(lagMs, that.lagMs)
                && Objects.equals(pausesAtZero, that.pausesAtZero)
                && Objects.equals(sharedBalance, that.sharedBalance)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asOf,
                balance,
                creditUnit,
                creditUnitPrecision,
                currency,
                exact,
                exhausted,
                hasAccess,
                lagMs,
                pausesAtZero,
                sharedBalance,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletCheck{"
                + "asOf="
                + asOf
                + ", balance="
                + balance
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", currency="
                + currency
                + ", exact="
                + exact
                + ", exhausted="
                + exhausted
                + ", hasAccess="
                + hasAccess
                + ", lagMs="
                + lagMs
                + ", pausesAtZero="
                + pausesAtZero
                + ", sharedBalance="
                + sharedBalance
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WalletCheck}. */
    public static final class Builder {
        private OffsetDateTime asOf;
        private Long balance;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private Boolean exact;
        private Boolean exhausted;
        private Boolean hasAccess;
        private Long lagMs;
        private Boolean pausesAtZero;
        private JsonField<Long> sharedBalance = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * When <code>balance</code> was computed.
         *
         * @param asOf the value
         * @return this builder
         */
        public Builder asOf(OffsetDateTime asOf) {
            this.asOf = asOf;
            return this;
        }

        /**
         * The balance: credit on account net of the usage not invoiced yet that it will pay, in
         * minor units of <code>currency</code> or <code>credit_unit</code>; never negative for the
         * customer as a whole, as <code>balance</code> of <code>GET /wallets</code>. With <code>
         * product_id</code>, only the credit that can pay for that product, net of its usage no
         * credit covers. With <code>subscription_id</code>, only the credit that subscription can
         * spend (credit restricted to products it is not charged for left out), net of its usage no
         * credit covers; credit that belongs to no subscription counts in every subscription's
         * balance (see <code>shared_balance</code>).
         *
         * @param balance the value
         * @return this builder
         */
        public Builder balance(Long balance) {
            this.balance = balance;
            return this;
        }

        /**
         * The credit unit (its code) checked; absent for a currency.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
            return this;
        }

        /**
         * Decimal places of <code>credit_unit</code>: <code>balance</code> is in integers of
         * 10^-precision credit.
         *
         * @param creditUnitPrecision the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnitPrecision(Integer creditUnitPrecision) {
            this.creditUnitPrecision = JsonField.ofNullable(creditUnitPrecision);
            return this;
        }

        /**
         * The {@code currency} property.
         *
         * @param currency the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder currency(Currency currency) {
            this.currency = JsonField.ofNullable(currency);
            return this;
        }

        /**
         * Always false: <code>balance</code> may lag usage by a few seconds (see <code>as_of</code>
         * ), and the answer is cached for one second.
         *
         * @param exact the value
         * @return this builder
         */
        public Builder exact(Boolean exact) {
            this.exact = exact;
            return this;
        }

        /**
         * True once <code>balance</code> is at or below zero, or, with <code>subscription_id</code>
         * , once no credit is left for some of its usage. Independent of <code>has_access</code>: a
         * wallet that allows overage still reports this, so the caller can warn without refusing.
         *
         * @param exhausted the value
         * @return this builder
         */
        public Builder exhausted(Boolean exhausted) {
            this.exhausted = exhausted;
            return this;
        }

        /**
         * False only once <code>balance</code> is at or below zero and <code>blocks_when_exhausted
         * </code> is true. Customers without a wallet in <code>currency</code> do not prepay, and
         * always have access. With <code>subscription_id</code>: false when <code>
         * blocks_when_exhausted</code> is true and no credit that subscription can spend is left
         * for some of its usage (of <code>product_id</code> when given), as the access gate refuses
         * it; a subscription charged no usage in the wallet keeps access.
         *
         * @param hasAccess the value
         * @return this builder
         */
        public Builder hasAccess(Boolean hasAccess) {
            this.hasAccess = hasAccess;
            return this;
        }

        /**
         * Age of <code>balance</code>, in milliseconds.
         *
         * @param lagMs the value
         * @return this builder
         */
        public Builder lagMs(Long lagMs) {
            this.lagMs = lagMs;
            return this;
        }

        /**
         * Whether usage is refused as soon as the credit is used up: the wallet's <code>
         * usage_at_zero</code>, else the plan of the subscription checked (of any active
         * subscription without one). A plan that invoices usage up to a cap refuses it past the cap
         * only, as <code>has_access</code> reports.
         *
         * @param pausesAtZero the value
         * @return this builder
         */
        public Builder pausesAtZero(Boolean pausesAtZero) {
            this.pausesAtZero = pausesAtZero;
            return this;
        }

        /**
         * With <code>subscription_id</code> only: the part of <code>balance</code> that belongs to
         * no subscription, which the customer's other subscriptions can spend too.
         *
         * @param sharedBalance the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder sharedBalance(Long sharedBalance) {
            this.sharedBalance = JsonField.ofNullable(sharedBalance);
            return this;
        }

        /**
         * A property the SDK does not know, sent along.
         *
         * @param name the property name
         * @param value the JSON value
         * @return this builder
         */
        public Builder putAdditionalProperty(String name, JsonNode value) {
            additionalProperties.put(name, value);
            return this;
        }

        /**
         * Properties the SDK does not know, sent along.
         *
         * @param additionalProperties the properties by name
         * @return this builder
         */
        public Builder putAllAdditionalProperties(Map<String, JsonNode> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }

        /**
         * Leaves out a property the SDK does not know.
         *
         * @param name the property name
         * @return this builder
         */
        public Builder removeAdditionalProperty(String name) {
            additionalProperties.remove(name);
            return this;
        }

        /**
         * The {@code WalletCheck}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletCheck build() {
            Utils.checkRequired(asOf, "as_of");
            Utils.checkRequired(balance, "balance");
            Utils.checkRequired(exact, "exact");
            Utils.checkRequired(exhausted, "exhausted");
            Utils.checkRequired(hasAccess, "has_access");
            Utils.checkRequired(lagMs, "lag_ms");
            Utils.checkRequired(pausesAtZero, "pauses_at_zero");
            return new WalletCheck(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletCheck}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletCheck fromJson(String json) {
        return Utils.parse(json, WalletCheck.class);
    }

    /**
     * This value as JSON.
     *
     * @return the JSON text
     */
    public String toJson() {
        return Utils.json(this);
    }
}
