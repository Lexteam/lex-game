package uk.jamierocks.lexteam.ygd.core.util.event;

import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.event.game.ShutdownGameEvent;
import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.section.Section;

/**
 * The listener for game events
 *
 * @author Jamie Mansfield
 */
public class GameListener {

    @Handler
    public void onShutdown(ShutdownGameEvent event) {
        for (Section section : event.getGame().getSectionService().getSections()) {
            for (Level level : section.getLevels()) {
                event.getGame().getTaskManager().removeTasks(level);
            }
        }
    }
}
