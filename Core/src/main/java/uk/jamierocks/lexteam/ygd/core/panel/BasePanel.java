package uk.jamierocks.lexteam.ygd.core.panel;

import com.flowpowered.math.vector.Vector3f;

/**
 * The most basic possible panel
 *
 * @author Tom Drever
 */
public interface BasePanel {
    /**
     * Gets the position of the panel represented as a {@link Vector3f}.
     *
     * @return the position of the panel.
     */
    Vector3f getPanelPosition();

    /**
     * Sets the position of the panel.
     *
     * @param panelPosition the new position.
     */
    void setPanelPosition(Vector3f panelPosition);
}
