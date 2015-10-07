/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.utils.IApplication;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.GameSettings;
import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;
import uk.jamierocks.lexteam.ygd.core.service.SimpleServiceManager;

import java.io.File;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame implements IApplication, Game, GameMeta {

    private final ServiceManager serviceManager = new SimpleServiceManager();
    private final GameSettings gameSettings =
            new GameSettings(this,
                    new File(getDirectory(), "settings.conf"),
                    "settings.conf");

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
        return serviceManager;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameSettings getSettings() {
        return this.gameSettings;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameMeta getMeta() {
        return this;
    }
}
