package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.objects.Point;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Represents a {@link Level}'s timer
 *
 * @author Jamie Mansfield
 */
public class GameTimer {

    public Timer gameTimer;
    public Level gameLevel;

    public long timerPulseTime;

    public GameTimer(Level level, long pulseTime) {
        timerPulseTime = pulseTime;

        gameLevel = level;

        gameTimer = new Timer();
    }

    public void startGameTimer() {
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                runPulse(gameLevel);
            }
        }, timerPulseTime);
    }

    private void runPulse(Level level) {
        Point startingPoint = level.getStartingPoint();


    }
}
