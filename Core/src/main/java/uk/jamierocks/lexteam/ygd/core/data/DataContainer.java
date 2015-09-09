package uk.jamierocks.lexteam.ygd.core.data;

import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;

public interface DataContainer {

    default <T> T get(Key<Value<T>> key) {
        return DataManager.get(this, key);
    }

    default <T> void offer(Key<Value<T>> key, T value) {

    }

    default <T> boolean has(Key<Value<T>> key) {
        return DataManager.has(this, key);
    }
}
