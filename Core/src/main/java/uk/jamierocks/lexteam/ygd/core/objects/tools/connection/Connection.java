package uk.jamierocks.lexteam.ygd.core.objects.tools.connection;

import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.objects.Point;

import java.util.*;

/**
 * Class to represent the concept of a connection. Contains a PointFrom and PointTo
 *
 * @author Tom Drever
 */
     public class Connection extends GameObject {

     /**
     * Represents the point the connection goes to
     */
    public Point pointTo;

    /**
     * Represents the point the connection goes from
     */
    public Point pointFrom;

    /**
     * The frequency of the connection
     */
    public ConnectionFrequency connectionFrequency;

    public Connection(Point PointTo, Point PointFrom, ConnectionFrequency Frequency) {
        this.pointTo = PointTo;
        this.pointFrom = PointFrom;
        this.connectionFrequency = Frequency;
    }

    /**
     * @param connection the connection to compare to
     * @return Returns true if the connection contains a point that this connection also contains
     */
    public boolean isConnectedTo(Connection connection) {
        return connection.connectionFrequency == this.connectionFrequency && (connection.pointFrom == this.pointFrom || connection.pointTo == this.pointTo);
    }

    /**
     * @param ID The ID of the point to be checked
     * @return Returns true if the point is found within this connection
     */
    public boolean hasPoint(int ID){
        return this.pointTo.ID == ID || this.pointFrom.ID == ID;
    }

    /**
     * @return Returns the amount of points in this connection that are not null
     */
    public Set<Point> configuredPoints(){
        Set<Point> configuredPoints = new HashSet<>();

        if (this.pointTo != null){
            configuredPoints.add(this.pointTo);
        }
        if (this.pointFrom != null){
            configuredPoints.add(this.pointFrom);
        }

        return configuredPoints;
    }
}
