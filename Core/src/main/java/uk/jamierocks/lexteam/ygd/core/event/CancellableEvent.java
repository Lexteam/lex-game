/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.event;

/**
 * Represents an event that can be cancelled.
 *
 * @author Jamie Mansfield
 */
public interface CancellableEvent extends Event {

    /**
     * Checks if the event is cancelled or not.
     *
     * @return {@code true} if the event is cancelled.
     */
    boolean isCancelled();

    /**
     * Changes teh event's cancelled state.
     *
     * @param cancelled the new state.
     */
    void setCancelled(boolean cancelled);
}
