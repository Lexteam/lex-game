package uk.jamierocks.lexteam.ygd.core.service.event;

import java.lang.reflect.Method;

/**
 * Represents an event handler.
 *
 * @author Jamie Mansfield
 */
public class EventHandler {

    private final Object instance;
    private final Method method;

    public EventHandler(Object instance, Method method) {
        this.instance = instance;
        this.method = method;
    }

    /**
     * Gets the instantiated class of which hold the method that needs to be invoked.
     * This is required to invoke the method.
     *
     * @return the instantiated class.
     */
    public Object getInstance() {
        return instance;
    }

    /**
     * Gets the method of which needs to be invoked.
     *
     * @return the method.
     */
    public Method getMethod() {
        return method;
    }
}
