/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.panel;

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
