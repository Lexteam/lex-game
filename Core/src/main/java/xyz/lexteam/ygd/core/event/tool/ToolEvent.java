/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.event.tool;

import xyz.lexteam.ygd.core.event.Event;
import xyz.lexteam.ygd.core.tool.Tool;

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
