package uk.jamierocks.lexteam.ygd.core.util;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Minimized {@link Map} implementation.
 *
 * @param <K> the key type
 * @param <V> the value type
 *
 * @author Jamie Mansfield
 */
public class LexMap<K, V> {

    private AtomicInteger indexes = new AtomicInteger();
    private List<K> keys = Lists.newArrayList();
    private List<V> values = Lists.newArrayList();

    /**
     * Adds a key, and it's value to the map.
     *
     * @param key the key.
     * @param value the value.
     */
    public void add(K key, V value) {
        if (!this.containsKey(key) && !this.containsValue(value)) {
            int index = this.indexes.getAndIncrement();
            this.keys.set(index, key);
            this.values.set(index, value);
        }
    }

    /**
     * Gets a key from it's corresponding value.
     *
     * @param value the value.
     * @return the corresponding key.
     */
    public K getKey(V value) {
        return this.keys.get(this.values.indexOf(value));
    }

    /**
     * Checks to see if the key is already in use.
     *
     * @param key the key.
     * @return boolean
     */
    public boolean containsKey(K key) {
        return this.keys.contains(key);
    }

    /**
     * Gets a value from it's corresponding key.
     *
     * @param key the key.
     * @return the corresponding value.
     */
    public V getValue(K key) {
        return this.values.get(this.values.indexOf(key));
    }

    /**
     * Checks to see if the value is already in use.
     *
     * @param value the key.
     * @return boolean
     */
    public boolean containsValue(V value) {
        return this.values.contains(value);
    }
}
