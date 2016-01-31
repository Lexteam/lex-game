/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.service.event;

import xyz.lexteam.eventbus.IEventBus;

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
