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
 * The authorization of a wallet's automatic top-up was given, changed or withdrawn.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AutoTopUpConsentChangedEventData {
    @JsonProperty("actor")
    private Actor actor;

    @JsonProperty("changed_at")
    private OffsetDateTime changedAt;

    @JsonProperty("configuration_revision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> configurationRevision = JsonField.missing();

    @JsonProperty("consent_attested_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> consentAttestedAt = JsonField.missing();

    @JsonProperty("consent_attested_by")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Actor> consentAttestedBy = JsonField.missing();

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("previous_configuration_revision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> previousConfigurationRevision = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AutoTopUpConsentChangedEventData() {}

    private AutoTopUpConsentChangedEventData(Builder builder) {
        this.actor = builder.actor;
        this.changedAt = builder.changedAt;
        this.configurationRevision = builder.configurationRevision;
        this.consentAttestedAt = builder.consentAttestedAt;
        this.consentAttestedBy = builder.consentAttestedBy;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.enabled = builder.enabled;
        this.previousConfigurationRevision = builder.previousConfigurationRevision;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AutoTopUpConsentChangedEventData}.
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
        builder.actor = actor;
        builder.changedAt = changedAt;
        builder.configurationRevision = configurationRevision;
        builder.consentAttestedAt = consentAttestedAt;
        builder.consentAttestedBy = consentAttestedBy;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.enabled = enabled;
        builder.previousConfigurationRevision = previousConfigurationRevision;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Who gave, changed or withdrew the authorization.
     *
     * @return the value, never null
     */
    public Actor actor() {
        return Utils.required(actor, "actor");
    }

    /**
     * When the authorization changed.
     *
     * @return the value, never null
     */
    public OffsetDateTime changedAt() {
        return Utils.required(changedAt, "changed_at");
    }

    /**
     * Identifies the terms authorized now, without disclosing payment details; absent when
     * withdrawn.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> configurationRevision() {
        return configurationRevision.asOptional();
    }

    /**
     * When that attestation was made.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> consentAttestedAt() {
        return consentAttestedAt.asOptional();
    }

    /**
     * The {@code consent_attested_by} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Actor> consentAttestedBy() {
        return consentAttestedBy.asOptional();
    }

    /**
     * The wallet's currency (ISO 4217) or credit unit code.
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
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
     * Whether automatic top-up is authorized after this change.
     *
     * @return the value, never null
     */
    public Boolean enabled() {
        return Utils.required(enabled, "enabled");
    }

    /**
     * Identifies the terms authorized before the change; absent when none were.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> previousConfigurationRevision() {
        return previousConfigurationRevision.asOptional();
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
        AutoTopUpConsentChangedEventData that = (AutoTopUpConsentChangedEventData) o;
        return Objects.equals(actor, that.actor)
                && Objects.equals(changedAt, that.changedAt)
                && Objects.equals(configurationRevision, that.configurationRevision)
                && Objects.equals(consentAttestedAt, that.consentAttestedAt)
                && Objects.equals(consentAttestedBy, that.consentAttestedBy)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(enabled, that.enabled)
                && Objects.equals(previousConfigurationRevision, that.previousConfigurationRevision)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actor,
                changedAt,
                configurationRevision,
                consentAttestedAt,
                consentAttestedBy,
                currency,
                customerId,
                enabled,
                previousConfigurationRevision,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AutoTopUpConsentChangedEventData{"
                + "actor="
                + actor
                + ", changedAt="
                + changedAt
                + ", configurationRevision="
                + configurationRevision
                + ", consentAttestedAt="
                + consentAttestedAt
                + ", consentAttestedBy="
                + consentAttestedBy
                + ", currency="
                + currency
                + ", customerId="
                + customerId
                + ", enabled="
                + enabled
                + ", previousConfigurationRevision="
                + previousConfigurationRevision
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AutoTopUpConsentChangedEventData}. */
    public static final class Builder {
        private Actor actor;
        private OffsetDateTime changedAt;
        private JsonField<String> configurationRevision = JsonField.missing();
        private JsonField<OffsetDateTime> consentAttestedAt = JsonField.missing();
        private JsonField<Actor> consentAttestedBy = JsonField.missing();
        private String currency;
        private String customerId;
        private Boolean enabled;
        private JsonField<String> previousConfigurationRevision = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Who gave, changed or withdrew the authorization.
         *
         * @param actor the value
         * @return this builder
         */
        public Builder actor(Actor actor) {
            this.actor = actor;
            return this;
        }

        /**
         * When the authorization changed.
         *
         * @param changedAt the value
         * @return this builder
         */
        public Builder changedAt(OffsetDateTime changedAt) {
            this.changedAt = changedAt;
            return this;
        }

        /**
         * Identifies the terms authorized now, without disclosing payment details; absent when
         * withdrawn.
         *
         * @param configurationRevision the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder configurationRevision(String configurationRevision) {
            this.configurationRevision = JsonField.ofNullable(configurationRevision);
            return this;
        }

        /**
         * When that attestation was made.
         *
         * @param consentAttestedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder consentAttestedAt(OffsetDateTime consentAttestedAt) {
            this.consentAttestedAt = JsonField.ofNullable(consentAttestedAt);
            return this;
        }

        /**
         * The {@code consent_attested_by} property.
         *
         * @param consentAttestedBy the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder consentAttestedBy(Actor consentAttestedBy) {
            this.consentAttestedBy = JsonField.ofNullable(consentAttestedBy);
            return this;
        }

        /**
         * The wallet's currency (ISO 4217) or credit unit code.
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * Whether automatic top-up is authorized after this change.
         *
         * @param enabled the value
         * @return this builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Identifies the terms authorized before the change; absent when none were.
         *
         * @param previousConfigurationRevision the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder previousConfigurationRevision(String previousConfigurationRevision) {
            this.previousConfigurationRevision =
                    JsonField.ofNullable(previousConfigurationRevision);
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
         * The {@code AutoTopUpConsentChangedEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AutoTopUpConsentChangedEventData build() {
            Utils.checkRequired(actor, "actor");
            Utils.checkRequired(changedAt, "changed_at");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(enabled, "enabled");
            return new AutoTopUpConsentChangedEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code AutoTopUpConsentChangedEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AutoTopUpConsentChangedEventData fromJson(String json) {
        return Utils.parse(json, AutoTopUpConsentChangedEventData.class);
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
