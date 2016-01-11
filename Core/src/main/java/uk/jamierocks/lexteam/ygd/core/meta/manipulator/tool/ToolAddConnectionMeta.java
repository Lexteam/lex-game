/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
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
