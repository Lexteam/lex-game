package uk.jamierocks.lexteam.ygd.core.event.tool;

import uk.jamierocks.lexteam.ygd.core.event.Event;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;

/**
 * Represents an event that is centered around a {@link Tool}.
 *
 * @author Jamie Mansfield
 */
interface ToolEvent extends Event {

    /**
     * Gets the tool the event is centered around.
     *
     * @return the tool.
     */
    Tool getTool();
}
