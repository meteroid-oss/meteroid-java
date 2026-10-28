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
 * Partial update: an absent field is left unchanged. <code>code</code> and <code>precision</code>
 * have no field here, they are immutable. <code>symbol</code> set to <code>null</code> clears it.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditUnitUpdateRequest {
    @JsonProperty("archived")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Boolean> archived = JsonField.missing();

    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> name = JsonField.missing();

    @JsonProperty("plural_name")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> pluralName = JsonField.missing();

    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> productId = JsonField.missing();

    @JsonProperty("symbol")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> symbol = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditUnitUpdateRequest() {}

    private CreditUnitUpdateRequest(Builder builder) {
        this.archived = builder.archived;
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.productId = builder.productId;
        this.symbol = builder.symbol;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditUnitUpdateRequest}.
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
        builder.archived = archived;
        builder.name = name;
        builder.pluralName = pluralName;
        builder.productId = productId;
        builder.symbol = symbol;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Blocks the unit from new prices, packs and grants; existing ones keep working.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Boolean> archived() {
        return archived.asOptional();
    }

    /**
     * Singular display name, 1 to 64 characters.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> name() {
        return name.asOptional();
    }

    /**
     * Plural display name, 1 to 64 characters.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> pluralName() {
        return pluralName.asOptional();
    }

    /**
     * The product sales of the unit are booked under; <code>null</code> clears it, which stops the
     * unit from being sold.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> productId() {
        return productId.asOptional();
    }

    /**
     * Validated by the store (trimmed, at most 8 characters) rather than here: <code>validator
     * </code> has no built-in support for a double <code>Option</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> symbol() {
        return symbol.asOptional();
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
        CreditUnitUpdateRequest that = (CreditUnitUpdateRequest) o;
        return Objects.equals(archived, that.archived)
                && Objects.equals(name, that.name)
                && Objects.equals(pluralName, that.pluralName)
                && Objects.equals(productId, that.productId)
                && Objects.equals(symbol, that.symbol)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archived, name, pluralName, productId, symbol, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditUnitUpdateRequest{"
                + "archived="
                + archived
                + ", name="
                + name
                + ", pluralName="
                + pluralName
                + ", productId="
                + productId
                + ", symbol="
                + symbol
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditUnitUpdateRequest}. */
    public static final class Builder {
        private JsonField<Boolean> archived = JsonField.missing();
        private JsonField<String> name = JsonField.missing();
        private JsonField<String> pluralName = JsonField.missing();
        private JsonField<String> productId = JsonField.missing();
        private JsonField<String> symbol = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Blocks the unit from new prices, packs and grants; existing ones keep working.
         *
         * @param archived the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder archived(Boolean archived) {
            this.archived = JsonField.ofNullable(archived);
            return this;
        }

        /**
         * Singular display name, 1 to 64 characters.
         *
         * @param name the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder name(String name) {
            this.name = JsonField.ofNullable(name);
            return this;
        }

        /**
         * Plural display name, 1 to 64 characters.
         *
         * @param pluralName the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder pluralName(String pluralName) {
            this.pluralName = JsonField.ofNullable(pluralName);
            return this;
        }

        /**
         * The product sales of the unit are booked under; <code>null</code> clears it, which stops
         * the unit from being sold.
         *
         * @param productId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder productId(String productId) {
            this.productId = JsonField.ofNullable(productId);
            return this;
        }

        /**
         * Validated by the store (trimmed, at most 8 characters) rather than here: <code>validator
         * </code> has no built-in support for a double <code>Option</code>.
         *
         * @param symbol the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder symbol(String symbol) {
            this.symbol = JsonField.ofNullable(symbol);
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
         * The {@code CreditUnitUpdateRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditUnitUpdateRequest build() {
            return new CreditUnitUpdateRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditUnitUpdateRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditUnitUpdateRequest fromJson(String json) {
        return Utils.parse(json, CreditUnitUpdateRequest.class);
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
