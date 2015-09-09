package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game extends DataContainer {

    ServiceManager getServiceManager();
}
