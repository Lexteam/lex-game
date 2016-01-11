/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.builder.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;
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
