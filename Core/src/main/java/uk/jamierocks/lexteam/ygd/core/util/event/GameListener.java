package uk.jamierocks.lexteam.ygd.core.util.event;

import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.YGDGame;
import uk.jamierocks.lexteam.ygd.core.event.game.ShutdownGameEvent;
import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.section.Section;
import uk.jamierocks.lexteam.ygd.core.service.service.SectionService;
import uk.jamierocks.lexteam.ygd.core.task.GameTask;
import uk.jamierocks.lexteam.ygd.core.task.GameTaskManager;

/**
 * The listener for game events
 *
 * @author Jamie Mansfield
 */
public class GameListener {

    @Handler
    public void onShutdown(final ShutdownGameEvent event) {
        event.getGame().getProvider(GameTaskManager.class).get().addTask(new GameTask(event.getGame(), event.getDelay()) {
            @Override
            public void run() {
                for (Section section : event.getGame().getProvider(SectionService.class).get().getSections()) {
                    for (Level level : section.getLevels()) {
                        event.getGame().getProvider(GameTaskManager.class).get().removeTasks(level);
                    }
                }
                event.getGame().getProvider(GameTaskManager.class).get().removeTasks(event.getGame());
            }
        });
        YGDGame.destroyGame();
    }
}
