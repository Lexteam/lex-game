package uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene;

public interface Camera extends BaseModel, Transformable {

    boolean LookAt(float x, float y, float z);

    boolean setActive(boolean active);

    boolean setDepthMode(CameraDepthMode mode);

    boolean getActive();

    CameraDepthMode getDepthMode();

    enum CameraDepthMode {

        perspective,
        orthographic
    }
}
