/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.event.game;

import uk.jamierocks.lexteam.ygd.core.Game;

/**
 * Represents a shutdown event.
 *
 * @author Jamie Mansfield
 */
public class GameShutdownEvent implements GameEvent {

    private final Game game;

    public GameShutdownEvent(Game game) {
        this.game = game;
    }

    @Override
    public Game getGame() {
        return this.game;
    }
}
