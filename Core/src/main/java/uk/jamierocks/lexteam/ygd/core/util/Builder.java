/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
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
