package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;

public class ChangeDurationInfo implements ToolManipulatorInfo {

    private int duration;

    public ChangeDurationInfo(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
