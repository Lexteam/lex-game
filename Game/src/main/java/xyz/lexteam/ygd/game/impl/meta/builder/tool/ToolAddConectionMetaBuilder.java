/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.builder.tool;

import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;
import uk.jamierocks.meta.api.builder.MetaManipulatorBuilder;

/**
 * The builder implementation for {@link ToolAddConnectionMeta}.
 *
 * @author Jamie Mansfield
 */
public class ToolAddConectionMetaBuilder implements MetaManipulatorBuilder<ToolAddConnectionMeta> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ToolAddConnectionMeta create() {
        return new LexToolAddConnectionMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<ToolAddConnectionMeta> getType() {
        return ToolAddConnectionMeta.class;
    }
}
