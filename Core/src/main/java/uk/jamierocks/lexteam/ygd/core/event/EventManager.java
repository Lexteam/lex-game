package uk.jamierocks.lexteam.ygd.core.event;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import net.engio.mbassy.bus.SyncMessageBus;
import net.engio.mbassy.bus.common.Properties;
import net.engio.mbassy.bus.config.BusConfiguration;
import net.engio.mbassy.bus.config.Feature;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.YGDGame;

import java.util.HashSet;
import java.util.Set;

/**
 * https://github.com/KittehOrg/KittehIRCClientLib/blob/5dd12bbafe49e1c04ee7447b366b17f365052df7/src/main/java/org
 * /kitteh/irc/client/library/EventManager.java
 *
 * @author Jamie Mansfield
 */
public class EventManager {

    private final SyncMessageBus<Object> bus =
            new SyncMessageBus<>(new BusConfiguration().addFeature(Feature.SyncPubSub.Default()).setProperty(
                    Properties.Handler.PublicationError, new Exceptional()));
    private final Set<Object> listeners = new HashSet<>();

    /**
     * Calls an event, triggering any registered methods for the event class.
     *
     * @param event event to call
     * @throws IllegalArgumentException for a null event
     */
    public void callEvent(Object event) {
        Preconditions.checkNotNull(event, "Event cannot be null");
        this.bus.publish(event);
    }

    /**
     * Gets all registered listener objects.
     *
     * @return a set of objects
     */
    public synchronized Set<Object> getRegisteredEventListeners() {
        return Sets.newHashSet(this.listeners);
    }

    /**
     * Registers annotated with {@link Handler} with sync invocation,
     * provided they have a single parameter. This parameter is the event.
     *
     * @param listener listener in which to register events
     * @throws IllegalArgumentException for a null listener
     */
    public synchronized void registerEventListener(Object listener) {
        this.listeners.add(listener);
        this.bus.subscribe(listener);
    }

    /**
     * Unregisters a listener.
     *
     * @param listener listener to unregister
     * @throws IllegalArgumentException for a null listener
     */
    public synchronized void unregisterEventListener(Object listener) {
        this.listeners.remove(listener);
        this.bus.unsubscribe(listener);
    }

    private class Exceptional implements IPublicationErrorHandler {

        @Override
        public void handleError(PublicationError publicationError) {
            YGDGame.getGame().getLogger().error("Daim this super cool event thingy we used broke :(", publicationError);
        }
    }
}
