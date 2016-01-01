/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
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

    /**
     * {@inheritDoc}
     */
    @Override
    public CubePosition getCubePosition() {
        return this.cubePosition;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCubePosition(CubePosition cubePosition) {
        this.cubePosition = cubePosition;
    }
}
