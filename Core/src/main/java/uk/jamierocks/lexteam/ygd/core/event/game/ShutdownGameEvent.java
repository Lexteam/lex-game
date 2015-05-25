package uk.jamierocks.lexteam.ygd.core.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.util.event.game.GameBaseEvent;

/**
 * The {@link Game} is taking a nap
 *
 * @author Jamie Mansfield
 */
public class ShutdownGameEvent extends GameBaseEvent {

    private long delay = 0;

    public ShutdownGameEvent(Game game) {
        super(game);
    }

    public ShutdownGameEvent(Game game, long delay) {
        super(game);
        this.delay = delay;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
}
