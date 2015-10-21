package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueManager;

import java.util.Optional;

/**
 * Represents a meta owner.
 *
 * @author Jamie Mansfield
 */
public interface MetaOwner {

    /**
     * Gets a value from it's key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    default <T> Optional<T> get(Key<Value<T>> key) {
        return ValueManager.get(this, key);
    }

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
    default <T> boolean supports(Key<Value<T>> key) {
        return ValueManager.supports(this, key);
    }

    /**
     * Offers the given value to the value processor.
     *
     * @param key the key of which you are offering to.
     * @param value the value you wish to set.
     * @param <T> the value type.
     * @return {@code true} if the value was set.
     */
    default <T> boolean offer(Key<Value<T>> key, T value) {
        return ValueManager.offer(this, key, value);
    }

    /**
     * Gets the requested meta.
     *
     * @param clazz the clazz of the required type.
     * @param <T> the type.
     * @return the meta.
     */
    default <T extends MetaManipulator> T obtainMeta(Class<T> clazz) {
        return MetaManager.get(this, clazz);
    }

    /**
     * Checks to see if this owner supports that meta type.
     *
     * @param clazz the clazz of the required type.
     * @param <T> the type.
     * @return {@code true} if it supports that meta.
     */
    default <T extends MetaManipulator> boolean supportsMeta(Class<T> clazz) {
        return MetaManager.supports(this, clazz);
    }
}
