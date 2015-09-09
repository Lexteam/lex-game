package uk.jamierocks.lexteam.ygd.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.game.data.Processors;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class GameLaunch implements Game {

    public final Logger logger = LoggerFactory.getLogger("lex-game");

    public GameLaunch() {
        Processors.registerProcessors();
    }

    public static void main(String[] args) {
        new GameLaunch();
    }
}
