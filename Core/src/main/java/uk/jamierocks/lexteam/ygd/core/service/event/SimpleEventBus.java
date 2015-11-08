package uk.jamierocks.lexteam.ygd.core.service.event;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

/**
 * A simple implementation of {@link IEventBus}.
 *
 * @author Jamie Mansfield
 */
public class SimpleEventBus implements IEventBus {

    private Map<Class, Set<IDedicatedListener>> handlers;

    public SimpleEventBus() {
        this.handlers = Maps.newHashMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerListener(Object listener) {
        if (listener instanceof IDedicatedListener) {
            IDedicatedListener dedicatedListener = (IDedicatedListener) listener;
            Set<IDedicatedListener> listeners =
                    this.handlers.getOrDefault(dedicatedListener.getHandles(), Sets.newHashSet());
            listeners.add(dedicatedListener);
            this.handlers.put(dedicatedListener.getHandles(), listeners);
        } else {
            for (Method m : listener.getClass().getMethods()) {
                if (m.getAnnotation(Listener.class) != null && m.getParameterCount() == 1) {
                    ListenerHandler handler = new ListenerHandler(listener, m);
                    Set<IDedicatedListener> listeners =
                            this.handlers.getOrDefault(handler.getHandles(), Sets.newHashSet());
                    listeners.add(handler);
                    this.handlers.put(handler.getHandles(), listeners);
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void post(Object event) {
        for (IDedicatedListener listener : handlers.get(event.getClass())) {
            listener.process(event);
        }
    }
}
