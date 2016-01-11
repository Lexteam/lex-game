/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.tool;

/**
 * Represents the different ways tool manipulation can end.
 *
 * @author Jamie Mansfield
 */
public enum ToolManipulateResult {

    CANT_MANIPULATE,
    FAILURE,
    SUCCESS;

    /**
     * Checks is the result was successful.
     *
     * @return {@code True} if it was, {@code false} otherwise.
     */
    public boolean wasSuccessful() {
        return this == SUCCESS;
    }
}
