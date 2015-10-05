package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * The most basic panel
 *
 * @author Tom Drever
 */
public interface BasePanel {

    /**
     * Gets the position of the panel represented as a {@link CubePosition}.
     *
     * @return the position of the panel.
     */
    CubePosition getCubePosition();

    /**
     * Sets the position of the panel.
     *
     * @param cubePosition the new position.
     */
    void setCubePosition(CubePosition cubePosition);
}
