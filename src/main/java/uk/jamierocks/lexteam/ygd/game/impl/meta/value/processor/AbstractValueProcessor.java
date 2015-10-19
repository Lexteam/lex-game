/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueProcessor;

public abstract class AbstractValueProcessor<E, V extends Value<E>> implements ValueProcessor<E, V> {

    private final Key<? extends Value<E>> key;

    public AbstractValueProcessor(Key<? extends Value<E>> key) {
        this.key = key;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Key<? extends Value<E>> getKey() {
        return this.key;
    }
}
