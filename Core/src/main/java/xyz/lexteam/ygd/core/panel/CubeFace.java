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

/**
 * Represents all the faces on the cube.
 *
 * @author Jamie Mansfield
 */
public enum CubeFace {
    TOP(Face.BACK, Face.FRONT, Face.LEFT, Face.RIGHT),
    BOTTOM(Face.FRONT, Face.BACK, Face.LEFT, Face.RIGHT),
    LEFT(Face.TOP, Face.BOTTOM, Face.FRONT, Face.BACK),
    RIGHT(Face.TOP, Face.BOTTOM, Face.FRONT, Face.BACK),
    FRONT(Face.TOP, Face.BOTTOM, Face.LEFT, Face.RIGHT),
    BACK(Face.TOP, Face.BOTTOM, Face.RIGHT, Face.LEFT);

    private final Face up;
    private final Face down;
    private final Face left;
    private final Face right;

    CubeFace(Face up, Face down, Face left, Face right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public Face getUp() {
        return up;
    }

    public Face getDown() {
        return down;
    }

    public Face getLeft() {
        return left;
    }

    public Face getRight() {
        return right;
    }

    public static CubeFace getCubeFace(Face face){
        switch (face) {
            case TOP:
                return CubeFace.TOP;
            case BOTTOM:
                return CubeFace.BOTTOM;
            case LEFT:
                return CubeFace.LEFT;
            case RIGHT:
                return CubeFace.RIGHT;
            case FRONT:
                return CubeFace.FRONT;
            case BACK:
                return CubeFace.BACK;
            default:
                return null;
        }
    }

    public enum Face {
        TOP, BOTTOM, LEFT, RIGHT, FRONT, BACK
    }
}
