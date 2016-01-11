/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.util.Builder;

/**
 * The {@link Tool} builder.
 *
 * @author Jamie Mansfield
 */
public interface ToolBuilder extends Builder<Tool> {

    /**
     * Sets the name of the tool.
     *
     * @param name The name.
     * @return this.
     */
    ToolBuilder name(String name);

    /**
     * Sets the cooldown time of this tool.
     *
     * @param cooldown The cooldown time.
     * @return this.
     */
    ToolBuilder cooldown(int cooldown);

    /**
     * Sets the manipulator for this tool.
     *
     * @param manipulator The manipulator.
     * @return this.
     */
    ToolBuilder manipulator(ToolManipulator manipulator);
}
