package uk.jamierocks.lexteam.ygd.core.meta.api;

import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.Value;

/**
 * Represents a meta owner.
 *
 * @author Jamie Mansfield
 */
public interface MetaOwner {

    /**
     * Gets the requested meta.
     *
     * @param clazz the clazz of the required type.
     * @param <T> the type.
     * @return the meta.
     */
    <T extends Meta> T obtainMeta(Class<T> clazz);

    /**
     * Checks to see if this owner supports that meta type.
     *
     * @param clazz the clazz of the required type.
     * @param <T> the type.
     * @return {@code true} if it supports that meta.
     */
    <T extends Meta> boolean supportsMeta(Class<T> clazz);

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
