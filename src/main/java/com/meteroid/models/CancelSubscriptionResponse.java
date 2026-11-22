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

import java.time.LocalDate;
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
public final class CancelSubscriptionResponse {
    @JsonProperty("pending_events")
    private List<PendingScheduledEvent> pendingEvents;

    @JsonProperty("scheduled_cancellation_date")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<LocalDate> scheduledCancellationDate = JsonField.missing();

    @JsonProperty("subscription")
    private Subscription subscription;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CancelSubscriptionResponse() {}

    private CancelSubscriptionResponse(Builder builder) {
        this.pendingEvents = Utils.copyList(builder.pendingEvents);
        this.scheduledCancellationDate = builder.scheduledCancellationDate;
        this.subscription = builder.subscription;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CancelSubscriptionResponse}.
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
        builder.pendingEvents = Utils.mutableList(pendingEvents);
        builder.scheduledCancellationDate = scheduledCancellationDate;
        builder.subscription = subscription;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Changes still scheduled after this request, including the cancellation.
     *
     * @return the value, never null
     */
    public List<PendingScheduledEvent> pendingEvents() {
        return Utils.required(pendingEvents, "pending_events");
    }

    /**
     * Date the subscription ends at the start of: its first day without service. Empty when the
     * cancellation applied immediately.
     *
     * @return the value, empty when unset or null
     */
    public Optional<LocalDate> scheduledCancellationDate() {
        return scheduledCancellationDate.asOptional();
    }

    /**
     * The {@code subscription} property.
     *
     * @return the value, never null
     */
    public Subscription subscription() {
        return Utils.required(subscription, "subscription");
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
        CancelSubscriptionResponse that = (CancelSubscriptionResponse) o;
        return Objects.equals(pendingEvents, that.pendingEvents)
                && Objects.equals(scheduledCancellationDate, that.scheduledCancellationDate)
                && Objects.equals(subscription, that.subscription)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pendingEvents, scheduledCancellationDate, subscription, additionalProperties);
    }

    @Override
    public String toString() {
        return "CancelSubscriptionResponse{"
                + "pendingEvents="
                + pendingEvents
                + ", scheduledCancellationDate="
                + scheduledCancellationDate
                + ", subscription="
                + subscription
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CancelSubscriptionResponse}. */
    public static final class Builder {
        private List<PendingScheduledEvent> pendingEvents;
        private JsonField<LocalDate> scheduledCancellationDate = JsonField.missing();
        private Subscription subscription;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Changes still scheduled after this request, including the cancellation.
         *
         * @param pendingEvents the value
         * @return this builder
         */
        public Builder pendingEvents(List<PendingScheduledEvent> pendingEvents) {
            this.pendingEvents = Utils.mutableList(pendingEvents);
            return this;
        }

        /**
         * Adds an item to {@code pending_events}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addPendingEventsItem(PendingScheduledEvent item) {
            if (this.pendingEvents == null) {
                this.pendingEvents = new ArrayList<>();
            }
            this.pendingEvents.add(item);
            return this;
        }

        /**
         * Date the subscription ends at the start of: its first day without service. Empty when the
         * cancellation applied immediately.
         *
         * @param scheduledCancellationDate the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder scheduledCancellationDate(LocalDate scheduledCancellationDate) {
            this.scheduledCancellationDate = JsonField.ofNullable(scheduledCancellationDate);
            return this;
        }

        /**
         * The {@code subscription} property.
         *
         * @param subscription the value
         * @return this builder
         */
        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
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
         * The {@code CancelSubscriptionResponse}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CancelSubscriptionResponse build() {
            Utils.checkRequired(pendingEvents, "pending_events");
            Utils.checkRequired(subscription, "subscription");
            return new CancelSubscriptionResponse(this);
        }
    }

    /**
     * Parse {@code json} as {@code CancelSubscriptionResponse}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CancelSubscriptionResponse fromJson(String json) {
        return Utils.parse(json, CancelSubscriptionResponse.class);
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
