package uk.jamierocks.lexteam.ygd.enginelib.scene;

public interface Shader {

    Status GetStatus();

    enum ShaderType {

        Vertex,
        Fragment,
        Geometry,
        TesslantaionControl
    }

    enum Status {
        Linked,
        Compiled
    }
}
