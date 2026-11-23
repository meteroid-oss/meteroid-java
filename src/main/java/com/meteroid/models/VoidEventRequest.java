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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class VoidEventRequest {
    @JsonProperty("customer_alias")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> customerAlias = JsonField.missing();

    @JsonProperty("customer_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> customerId = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private VoidEventRequest() {}

    private VoidEventRequest(Builder builder) {
        this.customerAlias = builder.customerAlias;
        this.customerId = builder.customerId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code VoidEventRequest}.
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
        builder.customerAlias = customerAlias;
        builder.customerId = customerId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * External customer alias of the event. Set this or <code>customer_id</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> customerAlias() {
        return customerAlias.asOptional();
    }

    /**
     * Meteroid customer ID of the event. Set this or <code>customer_alias</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> customerId() {
        return customerId.asOptional();
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
        VoidEventRequest that = (VoidEventRequest) o;
        return Objects.equals(customerAlias, that.customerAlias)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerAlias, customerId, additionalProperties);
    }

    @Override
    public String toString() {
        return "VoidEventRequest{"
                + "customerAlias="
                + customerAlias
                + ", customerId="
                + customerId
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link VoidEventRequest}. */
    public static final class Builder {
        private JsonField<String> customerAlias = JsonField.missing();
        private JsonField<String> customerId = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * External customer alias of the event. Set this or <code>customer_id</code>.
         *
         * @param customerAlias the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder customerAlias(String customerAlias) {
            this.customerAlias = JsonField.ofNullable(customerAlias);
            return this;
        }

        /**
         * Meteroid customer ID of the event. Set this or <code>customer_alias</code>.
         *
         * @param customerId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = JsonField.ofNullable(customerId);
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
         * The {@code VoidEventRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public VoidEventRequest build() {
            return new VoidEventRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code VoidEventRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static VoidEventRequest fromJson(String json) {
        return Utils.parse(json, VoidEventRequest.class);
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
