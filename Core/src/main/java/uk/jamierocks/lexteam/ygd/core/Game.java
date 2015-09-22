package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.meta.api.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game extends MetaOwner {

    /**
     * Gets the game's service manager.
     *
     * @return the {@link ServiceManager}.
     */
    ServiceManager getServiceManager();
}
