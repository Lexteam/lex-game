package uk.jamierocks.lexteam.ygd.core.service.event;

import java.util.Set;

/**
 * The lex-game event bus.
 *
 * @author Jamie Mansfield
 */
public interface IEventBus {

    /**
     * Registers the specified event listener.
     *
     * @param listener the event listener.
     */
    void registerListener(Object listener);

    /**
     * Posts the specified event.
     * This means all the event listeners listening to this event will be invoked.
     *
     * @param event the specified event.
     */
    void post(Object event);

    /**
     * Gets all of the registered event handlers.
     *
     * @return the event handlers.
     */
    Set<EventHandler> getHandlers();
}
