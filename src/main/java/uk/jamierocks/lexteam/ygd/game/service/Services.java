package uk.jamierocks.lexteam.ygd.game.service;

import com.google.common.eventbus.EventBus;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.core.service.ServiceManager;

public class Services {

    public static void registerServices(ServiceManager serviceManager) throws ProviderExistsException {
        serviceManager.setProvider(EventBus.class, new EventBus());
    }
}
