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

/**
 * How a usage line priced in a credit unit was paid: the credits it consumed, those the customer's
 * balance in the unit covered, and the rate the rest was billed at.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class InvoiceLineCreditUnit {
    @JsonProperty("code")
    private String code;

    @JsonProperty("consumed")
    private Long consumed;

    @JsonProperty("covered")
    private Long covered;

    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("rate")
    private BigDecimal rate;

    @JsonProperty("unit_price")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> unitPrice = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private InvoiceLineCreditUnit() {}

    private InvoiceLineCreditUnit(Builder builder) {
        this.code = builder.code;
        this.consumed = builder.consumed;
        this.covered = builder.covered;
        this.precision = builder.precision;
        this.rate = builder.rate;
        this.unitPrice = builder.unitPrice;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code InvoiceLineCreditUnit}.
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
        builder.code = code;
        builder.consumed = consumed;
        builder.covered = covered;
        builder.precision = precision;
        builder.rate = rate;
        builder.unitPrice = unitPrice;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The credit unit's code, e.g. <code>CREDITS</code>.
     *
     * @return the value, never null
     */
    public String code() {
        return Utils.required(code, "code");
    }

    /**
     * Credits the usage priced.
     *
     * @return the value, never null
     */
    public Long consumed() {
        return Utils.required(consumed, "consumed");
    }

    /**
     * Of which paid by the customer's credit wallet.
     *
     * @return the value, never null
     */
    public Long covered() {
        return Utils.required(covered, "covered");
    }

    /**
     * Credit amounts are integers in 10^-precision credit.
     *
     * @return the value, never null
     */
    public Integer precision() {
        return Utils.required(precision, "precision");
    }

    /**
     * Invoice-currency major units per credit.
     *
     * @return the value, never null
     */
    public BigDecimal rate() {
        return Utils.required(rate, "rate");
    }

    /**
     * Credits per usage unit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> unitPrice() {
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
        InvoiceLineCreditUnit that = (InvoiceLineCreditUnit) o;
        return Objects.equals(code, that.code)
                && Objects.equals(consumed, that.consumed)
                && Objects.equals(covered, that.covered)
                && Objects.equals(precision, that.precision)
                && Objects.equals(rate, that.rate)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                code, consumed, covered, precision, rate, unitPrice, additionalProperties);
    }

    @Override
    public String toString() {
        return "InvoiceLineCreditUnit{"
                + "code="
                + code
                + ", consumed="
                + consumed
                + ", covered="
                + covered
                + ", precision="
                + precision
                + ", rate="
                + rate
                + ", unitPrice="
                + unitPrice
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link InvoiceLineCreditUnit}. */
    public static final class Builder {
        private String code;
        private Long consumed;
        private Long covered;
        private Integer precision;
        private BigDecimal rate;
        private JsonField<BigDecimal> unitPrice = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The credit unit's code, e.g. <code>CREDITS</code>.
         *
         * @param code the value
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Credits the usage priced.
         *
         * @param consumed the value
         * @return this builder
         */
        public Builder consumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }

        /**
         * Of which paid by the customer's credit wallet.
         *
         * @param covered the value
         * @return this builder
         */
        public Builder covered(Long covered) {
            this.covered = covered;
            return this;
        }

        /**
         * Credit amounts are integers in 10^-precision credit.
         *
         * @param precision the value
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Invoice-currency major units per credit.
         *
         * @param rate the value
         * @return this builder
         */
        public Builder rate(BigDecimal rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Credits per usage unit.
         *
         * @param unitPrice the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unitPrice(BigDecimal unitPrice) {
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
         * The {@code InvoiceLineCreditUnit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public InvoiceLineCreditUnit build() {
            Utils.checkRequired(code, "code");
            Utils.checkRequired(consumed, "consumed");
            Utils.checkRequired(covered, "covered");
            Utils.checkRequired(precision, "precision");
            Utils.checkRequired(rate, "rate");
            return new InvoiceLineCreditUnit(this);
        }
    }

    /**
     * Parse {@code json} as {@code InvoiceLineCreditUnit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static InvoiceLineCreditUnit fromJson(String json) {
        return Utils.parse(json, InvoiceLineCreditUnit.class);
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
