package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * @author Tom
 */
public interface Panel {

    Connection getConnection();

    void setConnection(Connection connection);

    int getDuration();

    void setDuration(int duration);

    boolean isBurntout();

    void setBurntout(boolean burntout);
}
