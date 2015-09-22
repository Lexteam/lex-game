package uk.jamierocks.lexteam.ygd.core.meta.api;

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
}
