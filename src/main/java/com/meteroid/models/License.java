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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class License {
    @JsonProperty("auto_issued")
    private Boolean autoIssued;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("has_activation_code")
    private Boolean hasActivationCode;

    @JsonProperty("id")
    private String id;

    @JsonProperty("instance_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> instanceId = JsonField.missing();

    @JsonProperty("last_refreshed_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> lastRefreshedAt = JsonField.missing();

    @JsonProperty("offline")
    private Boolean offline;

    @JsonProperty("plan_name")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> planName = JsonField.missing();

    @JsonProperty("revoked_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> revokedAt = JsonField.missing();

    @JsonProperty("revoked_immediately")
    private Boolean revokedImmediately;

    @JsonProperty("status")
    private LicenseStatus status;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("validity_days")
    private Integer validityDays;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private License() {}

    private License(Builder builder) {
        this.autoIssued = builder.autoIssued;
        this.createdAt = builder.createdAt;
        this.customerId = builder.customerId;
        this.customerName = builder.customerName;
        this.hasActivationCode = builder.hasActivationCode;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.lastRefreshedAt = builder.lastRefreshedAt;
        this.offline = builder.offline;
        this.planName = builder.planName;
        this.revokedAt = builder.revokedAt;
        this.revokedImmediately = builder.revokedImmediately;
        this.status = builder.status;
        this.subscriptionId = builder.subscriptionId;
        this.validityDays = builder.validityDays;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code License}.
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
        builder.autoIssued = autoIssued;
        builder.createdAt = createdAt;
        builder.customerId = customerId;
        builder.customerName = customerName;
        builder.hasActivationCode = hasActivationCode;
        builder.id = id;
        builder.instanceId = instanceId;
        builder.lastRefreshedAt = lastRefreshedAt;
        builder.offline = offline;
        builder.planName = planName;
        builder.revokedAt = revokedAt;
        builder.revokedImmediately = revokedImmediately;
        builder.status = status;
        builder.subscriptionId = subscriptionId;
        builder.validityDays = validityDays;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Issued automatically for a subscription to a plan that issues licenses.
     *
     * @return the value, never null
     */
    public Boolean autoIssued() {
        return Utils.required(autoIssued, "auto_issued");
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
     * The {@code customer_id} property.
     *
     * @return the value, never null
     */
    public String customerId() {
        return Utils.required(customerId, "customer_id");
    }

    /**
     * The {@code customer_name} property.
     *
     * @return the value, never null
     */
    public String customerName() {
        return Utils.required(customerName, "customer_name");
    }

    /**
     * Whether the activation code can still be retrieved: only until activation or revocation.
     *
     * @return the value, never null
     */
    public Boolean hasActivationCode() {
        return Utils.required(hasActivationCode, "has_activation_code");
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
     * The installation the license is bound to, once activated.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> instanceId() {
        return instanceId.asOptional();
    }

    /**
     * The {@code last_refreshed_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> lastRefreshedAt() {
        return lastRefreshedAt.asOptional();
    }

    /**
     * Issued as a signed offline license: never activated nor refreshed.
     *
     * @return the value, never null
     */
    public Boolean offline() {
        return Utils.required(offline, "offline");
    }

    /**
     * The {@code plan_name} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> planName() {
        return planName.asOptional();
    }

    /**
     * The {@code revoked_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> revokedAt() {
        return revokedAt.asOptional();
    }

    /**
     * Revoked to stop at once: the installation drops its license on its next refresh instead of
     * keeping it until it expires.
     *
     * @return the value, never null
     */
    public Boolean revokedImmediately() {
        return Utils.required(revokedImmediately, "revoked_immediately");
    }

    /**
     * The {@code status} property.
     *
     * @return the value, never null
     */
    public LicenseStatus status() {
        return Utils.required(status, "status");
    }

    /**
     * The {@code subscription_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * Lifetime of each license token the installation receives on refresh; for an offline license,
     * the lifetime it was issued with.
     *
     * @return the value, never null
     */
    public Integer validityDays() {
        return Utils.required(validityDays, "validity_days");
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
        License that = (License) o;
        return Objects.equals(autoIssued, that.autoIssued)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(customerName, that.customerName)
                && Objects.equals(hasActivationCode, that.hasActivationCode)
                && Objects.equals(id, that.id)
                && Objects.equals(instanceId, that.instanceId)
                && Objects.equals(lastRefreshedAt, that.lastRefreshedAt)
                && Objects.equals(offline, that.offline)
                && Objects.equals(planName, that.planName)
                && Objects.equals(revokedAt, that.revokedAt)
                && Objects.equals(revokedImmediately, that.revokedImmediately)
                && Objects.equals(status, that.status)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(validityDays, that.validityDays)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                autoIssued,
                createdAt,
                customerId,
                customerName,
                hasActivationCode,
                id,
                instanceId,
                lastRefreshedAt,
                offline,
                planName,
                revokedAt,
                revokedImmediately,
                status,
                subscriptionId,
                validityDays,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "License{"
                + "autoIssued="
                + autoIssued
                + ", createdAt="
                + createdAt
                + ", customerId="
                + customerId
                + ", customerName="
                + customerName
                + ", hasActivationCode="
                + hasActivationCode
                + ", id="
                + id
                + ", instanceId="
                + instanceId
                + ", lastRefreshedAt="
                + lastRefreshedAt
                + ", offline="
                + offline
                + ", planName="
                + planName
                + ", revokedAt="
                + revokedAt
                + ", revokedImmediately="
                + revokedImmediately
                + ", status="
                + status
                + ", subscriptionId="
                + subscriptionId
                + ", validityDays="
                + validityDays
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link License}. */
    public static final class Builder {
        private Boolean autoIssued;
        private OffsetDateTime createdAt;
        private String customerId;
        private String customerName;
        private Boolean hasActivationCode;
        private String id;
        private JsonField<String> instanceId = JsonField.missing();
        private JsonField<OffsetDateTime> lastRefreshedAt = JsonField.missing();
        private Boolean offline;
        private JsonField<String> planName = JsonField.missing();
        private JsonField<OffsetDateTime> revokedAt = JsonField.missing();
        private Boolean revokedImmediately;
        private LicenseStatus status;
        private JsonField<String> subscriptionId = JsonField.missing();
        private Integer validityDays;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Issued automatically for a subscription to a plan that issues licenses.
         *
         * @param autoIssued the value
         * @return this builder
         */
        public Builder autoIssued(Boolean autoIssued) {
            this.autoIssued = autoIssued;
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
         * The {@code customer_id} property.
         *
         * @param customerId the value
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * The {@code customer_name} property.
         *
         * @param customerName the value
         * @return this builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * Whether the activation code can still be retrieved: only until activation or revocation.
         *
         * @param hasActivationCode the value
         * @return this builder
         */
        public Builder hasActivationCode(Boolean hasActivationCode) {
            this.hasActivationCode = hasActivationCode;
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
         * The installation the license is bound to, once activated.
         *
         * @param instanceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = JsonField.ofNullable(instanceId);
            return this;
        }

        /**
         * The {@code last_refreshed_at} property.
         *
         * @param lastRefreshedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastRefreshedAt(OffsetDateTime lastRefreshedAt) {
            this.lastRefreshedAt = JsonField.ofNullable(lastRefreshedAt);
            return this;
        }

        /**
         * Issued as a signed offline license: never activated nor refreshed.
         *
         * @param offline the value
         * @return this builder
         */
        public Builder offline(Boolean offline) {
            this.offline = offline;
            return this;
        }

        /**
         * The {@code plan_name} property.
         *
         * @param planName the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder planName(String planName) {
            this.planName = JsonField.ofNullable(planName);
            return this;
        }

        /**
         * The {@code revoked_at} property.
         *
         * @param revokedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder revokedAt(OffsetDateTime revokedAt) {
            this.revokedAt = JsonField.ofNullable(revokedAt);
            return this;
        }

        /**
         * Revoked to stop at once: the installation drops its license on its next refresh instead
         * of keeping it until it expires.
         *
         * @param revokedImmediately the value
         * @return this builder
         */
        public Builder revokedImmediately(Boolean revokedImmediately) {
            this.revokedImmediately = revokedImmediately;
            return this;
        }

        /**
         * The {@code status} property.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(LicenseStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The {@code subscription_id} property.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * Lifetime of each license token the installation receives on refresh; for an offline
         * license, the lifetime it was issued with.
         *
         * @param validityDays the value
         * @return this builder
         */
        public Builder validityDays(Integer validityDays) {
            this.validityDays = validityDays;
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
         * The {@code License}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public License build() {
            Utils.checkRequired(autoIssued, "auto_issued");
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(customerName, "customer_name");
            Utils.checkRequired(hasActivationCode, "has_activation_code");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(offline, "offline");
            Utils.checkRequired(revokedImmediately, "revoked_immediately");
            Utils.checkRequired(status, "status");
            Utils.checkRequired(validityDays, "validity_days");
            return new License(this);
        }
    }

    /**
     * Parse {@code json} as {@code License}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static License fromJson(String json) {
        return Utils.parse(json, License.class);
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
