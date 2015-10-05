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
