package uk.jamierocks.lexteam.ygd.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;
import uk.jamierocks.lexteam.ygd.core.service.SimpleServiceManager;
import uk.jamierocks.lexteam.ygd.game.data.Processors;
import uk.jamierocks.lexteam.ygd.game.service.Services;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class GameLaunch implements Game {

    public final Logger logger = LoggerFactory.getLogger("lex-game");
    private final ServiceManager serviceManager = new SimpleServiceManager();

    public GameLaunch() {
        try {
            Services.registerServices(serviceManager);
        } catch (ProviderExistsException e) {
            get(Keys.LOGGER).error("A provider already exists for that service!", e);
        }
        Processors.registerProcessors();
    }

    public static void main(String[] args) {
        new GameLaunch();
    }

    @Override
    public ServiceManager getServiceManager() {
        return serviceManager;
    }
}
