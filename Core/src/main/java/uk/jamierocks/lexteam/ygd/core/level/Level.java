package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.Set;

/**
 * Represents a level
 *
 * @author Jamie Mansfield
 */
public interface Level {
    /**
     * @return Returns the level's connection
     */
    public Set<Connection> getConnections();

    /**
     * Adds a connection
     * @param connection... The connection to be added
     */
    public void addConnection(Connection... connection);

    /**
     * A set of available points
     */
    public Set<Point> availablePoints;
}
