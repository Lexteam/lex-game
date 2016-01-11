/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.engine.meta.util;

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
