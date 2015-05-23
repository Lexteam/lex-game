package uk.jamierocks.lexteam.ygd.core;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import uk.jamierocks.lexteam.ygd.core.section.SectionBuilder;
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
     */
    private static void init() {
        // Register sections
        // TODO: Create sections and register them.

        // Register event listeners
        game.getEventManager().registerEventListener(new ToolAbilityListener());
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
     */
    public static void setGame(Game game) {
        if (YGDGame.game != null) {
            throw new UnsupportedOperationException("Only one game can run at once!");
        }
        YGDGame.game = Preconditions.checkNotNull(game);
        init();
    }
}
