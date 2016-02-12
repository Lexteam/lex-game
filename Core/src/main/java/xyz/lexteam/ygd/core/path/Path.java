/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.path;

import xyz.lexteam.ygd.core.panel.BasePanel;

/**
 * Represents a 'path'.
 *
 * @author Jamie Mansfield
 */
public interface Path {

    /**
     * Gets the first panel in the circuit.
     *
     * @return the starting panel.
     */
    BasePanel getStart();

    /**
     * Gets the last panel in the circuit.
     *
     * @return the finishing panel.
     */
    BasePanel getFinish();

    /**
     * Sees if the circuit is complete.
     *
     * @return {@code true} if the circuit is complete.
     */
    boolean isComplete();

    /**
     * Gets the time it takes for the pulse, to get from the starting position to the end or the circuit.
     *
     * @return the pulse time.
     */
    int getPulseTime();
}
