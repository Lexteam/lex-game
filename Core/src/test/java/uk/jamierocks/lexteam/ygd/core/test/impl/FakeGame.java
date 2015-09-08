package uk.jamierocks.lexteam.ygd.core.test.impl;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.YGDGame;

public class FakeGame extends Game {

    @Override
    protected void init() {
        YGDGame.defaultInit();
        getLogger().info("FakeGame#init() complete");
    }

    @Override
    public void shutdown() {
        getLogger().info("FakeGame#shutdown() complete");
    }
}
