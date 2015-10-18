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
import uk.jamierocks.lexteam.ygd.core.tool.Tools;
import uk.jamierocks.lexteam.ygd.game.impl.tool.GameTools;

/**
 * Tests for {@link GameTools}.
 *
 * @author Jamie Mansfield
 */
public class GameToolsTest {

    public GameToolsTest() {
        try {
            GameTools.injectTools();
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void addConnection() {
        Assert.assertEquals(Tools.ADD_CONNECTION, GameTools.ADD_CONNECTION);
    }

    @Test
    public void removeConnection() {
        Assert.assertEquals(Tools.REMOVE_CONNECTION, GameTools.REMOVE_CONNECTION);
    }

    @Test
    public void reverseConnection() {
        Assert.assertEquals(Tools.REVERSE_CONNECTION, GameTools.REVERSE_CONNECTION);
    }

    @Test
    public void changeDuration() {
        Assert.assertEquals(Tools.CHANGE_DURATION, GameTools.CHANGE_DURATION);
    }

    @Test
    public void weakRepairPanel() {
        Assert.assertEquals(Tools.WEAK_REPAIR_PANEL, GameTools.WEAK_REPAIR_PANEL);
    }

    @Test
    public void strongRepairPanel() {
        Assert.assertEquals(Tools.STRONG_REPAIR_PANEL, GameTools.STRONG_REPAIR_PANEL);
    }
}
