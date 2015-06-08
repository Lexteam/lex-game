package uk.jamierocks.lexteam.ygd.core;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.event.EventManager;
import uk.jamierocks.lexteam.ygd.core.service.service.SectionService;
import uk.jamierocks.lexteam.ygd.core.task.GameTaskManager;
import uk.jamierocks.lexteam.ygd.core.task.TaskOwner;

import java.util.concurrent.ConcurrentMap;

/**
 * The main game object
 *
 * This should be registered with {@link YGDGame#setGame(Game)}, by the implementation
 *
 * @author Jamie Mansfield
 */
public abstract class Game implements TaskOwner {

    private ConcurrentMap<Class<?>, Object> providers = Maps.newConcurrentMap();

    private Logger logger = LoggerFactory.getLogger("lex-game");

    public <T> Optional<T> getProvider(Class<T> providerClass) {
        Preconditions.checkNotNull(providerClass, "providerClass");
        if (providers.containsKey(providerClass)) {
            T provider = (T) providers.get(providerClass);
            return provider != null ? Optional.of(provider) : Optional.<T>absent();
        }
        throw new UnsupportedOperationException("That provider has not been registered!");
    }

    public <T> void addProvider(T provider) {
        Preconditions.checkNotNull(provider, "provider");
        providers.put(provider.getClass(), provider);
    }

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    public Logger getLogger() {
        return logger;
    }

    public abstract void shutdown();
}
