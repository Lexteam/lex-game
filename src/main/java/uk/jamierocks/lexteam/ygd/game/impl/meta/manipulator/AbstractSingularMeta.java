/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator;

import uk.jamierocks.lexteam.ygd.core.meta.MetaContainer;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.game.impl.meta.LexMetaContainer;

public abstract class AbstractSingularMeta<T> extends AbstractMeta {

    private final Key<Value<T>> key;
    private T value;

    public AbstractSingularMeta(Key<Value<T>> key, T value) {
        this.key = key;
        this.value = value;
        this.registerGettersAndSetters();
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    protected void registerGettersAndSetters() {
        this.registerGetter(this.key, AbstractSingularMeta.this::getValue);
        this.registerSetter(this.key, AbstractSingularMeta.this::setValue);
    }

    @Override
    public MetaContainer toContainer() {
        return new LexMetaContainer()
                .set(this.key.getQuery(), this.value);
    }
}
