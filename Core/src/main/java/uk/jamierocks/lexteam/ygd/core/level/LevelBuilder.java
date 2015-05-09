package uk.jamierocks.lexteam.ygd.core.level;

    import com.google.common.base.Preconditions;
    import uk.jamierocks.lexteam.ygd.core.objects.Point;
    import uk.jamierocks.lexteam.ygd.core.objects.PointFactory;
    import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

    import java.util.Collection;
    import java.util.HashSet;
    import java.util.Iterator;
    import java.util.Set;

    /**
     * Builder for levels
     * @author  Tom Drever
     */
    public class LevelBuilder {

        /**
         * The level built
         */
        private Level level;

        /**
         *  Creates a new level
         */
        public LevelBuilder() {
            level = new CreatedLevel() {
            };
        }

        /**
         *
         */
        public Level build(){
            return level;
        }

        /**
         * Implemented method of adding a connection that also removes the relevant points from the available points
         * @param connections the connection/s to be added
         */
        public void addConnection(Connection... connections) {
            this.level.addConnection((connections));

            for (Connection connection : connections){
                this.level.removeAvailablePoint(connection.pointFrom);
                this.level.removeAvailablePoint(connection.pointTo);
            }
        }

        public void populateAvailablePoints(){
            //for ... this.level.addAvailablePoint();
        }

        private class CreatedLevel implements Level {

            public final Set<Connection> connections;

            public final Set<Point> availablePoints;

            public final GameTimer gameTimer;

            public final Point startPoint;
            public final Point endPoint;

            /**
             * Creates an completely empty {@link Level}
             */
            public CreatedLevel(){
                connections = new HashSet<>();
                availablePoints = new HashSet<>();
                gameTimer = new GameTimer(this);

                startPoint = PointFactory.newPoint();
                endPoint = PointFactory.newPoint();
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
                for (Connection connection : connections){
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
            public Set<Point> getAvailablePoints() {
                return this.availablePoints;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public void addAvailablePoint(Point... points) {
                for (Point point : points){
                    this.availablePoints.add(point);
                }
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public void removeAvailablePoint(Point point) {
                this.availablePoints.remove(point);
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
            public Point getEndPoint(){
                return endPoint;
            }
        }
}
