package uk.jamierocks.lexteam.ygd.core.meta.key;

import uk.jamierocks.lexteam.ygd.core.meta.MetaQuery;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;

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

    MetaQuery getQuery();
}
