package uk.jamierocks.lexteam.ygd.core.data.key;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

public final class Keys {

    public static final Key<Value<Logger>> LOGGER = makeSingleKey(Value.class);
    public static final Key<Value<Integer>> DURATION = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> DIRECTION_TO = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> DIRECTION_FROM = makeSingleKey(Value.class);

    public static <E, V extends Value<E>> Key<V> makeSingleKey(final Class valueClass) {
        return () -> valueClass;
    }
}
