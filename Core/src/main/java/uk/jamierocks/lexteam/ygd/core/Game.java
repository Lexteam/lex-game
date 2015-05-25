package uk.jamierocks.lexteam.ygd.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.event.EventManager;
import uk.jamierocks.lexteam.ygd.core.service.SectionService;
import uk.jamierocks.lexteam.ygd.core.task.GameTaskManager;

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
    private GameTaskManager taskManager = new GameTaskManager();
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
     * The game's {@link GameTaskManager}
     *
     * @return the game's {@link GameTaskManager}
     */
    public GameTaskManager getTaskManager() {
        return taskManager;
    }

    /**
     * The game's main {@link Logger}
     *
     * @return the main {@link Logger}
     */
    public Logger getLogger() {
        return logger;
    }

    public abstract void shutdown();
}
