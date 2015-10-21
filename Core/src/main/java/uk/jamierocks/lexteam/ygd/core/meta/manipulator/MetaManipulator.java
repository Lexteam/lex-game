package uk.jamierocks.lexteam.ygd.core.meta.manipulator;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;

/**
 * Represents meta a {@link MetaOwner} can hold.
 *
 * @author Jamie Mansfield
 */
public interface MetaManipulator {

    /**
     * Checks to see if this manipulator supports that key.
     *
     * @param key the specified key.
     * @param <T> the value type.
     * @return the value.
     */
    <T> boolean supports(Key<Value<T>> key);

    /**
     * Sets the key's value.
     *
     * @param key the key
     * @param value the new value
     * @param <T> the value type
     */
    <T> void set(Key<Value<T>> key, T value);
}
