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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class ExternalPaymentMethodConfig {
    @JsonProperty("type")
    private String type = "external";

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private ExternalPaymentMethodConfig() {}

    private ExternalPaymentMethodConfig(Builder builder) {
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code ExternalPaymentMethodConfig}.
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
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
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
        ExternalPaymentMethodConfig that = (ExternalPaymentMethodConfig) o;
        return Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, additionalProperties);
    }

    @Override
    public String toString() {
        return "ExternalPaymentMethodConfig{"
                + "type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link ExternalPaymentMethodConfig}. */
    public static final class Builder {
        private String type = "external";
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

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
         * The {@code ExternalPaymentMethodConfig}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public ExternalPaymentMethodConfig build() {
            Utils.checkRequired(type, "type");
            return new ExternalPaymentMethodConfig(this);
        }
    }

    /**
     * Parse {@code json} as {@code ExternalPaymentMethodConfig}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static ExternalPaymentMethodConfig fromJson(String json) {
        return Utils.parse(json, ExternalPaymentMethodConfig.class);
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
