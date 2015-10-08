package uk.jamierocks.lexteam.ygd.game.impl.panel;

import com.flowpowered.math.vector.Vector3f;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.CubePosition;

/**
 * The implementation of {@Link BasePanel}.
 *
 * @author Jamie Mansfield
 */
public class GameBasePanel implements BasePanel {

    private CubePosition cubePosition;

    /**
     * {@inheritDoc}
     */
    @Override
    public CubePosition getCubePosition() {
        return cubePosition;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCubePosition(CubePosition cubePosition) {
        this.cubePosition = cubePosition;
    }
}
