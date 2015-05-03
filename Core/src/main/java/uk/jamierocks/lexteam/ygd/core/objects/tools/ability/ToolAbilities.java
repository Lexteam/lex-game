package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.PointFactory;

/**
 * The list of tool abilities
 *
 * @author Jamie Mansfield
 */
public final class ToolAbilities {

    /**
     * A class representing the ToolAbility to add points to a connection
     */
    public static final ToolAbility ADD_POINT = new ToolAbility() {
        @Override
        public void use(Connection connection, Level level) {

        }
    };

    /**
     * A class representing for the ToolAbility to change the frequency of the connection
     */
    public static final ToolAbility CHANGE_CONNECTION_FREQUENCY = new ToolAbility() {
        @Override
        public void use(Connection connection, Level level) {

        }
    };

    /**
     * A class representing for the ToolAbility to change the direction of the connection
     */
    public static final ToolAbility CHANGE_DIRECTION = new ToolAbility() {
        @Override
        public void use(Connection connection, Level level) {

        }
    };

    /**
     * A class representing for the ToolAbility to merge two connections into one
     */
    public static final ToolAbility MERGE_CONNECTIONS = new ToolAbility() {
        @Override
        public void use(Connection connection, Level level) {

        }
    };

    /**
     * A class representing for the ToolAbility to remove a point in a connection
     */
    public static final ToolAbility REMOVE_POINT = new ToolAbility() {
        @Override
        public void use(Connection connection, Level level) {

        }
    };

    /**
     * A class representing for the ToolAbility to split a connection into two new connections
     */
    public static final ToolAbility SPLIT_CONNECTION = new ToolAbility() {
        @Override
        public void use(Connection oldConnection, Level level) {
            Point newPoint = PointFactory.newPoint();
            Connection newConnection = new Connection(newPoint, oldConnection.pointTo);
            oldConnection.pointTo = newPoint;
        }
    };
}
