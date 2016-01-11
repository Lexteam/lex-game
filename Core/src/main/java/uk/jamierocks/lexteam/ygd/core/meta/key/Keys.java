/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.meta.key;

import uk.jamierocks.lexteam.ygd.core.meta.Queries;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.meta.api.key.Key;
import uk.jamierocks.meta.api.key.KeysBase;
import uk.jamierocks.meta.api.value.Value;

public final class Keys extends KeysBase {

    // Tool API
    public static final Key<Value<Integer>> TOOL_DURATION = makeSingleKey(Value.class, Queries.DURATION);
    public static final Key<Value<Direction>> TOOL_DIRECTION_TO = makeSingleKey(Value.class, Queries.DIRECTION_TO);
    public static final Key<Value<Direction>> TOOL_DIRECTION_FROM = makeSingleKey(Value.class, Queries.DIRECTION_FROM);
}