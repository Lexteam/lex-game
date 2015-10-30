package uk.jamierocks.lexteam.ygd.core.meta.manipulator;

import uk.jamierocks.lexteam.ygd.core.meta.MetaContainer;
import uk.jamierocks.lexteam.ygd.core.meta.MetaHolder;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueHolder;

import java.util.Optional;

/**
 * Represents meta a {@link MetaHolder} can hold.
 *
 * @author Jamie Mansfield
 */
public interface MetaManipulator extends ValueHolder {

    MetaContainer toContainer();
}
