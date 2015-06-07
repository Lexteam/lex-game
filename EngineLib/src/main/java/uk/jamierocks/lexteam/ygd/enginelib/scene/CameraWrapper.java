package uk.jamierocks.lexteam.ygd.enginelib.scene;

import uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene.Camera;
import uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene.Tile;

public class CameraWrapper implements Camera {

    public CameraWrapper() {
        // TODO: get instance
    }

    public boolean lookAt(float x, float y, float z) {
        return LookAt(x, y, z);
    }

    @Override
    public boolean LookAt(float x, float y, float z) {
        return false;
    }

    @Override
    public boolean setActive(boolean active) {
        return false;
    }

    @Override
    public boolean setDepthMode(CameraDepthMode Mode) {
        return false;
    }

    @Override
    public boolean getActive() {
        return false;
    }

    @Override
    public CameraDepthMode getDepthMode() {
        return null;
    }

    @Override
    public boolean setPos(float x, float y, float z) {
        return false;
    }

    @Override
    public boolean setPos(Tile Tilepos) {
        return false;
    }

    @Override
    public boolean setRotation(float x, float y, float z) {
        return false;
    }

    @Override
    public boolean setScale(Tile scale) {
        return false;
    }
}
