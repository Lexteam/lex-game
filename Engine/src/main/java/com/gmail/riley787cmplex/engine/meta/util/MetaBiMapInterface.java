/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.util;

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
