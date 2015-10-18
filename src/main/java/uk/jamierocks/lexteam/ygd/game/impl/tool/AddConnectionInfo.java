/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

/**
 * This is the {@link ToolManipulatorInfo} implementation for {@link Tools#ADD_CONNECTION}.
 *
 * @author Jamie Mansfield
 */
public class AddConnectionInfo implements ToolManipulatorInfo {

    private Direction to;
    private Direction from;

    public AddConnectionInfo(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    public Direction getTo() {
        return to;
    }

    public void setTo(Direction to) {
        this.to = to;
    }

    public Direction getFrom() {
        return from;
    }

    public void setFrom(Direction from) {
        this.from = from;
    }
}
