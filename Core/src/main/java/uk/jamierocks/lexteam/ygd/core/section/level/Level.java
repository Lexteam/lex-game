package uk.jamierocks.lexteam.ygd.core.section.level;

import com.flowpowered.math.vector.Vector3f;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;

import java.util.Set;

/**
 * Represents a level, containing the panels
 *
 * @author Tom Drever
 */
public class Level {

    private BiMap<BasePanel, Vector3f> panels = HashBiMap.create();

    public Level() {
    }

    public Level(BiMap<BasePanel, Vector3f> panels) {
        this.panels = panels;
    }

    /**
     * Gets all the panels, contained in this level.
     *
     * @return all the panels.
     */
    public Set<BasePanel> getPanels() {
        return panels.keySet();
    }

    /**
     * Gets a panel based on its position.
     *
     * @param panelPosition the position of the panel wanted
     * @return a panel that matches the given position
     */
    public BasePanel getPanel(Vector3f panelPosition) {
        return panels.inverse().get(panelPosition);
    }

    /**
     * Adds the specified panel to this level.
     *
     * @param panel the new panel.
     */
    public void addPanel(BasePanel panel) {
        panels.put(panel, panel.getPanelPosition());
    }
}
