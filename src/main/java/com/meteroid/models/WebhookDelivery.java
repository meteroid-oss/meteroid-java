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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * One event queued for one endpoint, with the state of its retry cycle.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WebhookDelivery {
    @JsonProperty("attempt_count")
    private Integer attemptCount;

    @JsonProperty("completed_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> completedAt = JsonField.missing();

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("endpoint_id")
    private String endpointId;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_error")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> lastError = JsonField.missing();

    @JsonProperty("last_response_status")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> lastResponseStatus = JsonField.missing();

    @JsonProperty("manual")
    private Boolean manual;

    @JsonProperty("message_id")
    private String messageId;

    @JsonProperty("next_attempt_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> nextAttemptAt = JsonField.missing();

    @JsonProperty("status")
    private WebhookDeliveryStatus status;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WebhookDelivery() {}

    private WebhookDelivery(Builder builder) {
        this.attemptCount = builder.attemptCount;
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.endpointId = builder.endpointId;
        this.eventType = builder.eventType;
        this.id = builder.id;
        this.lastError = builder.lastError;
        this.lastResponseStatus = builder.lastResponseStatus;
        this.manual = builder.manual;
        this.messageId = builder.messageId;
        this.nextAttemptAt = builder.nextAttemptAt;
        this.status = builder.status;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WebhookDelivery}.
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
        builder.attemptCount = attemptCount;
        builder.completedAt = completedAt;
        builder.createdAt = createdAt;
        builder.endpointId = endpointId;
        builder.eventType = eventType;
        builder.id = id;
        builder.lastError = lastError;
        builder.lastResponseStatus = lastResponseStatus;
        builder.manual = manual;
        builder.messageId = messageId;
        builder.nextAttemptAt = nextAttemptAt;
        builder.status = status;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code attempt_count} property.
     *
     * @return the value, never null
     */
    public Integer attemptCount() {
        return Utils.required(attemptCount, "attempt_count");
    }

    /**
     * The {@code completed_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> completedAt() {
        return completedAt.asOptional();
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
     * The {@code endpoint_id} property.
     *
     * @return the value, never null
     */
    public String endpointId() {
        return Utils.required(endpointId, "endpoint_id");
    }

    /**
     * The {@code event_type} property.
     *
     * @return the value, never null
     */
    public String eventType() {
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
     * The {@code last_error} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> lastError() {
        return lastError.asOptional();
    }

    /**
     * The {@code last_response_status} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> lastResponseStatus() {
        return lastResponseStatus.asOptional();
    }

    /**
     * True when the delivery was created by a resend or a test event.
     *
     * @return the value, never null
     */
    public Boolean manual() {
        return Utils.required(manual, "manual");
    }

    /**
     * The {@code message_id} property.
     *
     * @return the value, never null
     */
    public String messageId() {
        return Utils.required(messageId, "message_id");
    }

    /**
     * The {@code next_attempt_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> nextAttemptAt() {
        return nextAttemptAt.asOptional();
    }

    /**
     * The {@code status} property.
     *
     * @return the value, never null
     */
    public WebhookDeliveryStatus status() {
        return Utils.required(status, "status");
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
        WebhookDelivery that = (WebhookDelivery) o;
        return Objects.equals(attemptCount, that.attemptCount)
                && Objects.equals(completedAt, that.completedAt)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(endpointId, that.endpointId)
                && Objects.equals(eventType, that.eventType)
                && Objects.equals(id, that.id)
                && Objects.equals(lastError, that.lastError)
                && Objects.equals(lastResponseStatus, that.lastResponseStatus)
                && Objects.equals(manual, that.manual)
                && Objects.equals(messageId, that.messageId)
                && Objects.equals(nextAttemptAt, that.nextAttemptAt)
                && Objects.equals(status, that.status)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attemptCount,
                completedAt,
                createdAt,
                endpointId,
                eventType,
                id,
                lastError,
                lastResponseStatus,
                manual,
                messageId,
                nextAttemptAt,
                status,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WebhookDelivery{"
                + "attemptCount="
                + attemptCount
                + ", completedAt="
                + completedAt
                + ", createdAt="
                + createdAt
                + ", endpointId="
                + endpointId
                + ", eventType="
                + eventType
                + ", id="
                + id
                + ", lastError="
                + lastError
                + ", lastResponseStatus="
                + lastResponseStatus
                + ", manual="
                + manual
                + ", messageId="
                + messageId
                + ", nextAttemptAt="
                + nextAttemptAt
                + ", status="
                + status
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WebhookDelivery}. */
    public static final class Builder {
        private Integer attemptCount;
        private JsonField<OffsetDateTime> completedAt = JsonField.missing();
        private OffsetDateTime createdAt;
        private String endpointId;
        private String eventType;
        private String id;
        private JsonField<String> lastError = JsonField.missing();
        private JsonField<Integer> lastResponseStatus = JsonField.missing();
        private Boolean manual;
        private String messageId;
        private JsonField<OffsetDateTime> nextAttemptAt = JsonField.missing();
        private WebhookDeliveryStatus status;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code attempt_count} property.
         *
         * @param attemptCount the value
         * @return this builder
         */
        public Builder attemptCount(Integer attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        /**
         * The {@code completed_at} property.
         *
         * @param completedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder completedAt(OffsetDateTime completedAt) {
            this.completedAt = JsonField.ofNullable(completedAt);
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
         * The {@code endpoint_id} property.
         *
         * @param endpointId the value
         * @return this builder
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The {@code event_type} property.
         *
         * @param eventType the value
         * @return this builder
         */
        public Builder eventType(String eventType) {
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
         * The {@code last_error} property.
         *
         * @param lastError the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastError(String lastError) {
            this.lastError = JsonField.ofNullable(lastError);
            return this;
        }

        /**
         * The {@code last_response_status} property.
         *
         * @param lastResponseStatus the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastResponseStatus(Integer lastResponseStatus) {
            this.lastResponseStatus = JsonField.ofNullable(lastResponseStatus);
            return this;
        }

        /**
         * True when the delivery was created by a resend or a test event.
         *
         * @param manual the value
         * @return this builder
         */
        public Builder manual(Boolean manual) {
            this.manual = manual;
            return this;
        }

        /**
         * The {@code message_id} property.
         *
         * @param messageId the value
         * @return this builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * The {@code next_attempt_at} property.
         *
         * @param nextAttemptAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder nextAttemptAt(OffsetDateTime nextAttemptAt) {
            this.nextAttemptAt = JsonField.ofNullable(nextAttemptAt);
            return this;
        }

        /**
         * The {@code status} property.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(WebhookDeliveryStatus status) {
            this.status = status;
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
         * The {@code WebhookDelivery}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WebhookDelivery build() {
            Utils.checkRequired(attemptCount, "attempt_count");
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(endpointId, "endpoint_id");
            Utils.checkRequired(eventType, "event_type");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(manual, "manual");
            Utils.checkRequired(messageId, "message_id");
            Utils.checkRequired(status, "status");
            return new WebhookDelivery(this);
        }
    }

    /**
     * Parse {@code json} as {@code WebhookDelivery}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WebhookDelivery fromJson(String json) {
        return Utils.parse(json, WebhookDelivery.class);
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
