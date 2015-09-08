package uk.jamierocks.lexteam.ygd.core;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.EventBus;
import uk.jamierocks.lexteam.ygd.core.provider.save.SaveService;
import uk.jamierocks.lexteam.ygd.core.provider.section.SectionService;
import uk.jamierocks.lexteam.ygd.core.provider.task.TaskManager;
import uk.jamierocks.lexteam.ygd.core.util.event.GameListener;
import uk.jamierocks.lexteam.ygd.core.util.event.ToolAbilityListener;
import uk.jamierocks.lexteam.ygd.core.util.provider.save.DefaultSaveService;
import uk.jamierocks.lexteam.ygd.core.util.provider.section.DefaultSectionService;
import uk.jamierocks.lexteam.ygd.core.util.provider.task.DefaultTaskManager;

/**
 * Allows static access to game internals
 *
 * @author Jamie Mansfield
 */
public final class YGDGame {

    private static Game game;

    /**
     * Initializes default implementations of game components.
     *
     * If used, this will need to be used on the game, before YGDGame#setGame(Game) is used!
     *
     * <b>THIS SHOULD ONLY BE USED BY THE IMPLEMENTATION!</b>
     */
    public static void defaultInit() {
        // Register providers
        game.registerProvider(EventBus.class, new EventBus());
        game.registerProvider(TaskManager.class, new DefaultTaskManager());
        game.registerProvider(SectionService.class, new DefaultSectionService());
        game.registerProvider(SaveService.class, new DefaultSaveService());
    }

    /**
     * Initializes game components.
     * This is called after a game is set.
     *
     * <b>THIS SHOULD ONLY BE CALLED ONCE PER GAME INSTANCE</b>
     */
    private static void init() {
        // Register sections
        // TODO: Create sections and register them.

        // Register event listeners
        game.getProvider(EventBus.class).get().register(new ToolAbilityListener());
        game.getProvider(EventBus.class).get().register(new GameListener());
    }

    /**
     * Gets the currently running {@link Game}.
     *
     * @return the {@link Game} being run
     */
    public static Game getGame() {
        if (game != null) {
            return game;
        }
        throw new UnsupportedOperationException("The game has not been registered yet!");
    }

    /**
     * Attempts to set the currently running {@link Game}.
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

        YGDGame.game.init();
        init();
    }

    /**
     * Destroys the currently running {@link Game}.
     * This is done, by setting the game variable to {@code null}.
     *
     * <b>This should only be used by the implementation, or {@link GameListener}.</b>
     */
    public static void destroyGame() {
        YGDGame.game = null;
    }
}
