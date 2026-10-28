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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Whether a customer may consume more of a feature now.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class EntitlementCheck {
    @JsonProperty("as_of")
    private OffsetDateTime asOf;

    @JsonProperty("exact")
    private Boolean exact;

    @JsonProperty("feature")
    private EntitlementCheckFeature feature;

    @JsonProperty("has_access")
    private Boolean hasAccess;

    @JsonProperty("in_overage")
    private Boolean inOverage;

    @JsonProperty("lag_ms")
    private Long lagMs;

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> limit = JsonField.missing();

    @JsonProperty("limits")
    private List<EntitlementCheckLimit> limits;

    @JsonProperty("near_limit")
    private Boolean nearLimit;

    @JsonProperty("period")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<EntitlementCheckPeriod> period = JsonField.missing();

    @JsonProperty("reason")
    private EntitlementCheckReason reason;

    @JsonProperty("remaining")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> remaining = JsonField.missing();

    @JsonProperty("retry_after_ms")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> retryAfterMs = JsonField.missing();

    @JsonProperty("used")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> used = JsonField.missing();

    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<ConfigValue> value = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private EntitlementCheck() {}

    private EntitlementCheck(Builder builder) {
        this.asOf = builder.asOf;
        this.exact = builder.exact;
        this.feature = builder.feature;
        this.hasAccess = builder.hasAccess;
        this.inOverage = builder.inOverage;
        this.lagMs = builder.lagMs;
        this.limit = builder.limit;
        this.limits = Utils.copyList(builder.limits);
        this.nearLimit = builder.nearLimit;
        this.period = builder.period;
        this.reason = builder.reason;
        this.remaining = builder.remaining;
        this.retryAfterMs = builder.retryAfterMs;
        this.used = builder.used;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code EntitlementCheck}.
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
        builder.asOf = asOf;
        builder.exact = exact;
        builder.feature = feature;
        builder.hasAccess = hasAccess;
        builder.inOverage = inOverage;
        builder.lagMs = lagMs;
        builder.limit = limit;
        builder.limits = Utils.mutableList(limits);
        builder.nearLimit = nearLimit;
        builder.period = period;
        builder.reason = reason;
        builder.remaining = remaining;
        builder.retryAfterMs = retryAfterMs;
        builder.used = used;
        builder.value = value;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * When the usage behind the answer was measured.
     *
     * @return the value, never null
     */
    public OffsetDateTime asOf() {
        return Utils.required(asOf, "as_of");
    }

    /**
     * Always false: the answer reflects usage up to <code>as_of</code>.
     *
     * @return the value, never null
     */
    public Boolean exact() {
        return Utils.required(exact, "exact");
    }

    /**
     * The {@code feature} property.
     *
     * @return the value, never null
     */
    public EntitlementCheckFeature feature() {
        return Utils.required(feature, "feature");
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
     * The entitlement allows overage (<code>ALLOW</code>) and the requested units go beyond its
     * limit: access is granted, and the overage is billed.
     *
     * @return the value, never null
     */
    public Boolean inOverage() {
        return Utils.required(inOverage, "in_overage");
    }

    /**
     * Age of that usage, in milliseconds.
     *
     * @return the value, never null
     */
    public Long lagMs() {
        return Utils.required(lagMs, "lag_ms");
    }

    /**
     * The {@code limit} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> limit() {
        return limit.asOptional();
    }

    /**
     * Deprecated: always empty. Customer-specific limits are entitlement overrides, reported in
     * <code>used</code>, <code>limit</code> and <code>remaining</code>.
     *
     * @return the value, never null
     */
    public List<EntitlementCheckLimit> limits() {
        return Utils.required(limits, "limits");
    }

    /**
     * True when a hard limit is within 5% of being reached, reached, or refuses the request. While
     * true, check before every request with its actual <code>requested</code>, and do not cache an
     * answer that grants access.
     *
     * @return the value, never null
     */
    public Boolean nearLimit() {
        return Utils.required(nearLimit, "near_limit");
    }

    /**
     * The {@code period} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<EntitlementCheckPeriod> period() {
        return period.asOptional();
    }

    /**
     * The {@code reason} property.
     *
     * @return the value, never null
     */
    public EntitlementCheckReason reason() {
        return Utils.required(reason, "reason");
    }

    /**
     * Units left before the limit, grace excluded: 0 while <code>has_access</code> is true when
     * usage is within the grace allowance.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> remaining() {
        return remaining.asOptional();
    }

    /**
     * When to check again, in milliseconds. After a refusal by a limit whose period ends within 24
     * hours: the time until it ends (a smaller <code>requested</code> may still be allowed sooner);
     * absent after a refusal by a sliding window, whose usage leaves it gradually. While <code>
     * near_limit</code> is true and access is granted: 1000.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> retryAfterMs() {
        return retryAfterMs.asOptional();
    }

    /**
     * <code>used</code>, <code>limit</code>, <code>remaining</code> and <code>period</code> report
     * the entitlement's limit. Absent when the entitlement has no limit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> used() {
        return used.asOptional();
    }

    /**
     * The {@code value} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<ConfigValue> value() {
        return value.asOptional();
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
        EntitlementCheck that = (EntitlementCheck) o;
        return Objects.equals(asOf, that.asOf)
                && Objects.equals(exact, that.exact)
                && Objects.equals(feature, that.feature)
                && Objects.equals(hasAccess, that.hasAccess)
                && Objects.equals(inOverage, that.inOverage)
                && Objects.equals(lagMs, that.lagMs)
                && Objects.equals(limit, that.limit)
                && Objects.equals(limits, that.limits)
                && Objects.equals(nearLimit, that.nearLimit)
                && Objects.equals(period, that.period)
                && Objects.equals(reason, that.reason)
                && Objects.equals(remaining, that.remaining)
                && Objects.equals(retryAfterMs, that.retryAfterMs)
                && Objects.equals(used, that.used)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asOf,
                exact,
                feature,
                hasAccess,
                inOverage,
                lagMs,
                limit,
                limits,
                nearLimit,
                period,
                reason,
                remaining,
                retryAfterMs,
                used,
                value,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "EntitlementCheck{"
                + "asOf="
                + asOf
                + ", exact="
                + exact
                + ", feature="
                + feature
                + ", hasAccess="
                + hasAccess
                + ", inOverage="
                + inOverage
                + ", lagMs="
                + lagMs
                + ", limit="
                + limit
                + ", limits="
                + limits
                + ", nearLimit="
                + nearLimit
                + ", period="
                + period
                + ", reason="
                + reason
                + ", remaining="
                + remaining
                + ", retryAfterMs="
                + retryAfterMs
                + ", used="
                + used
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link EntitlementCheck}. */
    public static final class Builder {
        private OffsetDateTime asOf;
        private Boolean exact;
        private EntitlementCheckFeature feature;
        private Boolean hasAccess;
        private Boolean inOverage;
        private Long lagMs;
        private JsonField<BigDecimal> limit = JsonField.missing();
        private List<EntitlementCheckLimit> limits;
        private Boolean nearLimit;
        private JsonField<EntitlementCheckPeriod> period = JsonField.missing();
        private EntitlementCheckReason reason;
        private JsonField<BigDecimal> remaining = JsonField.missing();
        private JsonField<Long> retryAfterMs = JsonField.missing();
        private JsonField<BigDecimal> used = JsonField.missing();
        private JsonField<ConfigValue> value = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * When the usage behind the answer was measured.
         *
         * @param asOf the value
         * @return this builder
         */
        public Builder asOf(OffsetDateTime asOf) {
            this.asOf = asOf;
            return this;
        }

        /**
         * Always false: the answer reflects usage up to <code>as_of</code>.
         *
         * @param exact the value
         * @return this builder
         */
        public Builder exact(Boolean exact) {
            this.exact = exact;
            return this;
        }

        /**
         * The {@code feature} property.
         *
         * @param feature the value
         * @return this builder
         */
        public Builder feature(EntitlementCheckFeature feature) {
            this.feature = feature;
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
         * The entitlement allows overage (<code>ALLOW</code>) and the requested units go beyond its
         * limit: access is granted, and the overage is billed.
         *
         * @param inOverage the value
         * @return this builder
         */
        public Builder inOverage(Boolean inOverage) {
            this.inOverage = inOverage;
            return this;
        }

        /**
         * Age of that usage, in milliseconds.
         *
         * @param lagMs the value
         * @return this builder
         */
        public Builder lagMs(Long lagMs) {
            this.lagMs = lagMs;
            return this;
        }

        /**
         * The {@code limit} property.
         *
         * @param limit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder limit(BigDecimal limit) {
            this.limit = JsonField.ofNullable(limit);
            return this;
        }

        /**
         * Deprecated: always empty. Customer-specific limits are entitlement overrides, reported in
         * <code>used</code>, <code>limit</code> and <code>remaining</code>.
         *
         * @param limits the value
         * @return this builder
         */
        public Builder limits(List<EntitlementCheckLimit> limits) {
            this.limits = Utils.mutableList(limits);
            return this;
        }

        /**
         * Adds an item to {@code limits}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addLimitsItem(EntitlementCheckLimit item) {
            if (this.limits == null) {
                this.limits = new ArrayList<>();
            }
            this.limits.add(item);
            return this;
        }

        /**
         * True when a hard limit is within 5% of being reached, reached, or refuses the request.
         * While true, check before every request with its actual <code>requested</code>, and do not
         * cache an answer that grants access.
         *
         * @param nearLimit the value
         * @return this builder
         */
        public Builder nearLimit(Boolean nearLimit) {
            this.nearLimit = nearLimit;
            return this;
        }

        /**
         * The {@code period} property.
         *
         * @param period the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder period(EntitlementCheckPeriod period) {
            this.period = JsonField.ofNullable(period);
            return this;
        }

        /**
         * The {@code reason} property.
         *
         * @param reason the value
         * @return this builder
         */
        public Builder reason(EntitlementCheckReason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Units left before the limit, grace excluded: 0 while <code>has_access</code> is true when
         * usage is within the grace allowance.
         *
         * @param remaining the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder remaining(BigDecimal remaining) {
            this.remaining = JsonField.ofNullable(remaining);
            return this;
        }

        /**
         * When to check again, in milliseconds. After a refusal by a limit whose period ends within
         * 24 hours: the time until it ends (a smaller <code>requested</code> may still be allowed
         * sooner); absent after a refusal by a sliding window, whose usage leaves it gradually.
         * While <code>near_limit</code> is true and access is granted: 1000.
         *
         * @param retryAfterMs the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder retryAfterMs(Long retryAfterMs) {
            this.retryAfterMs = JsonField.ofNullable(retryAfterMs);
            return this;
        }

        /**
         * <code>used</code>, <code>limit</code>, <code>remaining</code> and <code>period</code>
         * report the entitlement's limit. Absent when the entitlement has no limit.
         *
         * @param used the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder used(BigDecimal used) {
            this.used = JsonField.ofNullable(used);
            return this;
        }

        /**
         * The {@code value} property.
         *
         * @param value the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder value(ConfigValue value) {
            this.value = JsonField.ofNullable(value);
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
         * The {@code EntitlementCheck}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public EntitlementCheck build() {
            Utils.checkRequired(asOf, "as_of");
            Utils.checkRequired(exact, "exact");
            Utils.checkRequired(feature, "feature");
            Utils.checkRequired(hasAccess, "has_access");
            Utils.checkRequired(inOverage, "in_overage");
            Utils.checkRequired(lagMs, "lag_ms");
            Utils.checkRequired(limits, "limits");
            Utils.checkRequired(nearLimit, "near_limit");
            Utils.checkRequired(reason, "reason");
            return new EntitlementCheck(this);
        }
    }

    /**
     * Parse {@code json} as {@code EntitlementCheck}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static EntitlementCheck fromJson(String json) {
        return Utils.parse(json, EntitlementCheck.class);
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
