package uk.jamierocks.lexteam.ygd.core.level;

import net.visualillusionsent.utils.TaskManager;

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
        TaskManager.scheduleDelayedTaskInMillis(new Runnable() {
            @Override
            public void run() {
                runPulse(gameLevel);
            }
        }, timerPulseTime);
    }

    protected void runPulse(Level level) {
        // TODO: create
    }
}
