package uk.jamierocks.lexteam.ygd.core.meta;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

import java.util.Map;

public class MetaManager {

    private static Map<Class<?>, MetaProcessor> processors = Maps.newHashMap();

    public static void registerProcessor(MetaProcessor processor) {
        processors.put(processor.getMetaType(), processor);
    }

    public static <T> T get(MetaHolder container, Class<T> key) {
        return (T) processors.get(key).getMetaFromContainer(container).get();
    }

    public static <T> boolean supports(MetaHolder container, Class<T> key) {
        return processors.get(key).supports(container);
    }

    public static <T extends MetaManipulator> boolean apply(MetaHolder container, T manipulator) {
        return processors.get(manipulator.getClass()).apply(container, manipulator);
    }
}
