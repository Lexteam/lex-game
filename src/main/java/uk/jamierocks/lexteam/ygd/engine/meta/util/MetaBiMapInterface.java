/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.engine.meta.util;

import com.google.common.collect.BiMap;
import uk.jamierocks.meta.api.manipulator.MetaManipulator;

import java.util.Set;

/**
 * Created by ethan on 03/11/15.
 */
public interface MetaBiMapInterface<K, V> extends MetaManipulator {

    BiMap<K, V> getBiMap();

    V get(K key);

    K getKey(V key);

    Set<K> getKeySet();

    Set<V> getValueSet();


    void put(K key, V value);
}
