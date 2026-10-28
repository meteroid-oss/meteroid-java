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
 * How long funded credit stays spendable. BILLING_PERIOD takes value 1.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditPackExpiry {
    @JsonProperty("unit")
    private CreditExpiryUnit unit;

    @JsonProperty("value")
    private Integer value;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditPackExpiry() {}

    private CreditPackExpiry(Builder builder) {
        this.unit = builder.unit;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditPackExpiry}.
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
        builder.unit = unit;
        builder.value = value;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * DAY, MONTH or BILLING_PERIOD.
     *
     * @return the value, never null
     */
    public CreditExpiryUnit unit() {
        return Utils.required(unit, "unit");
    }

    /**
     * How many days or months; 1 for BILLING_PERIOD.
     *
     * @return the value, never null
     */
    public Integer value() {
        return Utils.required(value, "value");
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
        CreditPackExpiry that = (CreditPackExpiry) o;
        return Objects.equals(unit, that.unit)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditPackExpiry{"
                + "unit="
                + unit
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditPackExpiry}. */
    public static final class Builder {
        private CreditExpiryUnit unit;
        private Integer value;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * DAY, MONTH or BILLING_PERIOD.
         *
         * @param unit the value
         * @return this builder
         */
        public Builder unit(CreditExpiryUnit unit) {
            this.unit = unit;
            return this;
        }

        /**
         * How many days or months; 1 for BILLING_PERIOD.
         *
         * @param value the value
         * @return this builder
         */
        public Builder value(Integer value) {
            this.value = value;
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
         * The {@code CreditPackExpiry}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditPackExpiry build() {
            Utils.checkRequired(unit, "unit");
            Utils.checkRequired(value, "value");
            return new CreditPackExpiry(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditPackExpiry}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditPackExpiry fromJson(String json) {
        return Utils.parse(json, CreditPackExpiry.class);
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
