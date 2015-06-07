package uk.jamierocks.lexteam.ygd.enginelib.interfaces.gui;

/**
 * Represents an in-game button.
 *
 * @author Jamie Mansfield
 */
public interface Button {

    /**
     * Sets the text of this button.
     *
     * @param text the text.
     * @return if the engine was successful in setting the text.
     */
    boolean setText(String text);

    /**
     * Sets the padding of this button.
     *
     * @param pixels the padding.
     * @return if the engine was successful in setting the padding.
     */
    boolean setPadding(float pixels);

    /**
     * Disable this button.
     *
     * @param disable weather to disable this button.
     * @return the disabled state.
     */
    boolean disable(boolean disable);

    boolean bbCollide(int x, int y);
}
