/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
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
