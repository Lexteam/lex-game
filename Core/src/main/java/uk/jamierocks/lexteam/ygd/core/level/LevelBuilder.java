package uk.jamierocks.lexteam.ygd.core.level;

import com.google.common.collect.Sets;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.PointFactory;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.Set;

/**
 * Builder to create a {@link Level}
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class LevelBuilder {

    public final Set<Connection> connections = Sets.newHashSet();

    public Level build() {
        return new CreatedLevel(connections);
    }

    /**
     * Implemented method of adding a connection that also removes the relevant points from the available points
     *
     * @param connections the connection/s to be added
     */
    public LevelBuilder connection(Connection... connections) {
        for (Connection connection : connections) {
            this.connections.add(connection);
        }
        return this;
    }

    private class CreatedLevel implements Level {

        public final Set<Connection> connections;

        public final GameTimer gameTimer = new GameTimer(this, 1000);
        ;

        public final Point startPoint = PointFactory.newPoint();
        public final Point endPoint = PointFactory.newPoint();

        public CreatedLevel(Set<Connection> connections) {
            this.connections = connections;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Set<Connection> getConnections() {
            return this.connections;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void addConnection(Connection... connections) {
            for (Connection connection : connections) {
                this.connections.add(connection);
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void removeConnection(Connection connection) {
            this.connections.remove(connection);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public GameTimer getGameTimer() {
            return this.gameTimer;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Point getStartingPoint() {
            return startPoint;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Point getEndPoint() {
            return endPoint;
        }
    }
}
