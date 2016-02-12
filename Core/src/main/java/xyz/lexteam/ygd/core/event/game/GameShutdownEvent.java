/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.event.game;

import xyz.lexteam.ygd.core.Game;

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

    /**
     * {@inheritDoc}
     */
    @Override
    public Game getGame() {
        return this.game;
    }
}
