package uk.jamierocks.lexteam.ygd.core.level;

import com.google.common.base.Optional;
import uk.jamierocks.lexteam.ygd.core.object.Point;
import uk.jamierocks.lexteam.ygd.core.object.tool.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.task.TaskOwner;

import java.util.Set;

/**
 * Represents a level
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public interface Level extends TaskOwner {

    /**
     * Get the level's timer
     */
    Optional<GameTimer> getGameTimer();

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
     * Gets the starting point of the level
     */
    Point getStartingPoint();

    /**
     * Gets the end point of the level
     */
    Point getEndPoint();
}
