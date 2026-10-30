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

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class LicenseSigningKeysResponse {
    @JsonProperty("endpoints")
    private LicensingEndpoints endpoints;

    @JsonProperty("keys")
    private List<LicenseSigningKey> keys;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private LicenseSigningKeysResponse() {}

    private LicenseSigningKeysResponse(Builder builder) {
        this.endpoints = builder.endpoints;
        this.keys = Utils.copyList(builder.keys);
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code LicenseSigningKeysResponse}.
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
        builder.endpoints = endpoints;
        builder.keys = Utils.mutableList(keys);
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code endpoints} property.
     *
     * @return the value, never null
     */
    public LicensingEndpoints endpoints() {
        return Utils.required(endpoints, "endpoints");
    }

    /**
     * Active key first. The first key is created on first issue.
     *
     * @return the value, never null
     */
    public List<LicenseSigningKey> keys() {
        return Utils.required(keys, "keys");
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
        LicenseSigningKeysResponse that = (LicenseSigningKeysResponse) o;
        return Objects.equals(endpoints, that.endpoints)
                && Objects.equals(keys, that.keys)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints, keys, additionalProperties);
    }

    @Override
    public String toString() {
        return "LicenseSigningKeysResponse{"
                + "endpoints="
                + endpoints
                + ", keys="
                + keys
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link LicenseSigningKeysResponse}. */
    public static final class Builder {
        private LicensingEndpoints endpoints;
        private List<LicenseSigningKey> keys;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code endpoints} property.
         *
         * @param endpoints the value
         * @return this builder
         */
        public Builder endpoints(LicensingEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Active key first. The first key is created on first issue.
         *
         * @param keys the value
         * @return this builder
         */
        public Builder keys(List<LicenseSigningKey> keys) {
            this.keys = Utils.mutableList(keys);
            return this;
        }

        /**
         * Adds an item to {@code keys}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addKeysItem(LicenseSigningKey item) {
            if (this.keys == null) {
                this.keys = new ArrayList<>();
            }
            this.keys.add(item);
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
         * The {@code LicenseSigningKeysResponse}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public LicenseSigningKeysResponse build() {
            Utils.checkRequired(endpoints, "endpoints");
            Utils.checkRequired(keys, "keys");
            return new LicenseSigningKeysResponse(this);
        }
    }

    /**
     * Parse {@code json} as {@code LicenseSigningKeysResponse}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static LicenseSigningKeysResponse fromJson(String json) {
        return Utils.parse(json, LicenseSigningKeysResponse.class);
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
