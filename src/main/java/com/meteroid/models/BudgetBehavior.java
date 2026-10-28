// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * What reaching the amount does. A SOFT budget only sends alerts; a HARD budget also makes the
 * entitlement check answer BUDGET_EXCEEDED for the features whose usage counts in its spend. A HARD
 * budget on one subscription refuses the checks naming that subscription, and the checks naming
 * none once every subscription charging the feature's metric is refused by its own.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class BudgetBehavior implements ToQueryParam {
    /** The value {@code "SOFT"}. */
    public static final BudgetBehavior SOFT = new BudgetBehavior("SOFT", Value.SOFT);

    /** The value {@code "HARD"}. */
    public static final BudgetBehavior HARD = new BudgetBehavior("HARD", Value.HARD);

    private static final Map<String, BudgetBehavior> constants =
            Map.ofEntries(Map.entry("SOFT", SOFT), Map.entry("HARD", HARD));

    private final String value;
    private final Value variant;

    private BudgetBehavior(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown BudgetBehavior holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static BudgetBehavior of(String value) {
        BudgetBehavior constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new BudgetBehavior(value, Value._UNKNOWN);
    }

    /**
     * The value as sent.
     *
     * @return the value
     */
    @JsonValue
    public String asString() {
        return value;
    }

    /**
     * Whether this version of the SDK knows the value.
     *
     * @return whether it is known
     */
    public boolean isKnown() {
        return variant != Value._UNKNOWN;
    }

    /**
     * The value as an enum to switch on, unknown values included.
     *
     * @return the enum, {@code _UNKNOWN} when unknown
     */
    public Value value() {
        return variant;
    }

    /**
     * The value as an enum of the known values only.
     *
     * @return the enum
     * @throws com.meteroid.exceptions.InvalidDataException when this version of the SDK does not
     *     know the value
     */
    public Known known() {
        if (!isKnown()) {
            throw new com.meteroid.exceptions.InvalidDataException(
                    "unknown BudgetBehavior: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BudgetBehavior && Objects.equals(value, ((BudgetBehavior) o).value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** The values this version of the SDK knows. */
    public enum Known {
        /** The {@code SOFT} constant. */
        SOFT,
        /** The {@code HARD} constant. */
        HARD
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code SOFT} constant. */
        SOFT,
        /** The {@code HARD} constant. */
        HARD,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
