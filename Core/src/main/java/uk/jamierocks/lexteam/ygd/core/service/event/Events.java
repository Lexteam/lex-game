package uk.jamierocks.lexteam.ygd.core.service.event;

/**
 * Static access to the event bus for Core.
 *
 * @author Jamie Mansfield
 */
public final class Events {

    public static final IEventBus EVENT_BUS = null;

    /**
     * @see IEventBus#registerListener(Object)
     */
    public static void registerListener(Object listener) {
        EVENT_BUS.registerListener(listener);
    }

    /**
     * @see IEventBus#post(Object)
     */
    public static void post(Object event) {
        EVENT_BUS.post(event);
    }
}
