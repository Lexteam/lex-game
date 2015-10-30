package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

import java.util.Optional;

/**
 * Represents an object, that holds all the data in a {@link MetaManipulator}.
 *
 * @author Jamie Mansfield
 */
public interface MetaContainer {

    Optional<Object> get(MetaQuery path);

    MetaContainer set(MetaQuery path, Object value);
}
