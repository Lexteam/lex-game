/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.builder.tool;

import uk.jamierocks.lexteam.ygd.core.meta.builder.MetaManipulatorBuilder;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;

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
