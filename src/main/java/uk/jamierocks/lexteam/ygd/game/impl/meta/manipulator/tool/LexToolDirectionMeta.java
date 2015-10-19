/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolDirectionMeta;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

/**
 * The meta implementation of {@link ToolDirectionMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolDirectionMeta implements ToolDirectionMeta {

    private final Direction to;
    private final Direction from;

    public LexToolDirectionMeta(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    @Override
    public Direction to() {
        return this.to;
    }

    @Override
    public Direction from() {
        return this.from;
    }
}
