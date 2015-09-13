package uk.jamierocks.lexteam.ygd.core.util;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

/**
 * Minimized {@link Map} implementation.
 *
 * @param <K> the key type
 * @param <V> the value type
 *
 * @author Jamie Mansfield
 */
public class LexMap<K, V> {

    private List<K> keys = Lists.newArrayList();
    private List<V> values = Lists.newArrayList();

    public void add(K key, V value) {
        this.keys.add(key);
        this.values.add(value);
    }

    public V getValue(K key) {
        return this.values.get(this.values.indexOf(key));
    }

    public K getKey(V value) {
        return this.keys.get(this.values.indexOf(value));
    }
}
