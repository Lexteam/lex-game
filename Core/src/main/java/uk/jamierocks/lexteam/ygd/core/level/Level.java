package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.Set;

/**
 * Represents a level
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public interface Level {

    /**
     * Get the level's connections
     */
    Set<Connection> getConnections();

    /**
     * Add connection/s to the level's connections
     * @param connections the connection/s to be added
     */
    void addConnection(Connection... connections);

    /**
     * Remove a connection from the level
     * @param connection the connection to be removed
     */
    void removeConnection(Connection connection);

    /**
     * Get the level's available points
     */
    Set<Point> getAvailablePoints();

    /**
     * Add connection/s to the level's available point
     * @param points the point/s to be added
     */
    void addAvailablePoint(Point... points);

    /**
     * Removes a point from the level's available point
     * @param point the point o be removed
     */
    void removeAvailablePoint(Point point);
}
