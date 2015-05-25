package uk.jamierocks.lexteam.ygd.enginelib.gui;

/**
 * Represents an in-game scroll menu.
 *
 * @author Jamie Mansfield
 */
public interface ScrollMenu {

    /**
     * Adds a {@link PushButton} to this scroll menu.
     *
     * @param button the {@link PushButton}
     * @return the {@link PushButton}
     */
    PushButton addbutton(PushButton button);
}
