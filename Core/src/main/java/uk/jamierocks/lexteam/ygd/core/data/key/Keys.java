package uk.jamierocks.lexteam.ygd.core.data.key;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;

public class Keys {

    public static final Key<Value<Logger>> LOGGER = makeSingleKey(Logger.class, Value.class);

    public static <E, V extends Value<E>> Key<V> makeSingleKey(final Class<E> elementClass, final Class valueClass) {
        return () -> valueClass;
    }
}
