/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

/**
 * This is the {@link ToolManipulatorInfo} implementation for {@link Tools#CHANGE_DURATION}.
 *
 * @author Jamie Mansfield
 */
public class ChangeDurationInfo implements ToolManipulatorInfo {

    private int duration;

    public ChangeDurationInfo(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
