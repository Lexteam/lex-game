package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueHolder;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueManager;

import java.util.Optional;

/**
 * Represents an object which holds meta.
 *
 * @author Jamie Mansfield
 */
public interface MetaHolder extends ValueHolder {

    /**
     * {@inheritDoc}
     */
    default <T> Optional<T> get(Key<Value<T>> key) {
        return ValueManager.get(this, key);
    }

    /**
     * {@inheritDoc}
     */
    default <T> boolean supports(Key<Value<T>> key) {
        return ValueManager.supports(this, key);
    }

    /**
     * {@inheritDoc}
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

    default <T extends MetaManipulator> boolean applyMeta(T meta) {
        return MetaManager.apply(this, meta);
    }
}
