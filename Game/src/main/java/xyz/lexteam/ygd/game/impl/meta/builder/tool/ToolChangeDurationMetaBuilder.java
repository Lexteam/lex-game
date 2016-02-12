/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.builder.tool;

import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import xyz.lexteam.meta.api.builder.MetaManipulatorBuilder;

/**
 * The builder implementation for {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class ToolChangeDurationMetaBuilder implements MetaManipulatorBuilder<ToolChangeDurationMeta> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ToolChangeDurationMeta create() {
        return new LexToolChangeDurationMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<ToolChangeDurationMeta> getType() {
        return ToolChangeDurationMeta.class;
    }
}
