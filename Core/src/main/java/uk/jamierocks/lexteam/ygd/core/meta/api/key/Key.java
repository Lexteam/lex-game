package uk.jamierocks.lexteam.ygd.core.meta.api.key;

import uk.jamierocks.lexteam.ygd.core.meta.api.value.Value;

/**
 * Represents a key, this can be of any value.
 *
 * @param <V> the value type.
 */
public interface Key<V extends Value<?>> {

    /**
     * Gets the value class.
     *
     * @return the value class.
     */
    Class<V> getValueClass();
}
