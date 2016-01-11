/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;
import uk.jamierocks.meta.api.manipulator.MetaManipulator;

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
