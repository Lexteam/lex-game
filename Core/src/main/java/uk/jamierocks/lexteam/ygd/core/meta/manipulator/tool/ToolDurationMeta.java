package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.Meta;

/**
 * Meta for tools which change the duration.
 *
 * @author Jamie Mansfield
 */
public interface ToolDurationMeta extends Meta {

    /**
     * Gets the duration of a panel.
     *
     * @return the duration.
     */
    int duration();
}
