package uk.jamierocks.lexteam.ygd.core.meta.manipulator;

import uk.jamierocks.lexteam.ygd.core.meta.MetaContainer;
import uk.jamierocks.lexteam.ygd.core.meta.MetaHolder;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueHolder;

/**
 * Represents meta a {@link MetaHolder} can hold.
 *
 * @author Jamie Mansfield
 */
public interface MetaManipulator extends ValueHolder {

    /**
     * Gets a {@link MetaContainer} representation of this manipulator.
     *
     * @return a {@link MetaContainer}.
     */
    MetaContainer toContainer();
}
