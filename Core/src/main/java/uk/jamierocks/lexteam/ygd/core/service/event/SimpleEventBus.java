package uk.jamierocks.lexteam.ygd.core.service.event;

import com.google.common.collect.Sets;

import java.lang.reflect.Method;
import java.util.Set;

/**
 * A simple implementation of {@link IEventBus}.
 *
 * @author Jamie Mansfield
 */
public class SimpleEventBus implements IEventBus {

    private Set<EventHandler> eventHandlers;

    public SimpleEventBus() {
        this.eventHandlers = Sets.newHashSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerListener(Object listener) {
        for (Method m : listener.getClass().getMethods()) {
            if (m.getAnnotation(Listener.class) != null && m.getParameterCount() == 1) {
                eventHandlers.add(new EventHandler(listener, m));
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void post(Object event) {
        Class<?> clazz = event.getClass();
        for (EventHandler h : eventHandlers) {
            Class<?>[] params = h.getMethod().getParameterTypes();
            if (params[0].isAssignableFrom(clazz)) {
                try {
                    h.getMethod().invoke(h.getInstance(), event);
                } catch (Exception e) {
                    // please no
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<EventHandler> getHandlers() {
        return this.eventHandlers;
    }
}
