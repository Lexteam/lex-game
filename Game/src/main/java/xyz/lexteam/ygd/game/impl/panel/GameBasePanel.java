/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.panel;

import xyz.lexteam.ygd.core.panel.BasePanel;
import xyz.lexteam.ygd.core.panel.CubePosition;

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
