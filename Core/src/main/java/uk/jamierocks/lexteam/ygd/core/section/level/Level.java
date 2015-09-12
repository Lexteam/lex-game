package uk.jamierocks.lexteam.ygd.core.section.level;

import uk.jamierocks.lexteam.ygd.core.panel.Panel;

import java.util.Set;

/**
 * @author Tom
 */
public class Level {
    private Set<Panel> panels;
    public Set<Panel> getPanels() {
        return panels;
    }
    public void setPanels(Set<Panel> panels) {
        this.panels = panels;
    }
}
