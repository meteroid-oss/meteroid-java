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
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The credit unit a credit pack grants.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditPackUnit {
    @JsonProperty("code")
    private String code;

    @JsonProperty("credit_unit_id")
    private String creditUnitId;

    @JsonProperty("precision")
    private Integer precision;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditPackUnit() {}

    private CreditPackUnit(Builder builder) {
        this.code = builder.code;
        this.creditUnitId = builder.creditUnitId;
        this.precision = builder.precision;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditPackUnit}.
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
        builder.creditUnitId = creditUnitId;
        builder.precision = precision;
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
     * The credit unit's id (<code>cun_…</code>).
     *
     * @return the value, never null
     */
    public String creditUnitId() {
        return Utils.required(creditUnitId, "credit_unit_id");
    }

    /**
     * Decimal places of the unit: credit balances and ledger amounts in it are integers of
     * 10^-precision credit.
     *
     * @return the value, never null
     */
    public Integer precision() {
        return Utils.required(precision, "precision");
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
        CreditPackUnit that = (CreditPackUnit) o;
        return Objects.equals(code, that.code)
                && Objects.equals(creditUnitId, that.creditUnitId)
                && Objects.equals(precision, that.precision)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, creditUnitId, precision, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditPackUnit{"
                + "code="
                + code
                + ", creditUnitId="
                + creditUnitId
                + ", precision="
                + precision
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditPackUnit}. */
    public static final class Builder {
        private String code;
        private String creditUnitId;
        private Integer precision;
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
         * The credit unit's id (<code>cun_…</code>).
         *
         * @param creditUnitId the value
         * @return this builder
         */
        public Builder creditUnitId(String creditUnitId) {
            this.creditUnitId = creditUnitId;
            return this;
        }

        /**
         * Decimal places of the unit: credit balances and ledger amounts in it are integers of
         * 10^-precision credit.
         *
         * @param precision the value
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
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
         * The {@code CreditPackUnit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditPackUnit build() {
            Utils.checkRequired(code, "code");
            Utils.checkRequired(creditUnitId, "credit_unit_id");
            Utils.checkRequired(precision, "precision");
            return new CreditPackUnit(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditPackUnit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditPackUnit fromJson(String json) {
        return Utils.parse(json, CreditPackUnit.class);
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
