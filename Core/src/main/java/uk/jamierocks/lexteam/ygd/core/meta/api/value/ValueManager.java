package uk.jamierocks.lexteam.ygd.core.meta.api.value;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;

import java.util.Map;

public class ValueManager {

    private static Map<Key, ValueProcessor> processors = Maps.newHashMap();

    public static void registerProcessor(ValueProcessor processor) {
        processors.put(processor.getKey(), processor);
    }

    public static <T> T get(ValueOwner container, Key<Value<T>> key) {
        return (T) processors.get(key).getValueFromContainer(container).get();
    }

    public static <T> boolean supports(ValueOwner container, Key<Value<T>> key) {
        return processors.get(key).supports(container);
    }

    public static <T> boolean offer(ValueOwner container, Key<Value<T>> key, T value) {
        return processors.get(key).offer(container, value);
    }
}
