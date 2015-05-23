package uk.jamierocks.lexteam.ygd.core;

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
        getGame().getSectionService().registerSection(new SectionBuilder().level().build());

        // Register event handlers
        getGame().getEventManager().registerEventListener(new ToolAbilityListener());
    }

    /**
     * Gets the currently running {@link Game}
     *
     * @return the {@link Game} being run
     */
    public static Game getGame() {
        return game;
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
            throw new UnsupportedOperationException("There is only one Game!");
        }
        YGDGame.game = Preconditions.checkNotNull(game);
        init();
    }
}
