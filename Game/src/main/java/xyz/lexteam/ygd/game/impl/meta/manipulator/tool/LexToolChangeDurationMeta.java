/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.manipulator.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.utils.MetaConstants;
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
