package uk.jamierocks.lexteam.ygd.enginelib.gui;

import org.jsfml.graphics.Font;
import org.jsfml.graphics.Texture;
import uk.jamierocks.lexteam.ygd.enginelib.interfaces.gui.PushButton;
import uk.jamierocks.lexteam.ygd.enginelib.interfaces.scene.Camera;

/**
 * Wrapper class for {@link Camera}
 *
 * @author Jamie Mansfield
 */
public class PushButtonWrapper implements PushButton {

    private PushButton button;

    public PushButtonWrapper(String text, Font font, Texture texture) {

    }

    /**
     * Constructs a texture based button (no text)
     *
     * @param texture the texture
     */
    public PushButtonWrapper(Texture texture) {

    }

    @Override
    public boolean setText(String text) {
        return button.setText(text);
    }

    @Override
    public boolean setPadding(float pixels) {
        return button.setPadding(pixels);
    }

    @Override
    public boolean disable(boolean disable) {
        return button.disable(disable);
    }

    @Override
    public boolean bbCollide(int x, int y) {
        return button.bbCollide(x, y);
    }
}
