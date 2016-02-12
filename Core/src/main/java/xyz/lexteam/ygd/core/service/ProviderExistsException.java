/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.service;

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
