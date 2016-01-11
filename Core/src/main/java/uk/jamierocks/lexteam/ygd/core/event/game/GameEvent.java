/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.event.Event;

/**
 * Represents a event that is centered around {@link Game}.
 *
 * @author Jamie Mansfield
 */
public interface GameEvent extends Event {

    /**
     * Gets the game the event is centered around.
     *
     * @return the game.
     */
    Game getGame();
}
