package uk.jamierocks.lexteam.ygd.core.object;

import com.google.common.base.Optional;

/**
 * Represents a point
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class Point {

    private final int id;
    private Point friendPoint;

    protected Point(int id) {
        this.id = id;
    }

    protected Point(int id, Point friendPoint) {
        this.id = id;
        this.friendPoint = friendPoint;
    }

    /**
     * The ID of the point
     */
    public int getId() {
        return id;
    }

    /**
     * Represents the point this point is next to on the cube (NOT the point it is connected to).
     */
    public Optional<Point> getFriendPoint() {
        return Optional.of(friendPoint);
    }

    /**
     * Sets the friend point
     */
    public void setFriendPoint(Point friendPoint) {
        this.friendPoint = friendPoint;
    }
}
