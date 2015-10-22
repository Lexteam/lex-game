package uk.jamierocks.lexteam.ygd.core.meta.key;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

import java.io.File;

public final class Keys {

    // Game
    public static final Key<Value<Logger>> GAME_LOGGER = makeSingleKey(Value.class);
    public static final Key<Value<File>> GAME_DIRECTORY = makeSingleKey(Value.class);

    // Tool API
    public static final Key<Value<Integer>> TOOL_DURATION = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> TOOL_DIRECTION_TO = makeSingleKey(Value.class);
    public static final Key<Value<Direction>> TOOL_DIRECTION_FROM = makeSingleKey(Value.class);

    public static <E, V extends Value<E>> Key<V> makeSingleKey(final Class valueClass) {
        return () -> valueClass;
    }
}
