/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;

/**
 * The meta implementation of {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolChangeDurationMeta implements ToolChangeDurationMeta {

    private final int duration;

    public LexToolChangeDurationMeta(int duration) {
        this.duration = duration;
    }

    @Override
    public int duration() {
        return this.duration;
    }
}
