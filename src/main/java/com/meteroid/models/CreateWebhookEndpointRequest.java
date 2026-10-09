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

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
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
public final class CreateWebhookEndpointRequest {
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> description = JsonField.missing();

    @JsonProperty("event_types")
    private List<String> eventTypes;

    @JsonProperty("headers")
    private List<WebhookHeaderInput> headers;

    @JsonProperty("rate_limit_per_sec")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> rateLimitPerSec = JsonField.missing();

    @JsonProperty("url")
    private String url;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateWebhookEndpointRequest() {}

    private CreateWebhookEndpointRequest(Builder builder) {
        this.description = builder.description;
        this.eventTypes = Utils.copyList(builder.eventTypes);
        this.headers = Utils.copyList(builder.headers);
        this.rateLimitPerSec = builder.rateLimitPerSec;
        this.url = builder.url;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateWebhookEndpointRequest}.
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
        builder.description = description;
        builder.eventTypes = Utils.mutableList(eventTypes);
        builder.headers = Utils.mutableList(headers);
        builder.rateLimitPerSec = rateLimitPerSec;
        builder.url = url;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code description} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> description() {
        return description.asOptional();
    }

    /**
     * Event types to subscribe to. Omit or leave empty to receive every event type.
     *
     * @return the value, empty when unset
     */
    public Optional<List<String>> eventTypes() {
        return Optional.ofNullable(eventTypes);
    }

    /**
     * Custom headers sent with every delivery.
     *
     * @return the value, empty when unset
     */
    public Optional<List<WebhookHeaderInput>> headers() {
        return Optional.ofNullable(headers);
    }

    /**
     * Deliveries started per second, at most (1 to 1000).
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> rateLimitPerSec() {
        return rateLimitPerSec.asOptional();
    }

    /**
     * HTTPS destination. Private and loopback addresses are rejected unless the instance is
     * configured to allow them.
     *
     * @return the value, never null
     */
    public String url() {
        return Utils.required(url, "url");
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
        CreateWebhookEndpointRequest that = (CreateWebhookEndpointRequest) o;
        return Objects.equals(description, that.description)
                && Objects.equals(eventTypes, that.eventTypes)
                && Objects.equals(headers, that.headers)
                && Objects.equals(rateLimitPerSec, that.rateLimitPerSec)
                && Objects.equals(url, that.url)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description, eventTypes, headers, rateLimitPerSec, url, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateWebhookEndpointRequest{"
                + "description="
                + description
                + ", eventTypes="
                + eventTypes
                + ", headers="
                + headers
                + ", rateLimitPerSec="
                + rateLimitPerSec
                + ", url="
                + url
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateWebhookEndpointRequest}. */
    public static final class Builder {
        private JsonField<String> description = JsonField.missing();
        private List<String> eventTypes;
        private List<WebhookHeaderInput> headers;
        private JsonField<Integer> rateLimitPerSec = JsonField.missing();
        private String url;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code description} property.
         *
         * @param description the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder description(String description) {
            this.description = JsonField.ofNullable(description);
            return this;
        }

        /**
         * Event types to subscribe to. Omit or leave empty to receive every event type.
         *
         * @param eventTypes the value
         * @return this builder
         */
        public Builder eventTypes(List<String> eventTypes) {
            this.eventTypes = Utils.mutableList(eventTypes);
            return this;
        }

        /**
         * Adds an item to {@code event_types}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addEventTypesItem(String item) {
            if (this.eventTypes == null) {
                this.eventTypes = new ArrayList<>();
            }
            this.eventTypes.add(item);
            return this;
        }

        /**
         * Custom headers sent with every delivery.
         *
         * @param headers the value
         * @return this builder
         */
        public Builder headers(List<WebhookHeaderInput> headers) {
            this.headers = Utils.mutableList(headers);
            return this;
        }

        /**
         * Adds an item to {@code headers}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addHeadersItem(WebhookHeaderInput item) {
            if (this.headers == null) {
                this.headers = new ArrayList<>();
            }
            this.headers.add(item);
            return this;
        }

        /**
         * Deliveries started per second, at most (1 to 1000).
         *
         * @param rateLimitPerSec the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder rateLimitPerSec(Integer rateLimitPerSec) {
            this.rateLimitPerSec = JsonField.ofNullable(rateLimitPerSec);
            return this;
        }

        /**
         * HTTPS destination. Private and loopback addresses are rejected unless the instance is
         * configured to allow them.
         *
         * @param url the value
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * The {@code CreateWebhookEndpointRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateWebhookEndpointRequest build() {
            Utils.checkRequired(url, "url");
            return new CreateWebhookEndpointRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateWebhookEndpointRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateWebhookEndpointRequest fromJson(String json) {
        return Utils.parse(json, CreateWebhookEndpointRequest.class);
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
