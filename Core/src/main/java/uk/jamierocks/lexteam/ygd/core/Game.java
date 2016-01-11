/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

import java.io.File;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game {

    String VERSION = "%project.version%";

    /**
     * Gets the game's service manager.
     *
     * @return the {@link ServiceManager}.
     */
    ServiceManager getServiceManager();

    /**
     * Gets the user defined game settings.
     *
     * @return the {@link GameSettings}.
     */
    GameSettings getSettings();

    /**
     * Gets the game's logger.
     *
     * @return the game's {@link Logger}.
     */
    Logger getLogger();

    /**
     * Gets the game's directory.
     *
     * @return the game's {@link File}.
     */
    File getDirectory();
}
