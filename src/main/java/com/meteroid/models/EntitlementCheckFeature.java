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
public final class EntitlementCheckFeature {
    @JsonProperty("code")
    private String code;

    @JsonProperty("id")
    private String id;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private EntitlementCheckFeature() {}

    private EntitlementCheckFeature(Builder builder) {
        this.code = builder.code;
        this.id = builder.id;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code EntitlementCheckFeature}.
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
        builder.id = id;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code code} property.
     *
     * @return the value, never null
     */
    public String code() {
        return Utils.required(code, "code");
    }

    /**
     * The {@code id} property.
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
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
        EntitlementCheckFeature that = (EntitlementCheckFeature) o;
        return Objects.equals(code, that.code)
                && Objects.equals(id, that.id)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, id, additionalProperties);
    }

    @Override
    public String toString() {
        return "EntitlementCheckFeature{"
                + "code="
                + code
                + ", id="
                + id
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link EntitlementCheckFeature}. */
    public static final class Builder {
        private String code;
        private String id;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code code} property.
         *
         * @param code the value
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The {@code id} property.
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
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
         * The {@code EntitlementCheckFeature}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public EntitlementCheckFeature build() {
            Utils.checkRequired(code, "code");
            Utils.checkRequired(id, "id");
            return new EntitlementCheckFeature(this);
        }
    }

    /**
     * Parse {@code json} as {@code EntitlementCheckFeature}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static EntitlementCheckFeature fromJson(String json) {
        return Utils.parse(json, EntitlementCheckFeature.class);
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
