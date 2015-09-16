package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * Represents a panel, containing a connection
 *
 * @author Tom Drever
 */
public interface Panel extends BasePanel{

    /**
     * Gets the panel's connection.
     *
     * @return the panel's connection.
     */
    Connection getConnection();

    /**
     * Sets the panel's connection.
     *
     * @param connection the new connection.
     */
    void setConnection(Connection connection);

    /**
     * Gets the duration of the panel.
     * The duration is in seconds.
     *
     * @return the pulse duration.
     */
    int getDuration();

    /**
     * Sets the pulse duration of this panel.
     *
     * @param duration the new duration.
     */
    void setDuration(int duration);

    /**
     * Gets whether or not the panel is burnt out.
     *
     * @return True if panel is burnt out.
     */
    boolean isBurntout();

    /**
     * Sets whether or not the panel is burnt out.
     *
     * @param burntout the new value.
     */
    void setBurntout(boolean burntout);

    /**
     * Gets whether or not the panel is currently cooling down
     *
     * @return True if the panel is cooling down
     */
    boolean isCoolingDown();

    /**
     * Sets whether or not the panel is cooling down
     *
     * @param coolingDown the new value
     */
    void setCoolingDown(boolean coolingDown);

    /**
     * Gets whether the panel is fixed; whether tools can interact with it
     *
     * @return True if the panel is fixed
     */
    boolean isFixedPanel();

    /**
     * Sets whether or not the panel is fixed.
     *
     * @param fixed the new value.
     */
    void setFixedPanel(boolean fixed);

}
