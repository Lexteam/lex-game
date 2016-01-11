/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * The most basic possible panel. Just holds its position.
 *
 * @author Tom Drever
 */
public interface BasePanel {

    /**
     * Gets the position of the panel represented as a {@link CubePosition}.
     *
     * @return the position of the panel.
     */
    CubePosition getCubePosition();

    /**
     * Sets the position of the panel.
     *
     * @param cubePosition the new position.
     */
    void setCubePosition(CubePosition cubePosition);
}
