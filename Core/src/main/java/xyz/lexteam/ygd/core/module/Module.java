/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.module;

/**
 * This annotation will be used by modules.
 *
 * @author Jamie Mansfield
 */
public @interface Module {

    String id();

    String name();

    String version();
}
