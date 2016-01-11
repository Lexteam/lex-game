/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.service;

/**
 * This exception is called whenever an attempt is made to register a provider of a type that has previously
 * been registered.
 *
 * @author Jamie Mansfield
 */
public class ProviderExistsException extends Exception {

    public ProviderExistsException() {
        super("A provider already exists for that service!");
    }
}
