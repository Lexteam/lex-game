package uk.jamierocks.lexteam.ygd.core.section.level;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.CubePosition;

import java.util.Set;

/**
 * Represents a level, containing the panels
 *
 * @author Tom Drever
 */
public class Level {

    private BiMap<BasePanel, CubePosition> panels = HashBiMap.create();

    private int panelsPerFace;

    public Level() {
    }

    public Level(BiMap<BasePanel, CubePosition> panels, int panelsPerFace) {
        this.panels = panels;
        this.panelsPerFace = panelsPerFace;
    }

    public int getPanelsPerFace() {
        return panelsPerFace;
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
    public BasePanel getPanel(CubePosition panelPosition) {
        return panels.inverse().get(panelPosition);
    }

    /*
    public BasePanel getAdjacentPanel(BasePanel panel, Direction direction){
        Vector3f adjacentPanelPosition;

        switch (direction) {
            case LEFT:
                if (panel.getPanelPosition().getX() == 1){
                    adjacentPanelPosition = new Vector3f(this.getPanelsPerFace(), panel.getPanelPosition().getY(), ((panel.getPanelPosition().getZ() - 1) % 4));
                } else {
                    adjacentPanelPosition = new Vector3f(panel.getPanelPosition().getX() - 1, panel.getPanelPosition().getY(), panel.getPanelPosition().getZ());
                }
                break;
            case RIGHT:
                if (panel.getPanelPosition().getX() == this.getPanelsPerFace()){
                    adjacentPanelPosition = new Vector3f(1, panel.getPanelPosition().getY(), ((panel.getPanelPosition().getZ() + 1) % 4));
                } else {
                    adjacentPanelPosition = new Vector3f(panel.getPanelPosition().getX() - 1, panel.getPanelPosition().getY(), panel.getPanelPosition().getZ());
                }
                break;
            case UP:
                if(panel.getPanelPosition().getY() == this.panelsPerFace){
                    // do some stuff
                } else {
                    adjacentPanelPosition = new Vector3f(panel.getPanelPosition().getX(), panel.getPanelPosition().getY() + 1, panel.getPanelPosition().getZ());
                }
                break;
            case DOWN:
                break;
            case NONE:
                //This should never be the case
                break;
        }
        return null;
    }*/

    /**
     * Adds the specified panel to this level.
     *
     * @param panel the new panel.
     */
    public void addPanel(BasePanel panel) {
        panels.put(panel, panel.getCubePosition());
    }
}
