package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.Meta;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

/**
 * Meta for tools which change the direction.
 *
 * @author Jamie Mansfield
 */
public interface ToolDirectionMeta extends Meta {

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
