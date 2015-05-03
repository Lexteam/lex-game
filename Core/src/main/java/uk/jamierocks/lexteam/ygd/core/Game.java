package uk.jamierocks.lexteam.ygd.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.section.SectionManager;

/**
 * The main game object
 *
 * This should be registered with {@link YGDGame#setGame(Game)}, by the implementation
 *
 * @author Jamie Mansfield
 */
public abstract class Game {

    /**
     * The game's {@link SectionManager}
     *
     * @return the game's {@link SectionManager}
     */
    public abstract SectionManager getSectionManager();

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    public Logger getLogger() {
        return LoggerFactory.getLogger("lex-game");
    }
}
