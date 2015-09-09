package uk.jamierocks.lexteam.ygd.core.data;

import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;

public interface DataContainer {

    <T> T get(Key<Value<T>> key);

    <T> void offer(Key<Value<T>> key, T value);

    <T> boolean has(Key<Value<T>> key);
}
