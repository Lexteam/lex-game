/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.builder.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
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
