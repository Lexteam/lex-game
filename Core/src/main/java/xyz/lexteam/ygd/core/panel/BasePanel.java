/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.panel;

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
