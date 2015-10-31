package uk.jamierocks.lexteam.ygd.core.meta.value;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;

import java.util.Optional;

/**
 * Represents an object which holds key values.
 *
 * @author Jamie Mansfield
 */
public interface ValueHolder {

    /**
     * Gets a value from it's key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    <T> Optional<T> get(Key<Value<T>> key);

    /**
     * Gets a value from it's key, and if it doesn't exist the gets null.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    default <T> T getOrNull(Key<Value<T>> key) {
        return this.get(key).orElse(null);
    }

    /**
     * Checks to see if this owner supports that key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    <T> boolean supports(Key<Value<T>> key);

    /**
     * Offers the given value to the value processor.
     *
     * @param key the key of which you are offering to.
     * @param value the value you wish to set.
     * @param <T> the value type.
     * @return {@code true} if the value was set.
     */
    <T> boolean offer(Key<Value<T>> key, T value);
}
