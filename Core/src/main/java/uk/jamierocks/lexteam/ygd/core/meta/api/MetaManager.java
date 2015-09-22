package uk.jamierocks.lexteam.ygd.core.meta.api;

import com.google.common.collect.Maps;

import java.util.Map;

public class MetaManager {

    private static Map<Class<?>, MetaProcessor> processors = Maps.newHashMap();

    public static void registerProcessor(MetaProcessor processor) {
        processors.put(processor.getMetaType(), processor);
    }

    public static <T> T get(MetaOwner container, Class<T> key) {
        return (T) processors.get(key).getMetaFromContainer(container).get();
    }

    public static <T> boolean has(MetaOwner container, Class<T>  key) {
        return processors.get(key).supports(container);
    }
}
