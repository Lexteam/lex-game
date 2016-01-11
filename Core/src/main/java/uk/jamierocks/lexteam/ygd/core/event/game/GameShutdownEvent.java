/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
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
