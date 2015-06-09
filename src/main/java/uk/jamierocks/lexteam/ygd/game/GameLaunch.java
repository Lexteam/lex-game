package uk.jamierocks.lexteam.ygd.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.YGDGame;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class GameLaunch extends Game {

    public static void main(String[] args) {
        YGDGame.setGame(new GameLaunch());
    }

    @Override
    protected void init() {
        YGDGame.defaultInit();
    }

    @Override
    public void shutdown() {

    }
}
