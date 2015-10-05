package uk.jamierocks.lexteam.ygd.game.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.GameSettings;
import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;
import uk.jamierocks.lexteam.ygd.core.service.SimpleServiceManager;
import uk.jamierocks.lexteam.ygd.core.util.DataUtils;

import java.io.File;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame implements Game, GameMeta {

    private final Logger logger = LoggerFactory.getLogger("lex-game");
    private final ServiceManager serviceManager = new SimpleServiceManager();
    private final GameSettings gameSettings =
            new GameSettings(this,
                    new File(DataUtils.getDataPath().toFile(), "settings.hocon"),
                    "defaultSettings.hocon");

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger() {
        return logger;
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
