package uk.jamierocks.lexteam.ygd.core.section.level;

import com.flowpowered.math.vector.Vector2f;
import com.flowpowered.math.vector.Vector3f;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.CubeFace;
import uk.jamierocks.lexteam.ygd.core.panel.CubePosition;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

import java.util.Map;
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

    public CubePosition getAdjacentPanelPosition(BasePanel panel, Direction direction){
        CubePosition adjacentPanelCubePosition = new CubePosition(null, null);
        switch (direction) {
            case LEFT:
                if (panel.getCubePosition().getVector2f().getX() == 0){
                    if (panel.getCubePosition().getCubeFace() == CubeFace.TOP){
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getLeft()), new Vector2f(panel.getCubePosition().getVector2f().getY(), panelsPerFace - 1));
                    }
                    else if (panel.getCubePosition().getCubeFace() == CubeFace.BOTTOM){
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getLeft()), new Vector2f(panel.getCubePosition().getVector2f().getY(), 0));
                    }
                    else{
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getLeft()), new Vector2f(panelsPerFace - 1, panel.getCubePosition().getVector2f().getY()));
                    }
                }
                else {
                    adjacentPanelCubePosition = new CubePosition(panel.getCubePosition().getCubeFace(),new Vector2f(panel.getCubePosition().getVector2f().getX() - 1,panel.getCubePosition().getVector2f().getY()));
                }
                break;
            case RIGHT:
                if (panel.getCubePosition().getVector2f().getX() == panelsPerFace - 1) {
                    if (panel.getCubePosition().getCubeFace() == CubeFace.TOP) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getRight()), new Vector2f(panel.getCubePosition().getVector2f().getY(), panelsPerFace - 1));
                    } else if (panel.getCubePosition().getCubeFace() == CubeFace.BOTTOM) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getRight()), new Vector2f(panel.getCubePosition().getVector2f().getY(), 0));
                    } else {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getRight()), new Vector2f(panelsPerFace - 1, panel.getCubePosition().getVector2f().getY()));
                    }
                }
                else {
                    adjacentPanelCubePosition = new CubePosition(panel.getCubePosition().getCubeFace(),new Vector2f(panel.getCubePosition().getVector2f().getX() + 1,panel.getCubePosition().getVector2f().getY()));
                }
                break;
            case UP:
                if (panel.getCubePosition().getVector2f().getY() == panelsPerFace - 1) {
                    if (panel.getCubePosition().getCubeFace() == CubeFace.TOP) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(panelsPerFace - 1, panel.getCubePosition().getVector2f().getY()));
                    } else if (panel.getCubePosition().getCubeFace() == CubeFace.BOTTOM) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(0, panel.getCubePosition().getVector2f().getX()));
                    } else {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(panel.getCubePosition().getVector2f().getX(), panelsPerFace - 1));
                    }
                }
                else {
                    adjacentPanelCubePosition = new CubePosition(panel.getCubePosition().getCubeFace(),new Vector2f(panel.getCubePosition().getVector2f().getX(), panel.getCubePosition().getVector2f().getY() + 1));
                }
                break;
            case DOWN:
                if (panel.getCubePosition().getVector2f().getY() == 0) {
                    if (panel.getCubePosition().getCubeFace() == CubeFace.TOP) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(panelsPerFace - 1, panel.getCubePosition().getVector2f().getY()));
                    } else if (panel.getCubePosition().getCubeFace() == CubeFace.BOTTOM) {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(0, panel.getCubePosition().getVector2f().getX()));
                    } else {
                        adjacentPanelCubePosition = new CubePosition(CubeFace.getCubeFace(panel.getCubePosition().getCubeFace().getUp()), new Vector2f(panel.getCubePosition().getVector2f().getX(), 0));
                    }
                }
                else {
                    adjacentPanelCubePosition = new CubePosition(panel.getCubePosition().getCubeFace(),new Vector2f(panel.getCubePosition().getVector2f().getX(), panel.getCubePosition().getVector2f().getY() - 1));
                }
                break;
            case NONE:
                //No.
                break;
        }
        return adjacentPanelCubePosition;
    }

    public BasePanel getAdjacentPanel(BasePanel panel, Direction direction){
        return panels.inverse().get(getAdjacentPanelPosition(panel, direction));
    }

    /**
     * Adds the specified panel to this level.
     *
     * @param panel the new panel.
     */
    public void addPanel(BasePanel panel) {
        panels.put(panel, panel.getCubePosition());
    }
}
