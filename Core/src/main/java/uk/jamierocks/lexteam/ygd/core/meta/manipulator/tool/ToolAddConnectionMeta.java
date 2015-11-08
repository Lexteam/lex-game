package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

/**
 * Meta for {@link Tools#ADD_CONNECTION}.
 *
 * @author Jamie Mansfield
 */
public interface ToolAddConnectionMeta extends MetaManipulator {

    /**
     * Gets the direction the connection points to.
     *
     * @return the direction.
     */
    Direction to();

    /**
     * Gets the direction the connection points from.
     *
     * @return the direction.
     */
    Direction from();
}
