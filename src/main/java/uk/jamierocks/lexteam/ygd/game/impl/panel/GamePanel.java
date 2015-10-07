/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.panel;

import uk.jamierocks.lexteam.ygd.core.panel.Connection;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;

/**
 * The implementation of {@link Panel}.
 *
 * @author Jamie Mansfield
 * @author Tom
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
