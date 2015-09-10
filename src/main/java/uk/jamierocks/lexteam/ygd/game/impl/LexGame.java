package uk.jamierocks.lexteam.ygd.game.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;
import uk.jamierocks.lexteam.ygd.core.service.SimpleServiceManager;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame implements Game {

    private final Logger logger = LoggerFactory.getLogger("lex-game");
    private final ServiceManager serviceManager = new SimpleServiceManager();

    public Logger getLogger() {
        return logger;
    }

    @Override
    public ServiceManager getServiceManager() {
        return serviceManager;
    }
}
