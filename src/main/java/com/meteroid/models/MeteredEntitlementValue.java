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
public final class MeteredEntitlementValue {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("grace_pct")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> gracePct = JsonField.missing();

    @JsonProperty("group_by")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> groupBy = JsonField.missing();

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> limit = JsonField.missing();

    @JsonProperty("overage_behavior")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<EntitlementOverageBehavior> overageBehavior = JsonField.missing();

    @JsonProperty("reset_period")
    private ResetPeriod resetPeriod;

    @JsonProperty("thresholds")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<Integer>> thresholds = JsonField.missing();

    @JsonProperty("type")
    private String type = "METERED";

    @JsonProperty("warning_threshold_pct")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> warningThresholdPct = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private MeteredEntitlementValue() {}

    private MeteredEntitlementValue(Builder builder) {
        this.enabled = builder.enabled;
        this.gracePct = builder.gracePct;
        this.groupBy = builder.groupBy;
        this.limit = builder.limit;
        this.overageBehavior = builder.overageBehavior;
        this.resetPeriod = builder.resetPeriod;
        this.thresholds = builder.thresholds.map(Utils::copyList);
        this.type = builder.type;
        this.warningThresholdPct = builder.warningThresholdPct;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code MeteredEntitlementValue}.
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
        builder.enabled = enabled;
        builder.gracePct = gracePct;
        builder.groupBy = groupBy;
        builder.limit = limit;
        builder.overageBehavior = overageBehavior;
        builder.resetPeriod = resetPeriod;
        builder.thresholds = thresholds.map(Utils::mutableList);
        builder.type = type;
        builder.warningThresholdPct = warningThresholdPct;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Per-entitlement kill switch. <code>false</code> means disabled.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(enabled);
    }

    /**
     * <code>BLOCK</code> only: usage allowed beyond the limit before it is refused, in percent of
     * the limit (1 to 1000).
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> gracePct() {
        return gracePct.asOptional();
    }

    /**
     * Event property the limit applies to separately, one limit per value (e.g. <code>user_id
     * </code>).
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> groupBy() {
        return groupBy.asOptional();
    }

    /**
     * Cap on usage. Null means unlimited.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> limit() {
        return limit.asOptional();
    }

    /**
     * The {@code overage_behavior} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<EntitlementOverageBehavior> overageBehavior() {
        return overageBehavior.asOptional();
    }

    /**
     * The {@code reset_period} property.
     *
     * @return the value, empty when unset
     */
    public Optional<ResetPeriod> resetPeriod() {
        return Optional.ofNullable(resetPeriod);
    }

    /**
     * Percents of the limit (1 to 100, at most 10) at which an alert is sent, once per period:
     * <code>entitlement.usage_threshold_reached</code>, or <code>entitlement.limit_reached</code>
     * at 100. Requires a limit and a window that is not sliding.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<Integer>> thresholds() {
        return thresholds.asOptional();
    }

    /**
     * The {@code type} property.
     *
     * @return the value, never null
     */
    public String type() {
        return Utils.required(type, "type");
    }

    /**
     * Deprecated: use <code>thresholds</code>. A single alert threshold, read only when <code>
     * thresholds</code> is omitted; returned as the lowest of <code>thresholds</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> warningThresholdPct() {
        return warningThresholdPct.asOptional();
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
        MeteredEntitlementValue that = (MeteredEntitlementValue) o;
        return Objects.equals(enabled, that.enabled)
                && Objects.equals(gracePct, that.gracePct)
                && Objects.equals(groupBy, that.groupBy)
                && Objects.equals(limit, that.limit)
                && Objects.equals(overageBehavior, that.overageBehavior)
                && Objects.equals(resetPeriod, that.resetPeriod)
                && Objects.equals(thresholds, that.thresholds)
                && Objects.equals(type, that.type)
                && Objects.equals(warningThresholdPct, that.warningThresholdPct)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                enabled,
                gracePct,
                groupBy,
                limit,
                overageBehavior,
                resetPeriod,
                thresholds,
                type,
                warningThresholdPct,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "MeteredEntitlementValue{"
                + "enabled="
                + enabled
                + ", gracePct="
                + gracePct
                + ", groupBy="
                + groupBy
                + ", limit="
                + limit
                + ", overageBehavior="
                + overageBehavior
                + ", resetPeriod="
                + resetPeriod
                + ", thresholds="
                + thresholds
                + ", type="
                + type
                + ", warningThresholdPct="
                + warningThresholdPct
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link MeteredEntitlementValue}. */
    public static final class Builder {
        private Boolean enabled;
        private JsonField<Integer> gracePct = JsonField.missing();
        private JsonField<String> groupBy = JsonField.missing();
        private JsonField<BigDecimal> limit = JsonField.missing();
        private JsonField<EntitlementOverageBehavior> overageBehavior = JsonField.missing();
        private ResetPeriod resetPeriod;
        private JsonField<List<Integer>> thresholds = JsonField.missing();
        private String type = "METERED";
        private JsonField<Integer> warningThresholdPct = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Per-entitlement kill switch. <code>false</code> means disabled.
         *
         * @param enabled the value
         * @return this builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <code>BLOCK</code> only: usage allowed beyond the limit before it is refused, in percent
         * of the limit (1 to 1000).
         *
         * @param gracePct the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder gracePct(Integer gracePct) {
            this.gracePct = JsonField.ofNullable(gracePct);
            return this;
        }

        /**
         * Event property the limit applies to separately, one limit per value (e.g. <code>user_id
         * </code>).
         *
         * @param groupBy the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder groupBy(String groupBy) {
            this.groupBy = JsonField.ofNullable(groupBy);
            return this;
        }

        /**
         * Cap on usage. Null means unlimited.
         *
         * @param limit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder limit(BigDecimal limit) {
            this.limit = JsonField.ofNullable(limit);
            return this;
        }

        /**
         * The {@code overage_behavior} property.
         *
         * @param overageBehavior the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder overageBehavior(EntitlementOverageBehavior overageBehavior) {
            this.overageBehavior = JsonField.ofNullable(overageBehavior);
            return this;
        }

        /**
         * The {@code reset_period} property.
         *
         * @param resetPeriod the value
         * @return this builder
         */
        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            return this;
        }

        /**
         * Percents of the limit (1 to 100, at most 10) at which an alert is sent, once per period:
         * <code>entitlement.usage_threshold_reached</code>, or <code>entitlement.limit_reached
         * </code> at 100. Requires a limit and a window that is not sliding.
         *
         * @param thresholds the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder thresholds(List<Integer> thresholds) {
            this.thresholds = JsonField.ofNullable(Utils.mutableList(thresholds));
            return this;
        }

        /**
         * Adds an item to {@code thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addThresholdsItem(Integer item) {
            List<Integer> items = this.thresholds.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.thresholds = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * The {@code type} property.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Deprecated: use <code>thresholds</code>. A single alert threshold, read only when <code>
         * thresholds</code> is omitted; returned as the lowest of <code>thresholds</code>.
         *
         * @param warningThresholdPct the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder warningThresholdPct(Integer warningThresholdPct) {
            this.warningThresholdPct = JsonField.ofNullable(warningThresholdPct);
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
         * The {@code MeteredEntitlementValue}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public MeteredEntitlementValue build() {
            Utils.checkRequired(type, "type");
            return new MeteredEntitlementValue(this);
        }
    }

    /**
     * Parse {@code json} as {@code MeteredEntitlementValue}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static MeteredEntitlementValue fromJson(String json) {
        return Utils.parse(json, MeteredEntitlementValue.class);
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
