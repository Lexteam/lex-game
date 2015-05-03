package uk.jamierocks.lexteam.ygd.core.objects;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The factory that makes {@link Point}s
 *
 * @author Jamie Mansfield
 */
public class PointFactory {

    private static final AtomicInteger points = new AtomicInteger(1);

    public static Point newPoint() {
        return new Point(points.incrementAndGet());
    }
}
