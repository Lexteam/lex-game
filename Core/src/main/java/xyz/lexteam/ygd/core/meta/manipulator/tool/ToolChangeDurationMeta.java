/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.meta.manipulator.tool;

import xyz.lexteam.ygd.core.tool.Tools;
import uk.jamierocks.meta.api.manipulator.MetaManipulator;

/**
 * Meta for {@link Tools#CHANGE_DURATION}.
 *
 * @author Jamie Mansfield
 */
public interface ToolChangeDurationMeta extends MetaManipulator {

    /**
     * Gets the duration of a panel.
     *
     * @return the duration.
     */
    int duration();
}
