package uk.jamierocks.lexteam.ygd.core.meta.api.key;

import uk.jamierocks.lexteam.ygd.core.meta.api.value.Value;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

public final class Keys {

    // Tools
    public static final Key<Value<Integer>> DURATION = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> DIRECTION_TO = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> DIRECTION_FROM = makeSingleKey(Value.class);

    public static <E, V extends Value<E>> Key<V> makeSingleKey(final Class valueClass) {
        return () -> valueClass;
    }
}
