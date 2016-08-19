/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.lexteam.ygd.core.meta.key;

import xyz.lexteam.ygd.core.meta.Queries;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.meta.api.key.Key;
import xyz.lexteam.meta.api.key.KeysBase;
import xyz.lexteam.meta.api.value.Value;

public final class Keys extends KeysBase {

    // Tool API
    public static final Key<Value<Integer>> TOOL_DURATION = makeSingleKey(Value.class, Queries.DURATION);
    public static final Key<Value<Direction>> TOOL_DIRECTION_TO = makeSingleKey(Value.class, Queries.DIRECTION_TO);
    public static final Key<Value<Direction>> TOOL_DIRECTION_FROM = makeSingleKey(Value.class, Queries.DIRECTION_FROM);
}
