package uk.jamierocks.lexteam.ygd.core;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.event.EventBus;
import uk.jamierocks.lexteam.ygd.core.event.provider.RegisterProviderEvent;
import uk.jamierocks.lexteam.ygd.core.task.TaskOwner;

import java.util.concurrent.ConcurrentMap;

/**
 * The main game reference - This will be the central place for many actions.
 *
 * This should be registered with {@link YGDGame#setGame(Game)}, by the implementation.
 *
 * @author Jamie Mansfield
 */
public abstract class Game implements TaskOwner {

    private ConcurrentMap<Class<?>, Object> providers = Maps.newConcurrentMap();
    private EventBus eventBus = new EventBus();
    private Logger logger = LoggerFactory.getLogger("lex-game");

    public <T> Optional<T> getProvider(Class<T> providerClass) {
        Preconditions.checkNotNull(providerClass, "providerClass");
        if (providers.containsKey(providerClass)) {
            T provider = (T) providers.get(providerClass);
            return provider != null ? Optional.of(provider) : Optional.<T>absent();
        }
        throw new UnsupportedOperationException("That provider has not been registered!");
    }

    public <T> void registerProvider(Class<?> providerClass, T provider) {
        Preconditions.checkNotNull(provider, "provider");
        Preconditions.checkNotNull(providerClass, "providerClass");

        RegisterProviderEvent event = new RegisterProviderEvent(providerClass, provider);
        eventBus.callEvent(event);

        if (!event.isCanceled()) {
            if (providers.containsKey(event.getProviderClass())) {
                throw new UnsupportedOperationException("That providerClass has already been registered!");
            }

            providers.put(event.getProviderClass(), event.getProvider());
        }
    }

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    public Logger getLogger() {
        return logger;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    protected abstract void init();

    public abstract void shutdown();
}
