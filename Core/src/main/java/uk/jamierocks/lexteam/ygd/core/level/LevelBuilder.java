package uk.jamierocks.lexteam.ygd.core.level;

import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.HashSet;
import java.util.Set;

/**
 * Builder for levels
 * @author  Tom Drever
 */
public class LevelBuilder {

    private Level level;

    public LevelBuilder() {
        level = new Createdlevel();
    }

    public LevelBuilder addConnection(Connection... connections) {
        level.addConnection(connections);
        for (Connection connection : connections){
            if (this.level.availablePoints.contains(connection.pointTo)){
                this.level.availablePoints.remove(connection.pointTo);
            }

            if (this.level.availablePoints.contains(connection.pointFrom)){
                this.level.availablePoints.remove(connection.pointFrom);
            }
        }
        return this;
    }

    private class Createdlevel implements Level {
        /**
         * Set of connections
         */
        private final Set<Connection> connections;

        /**
         * Creates new level
         */
        public Createdlevel() {
            this.connections = new HashSet<>();
        }


        @Override
        public Set<Connection> getConnections() {
            return connections;
        }

        @Override
        public void addConnection(Connection... connections) {
            for (Connection connection : Preconditions.checkNotNull(connections)) {
                this.connections.add(Preconditions.checkNotNull(connection));
            }
        }
    }
}
