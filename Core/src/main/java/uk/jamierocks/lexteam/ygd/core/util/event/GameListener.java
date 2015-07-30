package uk.jamierocks.lexteam.ygd.core.util.event;

import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.YGDGame;
import uk.jamierocks.lexteam.ygd.core.event.game.ShutdownGameEvent;
import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.provider.section.SectionService;
import uk.jamierocks.lexteam.ygd.core.provider.task.TaskManager;
import uk.jamierocks.lexteam.ygd.core.section.Section;
import uk.jamierocks.lexteam.ygd.core.task.Task;

/**
 * The listener for game events
 *
 * @author Jamie Mansfield
 */
public class GameListener {

    @Handler
    public void onShutdown(final ShutdownGameEvent event) {
        event.getGame().getProvider(TaskManager.class).get().addTask(new Task(event.getGame(), event.getDelay()) {
            @Override
            public void run() {
                event.getGame().getProvider(SectionService.class).get().getSections().forEach(x -> x.getLevels()
                        .forEach(y -> event.getGame().getProvider(TaskManager.class).get().removeTasks(y)));
                event.getGame().getProvider(TaskManager.class).get().removeTasks(event.getGame());
            }
        });
        YGDGame.destroyGame();
    }
}
