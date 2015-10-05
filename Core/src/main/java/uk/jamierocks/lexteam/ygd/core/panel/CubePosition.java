package uk.jamierocks.lexteam.ygd.core.panel;

import com.flowpowered.math.vector.Vector2f;

/**
 * Represents a position on the cube.
 *
 * @author Jamie Mansfield
 */
public class CubePosition {

    private final Panel panel;
    private final CubeFace cubeFace;
    private final Vector2f vector2f;

    public CubePosition(Panel panel, CubeFace cubeFace, Vector2f vector2f) {
        this.panel = panel;
        this.cubeFace = cubeFace;
        this.vector2f = vector2f;
    }

    public Panel getPanel() {
        return panel;
    }

    public CubeFace getCubeFace() {
        return cubeFace;
    }

    public Vector2f getVector2f() {
        return vector2f;
    }
}
