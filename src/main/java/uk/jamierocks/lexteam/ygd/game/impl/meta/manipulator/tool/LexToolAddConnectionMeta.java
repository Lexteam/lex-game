/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.AbstractMeta;

/**
 * The meta implementation of {@link ToolAddConnectionMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolAddConnectionMeta extends AbstractMeta implements ToolAddConnectionMeta {

    private Direction to;
    private Direction from;

    public LexToolAddConnectionMeta(Direction to, Direction from) {
        this.to = to;
        this.from = from;
        this.registerSetters();
    }

    @Override
    public Direction to() {
        return this.to;
    }

    @Override
    public Direction from() {
        return this.from;
    }

    public void setTo(Direction to) {
        this.to = to;
    }

    public void setFrom(Direction from) {
        this.from = from;
    }

    @Override
    protected void registerSetters() {
        this.registerSetter(Keys.TOOL_DIRECTION_TO, LexToolAddConnectionMeta.this::setTo);
        this.registerSetter(Keys.TOOL_DIRECTION_FROM, LexToolAddConnectionMeta.this::setFrom);
    }
}
