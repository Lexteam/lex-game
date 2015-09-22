package uk.jamierocks.lexteam.ygd.core.meta.api.value;

/**
 * Represents any value.
 *
 * @param <V> the value type.
 */
public interface Value<V> {

    /**
     * Gets the value.
     *
     * @return the value.
     */
    V get();

    /**
     * Checks if the value has been set.
     *
     * @return {@code true} if the value has been set, else {@code false}.
     */
    boolean isPresent();
}
