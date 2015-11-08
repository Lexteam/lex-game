/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
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
