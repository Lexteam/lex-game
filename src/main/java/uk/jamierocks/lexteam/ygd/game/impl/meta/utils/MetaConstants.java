/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.utils.IApplication;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

import java.io.File;

/**
 * A class used for the default values of meta construction.
 *
 * @author Jamie Mansfield
 */
public final class MetaConstants {

    public static final Logger DEFAULT_GAME_LOGGER = LoggerFactory.getLogger("lex-game");
    public static final File DEFAULT_GAME_DIRECTORY = new File(IApplication.LEXTEAM_BASE_DIRECTORY, "lex-game");

    public static final Direction DEFAULT_TOOL_DIRECTION_TO = Direction.NONE;
    public static final Direction DEFAULT_TOOL_DIRECTION_FROM = Direction.NONE;

    public static final int DEFAULT_TOOL_DURATION = 5;
}
