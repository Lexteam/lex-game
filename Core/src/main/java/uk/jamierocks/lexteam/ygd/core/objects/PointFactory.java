package uk.jamierocks.lexteam.ygd.core.objects;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The factory that makes {@link Point}s
 *
 * @author Jamie Mansfield
 */
public class PointFactory {

    private static final AtomicInteger points = new AtomicInteger(1);

    /**
     * @return A new point with no friend point and a new ID
     */
    public static Point newPoint() {
        return new Point(points.incrementAndGet());
    }

    /**
     * @param friendPoint The friend point of the new point
     * @return A new point with a friend point and a new ID
     */
    public static Point newPoint(Point friendPoint) {
        return new Point(points.incrementAndGet(), friendPoint);
    }
}
