/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.tool.Tools;
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
