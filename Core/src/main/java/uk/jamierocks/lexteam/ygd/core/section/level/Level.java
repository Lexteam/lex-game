package uk.jamierocks.lexteam.ygd.core.section.level;

import uk.jamierocks.lexteam.ygd.core.panel.Panel;

import java.util.Set;

/**
 * Represents a level, containing the panels
 * @author Tom
 */
public class Level {

    /**
     * The level's panels
     */
    private Set<Panel> panels;

    /**
     * Sets the panels
     * @return Panel[] panels
     */
    public Set<Panel> getPanels() {
        return panels;
    }

    /**
     * Gets the panels
     * @param panels the new panels
     */
    public void setPanels(Set<Panel> panels) {
        this.panels = panels;
    }
}
