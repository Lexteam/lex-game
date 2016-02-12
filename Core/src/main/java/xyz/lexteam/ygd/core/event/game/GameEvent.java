/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.event.game;

import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.event.Event;

/**
 * Represents a event that is centered around {@link Game}.
 *
 * @author Jamie Mansfield
 */
public interface GameEvent extends Event {

    /**
     * Gets the game the event is centered around.
     *
     * @return the game.
     */
    Game getGame();
}
