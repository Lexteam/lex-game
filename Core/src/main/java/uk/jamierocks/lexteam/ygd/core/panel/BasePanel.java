package uk.jamierocks.lexteam.ygd.core.panel;

import com.flowpowered.math.vector.Vector3f;

/**
 * The most basic possible panel
 *
 * @author Tom Drever
 */
public interface BasePanel {
    /**
     * Gets the panel's position
     *
     * @return Vector3f panelPosition
     */
    Vector3f getPanelPosition();

    /**
     * Sets the panel's position
     *
     * @param panelPosition the new position value
     */
    void setPanelPosition(Vector3f panelPosition);
}
