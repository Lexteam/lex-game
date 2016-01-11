/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.utils.MetaConstants;
import uk.jamierocks.meta.impl.manipulator.AbstractSingularMeta;

/**
 * The meta implementation of {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolChangeDurationMeta extends AbstractSingularMeta<Integer> implements ToolChangeDurationMeta {

    public LexToolChangeDurationMeta(Integer value) {
        super(Keys.TOOL_DURATION, value);
    }

    public LexToolChangeDurationMeta() {
        this(MetaConstants.DEFAULT_TOOL_DURATION);
    }

    @Override
    public int duration() {
        return this.getValue();
    }
}