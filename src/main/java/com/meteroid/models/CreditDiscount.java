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

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Promotional credit added to the customer's credit balance when the subscription the coupon is
 * redeemed on starts. It never discounts an invoice and applies before tax. A customer redeems it
 * at most once, so the coupon cannot be <code>reusable</code>. Its code is case-insensitive: it is
 * stored upper-case and redeemed whatever the case.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditDiscount {
    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("expires_in_days")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> expiresInDays = JsonField.missing();

    @JsonProperty("scope")
    private CouponCreditScope scope;

    @JsonProperty("type")
    private String type = "CREDIT";

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditDiscount() {}

    private CreditDiscount(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.expiresInDays = builder.expiresInDays;
        this.scope = builder.scope;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditDiscount}.
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
        builder.amount = amount;
        builder.currency = currency;
        builder.expiresInDays = expiresInDays;
        builder.scope = scope;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Credit added per redemption, in major units (e.g. "25.00").
     *
     * @return the value, never null
     */
    public String amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * ISO 4217 code; it must match the currency of the subscription the coupon is redeemed on.
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * Days the credit stays spendable after redemption, 1 to 3660. Absent: it never expires.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> expiresInDays() {
        return expiresInDays.asOptional();
    }

    /**
     * CUSTOMER (default): the credit pays any of the customer's subscriptions. SUBSCRIPTION: the
     * credit pays only the subscription the code is redeemed on, and ends with it.
     *
     * @return the value, empty when unset
     */
    public Optional<CouponCreditScope> scope() {
        return Optional.ofNullable(scope);
    }

    /**
     * The {@code type} property.
     *
     * @return the value, never null
     */
    public String type() {
        return Utils.required(type, "type");
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
        CreditDiscount that = (CreditDiscount) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(currency, that.currency)
                && Objects.equals(expiresInDays, that.expiresInDays)
                && Objects.equals(scope, that.scope)
                && Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, expiresInDays, scope, type, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditDiscount{"
                + "amount="
                + amount
                + ", currency="
                + currency
                + ", expiresInDays="
                + expiresInDays
                + ", scope="
                + scope
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditDiscount}. */
    public static final class Builder {
        private String amount;
        private String currency;
        private JsonField<Integer> expiresInDays = JsonField.missing();
        private CouponCreditScope scope;
        private String type = "CREDIT";
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Credit added per redemption, in major units (e.g. "25.00").
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * ISO 4217 code; it must match the currency of the subscription the coupon is redeemed on.
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Days the credit stays spendable after redemption, 1 to 3660. Absent: it never expires.
         *
         * @param expiresInDays the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder expiresInDays(Integer expiresInDays) {
            this.expiresInDays = JsonField.ofNullable(expiresInDays);
            return this;
        }

        /**
         * CUSTOMER (default): the credit pays any of the customer's subscriptions. SUBSCRIPTION:
         * the credit pays only the subscription the code is redeemed on, and ends with it.
         *
         * @param scope the value
         * @return this builder
         */
        public Builder scope(CouponCreditScope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * The {@code type} property.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * The {@code CreditDiscount}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditDiscount build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(type, "type");
            return new CreditDiscount(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditDiscount}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditDiscount fromJson(String json) {
        return Utils.parse(json, CreditDiscount.class);
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
