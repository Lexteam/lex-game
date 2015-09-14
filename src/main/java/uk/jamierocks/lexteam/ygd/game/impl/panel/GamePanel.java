package uk.jamierocks.lexteam.ygd.game.impl.panel;

import com.flowpowered.math.vector.Vector3f;
import uk.jamierocks.lexteam.ygd.core.panel.Connection;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;

/**
 * The implementation of {@link Panel}.
 *
 * @author Jamie Mansfield
 */
public class GamePanel implements Panel {

    private Connection connection = Connection.BLANK;
    private int duration = 1;
    private boolean burntout = false;
    private Vector3f panelPosition;
    private boolean isCoolingDown = false;

    /**
     * {@inheritDoc}
     */
    @Override
    public Connection getConnection() {
        return this.connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDuration() {
        return this.duration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isBurntout() {
        return this.burntout;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBurntout(boolean burntout) {
        this.burntout = burntout;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vector3f getPanelPosition(){
        return this.panelPosition;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPanelPosition(Vector3f panelPosition){
        this.panelPosition = panelPosition;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCoolingDown() {
        return this.isCoolingDown;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCoolingDown(boolean isCoolingDown) {
        this.isCoolingDown = isCoolingDown;
    }
}
