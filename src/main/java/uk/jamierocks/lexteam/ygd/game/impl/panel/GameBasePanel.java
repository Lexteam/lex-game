package uk.jamierocks.lexteam.ygd.game.impl.panel;

import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.CubePosition;

/**
 * The implementation of {@Link BasePanel}.
 *
 * @author Jamie Mansfield
 */
public class GameBasePanel implements BasePanel {

    private CubePosition cubePosition;

    @Override
    public CubePosition getCubePosition() {
        return cubePosition;
    }

    @Override
    public void setCubePosition(CubePosition cubePosition) {
        this.cubePosition = cubePosition;
    }
}
