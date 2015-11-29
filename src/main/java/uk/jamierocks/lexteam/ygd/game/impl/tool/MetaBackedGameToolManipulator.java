/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.meta.api.MetaHolder;
import uk.jamierocks.meta.api.manipulator.MetaManipulator;

/**
 * Extension to {@link GameToolManipulator}, to manipulate with meta directly.
 *
 * @author Jamie Mansfield
 */
public abstract class MetaBackedGameToolManipulator<M extends MetaManipulator> extends GameToolManipulator {

    private final Class<M> metaClazz;

    public MetaBackedGameToolManipulator(Tool tool, Class<M> metaClazz) {
        super(tool);
        this.metaClazz = metaClazz;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void manipulate(Panel panel, MetaHolder info) {
        if (info.supports(this.metaClazz)) {
            this.manipulatePanel(panel, info.obtain(this.metaClazz));
        }
    }

    public abstract void manipulatePanel(Panel panel, M meta);
}
