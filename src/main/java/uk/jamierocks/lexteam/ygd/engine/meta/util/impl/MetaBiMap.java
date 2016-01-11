/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.engine.meta.util.impl;

import com.google.common.collect.BiMap;
import uk.jamierocks.lexteam.ygd.engine.meta.util.MetaBiMapInterface;
import uk.jamierocks.meta.api.key.Key;
import uk.jamierocks.meta.impl.manipulator.AbstractSingularMeta;

import java.util.Set;

/**
 * Created by ethan on 03/11/15.
 */
public class MetaBiMap<K, V> extends AbstractSingularMeta<BiMap<K, V>> implements MetaBiMapInterface<K, V> {

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
