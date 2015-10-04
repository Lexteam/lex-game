package uk.jamierocks.lexteam.ygd.core.panel;

import com.flowpowered.math.vector.Vector2f;

/**
 * Represents a position on the cube.
 *
 * @author Jamie Mansfield
 */
public class CubePosition {

    private final CubeFace cubeFace;
    private final Vector2f vector2f;

    public CubePosition(CubeFace cubeFace, Vector2f vector2f) {
        this.cubeFace = cubeFace;
        this.vector2f = vector2f;
    }

    public CubeFace getCubeFace() {
        return cubeFace;
    }

    public Vector2f getVector2f() {
        return vector2f;
    }
}
