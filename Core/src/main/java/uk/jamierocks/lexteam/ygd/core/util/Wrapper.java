/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.util;

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
        return handle;
    }
}
