/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.util;

/**
 * Represents a builder.
 *
 * @author Jamie Mansfield
 */
public interface Builder<T> {

    /**
     * Builds the constructed object.
     *
     * @return The constructed object.
     */
    T build();
}
