package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.YGDGame;
import uk.jamierocks.lexteam.ygd.core.task.Task;
import uk.jamierocks.lexteam.ygd.core.provider.task.TaskManager;

import java.util.Timer;

/**
 * Represent a {@link Level} timer
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public class GameTimer {

    public Timer gameTimer;
    public Level gameLevel;

    public long timerPulseTime;

    public GameTimer(Level level, long pulseTime) {
        this.timerPulseTime = pulseTime;
        this.gameLevel = level;
        this.gameTimer = new Timer();
    }

    public void startGameTimer() {
        YGDGame.getGame().getProvider(TaskManager.class).get().addTask(new Task(gameLevel, timerPulseTime) {
            @Override
            public void run() {
                runPulse(gameLevel);
            }
        });
    }

    protected void runPulse(Level level) {
        // TODO: create
    }
}
