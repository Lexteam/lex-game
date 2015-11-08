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
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;
import uk.jamierocks.lexteam.ygd.game.GameLaunch;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

/**
 * Tests for Meta API.
 *
 * @author Jamie Mansfield
 */
public class MetaTest {

    public MetaTest() {
        GameLaunch.registerProcessors();
    }

    @Test
    public void gameMetaTest() {
        Game game = new LexGame();
        Assert.assertTrue(game.supportsMeta(GameMeta.class));
    }
}
