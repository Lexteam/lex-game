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

    private Set<DedicatedListener> eventHandlers;

    public SimpleEventBus() {
        this.eventHandlers = Sets.newHashSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerListener(Object listener) {
        if (listener instanceof DedicatedListener) {
            this.eventHandlers.add((DedicatedListener) listener);
        } else {
            for (Method m : listener.getClass().getMethods()) {
                if (m.getAnnotation(Listener.class) != null && m.getParameterCount() == 1) {
                    this.eventHandlers.add(new EventHandler(listener, m));
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void post(Object event) {
        for (DedicatedListener h : eventHandlers) {
            h.process(event);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<DedicatedListener> getHandlers() {
        return Sets.newHashSet(this.eventHandlers);
    }
}
