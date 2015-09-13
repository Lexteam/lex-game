package uk.jamierocks.lexteam.ygd.game.impl.panel;

import com.flowpowered.math.vector.Vector3f;
import uk.jamierocks.lexteam.ygd.core.panel.BlankPanel;

/**
 * The implementation of {@Link BlankPanel}
 * @author Tom
 */
public class GameBlankPanel implements BlankPanel {
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
