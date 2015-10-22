package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

/**
 * Meta for {@link Tools#CHANGE_DURATION}.
 *
 * @author Jamie Mansfield
 */
public interface ToolChangeDurationMeta extends MetaManipulator {

    /**
     * Gets the duration of a panel.
     *
     * @return the duration.
     */
    int duration();
}
