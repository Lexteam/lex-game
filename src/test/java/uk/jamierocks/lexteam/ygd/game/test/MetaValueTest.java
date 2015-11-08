/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.test;

import org.junit.Assert;
import org.junit.Test;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.GameLaunch;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;

/**
 * Tests for Meta Value API.
 *
 * @author Jamie Mansfield
 */
public class MetaValueTest {

    public MetaValueTest() {
        GameLaunch.registerValueProcessors();
    }

    @Test
    public void durationTest() {
        ChangeDurationInfo info = new ChangeDurationInfo(5);
        Assert.assertEquals(info.getOrNull(Keys.TOOL_DURATION), new Integer(5));
    }

    @Test
    public void directionToTest() {
        AddConnectionInfo info = new AddConnectionInfo(Direction.DOWN, Direction.LEFT);
        Assert.assertEquals(info.getOrNull(Keys.TOOL_DIRECTION_TO), Direction.DOWN);
    }

    @Test
    public void directionFromTest() {
        AddConnectionInfo info = new AddConnectionInfo(Direction.DOWN, Direction.LEFT);
        Assert.assertEquals(info.getOrNull(Keys.TOOL_DIRECTION_FROM), Direction.LEFT);
    }
}