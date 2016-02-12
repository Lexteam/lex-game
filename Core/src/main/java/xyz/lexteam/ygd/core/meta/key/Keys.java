/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.meta.key;

import xyz.lexteam.ygd.core.meta.Queries;
import xyz.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.meta.api.key.Key;
import uk.jamierocks.meta.api.key.KeysBase;
import uk.jamierocks.meta.api.value.Value;

public final class Keys extends KeysBase {

    // Tool API
    public static final Key<Value<Integer>> TOOL_DURATION = makeSingleKey(Value.class, Queries.DURATION);
    public static final Key<Value<Direction>> TOOL_DIRECTION_TO = makeSingleKey(Value.class, Queries.DIRECTION_TO);
    public static final Key<Value<Direction>> TOOL_DIRECTION_FROM = makeSingleKey(Value.class, Queries.DIRECTION_FROM);
}
