package uk.jamierocks.lexteam.ygd.core.section.level;

import com.flowpowered.math.vector.Vector3f;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;

import java.util.Set;

/**
 * Represents a level, containing the panels
 *
 * @author Tom Drever
 */
public class Level {

    /**
     * The level's panels
     */
    private BiMap<BasePanel, Vector3f> panels = ImmutableBiMap.<BasePanel, Vector3f>builder().build();

    public Level() {}

    public Level(BiMap<BasePanel, Vector3f> panels){
        this.panels = panels;
    }

    /**
     * Gets the panels
     *
     * @return LexMap<BasePanel, Vector3f> panels
     */
    public Set<BasePanel> getPanels() {
        return panels.keySet();
    }

    /**
     * Returns a panel based on its position
     *
     * @param panelPosition the position of the panel wanted
     * @return a panel that matches the given position
     */
    public BasePanel getPanel(Vector3f panelPosition){
        return panels.inverse().get(panelPosition);
    }

    /**
     * Adds a new panel
     *
     * @param panel the new panel
     */
    public void addPanel (BasePanel panel) {
        panels.put(panel, panel.getPanelPosition());
    }
}
