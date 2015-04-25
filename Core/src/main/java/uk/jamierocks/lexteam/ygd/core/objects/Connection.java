package uk.jamierocks.lexteam.ygd.core.objects;

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

    public Connection(Point PointTo, Point PointFrom) {
        this.pointTo = PointTo;
        this.pointFrom = PointFrom;
    }

    /**
     * @param connection the connection to compare to
     * @return Returns true if the connection contains a point that this connection also contains
     */
    public boolean isConnectedTo(Connection connection) {
        return connection.pointFrom == this.pointFrom || connection.pointTo == this.pointTo;
    }
}
