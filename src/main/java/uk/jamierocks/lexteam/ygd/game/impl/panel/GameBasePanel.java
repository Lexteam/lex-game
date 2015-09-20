package uk.jamierocks.lexteam.ygd.game.impl.panel;

import com.flowpowered.math.vector.Vector3f;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;

/**
 * The implementation of {@Link BasePanel}.
 *
 * @author Jamie Mansfield
 */
public class GameBasePanel implements BasePanel {

    private Vector3f panelPosition;

    /**
     * {@inheritDoc}
     */
    @Override
    public Vector3f getPanelPosition(){
        return this.panelPosition;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPanelPosition(Vector3f panelPosition){
        this.panelPosition = panelPosition;
    }
}
