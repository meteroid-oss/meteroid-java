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

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Deprecated: customer usage limits were replaced by entitlement overrides; never returned.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class EntitlementCheckLimit {
    @JsonProperty("behavior")
    private EntitlementCheckLimitBehavior behavior;

    @JsonProperty("group")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Map<String, String>> group = JsonField.missing();

    @JsonProperty("has_access")
    private Boolean hasAccess;

    @JsonProperty("limit")
    private BigDecimal limit;

    @JsonProperty("remaining")
    private BigDecimal remaining;

    @JsonProperty("usage_limit_id")
    private String usageLimitId;

    @JsonProperty("used")
    private BigDecimal used;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private EntitlementCheckLimit() {}

    private EntitlementCheckLimit(Builder builder) {
        this.behavior = builder.behavior;
        this.group = builder.group.map(Utils::copyMap);
        this.hasAccess = builder.hasAccess;
        this.limit = builder.limit;
        this.remaining = builder.remaining;
        this.usageLimitId = builder.usageLimitId;
        this.used = builder.used;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code EntitlementCheckLimit}.
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
        builder.behavior = behavior;
        builder.group = group.map(Utils::mutableMap);
        builder.hasAccess = hasAccess;
        builder.limit = limit;
        builder.remaining = remaining;
        builder.usageLimitId = usageLimitId;
        builder.used = used;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code behavior} property.
     *
     * @return the value, never null
     */
    public EntitlementCheckLimitBehavior behavior() {
        return Utils.required(behavior, "behavior");
    }

    /**
     * The group the limit was evaluated for, when the limit is grouped.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Map<String, String>> group() {
        return group.asOptional();
    }

    /**
     * The {@code has_access} property.
     *
     * @return the value, never null
     */
    public Boolean hasAccess() {
        return Utils.required(hasAccess, "has_access");
    }

    /**
     * The {@code limit} property.
     *
     * @return the value, never null
     */
    public BigDecimal limit() {
        return Utils.required(limit, "limit");
    }

    /**
     * The {@code remaining} property.
     *
     * @return the value, never null
     */
    public BigDecimal remaining() {
        return Utils.required(remaining, "remaining");
    }

    /**
     * The {@code usage_limit_id} property.
     *
     * @return the value, never null
     */
    public String usageLimitId() {
        return Utils.required(usageLimitId, "usage_limit_id");
    }

    /**
     * The {@code used} property.
     *
     * @return the value, never null
     */
    public BigDecimal used() {
        return Utils.required(used, "used");
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
        EntitlementCheckLimit that = (EntitlementCheckLimit) o;
        return Objects.equals(behavior, that.behavior)
                && Objects.equals(group, that.group)
                && Objects.equals(hasAccess, that.hasAccess)
                && Objects.equals(limit, that.limit)
                && Objects.equals(remaining, that.remaining)
                && Objects.equals(usageLimitId, that.usageLimitId)
                && Objects.equals(used, that.used)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                behavior,
                group,
                hasAccess,
                limit,
                remaining,
                usageLimitId,
                used,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "EntitlementCheckLimit{"
                + "behavior="
                + behavior
                + ", group="
                + group
                + ", hasAccess="
                + hasAccess
                + ", limit="
                + limit
                + ", remaining="
                + remaining
                + ", usageLimitId="
                + usageLimitId
                + ", used="
                + used
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link EntitlementCheckLimit}. */
    public static final class Builder {
        private EntitlementCheckLimitBehavior behavior;
        private JsonField<Map<String, String>> group = JsonField.missing();
        private Boolean hasAccess;
        private BigDecimal limit;
        private BigDecimal remaining;
        private String usageLimitId;
        private BigDecimal used;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code behavior} property.
         *
         * @param behavior the value
         * @return this builder
         */
        public Builder behavior(EntitlementCheckLimitBehavior behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * The group the limit was evaluated for, when the limit is grouped.
         *
         * @param group the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder group(Map<String, String> group) {
            this.group = JsonField.ofNullable(Utils.mutableMap(group));
            return this;
        }

        /**
         * Puts an entry in {@code group}.
         *
         * @param key the key
         * @param item the item
         * @return this builder
         */
        public Builder putGroupItem(String key, String item) {
            Map<String, String> items = this.group.orNull();
            if (items == null) {
                items = new LinkedHashMap<>();
                this.group = JsonField.ofNullable(items);
            }
            items.put(key, item);
            return this;
        }

        /**
         * The {@code has_access} property.
         *
         * @param hasAccess the value
         * @return this builder
         */
        public Builder hasAccess(Boolean hasAccess) {
            this.hasAccess = hasAccess;
            return this;
        }

        /**
         * The {@code limit} property.
         *
         * @param limit the value
         * @return this builder
         */
        public Builder limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The {@code remaining} property.
         *
         * @param remaining the value
         * @return this builder
         */
        public Builder remaining(BigDecimal remaining) {
            this.remaining = remaining;
            return this;
        }

        /**
         * The {@code usage_limit_id} property.
         *
         * @param usageLimitId the value
         * @return this builder
         */
        public Builder usageLimitId(String usageLimitId) {
            this.usageLimitId = usageLimitId;
            return this;
        }

        /**
         * The {@code used} property.
         *
         * @param used the value
         * @return this builder
         */
        public Builder used(BigDecimal used) {
            this.used = used;
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
         * The {@code EntitlementCheckLimit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public EntitlementCheckLimit build() {
            Utils.checkRequired(behavior, "behavior");
            Utils.checkRequired(hasAccess, "has_access");
            Utils.checkRequired(limit, "limit");
            Utils.checkRequired(remaining, "remaining");
            Utils.checkRequired(usageLimitId, "usage_limit_id");
            Utils.checkRequired(used, "used");
            return new EntitlementCheckLimit(this);
        }
    }

    /**
     * Parse {@code json} as {@code EntitlementCheckLimit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static EntitlementCheckLimit fromJson(String json) {
        return Utils.parse(json, EntitlementCheckLimit.class);
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
