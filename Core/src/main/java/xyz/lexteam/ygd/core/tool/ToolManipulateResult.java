/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.tool;

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
