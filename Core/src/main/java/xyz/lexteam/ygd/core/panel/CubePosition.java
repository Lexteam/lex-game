/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.panel;

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
