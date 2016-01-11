/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
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
