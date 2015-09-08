package uk.jamierocks.lexteam.ygd.core.test;

import com.google.common.eventbus.EventBus;
import org.junit.Assert;
import org.junit.Test;
import uk.jamierocks.lexteam.ygd.core.YGDGame;
import uk.jamierocks.lexteam.ygd.core.provider.save.SaveService;
import uk.jamierocks.lexteam.ygd.core.provider.section.SectionService;
import uk.jamierocks.lexteam.ygd.core.provider.task.TaskManager;
import uk.jamierocks.lexteam.ygd.core.test.impl.FakeGame;

/**
 * Simple tests related to game internals.
 *
 * @author Jamie Mansfield
 */
public class GameTest {

    @Test
    public void setGameTest() {
        YGDGame.setGame(new FakeGame());

        Assert.assertTrue(YGDGame.getGame() != null);
    }

    @Test
    public void doProvidersExist() {
        Assert.assertTrue(YGDGame.getGame().getProvider(SaveService.class).isPresent());
        Assert.assertTrue(YGDGame.getGame().getProvider(SectionService.class).isPresent());
        Assert.assertTrue(YGDGame.getGame().getProvider(TaskManager.class).isPresent());
        Assert.assertTrue(YGDGame.getGame().getProvider(EventBus.class).isPresent());
    }
}
