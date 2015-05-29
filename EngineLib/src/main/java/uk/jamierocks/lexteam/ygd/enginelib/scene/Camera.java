package uk.jamierocks.lexteam.ygd.enginelib.scene;

public interface Camera extends BaseModel, Transformable {

    boolean LookAt(float x, float y, float z);

    boolean setActive(boolean active);

    boolean setDepthMode(CameraDepthMode Mode);

    boolean getActive();

    CameraDepthMode getDepthMode();

    enum CameraDepthMode {

        perspective,
        orthographic
    }
}
