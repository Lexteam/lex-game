/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.util;

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
