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
public final class IssueLicenseRequest {
    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("instance_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> instanceId = JsonField.missing();

    @JsonProperty("offline")
    private Boolean offline;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("validity_days")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> validityDays = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private IssueLicenseRequest() {}

    private IssueLicenseRequest(Builder builder) {
        this.customerId = builder.customerId;
        this.instanceId = builder.instanceId;
        this.offline = builder.offline;
        this.subscriptionId = builder.subscriptionId;
        this.validityDays = builder.validityDays;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code IssueLicenseRequest}.
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
        builder.customerId = customerId;
        builder.instanceId = instanceId;
        builder.offline = offline;
        builder.subscriptionId = subscriptionId;
        builder.validityDays = validityDays;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Customer ID or alias
     *
     * @return the value, never null
     */
    public String customerId() {
        return Utils.required(customerId, "customer_id");
    }

    /**
     * Offline only. The installation's id as it reports it, up to 255 characters without spaces:
     * the license names it (<code>aud</code>) and stays bound to it. Without one, the license is
     * not tied to an installation.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> instanceId() {
        return instanceId.asOptional();
    }

    /**
     * Delivers the license at once as a signed offline license, for an installation that can't
     * reach the license server: no activation code, no refresh. Default: false.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> offline() {
        return Optional.ofNullable(offline);
    }

    /**
     * Ties the license to this subscription of the customer: it is renewed while the subscription
     * is paid, and carries its plan's entitlements.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * Online: lifetime of each license token the installation refreshes, 1 to 31 days. Default: 7.
     * Offline: lifetime of the signed license, 1 to 400 days. Default: 365.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> validityDays() {
        return validityDays.asOptional();
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
        IssueLicenseRequest that = (IssueLicenseRequest) o;
        return Objects.equals(customerId, that.customerId)
                && Objects.equals(instanceId, that.instanceId)
                && Objects.equals(offline, that.offline)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(validityDays, that.validityDays)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                customerId,
                instanceId,
                offline,
                subscriptionId,
                validityDays,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "IssueLicenseRequest{"
                + "customerId="
                + customerId
                + ", instanceId="
                + instanceId
                + ", offline="
                + offline
                + ", subscriptionId="
                + subscriptionId
                + ", validityDays="
                + validityDays
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link IssueLicenseRequest}. */
    public static final class Builder {
        private String customerId;
        private JsonField<String> instanceId = JsonField.missing();
        private Boolean offline;
        private JsonField<String> subscriptionId = JsonField.missing();
        private JsonField<Integer> validityDays = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Customer ID or alias
         *
         * @param customerId the value
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Offline only. The installation's id as it reports it, up to 255 characters without
         * spaces: the license names it (<code>aud</code>) and stays bound to it. Without one, the
         * license is not tied to an installation.
         *
         * @param instanceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = JsonField.ofNullable(instanceId);
            return this;
        }

        /**
         * Delivers the license at once as a signed offline license, for an installation that can't
         * reach the license server: no activation code, no refresh. Default: false.
         *
         * @param offline the value
         * @return this builder
         */
        public Builder offline(Boolean offline) {
            this.offline = offline;
            return this;
        }

        /**
         * Ties the license to this subscription of the customer: it is renewed while the
         * subscription is paid, and carries its plan's entitlements.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * Online: lifetime of each license token the installation refreshes, 1 to 31 days. Default:
         * 7. Offline: lifetime of the signed license, 1 to 400 days. Default: 365.
         *
         * @param validityDays the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder validityDays(Integer validityDays) {
            this.validityDays = JsonField.ofNullable(validityDays);
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
         * The {@code IssueLicenseRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public IssueLicenseRequest build() {
            Utils.checkRequired(customerId, "customer_id");
            return new IssueLicenseRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code IssueLicenseRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static IssueLicenseRequest fromJson(String json) {
        return Utils.parse(json, IssueLicenseRequest.class);
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
