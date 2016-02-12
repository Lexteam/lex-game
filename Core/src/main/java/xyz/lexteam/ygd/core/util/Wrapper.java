/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.util;

/**
 * Represents a wrapper.
 *
 * @author Jamie Mansfield
 */
public abstract class Wrapper<T> {

    private final T handle;

    public Wrapper(final T handle) {
        this.handle = handle;
    }

    public T getHandle() {
        return this.handle;
    }
}
