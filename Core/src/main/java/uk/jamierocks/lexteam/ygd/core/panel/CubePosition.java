/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
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

    @Override
    public boolean equals(Object obj) {
        return ((CubePosition) obj).cubeFace.equals(this.cubeFace) && (((CubePosition) obj).vector2f.equals(this.vector2f));
    }
}
