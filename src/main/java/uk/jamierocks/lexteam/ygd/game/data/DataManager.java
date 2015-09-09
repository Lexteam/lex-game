package uk.jamierocks.lexteam.ygd.game.data;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.game.data.processor.LoggerValueProcessor;

import java.util.Map;

public class DataManager {

    private static Map<Key, ValueProcessor> processors = Maps.newHashMap();

    static {
        registerProcessor(new LoggerValueProcessor());
    }

    public static void registerProcessor(ValueProcessor processor) {
        processors.put(processor.getKey(), processor);
    }

    public static <T> T get(DataContainer container, Key<Value<T>> key) {
        return (T) processors.get(key).getValueFromContainer(container).get();
    }

    public static <T> boolean has(DataContainer container, Key<Value<T>> key) {
        return processors.get(key).supports(container);
    }
}
