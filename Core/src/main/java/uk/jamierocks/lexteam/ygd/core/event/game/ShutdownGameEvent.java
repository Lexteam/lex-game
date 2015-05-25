package uk.jamierocks.lexteam.ygd.core.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.util.event.game.GameBaseEvent;

/**
 * The {@link Game} is taking a nap
 *
 * @author Jamie Mansfield
 */
public class ShutdownGameEvent extends GameBaseEvent {

    public ShutdownGameEvent(Game game) {
        super(game);
    }
}
