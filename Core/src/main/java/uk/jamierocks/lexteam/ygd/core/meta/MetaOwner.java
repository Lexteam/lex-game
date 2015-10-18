package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.Meta;

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
    default <T extends Meta> T obtainMeta(Class<T> clazz) {
        return MetaManager.get(this, clazz);
    }

    /**
     * Checks to see if this owner supports that meta type.
     *
     * @param clazz the clazz of the required type.
     * @param <T> the type.
     * @return {@code true} if it supports that meta.
     */
    default <T extends Meta> boolean supportsMeta(Class<T> clazz) {
        return MetaManager.has(this, clazz);
    }
}
