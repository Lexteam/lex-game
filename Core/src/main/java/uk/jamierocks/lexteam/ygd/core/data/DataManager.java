package uk.jamierocks.lexteam.ygd.core.data;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;

import java.util.Map;

public class DataManager {

    private static Map<Key, ValueProcessor> processors = Maps.newHashMap();

    public static void registerProcessor(ValueProcessor processor) {
        processors.put(processor.getKey(), processor);
    }

    public static <T> T get(DataContainer container, Key<Value<T>> key) {
        return (T) processors.get(key).getValueFromContainer(container).get();
    }

    public static <T> DataTransactionResult offer(Key<Value<T>> key, T value) {
        return processors.get(key).offer(value);
    }

    public static <T> boolean has(DataContainer container, Key<Value<T>> key) {
        return processors.get(key).supports(container);
    }
}
