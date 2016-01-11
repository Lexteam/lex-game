/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool.info;

import uk.jamierocks.lexteam.ygd.core.tool.Tools;
import uk.jamierocks.meta.api.MetaHolder;

/**
 * This is the {@link MetaHolder} implementation for {@link Tools#CHANGE_DURATION}.
 *
 * @author Jamie Mansfield
 */
public class ChangeDurationInfo implements MetaHolder {

    private int duration;

    public ChangeDurationInfo(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
