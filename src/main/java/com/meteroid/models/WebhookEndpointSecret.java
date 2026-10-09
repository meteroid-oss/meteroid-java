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
public final class WebhookEndpointSecret {
    @JsonProperty("secret")
    private String secret;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WebhookEndpointSecret() {}

    private WebhookEndpointSecret(Builder builder) {
        this.secret = builder.secret;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WebhookEndpointSecret}.
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
        builder.secret = secret;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code secret} property.
     *
     * @return the value, never null
     */
    public String secret() {
        return Utils.required(secret, "secret");
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
        WebhookEndpointSecret that = (WebhookEndpointSecret) o;
        return Objects.equals(secret, that.secret)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret, additionalProperties);
    }

    @Override
    public String toString() {
        return "WebhookEndpointSecret{"
                + "secret="
                + secret
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WebhookEndpointSecret}. */
    public static final class Builder {
        private String secret;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code secret} property.
         *
         * @param secret the value
         * @return this builder
         */
        public Builder secret(String secret) {
            this.secret = secret;
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
         * The {@code WebhookEndpointSecret}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WebhookEndpointSecret build() {
            Utils.checkRequired(secret, "secret");
            return new WebhookEndpointSecret(this);
        }
    }

    /**
     * Parse {@code json} as {@code WebhookEndpointSecret}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WebhookEndpointSecret fromJson(String json) {
        return Utils.parse(json, WebhookEndpointSecret.class);
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
