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

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class InvoiceLineUsageBreakdownItem {
    @JsonProperty("amount_subtotal")
    private Long amountSubtotal;

    @JsonProperty("credits_consumed")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> creditsConsumed = JsonField.missing();

    @JsonProperty("others")
    private Boolean others;

    @JsonProperty("quantity")
    private BigDecimal quantity;

    @JsonProperty("quoted_amount_subtotal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> quotedAmountSubtotal = JsonField.missing();

    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> value = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private InvoiceLineUsageBreakdownItem() {}

    private InvoiceLineUsageBreakdownItem(Builder builder) {
        this.amountSubtotal = builder.amountSubtotal;
        this.creditsConsumed = builder.creditsConsumed;
        this.others = builder.others;
        this.quantity = builder.quantity;
        this.quotedAmountSubtotal = builder.quotedAmountSubtotal;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code InvoiceLineUsageBreakdownItem}.
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
        builder.amountSubtotal = amountSubtotal;
        builder.creditsConsumed = creditsConsumed;
        builder.others = others;
        builder.quantity = quantity;
        builder.quotedAmountSubtotal = quotedAmountSubtotal;
        builder.value = value;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Its part of the line's amount before discounts and tax, in minor units.
     *
     * @return the value, never null
     */
    public Long amountSubtotal() {
        return Utils.required(amountSubtotal, "amount_subtotal");
    }

    /**
     * Its part of <code>credit_unit.consumed</code>, on a line priced in a credit unit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> creditsConsumed() {
        return creditsConsumed.asOptional();
    }

    /**
     * Set on the last item when there are more than 99 values: it sums the rest.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> others() {
        return Optional.ofNullable(others);
    }

    /**
     * Usage of this value, in the units the line is priced in.
     *
     * @return the value, never null
     */
    public BigDecimal quantity() {
        return Utils.required(quantity, "quantity");
    }

    /**
     * Its part of the tax-included amount quoted, on a line billed from tax-inclusive prices.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> quotedAmountSubtotal() {
        return quotedAmountSubtotal.asOptional();
    }

    /**
     * The property's value; absent for events without it, and for <code>others</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> value() {
        return value.asOptional();
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
        InvoiceLineUsageBreakdownItem that = (InvoiceLineUsageBreakdownItem) o;
        return Objects.equals(amountSubtotal, that.amountSubtotal)
                && Objects.equals(creditsConsumed, that.creditsConsumed)
                && Objects.equals(others, that.others)
                && Objects.equals(quantity, that.quantity)
                && Objects.equals(quotedAmountSubtotal, that.quotedAmountSubtotal)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amountSubtotal,
                creditsConsumed,
                others,
                quantity,
                quotedAmountSubtotal,
                value,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "InvoiceLineUsageBreakdownItem{"
                + "amountSubtotal="
                + amountSubtotal
                + ", creditsConsumed="
                + creditsConsumed
                + ", others="
                + others
                + ", quantity="
                + quantity
                + ", quotedAmountSubtotal="
                + quotedAmountSubtotal
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link InvoiceLineUsageBreakdownItem}. */
    public static final class Builder {
        private Long amountSubtotal;
        private JsonField<Long> creditsConsumed = JsonField.missing();
        private Boolean others;
        private BigDecimal quantity;
        private JsonField<Long> quotedAmountSubtotal = JsonField.missing();
        private JsonField<String> value = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Its part of the line's amount before discounts and tax, in minor units.
         *
         * @param amountSubtotal the value
         * @return this builder
         */
        public Builder amountSubtotal(Long amountSubtotal) {
            this.amountSubtotal = amountSubtotal;
            return this;
        }

        /**
         * Its part of <code>credit_unit.consumed</code>, on a line priced in a credit unit.
         *
         * @param creditsConsumed the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditsConsumed(Long creditsConsumed) {
            this.creditsConsumed = JsonField.ofNullable(creditsConsumed);
            return this;
        }

        /**
         * Set on the last item when there are more than 99 values: it sums the rest.
         *
         * @param others the value
         * @return this builder
         */
        public Builder others(Boolean others) {
            this.others = others;
            return this;
        }

        /**
         * Usage of this value, in the units the line is priced in.
         *
         * @param quantity the value
         * @return this builder
         */
        public Builder quantity(BigDecimal quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Its part of the tax-included amount quoted, on a line billed from tax-inclusive prices.
         *
         * @param quotedAmountSubtotal the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder quotedAmountSubtotal(Long quotedAmountSubtotal) {
            this.quotedAmountSubtotal = JsonField.ofNullable(quotedAmountSubtotal);
            return this;
        }

        /**
         * The property's value; absent for events without it, and for <code>others</code>.
         *
         * @param value the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder value(String value) {
            this.value = JsonField.ofNullable(value);
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
         * The {@code InvoiceLineUsageBreakdownItem}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public InvoiceLineUsageBreakdownItem build() {
            Utils.checkRequired(amountSubtotal, "amount_subtotal");
            Utils.checkRequired(quantity, "quantity");
            return new InvoiceLineUsageBreakdownItem(this);
        }
    }

    /**
     * Parse {@code json} as {@code InvoiceLineUsageBreakdownItem}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static InvoiceLineUsageBreakdownItem fromJson(String json) {
        return Utils.parse(json, InvoiceLineUsageBreakdownItem.class);
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
