package uk.jamierocks.lexteam.ygd.core.meta;

/**
 * Represents a meta owner.
 *
 * @author Jamie Mansfield
 */
public interface MetaOwner {

    <T extends Meta> T obtainMeta(Class<T> clazz);
}
