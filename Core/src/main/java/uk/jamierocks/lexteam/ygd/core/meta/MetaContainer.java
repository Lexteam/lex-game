package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Represents an object, that holds all the data in a {@link MetaManipulator}.
 *
 * @author Jamie Mansfield
 */
public interface MetaContainer {

    /**
     * Gets all the queries associated with this container.
     *
     * @return all the queries.
     */
    Set<MetaQuery> getQueries();

    /**
     * Gets all the values.
     *
     * @return all the values.
     */
    Map<MetaQuery, Object> getValues();

    /**
     * Checks if this container contains the given query.
     *
     * @param query the given query.
     * @return {@code true} if this container contains the given query, {@code false} otherwise.
     */
    boolean contains(MetaQuery query);

    Optional<Object> get(MetaQuery query);

    default <T> Optional<T> getType(MetaQuery query, Class<T> type) {
        Optional<Object> value = this.get(query);

        if (!value.isPresent()) {
            return Optional.empty();
        }

        if (value.get().getClass() != type) {
            return Optional.empty();
        }

        return Optional.of((T) value.get());
    }

    default Optional<String> getString(MetaQuery query) {
        return this.getType(query, String.class);
    }

    default Optional<Boolean> getBoolean(MetaQuery query) {
        return this.getType(query, Boolean.class);
    }

    default Optional<Integer> getInteger(MetaQuery query) {
        return this.getType(query, Integer.class);
    }

    default Optional<Double> getDouble(MetaQuery query) {
        return this.getType(query, Double.class);
    }

    default Optional<Long> getLong(MetaQuery query) {
        return this.getType(query, Long.class);
    }

    default Optional<Short> getShort(MetaQuery query) {
        return this.getType(query, Short.class);
    }

    MetaContainer set(MetaQuery query, Object value);

    void remove(MetaQuery query);
}
