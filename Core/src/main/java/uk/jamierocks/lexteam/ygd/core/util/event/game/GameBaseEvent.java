package uk.jamierocks.lexteam.ygd.core.util.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;

/**
 * An event involving the {@link Game}
 *
 * @author Jamie Mansfield
 */
public class GameBaseEvent {

    private final Game game;

    public GameBaseEvent(Game game) {
        this.game = game;
    }

    /**
     * The game
     *
     * @return the game
     */
    public Game getGame() {
        return game;
    }
}
