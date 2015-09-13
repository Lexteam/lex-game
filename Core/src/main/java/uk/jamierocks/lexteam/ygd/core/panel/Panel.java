package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * Represents a panel, containing a connection
 * @author Tom
 */
public interface Panel extends BasePanel{

    /**
     * Gets the panel's connection
     * @return Connection connction
     */
    Connection getConnection();

    /**
     * Sets the panel's connection
     * @param connection the new connection value
     */
    void setConnection(Connection connection);

    /**
     * Gets the duration of the panel
     * @return Int duration
     */
    int getDuration();

    /**
     *
     * @param duration the new duration value
     */
    void setDuration(int duration);

    /**
     * Gets whether or not the panel is burnt out
     * @return True if panel is burnt out
     */
    boolean isBurntout();

    /**
     * Sets whether or not the panel is burnt out
     * @param burntout the new value
     */
    void setBurntout(boolean burntout);
}
