package uk.jamierocks.lexteam.ygd.core.meta.api.value;

import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;

/**
 * Represents a value owner.
 *
 * @author Jamie Mansfield
 */
public interface ValueOwner {

    /**
     * Gets a value from it's key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    <T> T get(Key<Value<T>> key);

    /**
     * Checks to see if this owner supports that key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    <T> boolean has(Key<Value<T>> key);
}
