package uk.jamierocks.lexteam.ygd.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main game object
 *
 * This should be registered with {@link YGDGame#setGame(Game)}, by the implementation
 *
 * @author Jamie Mansfield
 */
public interface Game {

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    default Logger getLogger() {
        return LoggerFactory.getLogger("lex-game");
    }
}
