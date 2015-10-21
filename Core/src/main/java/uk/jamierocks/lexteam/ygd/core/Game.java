package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game extends MetaOwner {

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

    default GameMeta getMeta() {
        return this.obtainMeta(GameMeta.class);
    }
}
