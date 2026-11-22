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
public final class PendingScheduledEvent {
    @JsonProperty("cancel_reason")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> cancelReason = JsonField.missing();

    @JsonProperty("customer_initiated")
    private Boolean customerInitiated;

    @JsonProperty("event_type")
    private ScheduledEventType eventType;

    @JsonProperty("id")
    private String id;

    @JsonProperty("new_plan_name")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> newPlanName = JsonField.missing();

    @JsonProperty("new_plan_version_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> newPlanVersionId = JsonField.missing();

    @JsonProperty("scheduled_date")
    private LocalDate scheduledDate;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private PendingScheduledEvent() {}

    private PendingScheduledEvent(Builder builder) {
        this.cancelReason = builder.cancelReason;
        this.customerInitiated = builder.customerInitiated;
        this.eventType = builder.eventType;
        this.id = builder.id;
        this.newPlanName = builder.newPlanName;
        this.newPlanVersionId = builder.newPlanVersionId;
        this.scheduledDate = builder.scheduledDate;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code PendingScheduledEvent}.
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
        builder.cancelReason = cancelReason;
        builder.customerInitiated = customerInitiated;
        builder.eventType = eventType;
        builder.id = id;
        builder.newPlanName = newPlanName;
        builder.newPlanVersionId = newPlanVersionId;
        builder.scheduledDate = scheduledDate;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code cancel_reason} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> cancelReason() {
        return cancelReason.asOptional();
    }

    /**
     * The {@code customer_initiated} property.
     *
     * @return the value, never null
     */
    public Boolean customerInitiated() {
        return Utils.required(customerInitiated, "customer_initiated");
    }

    /**
     * The {@code event_type} property.
     *
     * @return the value, never null
     */
    public ScheduledEventType eventType() {
        return Utils.required(eventType, "event_type");
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
     * The {@code new_plan_name} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> newPlanName() {
        return newPlanName.asOptional();
    }

    /**
     * The {@code new_plan_version_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> newPlanVersionId() {
        return newPlanVersionId.asOptional();
    }

    /**
     * Date the event takes effect at the start of
     *
     * @return the value, never null
     */
    public LocalDate scheduledDate() {
        return Utils.required(scheduledDate, "scheduled_date");
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
        PendingScheduledEvent that = (PendingScheduledEvent) o;
        return Objects.equals(cancelReason, that.cancelReason)
                && Objects.equals(customerInitiated, that.customerInitiated)
                && Objects.equals(eventType, that.eventType)
                && Objects.equals(id, that.id)
                && Objects.equals(newPlanName, that.newPlanName)
                && Objects.equals(newPlanVersionId, that.newPlanVersionId)
                && Objects.equals(scheduledDate, that.scheduledDate)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cancelReason,
                customerInitiated,
                eventType,
                id,
                newPlanName,
                newPlanVersionId,
                scheduledDate,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "PendingScheduledEvent{"
                + "cancelReason="
                + cancelReason
                + ", customerInitiated="
                + customerInitiated
                + ", eventType="
                + eventType
                + ", id="
                + id
                + ", newPlanName="
                + newPlanName
                + ", newPlanVersionId="
                + newPlanVersionId
                + ", scheduledDate="
                + scheduledDate
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link PendingScheduledEvent}. */
    public static final class Builder {
        private JsonField<String> cancelReason = JsonField.missing();
        private Boolean customerInitiated;
        private ScheduledEventType eventType;
        private String id;
        private JsonField<String> newPlanName = JsonField.missing();
        private JsonField<String> newPlanVersionId = JsonField.missing();
        private LocalDate scheduledDate;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code cancel_reason} property.
         *
         * @param cancelReason the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder cancelReason(String cancelReason) {
            this.cancelReason = JsonField.ofNullable(cancelReason);
            return this;
        }

        /**
         * The {@code customer_initiated} property.
         *
         * @param customerInitiated the value
         * @return this builder
         */
        public Builder customerInitiated(Boolean customerInitiated) {
            this.customerInitiated = customerInitiated;
            return this;
        }

        /**
         * The {@code event_type} property.
         *
         * @param eventType the value
         * @return this builder
         */
        public Builder eventType(ScheduledEventType eventType) {
            this.eventType = eventType;
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
         * The {@code new_plan_name} property.
         *
         * @param newPlanName the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder newPlanName(String newPlanName) {
            this.newPlanName = JsonField.ofNullable(newPlanName);
            return this;
        }

        /**
         * The {@code new_plan_version_id} property.
         *
         * @param newPlanVersionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder newPlanVersionId(String newPlanVersionId) {
            this.newPlanVersionId = JsonField.ofNullable(newPlanVersionId);
            return this;
        }

        /**
         * Date the event takes effect at the start of
         *
         * @param scheduledDate the value
         * @return this builder
         */
        public Builder scheduledDate(LocalDate scheduledDate) {
            this.scheduledDate = scheduledDate;
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
         * The {@code PendingScheduledEvent}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public PendingScheduledEvent build() {
            Utils.checkRequired(customerInitiated, "customer_initiated");
            Utils.checkRequired(eventType, "event_type");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(scheduledDate, "scheduled_date");
            return new PendingScheduledEvent(this);
        }
    }

    /**
     * Parse {@code json} as {@code PendingScheduledEvent}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static PendingScheduledEvent fromJson(String json) {
        return Utils.parse(json, PendingScheduledEvent.class);
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
