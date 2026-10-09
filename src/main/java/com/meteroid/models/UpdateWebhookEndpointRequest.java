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
public final class UpdateWebhookEndpointRequest {
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> description = JsonField.missing();

    @JsonProperty("disabled")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Boolean> disabled = JsonField.missing();

    @JsonProperty("event_types")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<String>> eventTypes = JsonField.missing();

    @JsonProperty("headers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<WebhookHeaderInput>> headers = JsonField.missing();

    @JsonProperty("rate_limit_per_sec")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> rateLimitPerSec = JsonField.missing();

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> url = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UpdateWebhookEndpointRequest() {}

    private UpdateWebhookEndpointRequest(Builder builder) {
        this.description = builder.description;
        this.disabled = builder.disabled;
        this.eventTypes = builder.eventTypes.map(Utils::copyList);
        this.headers = builder.headers.map(Utils::copyList);
        this.rateLimitPerSec = builder.rateLimitPerSec;
        this.url = builder.url;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UpdateWebhookEndpointRequest}.
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
        builder.disabled = disabled;
        builder.eventTypes = eventTypes.map(Utils::mutableList);
        builder.headers = headers.map(Utils::mutableList);
        builder.rateLimitPerSec = rateLimitPerSec;
        builder.url = url;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Omit to leave unchanged; send <code>null</code> or an empty string to clear.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> description() {
        return description.asOptional();
    }

    /**
     * Re-enabling an endpoint also resets its consecutive failure count.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Boolean> disabled() {
        return disabled.asOptional();
    }

    /**
     * Replaces the subscription list. An empty array subscribes to every event type.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<String>> eventTypes() {
        return eventTypes.asOptional();
    }

    /**
     * Replaces the custom header list. An empty array removes every header.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<WebhookHeaderInput>> headers() {
        return headers.asOptional();
    }

    /**
     * Omit to leave unchanged; send <code>null</code> to remove the rate limit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> rateLimitPerSec() {
        return rateLimitPerSec.asOptional();
    }

    /**
     * The {@code url} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> url() {
        return url.asOptional();
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
        UpdateWebhookEndpointRequest that = (UpdateWebhookEndpointRequest) o;
        return Objects.equals(description, that.description)
                && Objects.equals(disabled, that.disabled)
                && Objects.equals(eventTypes, that.eventTypes)
                && Objects.equals(headers, that.headers)
                && Objects.equals(rateLimitPerSec, that.rateLimitPerSec)
                && Objects.equals(url, that.url)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                disabled,
                eventTypes,
                headers,
                rateLimitPerSec,
                url,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "UpdateWebhookEndpointRequest{"
                + "description="
                + description
                + ", disabled="
                + disabled
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

    /** Builds {@link UpdateWebhookEndpointRequest}. */
    public static final class Builder {
        private JsonField<String> description = JsonField.missing();
        private JsonField<Boolean> disabled = JsonField.missing();
        private JsonField<List<String>> eventTypes = JsonField.missing();
        private JsonField<List<WebhookHeaderInput>> headers = JsonField.missing();
        private JsonField<Integer> rateLimitPerSec = JsonField.missing();
        private JsonField<String> url = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Omit to leave unchanged; send <code>null</code> or an empty string to clear.
         *
         * @param description the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder description(String description) {
            this.description = JsonField.ofNullable(description);
            return this;
        }

        /**
         * Re-enabling an endpoint also resets its consecutive failure count.
         *
         * @param disabled the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = JsonField.ofNullable(disabled);
            return this;
        }

        /**
         * Replaces the subscription list. An empty array subscribes to every event type.
         *
         * @param eventTypes the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder eventTypes(List<String> eventTypes) {
            this.eventTypes = JsonField.ofNullable(Utils.mutableList(eventTypes));
            return this;
        }

        /**
         * Adds an item to {@code event_types}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addEventTypesItem(String item) {
            List<String> items = this.eventTypes.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.eventTypes = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * Replaces the custom header list. An empty array removes every header.
         *
         * @param headers the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder headers(List<WebhookHeaderInput> headers) {
            this.headers = JsonField.ofNullable(Utils.mutableList(headers));
            return this;
        }

        /**
         * Adds an item to {@code headers}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addHeadersItem(WebhookHeaderInput item) {
            List<WebhookHeaderInput> items = this.headers.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.headers = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * Omit to leave unchanged; send <code>null</code> to remove the rate limit.
         *
         * @param rateLimitPerSec the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder rateLimitPerSec(Integer rateLimitPerSec) {
            this.rateLimitPerSec = JsonField.ofNullable(rateLimitPerSec);
            return this;
        }

        /**
         * The {@code url} property.
         *
         * @param url the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder url(String url) {
            this.url = JsonField.ofNullable(url);
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
         * The {@code UpdateWebhookEndpointRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UpdateWebhookEndpointRequest build() {
            return new UpdateWebhookEndpointRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code UpdateWebhookEndpointRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UpdateWebhookEndpointRequest fromJson(String json) {
        return Utils.parse(json, UpdateWebhookEndpointRequest.class);
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
