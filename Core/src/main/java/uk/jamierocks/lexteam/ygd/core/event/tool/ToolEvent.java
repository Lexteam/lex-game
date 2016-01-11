/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.event.tool;

import uk.jamierocks.lexteam.ygd.core.event.Event;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;

/**
 * Represents an event that is centered around a {@link Tool}.
 *
 * @author Jamie Mansfield
 */
public interface ToolEvent extends Event {

    /**
     * Gets the tool the event is centered around.
     *
     * @return the tool.
     */
    Tool getTool();
}
