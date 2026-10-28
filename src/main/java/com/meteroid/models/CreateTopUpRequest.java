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
 * Credit sold to the customer, charged or invoiced.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreateTopUpRequest {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("collection")
    private TopUpCollection collection;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("expires_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> expiresAt = JsonField.missing();

    @JsonProperty("payment_method_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> paymentMethodId = JsonField.missing();

    @JsonProperty("unit_price")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> unitPrice = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateTopUpRequest() {}

    private CreateTopUpRequest(Builder builder) {
        this.amount = builder.amount;
        this.collection = builder.collection;
        this.creditUnit = builder.creditUnit;
        this.currency = builder.currency;
        this.expiresAt = builder.expiresAt;
        this.paymentMethodId = builder.paymentMethodId;
        this.unitPrice = builder.unitPrice;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateTopUpRequest}.
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
        builder.collection = collection;
        builder.creditUnit = creditUnit;
        builder.currency = currency;
        builder.expiresAt = expiresAt;
        builder.paymentMethodId = paymentMethodId;
        builder.unitPrice = unitPrice;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Credit to buy, positive, applying to ALL charges. In minor units of <code>currency</code>,
     * charged one for one without tax: the usage it pays is taxed on the invoice that bills it.
     * With <code>credit_unit</code>, in minor units of that unit (e.g. 500000 is 5,000.00 credits
     * of a unit with precision 2), charged at the unit's price per credit in the customer's
     * currency, plus tax under the unit's product.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * CHARGE (default) charges a saved payment method now; SEND_INVOICE issues an invoice and
     * grants the credit once it is paid.
     *
     * @return the value, empty when unset
     */
    public Optional<TopUpCollection> collection() {
        return Optional.ofNullable(collection);
    }

    /**
     * Buy credits of this credit unit (its code) instead of money; excludes <code>currency</code>.
     * They are charged in the customer's currency at the customer's agreed price for the unit (the
     * wallet's <code>unit_price</code>), else its list price, plus tax, under the unit's product.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
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
     * Absolute expiry of the purchased credit; unset never expires.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> expiresAt() {
        return expiresAt.asOptional();
    }

    /**
     * CHARGE only; defaults to the customer's default payment method.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentMethodId() {
        return paymentMethodId.asOptional();
    }

    /**
     * With <code>credit_unit</code>: the negotiated price of one credit for this purchase, in major
     * units of the customer's currency, as a decimal string (e.g. "0.0008"). Defaults to the
     * wallet's <code>unit_price</code> when set, else the list price; the unit must still have a
     * list price in that currency.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> unitPrice() {
        return unitPrice.asOptional();
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
        CreateTopUpRequest that = (CreateTopUpRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(collection, that.collection)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(currency, that.currency)
                && Objects.equals(expiresAt, that.expiresAt)
                && Objects.equals(paymentMethodId, that.paymentMethodId)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                collection,
                creditUnit,
                currency,
                expiresAt,
                paymentMethodId,
                unitPrice,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateTopUpRequest{"
                + "amount="
                + amount
                + ", collection="
                + collection
                + ", creditUnit="
                + creditUnit
                + ", currency="
                + currency
                + ", expiresAt="
                + expiresAt
                + ", paymentMethodId="
                + paymentMethodId
                + ", unitPrice="
                + unitPrice
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateTopUpRequest}. */
    public static final class Builder {
        private Long amount;
        private TopUpCollection collection;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private JsonField<OffsetDateTime> expiresAt = JsonField.missing();
        private JsonField<String> paymentMethodId = JsonField.missing();
        private JsonField<String> unitPrice = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Credit to buy, positive, applying to ALL charges. In minor units of <code>currency</code>
         * , charged one for one without tax: the usage it pays is taxed on the invoice that bills
         * it. With <code>credit_unit</code>, in minor units of that unit (e.g. 500000 is 5,000.00
         * credits of a unit with precision 2), charged at the unit's price per credit in the
         * customer's currency, plus tax under the unit's product.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * CHARGE (default) charges a saved payment method now; SEND_INVOICE issues an invoice and
         * grants the credit once it is paid.
         *
         * @param collection the value
         * @return this builder
         */
        public Builder collection(TopUpCollection collection) {
            this.collection = collection;
            return this;
        }

        /**
         * Buy credits of this credit unit (its code) instead of money; excludes <code>currency
         * </code>. They are charged in the customer's currency at the customer's agreed price for
         * the unit (the wallet's <code>unit_price</code>), else its list price, plus tax, under the
         * unit's product.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
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
         * Absolute expiry of the purchased credit; unset never expires.
         *
         * @param expiresAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = JsonField.ofNullable(expiresAt);
            return this;
        }

        /**
         * CHARGE only; defaults to the customer's default payment method.
         *
         * @param paymentMethodId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = JsonField.ofNullable(paymentMethodId);
            return this;
        }

        /**
         * With <code>credit_unit</code>: the negotiated price of one credit for this purchase, in
         * major units of the customer's currency, as a decimal string (e.g. "0.0008"). Defaults to
         * the wallet's <code>unit_price</code> when set, else the list price; the unit must still
         * have a list price in that currency.
         *
         * @param unitPrice the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = JsonField.ofNullable(unitPrice);
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
         * The {@code CreateTopUpRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateTopUpRequest build() {
            Utils.checkRequired(amount, "amount");
            return new CreateTopUpRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateTopUpRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateTopUpRequest fromJson(String json) {
        return Utils.parse(json, CreateTopUpRequest.class);
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
