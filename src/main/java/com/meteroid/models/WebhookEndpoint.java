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

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A destination Meteroid POSTs signed event payloads to.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WebhookEndpoint {
    @JsonProperty("consecutive_failures")
    private Integer consecutiveFailures;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> description = JsonField.missing();

    @JsonProperty("disabled")
    private Boolean disabled;

    @JsonProperty("disabled_reason")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<WebhookEndpointDisabledReason> disabledReason = JsonField.missing();

    @JsonProperty("event_types")
    private List<String> eventTypes;

    @JsonProperty("headers")
    private List<WebhookHeader> headers;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_failure_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> lastFailureAt = JsonField.missing();

    @JsonProperty("last_success_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> lastSuccessAt = JsonField.missing();

    @JsonProperty("max_in_flight")
    private Integer maxInFlight;

    @JsonProperty("needs_setup")
    private Boolean needsSetup;

    @JsonProperty("paused_until")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> pausedUntil = JsonField.missing();

    @JsonProperty("rate_limit_per_sec")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> rateLimitPerSec = JsonField.missing();

    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> updatedAt = JsonField.missing();

    @JsonProperty("url")
    private String url;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WebhookEndpoint() {}

    private WebhookEndpoint(Builder builder) {
        this.consecutiveFailures = builder.consecutiveFailures;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.disabled = builder.disabled;
        this.disabledReason = builder.disabledReason;
        this.eventTypes = Utils.copyList(builder.eventTypes);
        this.headers = Utils.copyList(builder.headers);
        this.id = builder.id;
        this.lastFailureAt = builder.lastFailureAt;
        this.lastSuccessAt = builder.lastSuccessAt;
        this.maxInFlight = builder.maxInFlight;
        this.needsSetup = builder.needsSetup;
        this.pausedUntil = builder.pausedUntil;
        this.rateLimitPerSec = builder.rateLimitPerSec;
        this.updatedAt = builder.updatedAt;
        this.url = builder.url;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WebhookEndpoint}.
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
        builder.consecutiveFailures = consecutiveFailures;
        builder.createdAt = createdAt;
        builder.description = description;
        builder.disabled = disabled;
        builder.disabledReason = disabledReason;
        builder.eventTypes = Utils.mutableList(eventTypes);
        builder.headers = Utils.mutableList(headers);
        builder.id = id;
        builder.lastFailureAt = lastFailureAt;
        builder.lastSuccessAt = lastSuccessAt;
        builder.maxInFlight = maxInFlight;
        builder.needsSetup = needsSetup;
        builder.pausedUntil = pausedUntil;
        builder.rateLimitPerSec = rateLimitPerSec;
        builder.updatedAt = updatedAt;
        builder.url = url;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Failures since the last success, reset to 0 on any 2xx.
     *
     * @return the value, never null
     */
    public Integer consecutiveFailures() {
        return Utils.required(consecutiveFailures, "consecutive_failures");
    }

    /**
     * The {@code created_at} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime createdAt() {
        return Utils.required(createdAt, "created_at");
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
     * The {@code disabled} property.
     *
     * @return the value, never null
     */
    public Boolean disabled() {
        return Utils.required(disabled, "disabled");
    }

    /**
     * The {@code disabled_reason} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<WebhookEndpointDisabledReason> disabledReason() {
        return disabledReason.asOptional();
    }

    /**
     * Subscribed event types. Empty means every event type.
     *
     * @return the value, never null
     */
    public List<String> eventTypes() {
        return Utils.required(eventTypes, "event_types");
    }

    /**
     * Custom headers sent with every delivery.
     *
     * @return the value, never null
     */
    public List<WebhookHeader> headers() {
        return Utils.required(headers, "headers");
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
     * The {@code last_failure_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> lastFailureAt() {
        return lastFailureAt.asOptional();
    }

    /**
     * The {@code last_success_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> lastSuccessAt() {
        return lastSuccessAt.asOptional();
    }

    /**
     * How many deliveries this endpoint may have in flight at once. Read-only; it is set from the
     * tenant's environment when the endpoint is created.
     *
     * @return the value, never null
     */
    public Integer maxInFlight() {
        return Utils.required(maxInFlight, "max_in_flight");
    }

    /**
     * A sensitive header still waits for its value; the endpoint cannot be enabled until it is set.
     *
     * @return the value, never null
     */
    public Boolean needsSetup() {
        return Utils.required(needsSetup, "needs_setup");
    }

    /**
     * The endpoint was unreachable several times in a row: nothing is sent before this time, then
     * it is retried one delivery at a time until it answers again.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> pausedUntil() {
        return pausedUntil.asOptional();
    }

    /**
     * Deliveries started per second, at most.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> rateLimitPerSec() {
        return rateLimitPerSec.asOptional();
    }

    /**
     * The {@code updated_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt.asOptional();
    }

    /**
     * The {@code url} property.
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
        WebhookEndpoint that = (WebhookEndpoint) o;
        return Objects.equals(consecutiveFailures, that.consecutiveFailures)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(description, that.description)
                && Objects.equals(disabled, that.disabled)
                && Objects.equals(disabledReason, that.disabledReason)
                && Objects.equals(eventTypes, that.eventTypes)
                && Objects.equals(headers, that.headers)
                && Objects.equals(id, that.id)
                && Objects.equals(lastFailureAt, that.lastFailureAt)
                && Objects.equals(lastSuccessAt, that.lastSuccessAt)
                && Objects.equals(maxInFlight, that.maxInFlight)
                && Objects.equals(needsSetup, that.needsSetup)
                && Objects.equals(pausedUntil, that.pausedUntil)
                && Objects.equals(rateLimitPerSec, that.rateLimitPerSec)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                consecutiveFailures,
                createdAt,
                description,
                disabled,
                disabledReason,
                eventTypes,
                headers,
                id,
                lastFailureAt,
                lastSuccessAt,
                maxInFlight,
                needsSetup,
                pausedUntil,
                rateLimitPerSec,
                updatedAt,
                url,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WebhookEndpoint{"
                + "consecutiveFailures="
                + consecutiveFailures
                + ", createdAt="
                + createdAt
                + ", description="
                + description
                + ", disabled="
                + disabled
                + ", disabledReason="
                + disabledReason
                + ", eventTypes="
                + eventTypes
                + ", headers="
                + headers
                + ", id="
                + id
                + ", lastFailureAt="
                + lastFailureAt
                + ", lastSuccessAt="
                + lastSuccessAt
                + ", maxInFlight="
                + maxInFlight
                + ", needsSetup="
                + needsSetup
                + ", pausedUntil="
                + pausedUntil
                + ", rateLimitPerSec="
                + rateLimitPerSec
                + ", updatedAt="
                + updatedAt
                + ", url="
                + url
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WebhookEndpoint}. */
    public static final class Builder {
        private Integer consecutiveFailures;
        private OffsetDateTime createdAt;
        private JsonField<String> description = JsonField.missing();
        private Boolean disabled;
        private JsonField<WebhookEndpointDisabledReason> disabledReason = JsonField.missing();
        private List<String> eventTypes;
        private List<WebhookHeader> headers;
        private String id;
        private JsonField<OffsetDateTime> lastFailureAt = JsonField.missing();
        private JsonField<OffsetDateTime> lastSuccessAt = JsonField.missing();
        private Integer maxInFlight;
        private Boolean needsSetup;
        private JsonField<OffsetDateTime> pausedUntil = JsonField.missing();
        private JsonField<Integer> rateLimitPerSec = JsonField.missing();
        private JsonField<OffsetDateTime> updatedAt = JsonField.missing();
        private String url;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Failures since the last success, reset to 0 on any 2xx.
         *
         * @param consecutiveFailures the value
         * @return this builder
         */
        public Builder consecutiveFailures(Integer consecutiveFailures) {
            this.consecutiveFailures = consecutiveFailures;
            return this;
        }

        /**
         * The {@code created_at} property.
         *
         * @param createdAt the value
         * @return this builder
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

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
         * The {@code disabled} property.
         *
         * @param disabled the value
         * @return this builder
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * The {@code disabled_reason} property.
         *
         * @param disabledReason the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder disabledReason(WebhookEndpointDisabledReason disabledReason) {
            this.disabledReason = JsonField.ofNullable(disabledReason);
            return this;
        }

        /**
         * Subscribed event types. Empty means every event type.
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
        public Builder headers(List<WebhookHeader> headers) {
            this.headers = Utils.mutableList(headers);
            return this;
        }

        /**
         * Adds an item to {@code headers}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addHeadersItem(WebhookHeader item) {
            if (this.headers == null) {
                this.headers = new ArrayList<>();
            }
            this.headers.add(item);
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
         * The {@code last_failure_at} property.
         *
         * @param lastFailureAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastFailureAt(OffsetDateTime lastFailureAt) {
            this.lastFailureAt = JsonField.ofNullable(lastFailureAt);
            return this;
        }

        /**
         * The {@code last_success_at} property.
         *
         * @param lastSuccessAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastSuccessAt(OffsetDateTime lastSuccessAt) {
            this.lastSuccessAt = JsonField.ofNullable(lastSuccessAt);
            return this;
        }

        /**
         * How many deliveries this endpoint may have in flight at once. Read-only; it is set from
         * the tenant's environment when the endpoint is created.
         *
         * @param maxInFlight the value
         * @return this builder
         */
        public Builder maxInFlight(Integer maxInFlight) {
            this.maxInFlight = maxInFlight;
            return this;
        }

        /**
         * A sensitive header still waits for its value; the endpoint cannot be enabled until it is
         * set.
         *
         * @param needsSetup the value
         * @return this builder
         */
        public Builder needsSetup(Boolean needsSetup) {
            this.needsSetup = needsSetup;
            return this;
        }

        /**
         * The endpoint was unreachable several times in a row: nothing is sent before this time,
         * then it is retried one delivery at a time until it answers again.
         *
         * @param pausedUntil the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder pausedUntil(OffsetDateTime pausedUntil) {
            this.pausedUntil = JsonField.ofNullable(pausedUntil);
            return this;
        }

        /**
         * Deliveries started per second, at most.
         *
         * @param rateLimitPerSec the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder rateLimitPerSec(Integer rateLimitPerSec) {
            this.rateLimitPerSec = JsonField.ofNullable(rateLimitPerSec);
            return this;
        }

        /**
         * The {@code updated_at} property.
         *
         * @param updatedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = JsonField.ofNullable(updatedAt);
            return this;
        }

        /**
         * The {@code url} property.
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
         * The {@code WebhookEndpoint}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WebhookEndpoint build() {
            Utils.checkRequired(consecutiveFailures, "consecutive_failures");
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(disabled, "disabled");
            Utils.checkRequired(eventTypes, "event_types");
            Utils.checkRequired(headers, "headers");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(maxInFlight, "max_in_flight");
            Utils.checkRequired(needsSetup, "needs_setup");
            Utils.checkRequired(url, "url");
            return new WebhookEndpoint(this);
        }
    }

    /**
     * Parse {@code json} as {@code WebhookEndpoint}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WebhookEndpoint fromJson(String json) {
        return Utils.parse(json, WebhookEndpoint.class);
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
