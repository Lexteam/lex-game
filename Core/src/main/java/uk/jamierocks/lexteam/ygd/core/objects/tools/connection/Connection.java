package uk.jamierocks.lexteam.ygd.core.objects.tools.connection;

import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.PointFactory;

import java.util.HashSet;
import java.util.Random;

/**
 * Class to represent the concept of a connection. Contains a PointFrom and PointTo
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class Connection implements GameObject {

    /**
     * Represents the point the connection goes to
     */
    public Point pointTo;

    /**
     * Represents the point the connection goes from
     */
    public Point pointFrom;

    /**
     * All the points that could possibly be selected in the connection
     */
    public HashSet<Point> availablePoints;

    /**
     * The frequency of the connection
     */
    public ConnectionFrequency connectionFrequency;

    public Connection(Point pointTo, Point pointFrom, ConnectionFrequency frequency) {
        this.pointTo = pointTo;
        this.pointFrom = pointFrom;
        this.connectionFrequency = frequency;

        this.availablePoints = new HashSet<>();
        this.populateAvailablePoints();
    }

    /**
     * Checks if this Connection is connected to another Connection
     *
     * @param connection the connection to compare to
     * @return {@code true} if the connection contains a point that this connection also contains
     */
    public boolean isConnectedTo(Connection connection) {
        return connection.connectionFrequency == this.connectionFrequency && (connection.pointFrom == this.pointFrom
                || connection.pointTo == this.pointTo);
    }

    /**
     * Checks is this Connection contains a Point
     *
     * @param ID the ID of the point to be checked
     * @return {@code true} if the point is found within this connection
     */
    public boolean hasPoint(int ID) {
        return this.pointTo.ID == ID || this.pointFrom.ID == ID;
    }

    /**
     * Populates the "availablepoints" with a random(ish) number of points
     */
    private void populateAvailablePoints() {
        Random r = new Random();
        for (int i = 0; (i < r.nextInt((4 - 2) + 1) + 2); i++) {
            this.availablePoints.add(PointFactory.newPoint());
        }
    }
}
