package uk.jamierocks.lexteam.ygd.core.service.event;

/**
 * Represents a 'dedicated listener'.
 * This is a type of listener which listens only on one event.
 *
 * @param <T> this is the type of which the event is.
 * @author Jamie Mansfield
 */
public interface IDedicatedListener<T> {

    /**
     * Processes the given event.
     *
     * @param event the event.
     */
    void process(T event);

    /**
     * Gets the type that this 'dedicated listener' listens for.
     *
     * @return the type of event.
     */
    Class<T> getHandles();
}
