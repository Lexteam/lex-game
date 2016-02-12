/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.manipulator.tool;

import xyz.lexteam.ygd.core.meta.Queries;
import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.game.impl.meta.utils.MetaConstants;
import uk.jamierocks.meta.api.MetaContainer;
import uk.jamierocks.meta.impl.LexMetaContainer;
import uk.jamierocks.meta.impl.manipulator.AbstractMeta;

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
        this.registerGettersAndSetters();
    }

    public LexToolAddConnectionMeta() {
        this(MetaConstants.DEFAULT_TOOL_DIRECTION_TO, MetaConstants.DEFAULT_TOOL_DIRECTION_FROM);
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
    protected void registerGettersAndSetters() {
        this.registerGetter(Keys.TOOL_DIRECTION_TO, LexToolAddConnectionMeta.this::to);
        this.registerSetter(Keys.TOOL_DIRECTION_TO, LexToolAddConnectionMeta.this::setTo);

        this.registerGetter(Keys.TOOL_DIRECTION_FROM, LexToolAddConnectionMeta.this::from);
        this.registerSetter(Keys.TOOL_DIRECTION_FROM, LexToolAddConnectionMeta.this::setFrom);
    }

    @Override
    public MetaContainer toContainer() {
        return new LexMetaContainer()
                .set(Queries.DIRECTION_TO, this.to)
                .set(Queries.DIRECTION_FROM, this.from);
    }
}
