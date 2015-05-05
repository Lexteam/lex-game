package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.PointFactory;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.ConnectionFrequency;

/**
 * The list of tool abilities
 *
 * @author Jamie Mansfield
 */
public final class ToolAbilities {

    /**
     * A class representing the ToolAbility to add points to a connection
     */
    public static final PointToolAbility ADD_POINT = new PointToolAbility() {
        @Override
        public void use(Level level, Connection connection, Point point) {
            if (connection.pointTo == null){
                connection.pointTo = point;
            }

            if (connection.pointFrom == null){
                connection.pointFrom = point;
            }
        }
    };

    /**
     * A class representing for the ToolAbility to change the frequency of the connection
     */
    public static final ConnectionFrequencyToolAbility CHANGE_CONNECTION_FREQUENCY = new ConnectionFrequencyToolAbility() {
        @Override
        public void use(Level level, Connection connection, ConnectionFrequency connectionFrequency) {
            connection.connectionFrequency = connectionFrequency;
        }
    };

    /**
     * A class representing for the ToolAbility to change the direction of the connection
     */
    public static final SimpleToolAbility CHANGE_DIRECTION = new SimpleToolAbility() {
        @Override
        public void use(Level level, Connection connection) {
            Point newPointTo = connection.pointFrom;
            Point newPointFrom = connection.pointTo;

            connection.pointTo = newPointTo;
            connection.pointFrom = newPointFrom;
        }
    };

    /**
     * A class representing for the ToolAbility to merge two connections into one
     */
    public static final MultipleConnectionToolAbility MERGE_CONNECTIONS = new MultipleConnectionToolAbility() {
        @Override
        public void use(Level level, Connection connectionOne, Connection connectionTwo) {
            if (connectionOne.configuredPoints().size() == 2 && connectionTwo.configuredPoints().size() == 2){
                // remove connectiontwo
                level.connections.remove(connectionTwo);

                // edit connectionone
                connectionOne.pointTo = connectionTwo.pointTo;
            }
        }
    };

    /**
     * A class representing for the ToolAbility to remove a point in a connection
     */
    public static final PointToolAbility REMOVE_POINT = new PointToolAbility() {
        @Override
        public void use(Level level, Connection connection, Point point) {
            if (connection.pointTo == point){
                connection.pointTo = null;
                level.availablePoints.add(point);
            }

            if (connection.pointFrom == point){
                connection.pointFrom = null;
                level.availablePoints.add(point);
            }
        }
    };
}
