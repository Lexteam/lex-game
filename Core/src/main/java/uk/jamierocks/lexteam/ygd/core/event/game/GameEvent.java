package uk.jamierocks.lexteam.ygd.core.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.event.Event;

/**
 * Represents a event that is centered around {@link Game}.
 *
 * @author Jamie Mansfield
 */
interface GameEvent extends Event {

    /**
     * Gets the game the event is centered around.
     *
     * @return the game.
     */
    Game getGame();
}
