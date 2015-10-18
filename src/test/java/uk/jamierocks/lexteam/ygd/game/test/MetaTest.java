package uk.jamierocks.lexteam.ygd.game.test;

import org.junit.Assert;
import org.junit.Test;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
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
