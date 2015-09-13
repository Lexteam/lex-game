package uk.jamierocks.lexteam.ygd.core.section.level;

import com.flowpowered.math.vector.Vector3f;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.PanelMap;

/**
 * Represents a level, containing the panels
 * @author Tom
 */
public class Level {

    /**
     * The level's panels
     */
    private LexMap<BasePanel, Vector3f> panels;

    /**
     * Sets the panels
     * @return LexMap<BasePanel, Vector3f> panels
     */
    public LexMap<BasePanel, Vector3f> getPanels() {
        return panels;
    }

    public BasePanel getPanel(Vector3f panelPosition){
        return panels.getPanel(panelPosition);
    }

    /**
     * Gets the panels
     * @param panels the new panels
     */
    public void LexMap<BasePanel, Vector3f>(PanelMap panels) {
        this.panels = panels;
    }
}
