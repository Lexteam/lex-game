package uk.jamierocks.lexteam.ygd.enginelib.scene;

import com.sun.jna.Native;
import uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene.Camera;
import uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene.Tile;

/**
 * Wrapper class for {@link Camera}
 *
 * @author Jamie Mansfield
 */
public class CameraWrapper implements Camera {

    private final Camera camera;

    public CameraWrapper() {
        camera = (Camera) Native.loadLibrary(Camera.class);
    }

    public boolean lookAt(float x, float y, float z) {
        return LookAt(x, y, z);
    }

    @Override
    public boolean LookAt(float x, float y, float z) {
        return camera.LookAt(x, y, z);
    }

    @Override
    public boolean setActive(boolean active) {
        return camera.setActive(active);
    }

    @Override
    public boolean setDepthMode(CameraDepthMode mode) {
        return camera.setDepthMode(mode);
    }

    @Override
    public boolean getActive() {
        return camera.getActive();
    }

    @Override
    public CameraDepthMode getDepthMode() {
        return camera.getDepthMode();
    }

    @Override
    public boolean setPos(float x, float y, float z) {
        return camera.setPos(x, y, z);
    }

    @Override
    public boolean setPos(Tile tilepos) {
        return camera.setPos(tilepos);
    }

    @Override
    public boolean setRotation(float x, float y, float z) {
        return camera.setRotation(x, y, z);
    }

    @Override
    public boolean setScale(Tile scale) {
        return camera.setScale(scale);
    }
}
