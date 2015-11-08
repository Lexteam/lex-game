package uk.jamierocks.lexteam.ygd.core.meta.key;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.MetaQuery;
import uk.jamierocks.lexteam.ygd.core.meta.Queries;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

import java.io.File;

public final class Keys {

    // Game
    public static final Key<Value<Logger>> GAME_LOGGER = makeSingleKey(Value.class, Queries.LOGGER);
    public static final Key<Value<File>> GAME_DIRECTORY = makeSingleKey(Value.class, Queries.DIRECTORY);

    // Tool API
    public static final Key<Value<Integer>> TOOL_DURATION = makeSingleKey(Value.class, Queries.DURATION);
    public static final Key<Value<Direction>> TOOL_DIRECTION_TO = makeSingleKey(Value.class, Queries.DIRECTION_TO);
    public static final Key<Value<Direction>> TOOL_DIRECTION_FROM = makeSingleKey(Value.class, Queries.DIRECTION_FROM);

    public static <E, V extends Value<E>> Key<V> makeSingleKey(final Class valueClass, final MetaQuery metaQuery) {
        return new Key<V>() {
            @Override
            public Class<V> getValueClass() {
                return valueClass;
            }

            @Override
            public MetaQuery getQuery() {
                return metaQuery;
            }
        };
    }
}
