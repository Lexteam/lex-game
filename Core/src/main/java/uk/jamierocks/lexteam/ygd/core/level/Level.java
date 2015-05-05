package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.Set;

/**
 * Represents a level
 *
 * @author Jamie Mansfield
 */
public abstract class Level {

    /**
     * A set of connections
     */
    public Set<Connection> connections;

    /**
     * A set of available points
     */
    public Set<Point> availablePoints;
}
