/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
