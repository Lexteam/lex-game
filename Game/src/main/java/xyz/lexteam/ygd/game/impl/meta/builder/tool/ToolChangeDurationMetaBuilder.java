/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.builder.tool;

import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import uk.jamierocks.meta.api.builder.MetaManipulatorBuilder;

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
