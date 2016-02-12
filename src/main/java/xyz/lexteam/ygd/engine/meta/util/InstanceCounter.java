/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.util;

/**
 * Counts instances of inherited class
 */
public abstract class InstanceCounter {

    public InstanceCounter(){
        ++instances;
        instance = instances;
    }

    public int getInstance(){
        return instance;
    }

    private int instance;
    private static int instances;
}
