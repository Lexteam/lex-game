/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.AbstractMeta;

/**
 * The meta implementation of {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolChangeDurationMeta extends AbstractMeta implements ToolChangeDurationMeta {

    private int duration;

    public LexToolChangeDurationMeta(int duration) {
        this.duration = duration;
        this.registerSetters();
    }

    @Override
    public int duration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    protected void registerSetters() {
        this.registerSetter(Keys.TOOL_DURATION, LexToolChangeDurationMeta.this::setDuration);
    }
}
