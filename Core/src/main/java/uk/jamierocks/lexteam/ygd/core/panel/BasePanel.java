/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
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
