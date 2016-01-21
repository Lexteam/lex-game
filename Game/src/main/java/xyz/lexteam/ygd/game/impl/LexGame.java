/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.utils.IApplication;
import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.GameSettings;
import xyz.lexteam.ygd.core.service.ServiceManager;
import xyz.lexteam.ygd.core.service.SimpleServiceManager;

import java.io.File;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame implements IApplication, Game {

    private final ServiceManager serviceManager = new SimpleServiceManager();
    private final GameSettings gameSettings = new GameSettings(this,
                    new File(getDirectory(), "settings.conf"), "/settings.conf");

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "lex-game";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File getDirectory() {
        File directory = new File(LEXTEAM_BASE_DIRECTORY, getSafeName());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        return directory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger() {
        return LoggerFactory.getLogger(getSafeName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceManager getServiceManager() {
        return this.serviceManager;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameSettings getSettings() {
        return this.gameSettings;
    }
}
