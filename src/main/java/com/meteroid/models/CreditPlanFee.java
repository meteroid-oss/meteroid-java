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
 * Credit pack: charged <code>unit_price</code> × <code>quantity</code> in advance each billing
 * period, it grants <code>credit_amount</code> × <code>quantity</code> of credit, in the plan
 * currency or in <code>credit_unit_id</code>, once paid. A zero <code>unit_price</code> makes it
 * credit included with the plan (promotional). A currency pack priced below its credit (e.g. 500.00
 * buys 550.00) grants the price paid as paid credit and the difference as promotional bonus credit,
 * which applies before tax.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditPlanFee {
    @JsonProperty("cadence")
    private BillingPeriodEnum cadence;

    @JsonProperty("credit_amount")
    private BigDecimal creditAmount;

    @JsonProperty("credit_unit_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnitId = JsonField.missing();

    @JsonProperty("expiry")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<CreditPackExpiry> expiry = JsonField.missing();

    @JsonProperty("once")
    private Boolean once;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("rollover")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<CreditPackRollover> rollover = JsonField.missing();

    @JsonProperty("type")
    private String type = "CREDIT";

    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditPlanFee() {}

    private CreditPlanFee(Builder builder) {
        this.cadence = builder.cadence;
        this.creditAmount = builder.creditAmount;
        this.creditUnitId = builder.creditUnitId;
        this.expiry = builder.expiry;
        this.once = builder.once;
        this.quantity = builder.quantity;
        this.rollover = builder.rollover;
        this.type = builder.type;
        this.unitPrice = builder.unitPrice;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditPlanFee}.
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
        builder.cadence = cadence;
        builder.creditAmount = creditAmount;
        builder.creditUnitId = creditUnitId;
        builder.expiry = expiry;
        builder.once = once;
        builder.quantity = quantity;
        builder.rollover = rollover;
        builder.type = type;
        builder.unitPrice = unitPrice;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code cadence} property.
     *
     * @return the value, never null
     */
    public BillingPeriodEnum cadence() {
        return Utils.required(cadence, "cadence");
    }

    /**
     * The {@code credit_amount} property.
     *
     * @return the value, never null
     */
    public BigDecimal creditAmount() {
        return Utils.required(creditAmount, "credit_amount");
    }

    /**
     * The credit unit <code>credit_amount</code> is granted in; absent grants the plan currency.
     * The pack is paid in the plan currency, and taxed when sold if it grants a credit unit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnitId() {
        return creditUnitId.asOptional();
    }

    /**
     * The {@code expiry} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<CreditPackExpiry> expiry() {
        return expiry.asOptional();
    }

    /**
     * When true, the pack is billed and its credit granted once, on the subscription's first
     * invoice, instead of every period (e.g. a welcome credit). A plan change grants it on the next
     * invoice only if the subscription never received a one-time credit of the same product; credit
     * packs billed every period don't count. Cannot be combined with <code>rollover</code>.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> once() {
        return Optional.ofNullable(once);
    }

    /**
     * The {@code quantity} property.
     *
     * @return the value, never null
     */
    public Integer quantity() {
        return Utils.required(quantity, "quantity");
    }

    /**
     * The {@code rollover} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<CreditPackRollover> rollover() {
        return rollover.asOptional();
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
     * The {@code unit_price} property.
     *
     * @return the value, never null
     */
    public BigDecimal unitPrice() {
        return Utils.required(unitPrice, "unit_price");
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
        CreditPlanFee that = (CreditPlanFee) o;
        return Objects.equals(cadence, that.cadence)
                && Objects.equals(creditAmount, that.creditAmount)
                && Objects.equals(creditUnitId, that.creditUnitId)
                && Objects.equals(expiry, that.expiry)
                && Objects.equals(once, that.once)
                && Objects.equals(quantity, that.quantity)
                && Objects.equals(rollover, that.rollover)
                && Objects.equals(type, that.type)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cadence,
                creditAmount,
                creditUnitId,
                expiry,
                once,
                quantity,
                rollover,
                type,
                unitPrice,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditPlanFee{"
                + "cadence="
                + cadence
                + ", creditAmount="
                + creditAmount
                + ", creditUnitId="
                + creditUnitId
                + ", expiry="
                + expiry
                + ", once="
                + once
                + ", quantity="
                + quantity
                + ", rollover="
                + rollover
                + ", type="
                + type
                + ", unitPrice="
                + unitPrice
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditPlanFee}. */
    public static final class Builder {
        private BillingPeriodEnum cadence;
        private BigDecimal creditAmount;
        private JsonField<String> creditUnitId = JsonField.missing();
        private JsonField<CreditPackExpiry> expiry = JsonField.missing();
        private Boolean once;
        private Integer quantity;
        private JsonField<CreditPackRollover> rollover = JsonField.missing();
        private String type = "CREDIT";
        private BigDecimal unitPrice;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code cadence} property.
         *
         * @param cadence the value
         * @return this builder
         */
        public Builder cadence(BillingPeriodEnum cadence) {
            this.cadence = cadence;
            return this;
        }

        /**
         * The {@code credit_amount} property.
         *
         * @param creditAmount the value
         * @return this builder
         */
        public Builder creditAmount(BigDecimal creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * The credit unit <code>credit_amount</code> is granted in; absent grants the plan
         * currency. The pack is paid in the plan currency, and taxed when sold if it grants a
         * credit unit.
         *
         * @param creditUnitId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnitId(String creditUnitId) {
            this.creditUnitId = JsonField.ofNullable(creditUnitId);
            return this;
        }

        /**
         * The {@code expiry} property.
         *
         * @param expiry the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder expiry(CreditPackExpiry expiry) {
            this.expiry = JsonField.ofNullable(expiry);
            return this;
        }

        /**
         * When true, the pack is billed and its credit granted once, on the subscription's first
         * invoice, instead of every period (e.g. a welcome credit). A plan change grants it on the
         * next invoice only if the subscription never received a one-time credit of the same
         * product; credit packs billed every period don't count. Cannot be combined with <code>
         * rollover</code>.
         *
         * @param once the value
         * @return this builder
         */
        public Builder once(Boolean once) {
            this.once = once;
            return this;
        }

        /**
         * The {@code quantity} property.
         *
         * @param quantity the value
         * @return this builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * The {@code rollover} property.
         *
         * @param rollover the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder rollover(CreditPackRollover rollover) {
            this.rollover = JsonField.ofNullable(rollover);
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
         * The {@code unit_price} property.
         *
         * @param unitPrice the value
         * @return this builder
         */
        public Builder unitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
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
         * The {@code CreditPlanFee}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditPlanFee build() {
            Utils.checkRequired(cadence, "cadence");
            Utils.checkRequired(creditAmount, "credit_amount");
            Utils.checkRequired(quantity, "quantity");
            Utils.checkRequired(type, "type");
            Utils.checkRequired(unitPrice, "unit_price");
            return new CreditPlanFee(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditPlanFee}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditPlanFee fromJson(String json) {
        return Utils.parse(json, CreditPlanFee.class);
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
