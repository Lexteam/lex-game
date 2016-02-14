/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.module;

/**
 * Wrapper around classes with the {@link Module} annotation.
 *
 * @author Jamie Mansfield
 */
public interface ModuleContainer {

    String getId();

    String getName();

    String getVersion();

    Object getInstance();
}
