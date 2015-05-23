package uk.jamierocks.lexteam.ygd.core.objects;

/**
 * Represents a point
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class Point {

    /**
     * The ID of the point
     */
    public final int ID;

    /**
     * Represents the point this point is next to on the cube (NOT the point it is connected to).
     */
    protected Point friendPoint;

    protected Point(int id) {
        this.ID = id;
    }

    protected Point(int id, Point friendPoint) {
        this.ID = id;
        this.friendPoint = friendPoint;
    }

    /**
     * Gets the friend point
     */
    public Point getFriendPoint() {
        return friendPoint;
    }

    /**
     * Sets the friend point
     */
    public void setFriendPoint(Point friendPoint) {
        this.friendPoint = friendPoint;
    }
}
