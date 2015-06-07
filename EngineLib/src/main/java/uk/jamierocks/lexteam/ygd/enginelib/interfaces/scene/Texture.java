package uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene;

public interface Texture {

    enum TextureFilterType {

        Linear,
        Nearest
    }

    enum TextureWrappingType {

        Repeat,
        MirroredRepeat,
        ClampToEdge,
        ClampToBorder
    }
}
