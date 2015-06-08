package uk.jamierocks.lexteam.ygd.core;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import uk.jamierocks.lexteam.ygd.core.event.EventManager;
import uk.jamierocks.lexteam.ygd.core.service.service.SectionService;
import uk.jamierocks.lexteam.ygd.core.task.GameTaskManager;
import uk.jamierocks.lexteam.ygd.core.util.event.GameListener;
import uk.jamierocks.lexteam.ygd.core.util.event.ToolAbilityListener;

/**
 * Allows static access to game internals
 *
 * @author Jamie Mansfield
 */
public final class YGDGame {

    private static Game game;

    /**
     * Initializes game components
     * This is called after a game is set.
     *
     * <b>THIS SHOULD ONLY BE CALLED ONCE PER GAME INSTANCE</b>
     */
    private static void init() {
        // Register providers
        game.addProvider(new EventManager());
        game.addProvider(new SectionService());
        game.addProvider(new GameTaskManager());

        // Register sections
        // TODO: Create sections and register them.

        // Register event listeners
        game.getProvider(EventManager.class).get().registerEventListener(new ToolAbilityListener());
        game.getProvider(EventManager.class).get().registerEventListener(new GameListener());
    }

    /**
     * Gets the currently running {@link Game}
     *
     * @return the {@link Game} being run
     */
    public static Optional<Game> getGame() {
        return Optional.of(game);
    }

    /**
     * Attempts to set the currently running {@link Game}
     * This will not work, if one is already running!
     *
     * <b>THIS SHOULD ONLY BE USED BY THE IMPLEMENTATION!</b>
     *
     * @param game the {@link Game} to set.
     * @throws UnsupportedOperationException if an instance is already running.
     */
    public static void setGame(Game game) {
        if (YGDGame.game != null) {
            throw new UnsupportedOperationException("Only one game can run at once!");
        }
        YGDGame.game = Preconditions.checkNotNull(game);
        init();
    }

    /**
     * Destroys the currently running {@link Game}.
     * This is done, by setting the game to null.
     *
     * <b>This should only be used by the implementation, or {@link GameListener}.</b>
     */
    public static void destroyGame() {
        YGDGame.game = null;
    }
}
