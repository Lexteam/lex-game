/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor;

import uk.jamierocks.lexteam.ygd.core.meta.MetaProcessor;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

public abstract class AbstractMetaProcessor<M extends MetaManipulator> implements MetaProcessor<M> {

    private final Class<M> clazz;

    public AbstractMetaProcessor(Class<M> clazz) {
        this.clazz = clazz;
    }

    /**
     * {@inheritDoc}
     */
    public Class<M> getMetaType() {
        return clazz;
    }
}
