/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.meta.manipulator.tool;

import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.core.tool.Tools;
import xyz.lexteam.meta.api.manipulator.MetaManipulator;

/**
 * Meta for {@link Tools#ADD_CONNECTION}.
 *
 * @author Jamie Mansfield
 */
public interface ToolAddConnectionMeta extends MetaManipulator {

    /**
     * Gets the direction the connection points to.
     *
     * @return the direction.
     */
    Direction to();

    /**
     * Gets the direction the connection points from.
     *
     * @return the direction.
     */
    Direction from();
}
