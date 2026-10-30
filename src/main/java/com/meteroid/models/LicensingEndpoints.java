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
 * The public endpoints your installations talk to.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class LicensingEndpoints {
    @JsonProperty("activate_url")
    private String activateUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("jwks_url")
    private String jwksUrl;

    @JsonProperty("refresh_url")
    private String refreshUrl;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private LicensingEndpoints() {}

    private LicensingEndpoints(Builder builder) {
        this.activateUrl = builder.activateUrl;
        this.eventsUrl = builder.eventsUrl;
        this.jwksUrl = builder.jwksUrl;
        this.refreshUrl = builder.refreshUrl;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code LicensingEndpoints}.
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
        builder.activateUrl = activateUrl;
        builder.eventsUrl = eventsUrl;
        builder.jwksUrl = jwksUrl;
        builder.refreshUrl = refreshUrl;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code activate_url} property.
     *
     * @return the value, never null
     */
    public String activateUrl() {
        return Utils.required(activateUrl, "activate_url");
    }

    /**
     * The {@code events_url} property.
     *
     * @return the value, never null
     */
    public String eventsUrl() {
        return Utils.required(eventsUrl, "events_url");
    }

    /**
     * The {@code jwks_url} property.
     *
     * @return the value, never null
     */
    public String jwksUrl() {
        return Utils.required(jwksUrl, "jwks_url");
    }

    /**
     * The {@code refresh_url} property.
     *
     * @return the value, never null
     */
    public String refreshUrl() {
        return Utils.required(refreshUrl, "refresh_url");
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
        LicensingEndpoints that = (LicensingEndpoints) o;
        return Objects.equals(activateUrl, that.activateUrl)
                && Objects.equals(eventsUrl, that.eventsUrl)
                && Objects.equals(jwksUrl, that.jwksUrl)
                && Objects.equals(refreshUrl, that.refreshUrl)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activateUrl, eventsUrl, jwksUrl, refreshUrl, additionalProperties);
    }

    @Override
    public String toString() {
        return "LicensingEndpoints{"
                + "activateUrl="
                + activateUrl
                + ", eventsUrl="
                + eventsUrl
                + ", jwksUrl="
                + jwksUrl
                + ", refreshUrl="
                + refreshUrl
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link LicensingEndpoints}. */
    public static final class Builder {
        private String activateUrl;
        private String eventsUrl;
        private String jwksUrl;
        private String refreshUrl;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code activate_url} property.
         *
         * @param activateUrl the value
         * @return this builder
         */
        public Builder activateUrl(String activateUrl) {
            this.activateUrl = activateUrl;
            return this;
        }

        /**
         * The {@code events_url} property.
         *
         * @param eventsUrl the value
         * @return this builder
         */
        public Builder eventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
            return this;
        }

        /**
         * The {@code jwks_url} property.
         *
         * @param jwksUrl the value
         * @return this builder
         */
        public Builder jwksUrl(String jwksUrl) {
            this.jwksUrl = jwksUrl;
            return this;
        }

        /**
         * The {@code refresh_url} property.
         *
         * @param refreshUrl the value
         * @return this builder
         */
        public Builder refreshUrl(String refreshUrl) {
            this.refreshUrl = refreshUrl;
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
         * The {@code LicensingEndpoints}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public LicensingEndpoints build() {
            Utils.checkRequired(activateUrl, "activate_url");
            Utils.checkRequired(eventsUrl, "events_url");
            Utils.checkRequired(jwksUrl, "jwks_url");
            Utils.checkRequired(refreshUrl, "refresh_url");
            return new LicensingEndpoints(this);
        }
    }

    /**
     * Parse {@code json} as {@code LicensingEndpoints}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static LicensingEndpoints fromJson(String json) {
        return Utils.parse(json, LicensingEndpoints.class);
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
