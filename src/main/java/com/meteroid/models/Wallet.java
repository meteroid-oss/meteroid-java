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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A customer's credit in one currency or credit unit. Amounts are minor units of it. Read with
 * <code>subscription_id</code>, every amount counts only the credit that subscription can use.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class Wallet {
    @JsonProperty("as_of")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> asOf = JsonField.missing();

    @JsonProperty("auto_top_up")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<AutoTopUp> autoTopUp = JsonField.missing();

    @JsonProperty("balance")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> balance = JsonField.missing();

    @JsonProperty("credit_on_account")
    private Long creditOnAccount;

    @JsonProperty("credit_on_account_usage_only")
    private Long creditOnAccountUsageOnly;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("low_balance_thresholds")
    private List<Long> lowBalanceThresholds;

    @JsonProperty("pauses_at_zero")
    private Boolean pausesAtZero;

    @JsonProperty("shared_balance")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> sharedBalance = JsonField.missing();

    @JsonProperty("subscription_credit")
    private List<SubscriptionCredit> subscriptionCredit;

    @JsonProperty("unbilled_usage")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> unbilledUsage = JsonField.missing();

    @JsonProperty("unit_price")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> unitPrice = JsonField.missing();

    @JsonProperty("unit_price_currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> unitPriceCurrency = JsonField.missing();

    @JsonProperty("upcoming_credit")
    private Long upcomingCredit;

    @JsonProperty("usage_at_zero")
    private UsageAtZero usageAtZero;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private Wallet() {}

    private Wallet(Builder builder) {
        this.asOf = builder.asOf;
        this.autoTopUp = builder.autoTopUp;
        this.balance = builder.balance;
        this.creditOnAccount = builder.creditOnAccount;
        this.creditOnAccountUsageOnly = builder.creditOnAccountUsageOnly;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.lowBalanceThresholds = Utils.copyList(builder.lowBalanceThresholds);
        this.pausesAtZero = builder.pausesAtZero;
        this.sharedBalance = builder.sharedBalance;
        this.subscriptionCredit = Utils.copyList(builder.subscriptionCredit);
        this.unbilledUsage = builder.unbilledUsage;
        this.unitPrice = builder.unitPrice;
        this.unitPriceCurrency = builder.unitPriceCurrency;
        this.upcomingCredit = builder.upcomingCredit;
        this.usageAtZero = builder.usageAtZero;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code Wallet}.
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
        builder.autoTopUp = autoTopUp;
        builder.balance = balance;
        builder.creditOnAccount = creditOnAccount;
        builder.creditOnAccountUsageOnly = creditOnAccountUsageOnly;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.lowBalanceThresholds = Utils.mutableList(lowBalanceThresholds);
        builder.pausesAtZero = pausesAtZero;
        builder.sharedBalance = sharedBalance;
        builder.subscriptionCredit = Utils.mutableList(subscriptionCredit);
        builder.unbilledUsage = unbilledUsage;
        builder.unitPrice = unitPrice;
        builder.unitPriceCurrency = unitPriceCurrency;
        builder.upcomingCredit = upcomingCredit;
        builder.usageAtZero = usageAtZero;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * When <code>balance</code> and <code>unbilled_usage</code> were computed. They follow usage
     * within a few seconds while the balance is near zero or a threshold, and within a minute
     * otherwise.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> asOf() {
        return asOf.asOptional();
    }

    /**
     * The {@code auto_top_up} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<AutoTopUp> autoTopUp() {
        return autoTopUp.asOptional();
    }

    /**
     * What the customer has left: <code>credit_on_account</code> minus the part of <code>
     * unbilled_usage</code> that credit will pay. Never negative: usage beyond the credit stays in
     * <code>unbilled_usage</code>, to be invoiced. Low-balance alerts use it; automatic top-ups
     * watch only its part that pays any charge (credit that belongs to no subscription and is not
     * limited to usage or products). Absent, with <code>unbilled_usage</code> and <code>as_of
     * </code>, until the customer's usage has been priced once. With <code>subscription_id</code>:
     * the credit that subscription can spend once every subscription's unbilled usage is paid,
     * minus its own unbilled usage no credit pays (negative then), as <code>GET /wallets/check
     * </code> reads it. Credit restricted to products it is not charged for is left out. Credit
     * that belongs to no subscription counts in the balance of every subscription that can use it
     * (see <code>shared_balance</code>): never add subscriptions' balances up.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> balance() {
        return balance.asOptional();
    }

    /**
     * The ledger total: credit granted and effective, not yet applied to an invoice or expired,
     * whatever it applies to. Usage not invoiced yet is not deducted (see <code>balance</code>).
     *
     * @return the value, never null
     */
    public Long creditOnAccount() {
        return Utils.required(creditOnAccount, "credit_on_account");
    }

    /**
     * The part of <code>credit_on_account</code> that pays only usage charges.
     *
     * @return the value, never null
     */
    public Long creditOnAccountUsageOnly() {
        return Utils.required(creditOnAccountUsageOnly, "credit_on_account_usage_only");
    }

    /**
     * The credit unit (its code) the wallet holds; absent for a currency.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
    }

    /**
     * Decimal places of <code>credit_unit</code>: amounts are integers of 10^-precision credit.
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
     * Ascending, distinct, at most 5. <code>wallet.balance_low</code> fires once when <code>balance
     * </code> falls below one; a drop below several at once fires once, for the lowest. All credit
     * counts, including credit that belongs to a subscription or is limited to usage or products,
     * which <code>wallet.depleted</code> leaves out: a wallet can be depleted without an alert
     * firing.
     *
     * @return the value, never null
     */
    public List<Long> lowBalanceThresholds() {
        return Utils.required(lowBalanceThresholds, "low_balance_thresholds");
    }

    /**
     * Usage stops as soon as the credit is used up, for at least one active subscription: by <code>
     * usage_at_zero</code>, or by the plan of a subscription charging usage in this wallet.
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
     * The part of <code>credit_on_account</code> that belongs to a subscription, which only that
     * subscription's charges can use, per subscription. The rest pays any subscription.
     *
     * @return the value, never null
     */
    public List<SubscriptionCredit> subscriptionCredit() {
        return Utils.required(subscriptionCredit, "subscription_credit");
    }

    /**
     * Usage recorded and priced but not invoiced yet, tax included, in minor units: what the next
     * invoices will charge for it, paid from credit as far as the credit goes. With <code>
     * subscription_id</code>, that subscription's usage only; other subscriptions' usage paid from
     * shared credit still lowers <code>balance</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> unbilledUsage() {
        return unbilledUsage.asOptional();
    }

    /**
     * Credit unit wallets: the price this customer agreed for one credit, in major units of <code>
     * unit_price_currency</code>, as a decimal string (e.g. "0.0008"). Purchases and automatic
     * top-ups in that currency charge it instead of the list price, unless a purchase sets its own
     * <code>unit_price</code>. Absent: the list price applies.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> unitPrice() {
        return unitPrice.asOptional();
    }

    /**
     * The {@code unit_price_currency} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Currency> unitPriceCurrency() {
        return unitPriceCurrency.asOptional();
    }

    /**
     * Credit granted that takes effect later.
     *
     * @return the value, never null
     */
    public Long upcomingCredit() {
        return Utils.required(upcomingCredit, "upcoming_credit");
    }

    /**
     * What this customer's usage does once the credit a subscription can use for it is used up (its
     * own credit, credit that belongs to no subscription, and credit limited to the product: the
     * <code>balance</code> of <code>GET /wallets/check</code>). <code>FOLLOW_PLAN</code> applies
     * the "when credit runs out" rule of each subscription's plan.
     *
     * @return the value, never null
     */
    public UsageAtZero usageAtZero() {
        return Utils.required(usageAtZero, "usage_at_zero");
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
        Wallet that = (Wallet) o;
        return Objects.equals(asOf, that.asOf)
                && Objects.equals(autoTopUp, that.autoTopUp)
                && Objects.equals(balance, that.balance)
                && Objects.equals(creditOnAccount, that.creditOnAccount)
                && Objects.equals(creditOnAccountUsageOnly, that.creditOnAccountUsageOnly)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(lowBalanceThresholds, that.lowBalanceThresholds)
                && Objects.equals(pausesAtZero, that.pausesAtZero)
                && Objects.equals(sharedBalance, that.sharedBalance)
                && Objects.equals(subscriptionCredit, that.subscriptionCredit)
                && Objects.equals(unbilledUsage, that.unbilledUsage)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(unitPriceCurrency, that.unitPriceCurrency)
                && Objects.equals(upcomingCredit, that.upcomingCredit)
                && Objects.equals(usageAtZero, that.usageAtZero)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asOf,
                autoTopUp,
                balance,
                creditOnAccount,
                creditOnAccountUsageOnly,
                creditUnit,
                creditUnitPrecision,
                currency,
                lowBalanceThresholds,
                pausesAtZero,
                sharedBalance,
                subscriptionCredit,
                unbilledUsage,
                unitPrice,
                unitPriceCurrency,
                upcomingCredit,
                usageAtZero,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "Wallet{"
                + "asOf="
                + asOf
                + ", autoTopUp="
                + autoTopUp
                + ", balance="
                + balance
                + ", creditOnAccount="
                + creditOnAccount
                + ", creditOnAccountUsageOnly="
                + creditOnAccountUsageOnly
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", currency="
                + currency
                + ", lowBalanceThresholds="
                + lowBalanceThresholds
                + ", pausesAtZero="
                + pausesAtZero
                + ", sharedBalance="
                + sharedBalance
                + ", subscriptionCredit="
                + subscriptionCredit
                + ", unbilledUsage="
                + unbilledUsage
                + ", unitPrice="
                + unitPrice
                + ", unitPriceCurrency="
                + unitPriceCurrency
                + ", upcomingCredit="
                + upcomingCredit
                + ", usageAtZero="
                + usageAtZero
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link Wallet}. */
    public static final class Builder {
        private JsonField<OffsetDateTime> asOf = JsonField.missing();
        private JsonField<AutoTopUp> autoTopUp = JsonField.missing();
        private JsonField<Long> balance = JsonField.missing();
        private Long creditOnAccount;
        private Long creditOnAccountUsageOnly;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private List<Long> lowBalanceThresholds;
        private Boolean pausesAtZero;
        private JsonField<Long> sharedBalance = JsonField.missing();
        private List<SubscriptionCredit> subscriptionCredit;
        private JsonField<Long> unbilledUsage = JsonField.missing();
        private JsonField<String> unitPrice = JsonField.missing();
        private JsonField<Currency> unitPriceCurrency = JsonField.missing();
        private Long upcomingCredit;
        private UsageAtZero usageAtZero;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * When <code>balance</code> and <code>unbilled_usage</code> were computed. They follow
         * usage within a few seconds while the balance is near zero or a threshold, and within a
         * minute otherwise.
         *
         * @param asOf the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder asOf(OffsetDateTime asOf) {
            this.asOf = JsonField.ofNullable(asOf);
            return this;
        }

        /**
         * The {@code auto_top_up} property.
         *
         * @param autoTopUp the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder autoTopUp(AutoTopUp autoTopUp) {
            this.autoTopUp = JsonField.ofNullable(autoTopUp);
            return this;
        }

        /**
         * What the customer has left: <code>credit_on_account</code> minus the part of <code>
         * unbilled_usage</code> that credit will pay. Never negative: usage beyond the credit stays
         * in <code>unbilled_usage</code>, to be invoiced. Low-balance alerts use it; automatic
         * top-ups watch only its part that pays any charge (credit that belongs to no subscription
         * and is not limited to usage or products). Absent, with <code>unbilled_usage</code> and
         * <code>as_of</code>, until the customer's usage has been priced once. With <code>
         * subscription_id</code>: the credit that subscription can spend once every subscription's
         * unbilled usage is paid, minus its own unbilled usage no credit pays (negative then), as
         * <code>GET /wallets/check</code> reads it. Credit restricted to products it is not charged
         * for is left out. Credit that belongs to no subscription counts in the balance of every
         * subscription that can use it (see <code>shared_balance</code>): never add subscriptions'
         * balances up.
         *
         * @param balance the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder balance(Long balance) {
            this.balance = JsonField.ofNullable(balance);
            return this;
        }

        /**
         * The ledger total: credit granted and effective, not yet applied to an invoice or expired,
         * whatever it applies to. Usage not invoiced yet is not deducted (see <code>balance</code>
         * ).
         *
         * @param creditOnAccount the value
         * @return this builder
         */
        public Builder creditOnAccount(Long creditOnAccount) {
            this.creditOnAccount = creditOnAccount;
            return this;
        }

        /**
         * The part of <code>credit_on_account</code> that pays only usage charges.
         *
         * @param creditOnAccountUsageOnly the value
         * @return this builder
         */
        public Builder creditOnAccountUsageOnly(Long creditOnAccountUsageOnly) {
            this.creditOnAccountUsageOnly = creditOnAccountUsageOnly;
            return this;
        }

        /**
         * The credit unit (its code) the wallet holds; absent for a currency.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
            return this;
        }

        /**
         * Decimal places of <code>credit_unit</code>: amounts are integers of 10^-precision credit.
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
         * Ascending, distinct, at most 5. <code>wallet.balance_low</code> fires once when <code>
         * balance</code> falls below one; a drop below several at once fires once, for the lowest.
         * All credit counts, including credit that belongs to a subscription or is limited to usage
         * or products, which <code>wallet.depleted</code> leaves out: a wallet can be depleted
         * without an alert firing.
         *
         * @param lowBalanceThresholds the value
         * @return this builder
         */
        public Builder lowBalanceThresholds(List<Long> lowBalanceThresholds) {
            this.lowBalanceThresholds = Utils.mutableList(lowBalanceThresholds);
            return this;
        }

        /**
         * Adds an item to {@code low_balance_thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addLowBalanceThresholdsItem(Long item) {
            if (this.lowBalanceThresholds == null) {
                this.lowBalanceThresholds = new ArrayList<>();
            }
            this.lowBalanceThresholds.add(item);
            return this;
        }

        /**
         * Usage stops as soon as the credit is used up, for at least one active subscription: by
         * <code>usage_at_zero</code>, or by the plan of a subscription charging usage in this
         * wallet.
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
         * The part of <code>credit_on_account</code> that belongs to a subscription, which only
         * that subscription's charges can use, per subscription. The rest pays any subscription.
         *
         * @param subscriptionCredit the value
         * @return this builder
         */
        public Builder subscriptionCredit(List<SubscriptionCredit> subscriptionCredit) {
            this.subscriptionCredit = Utils.mutableList(subscriptionCredit);
            return this;
        }

        /**
         * Adds an item to {@code subscription_credit}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addSubscriptionCreditItem(SubscriptionCredit item) {
            if (this.subscriptionCredit == null) {
                this.subscriptionCredit = new ArrayList<>();
            }
            this.subscriptionCredit.add(item);
            return this;
        }

        /**
         * Usage recorded and priced but not invoiced yet, tax included, in minor units: what the
         * next invoices will charge for it, paid from credit as far as the credit goes. With <code>
         * subscription_id</code>, that subscription's usage only; other subscriptions' usage paid
         * from shared credit still lowers <code>balance</code>.
         *
         * @param unbilledUsage the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unbilledUsage(Long unbilledUsage) {
            this.unbilledUsage = JsonField.ofNullable(unbilledUsage);
            return this;
        }

        /**
         * Credit unit wallets: the price this customer agreed for one credit, in major units of
         * <code>unit_price_currency</code>, as a decimal string (e.g. "0.0008"). Purchases and
         * automatic top-ups in that currency charge it instead of the list price, unless a purchase
         * sets its own <code>unit_price</code>. Absent: the list price applies.
         *
         * @param unitPrice the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = JsonField.ofNullable(unitPrice);
            return this;
        }

        /**
         * The {@code unit_price_currency} property.
         *
         * @param unitPriceCurrency the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unitPriceCurrency(Currency unitPriceCurrency) {
            this.unitPriceCurrency = JsonField.ofNullable(unitPriceCurrency);
            return this;
        }

        /**
         * Credit granted that takes effect later.
         *
         * @param upcomingCredit the value
         * @return this builder
         */
        public Builder upcomingCredit(Long upcomingCredit) {
            this.upcomingCredit = upcomingCredit;
            return this;
        }

        /**
         * What this customer's usage does once the credit a subscription can use for it is used up
         * (its own credit, credit that belongs to no subscription, and credit limited to the
         * product: the <code>balance</code> of <code>GET /wallets/check</code>). <code>FOLLOW_PLAN
         * </code> applies the "when credit runs out" rule of each subscription's plan.
         *
         * @param usageAtZero the value
         * @return this builder
         */
        public Builder usageAtZero(UsageAtZero usageAtZero) {
            this.usageAtZero = usageAtZero;
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
         * The {@code Wallet}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public Wallet build() {
            Utils.checkRequired(creditOnAccount, "credit_on_account");
            Utils.checkRequired(creditOnAccountUsageOnly, "credit_on_account_usage_only");
            Utils.checkRequired(lowBalanceThresholds, "low_balance_thresholds");
            Utils.checkRequired(pausesAtZero, "pauses_at_zero");
            Utils.checkRequired(subscriptionCredit, "subscription_credit");
            Utils.checkRequired(upcomingCredit, "upcoming_credit");
            Utils.checkRequired(usageAtZero, "usage_at_zero");
            return new Wallet(this);
        }
    }

    /**
     * Parse {@code json} as {@code Wallet}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static Wallet fromJson(String json) {
        return Utils.parse(json, Wallet.class);
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
