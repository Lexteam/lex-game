package uk.jamierocks.lexteam.ygd.core.service.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Represents a listener handler.
 * This wraps around a single method annotated with {@link Listener}.
 *
 * @author Jamie Mansfield
 */
public class ListenerHandler implements IDedicatedListener {

    private final Object instance;
    private final Method method;

    public ListenerHandler(Object instance, Method method) {
        this.instance = instance;
        this.method = method;
    }

    /**
     * Gets the instantiated class of which holds the method that needs to be invoked.
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

    /**
     * Invokes the given method, in the given instance.
     *
     * @param event the event to use while invoking.
     */
    @Override
    public void process(Object event) {
        if (getHandles().isAssignableFrom(event.getClass())) {
            try {
                this.method.invoke(this.instance, event);
            } catch (InvocationTargetException e) {
                IEventBus.LOGGER.error("There is something wrong :S", e);
            } catch (IllegalAccessException e) {
                IEventBus.LOGGER.error("All @Listener methods need to be public!", e);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class getHandles() {
        return this.method.getParameterTypes()[0];
    }
}
