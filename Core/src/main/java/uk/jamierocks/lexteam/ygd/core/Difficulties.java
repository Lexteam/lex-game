/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.tool.Tools;

/**
 * Static access to all the difficulties within the game.
 *
 * @author Jamie Mansfield
 */
public final class Difficulties {

    public static final Difficulty LOWEST = new Difficulty(Tools.REVERSE_CONNECTION, Tools.WEAK_REPAIR_PANEL);

    public static final Difficulty LOW = new Difficulty(LOWEST, Tools.ADD_CONNECTION);

    public static final Difficulty EASY = new Difficulty(LOW, Tools.REMOVE_CONNECTION);

    public static final Difficulty MEDIUM = new Difficulty(EASY, Tools.CHANGE_DURATION);

    public static final Difficulty HARD =
            new Difficulty(Tools.REVERSE_CONNECTION, Tools.STRONG_REPAIR_PANEL, Tools.ADD_CONNECTION,
                    Tools.REMOVE_CONNECTION, Tools.CHANGE_DURATION);

    public static final Difficulty HIGH = new Difficulty(HARD);

    public static final Difficulty HIGHEST = new Difficulty(HIGH);
}
