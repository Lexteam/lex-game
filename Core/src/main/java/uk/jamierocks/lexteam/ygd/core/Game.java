package uk.jamierocks.lexteam.ygd.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.event.EventManager;
import uk.jamierocks.lexteam.ygd.core.service.SectionService;

/**
 * The main game object
 *
 * This should be registered with {@link YGDGame#setGame(Game)}, by the implementation
 *
 * @author Jamie Mansfield
 */
public abstract class Game {

    private EventManager eventManager = new EventManager();
    private SectionService sectionService = new SectionService();
    private Logger logger = LoggerFactory.getLogger("lex-game");

    /**
     * The game's {@link EventManager}
     *
     * @return the game's {@link EventManager}
     */
    public EventManager getEventManager() {
        return eventManager;
    }

    /**
     * The game's {@link SectionService}
     *
     * @return the game's {@link SectionService}
     */
    public SectionService getSectionService() {
        return sectionService;
    }

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    public Logger getLogger() {
        return logger;
    }
}
