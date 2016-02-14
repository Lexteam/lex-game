/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core;

import org.slf4j.Logger;
import xyz.lexteam.ygd.core.service.ServiceManager;

import java.io.File;

/**
 * Static access to {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame {

    private static final Game GAME = null;

    public static Game getGame() {
        return GAME;
    }

    /**
     * @see Game#getServiceManager()
     */
    public static ServiceManager getServiceManager() {
        return GAME.getServiceManager();
    }

    /**
     * @see Game#getSettings()
     */
    public static GameSettings getSettings() {
        return GAME.getSettings();
    }

    /**
     * @see Game#getLogger()
     */
    public static Logger getLogger() {
        return GAME.getLogger();
    }

    /**
     * @see Game#getDirectory()
     */
    public static File getDirectory() {
        return GAME.getDirectory();
    }
}
