package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;

public class AddConnectionInfo implements ToolManipulatorInfo {

    private Direction to, from;

    public AddConnectionInfo(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    public Direction getTo() {
        return to;
    }

    public Direction getFrom() {
        return from;
    }
}
