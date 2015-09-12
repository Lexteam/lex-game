package uk.jamierocks.lexteam.ygd.game.impl.panel;

import uk.jamierocks.lexteam.ygd.core.panel.Connection;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;

public class GamePanel implements Panel {

    private Connection connection = new Connection(Direction.NONE, Direction.NONE);
    private int duration = 1;
    private boolean burntout = false;

    @Override
    public Connection getConnection() {
        return this.connection;
    }

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean isBurntout() {
        return this.burntout;
    }

    @Override
    public void setBurntout(boolean burntout) {
        this.burntout = burntout;
    }
}
