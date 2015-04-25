package uk.jamierocks.lexteam.ygd.core.objects;

/**
 * Class to represent the concept of a connection. Contains a PointFrom and PointTo
 *
 * @author Tom Drever
 */
public class Connection extends GameObject {

    public Point pointTo;
    public Point pointFrom;

    public Connection(Point PointTo, Point PointFrom) {
        this.pointTo = PointTo;
        this.pointFrom = PointFrom;
    }
}
