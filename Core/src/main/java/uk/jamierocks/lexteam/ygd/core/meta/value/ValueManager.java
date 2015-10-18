package uk.jamierocks.lexteam.ygd.core.meta.value;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;

import java.util.Map;
import java.util.Optional;

public class ValueManager {

    private static Map<Key, ValueProcessor> processors = Maps.newHashMap();

    public static void registerProcessor(ValueProcessor processor) {
        processors.put(processor.getKey(), processor);
    }

    public static <T> Optional<T> get(ValueOwner container, Key<Value<T>> key) {
        return processors.get(key).getValueFromContainer(container);
    }

    public static <T> boolean supports(ValueOwner container, Key<Value<T>> key) {
        return processors.get(key).supports(container);
    }

    public static <T> boolean offer(ValueOwner container, Key<Value<T>> key, T value) {
        return processors.get(key).offer(container, value);
    }
}
