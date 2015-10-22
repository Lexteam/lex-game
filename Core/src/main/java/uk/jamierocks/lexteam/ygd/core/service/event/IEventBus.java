package uk.jamierocks.lexteam.ygd.core.service.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The lex-game event bus.
 *
 * @author Jamie Mansfield
 */
public interface IEventBus {

    Logger LOGGER = LoggerFactory.getLogger("lex-game | event bus");

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
}
