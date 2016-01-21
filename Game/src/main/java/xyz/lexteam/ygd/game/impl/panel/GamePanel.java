/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.panel;

import xyz.lexteam.ygd.core.panel.Connection;
import xyz.lexteam.ygd.core.panel.Panel;

/**
 * The implementation of {@link Panel}.
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public class GamePanel extends GameBasePanel implements Panel {

    private Connection connection = Connection.BLANK;
    private int duration = 1;
    private boolean burntout = false;
    private boolean isCoolingDown = false;
    private boolean isFixedPanel;

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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFixedPanel() {
        return isFixedPanel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFixedPanel(boolean fixed) {
        this.isFixedPanel = fixed;
    }
}
