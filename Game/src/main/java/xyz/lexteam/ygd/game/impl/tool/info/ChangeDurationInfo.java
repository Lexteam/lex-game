/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.tool.info;

import xyz.lexteam.ygd.core.tool.Tools;
import xyz.lexteam.meta.api.MetaHolder;

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
