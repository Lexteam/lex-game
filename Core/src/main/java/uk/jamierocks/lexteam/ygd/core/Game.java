package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.meta.api.SingularMetaOwner;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game extends SingularMetaOwner<GameMeta> {

    /**
     * Gets the game's service manager.
     *
     * @return the {@link ServiceManager}.
     */
    ServiceManager getServiceManager();

    @Override
    default GameMeta getMeta() {
        return obtainMeta(GameMeta.class);
    }
}
