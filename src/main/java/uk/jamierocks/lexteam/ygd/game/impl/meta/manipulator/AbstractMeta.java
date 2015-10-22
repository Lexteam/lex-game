/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class AbstractMeta implements MetaManipulator {

    private final Map<Key<?>, Consumer<Object>> keySetterMap = Maps.newHashMap();
    private final Map<Key<?>, Supplier<?>> keyGetterMap = Maps.newHashMap();

    protected abstract void registerGettersAndSetters();

    protected final void registerGetter(Key<?> key, Supplier<?> function) {
        this.keyGetterMap.put(Preconditions.checkNotNull(key), Preconditions.checkNotNull(function));
    }

    protected final <T> void registerSetter(Key<Value<T>> key, Consumer<T> function) {
        this.keySetterMap.put(Preconditions.checkNotNull(key), Preconditions.checkNotNull((Consumer) function));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> Optional<T> get(Key<Value<T>> key) {
        if (!supports(key)) {
            return Optional.empty();
        }
        return Optional.of((T) this.keyGetterMap.get(key).get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> boolean supports(Key<Value<T>> key) {
        return this.keySetterMap.containsKey(key);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> void set(Key<Value<T>> key, T value) {
        this.keySetterMap.get(key).accept(value);
    }
}
