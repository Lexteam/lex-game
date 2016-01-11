/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.util.impl;

import com.google.common.collect.BiMap;

import com.gmail.riley787cmplex.engine.meta.util.MetaBiMapInterface;
import uk.jamierocks.meta.api.key.Key;
import uk.jamierocks.meta.impl.manipulator.AbstractSingularMeta;

import java.util.Set;

/**
 * Created by ethan on 03/11/15.
 */
public class MetaBiMap<K, V> extends AbstractSingularMeta<BiMap<K, V>> implements MetaBiMapInterface<K, V>{

    public MetaBiMap(Key key, BiMap<K,V> data){
        super(key, data);
    }

    @Override
    public BiMap<K, V> getBiMap(){return getValue();}

    public V get(K key){return getValue().get(key);}

    public K getKey(V key){return getValue().inverse().get(key);}

    public Set<K> getKeySet(){
        return getValue().keySet();
    }

    public Set<V> getValueSet(){return getValue().inverse().keySet();}


    public void put(K key, V value){getValue().put(key, value);}

}
