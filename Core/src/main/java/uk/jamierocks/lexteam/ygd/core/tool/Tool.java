/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.tool;

/**
 * Represents a tool.
 *
 * @author Jamie Mansfield
 */
public interface Tool {

    /**
     * Gets the tool's name.
     *
     * @return the tool's name.
     */
    String getName();

    /**
     * Gets the tool's cooldown time.
     * The time should be in seconds.
     *
     * @return the cooldown time in seconds.
     */
    int getCooldown();

    /**
     * Gets the tool's manipulator.
     *
     * @return the tool's manipulator.
     */
    ToolManipulator getManipulator();
}
