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
package xyz.lexteam.ygd.core.meta;

import xyz.lexteam.meta.api.MetaQuery;
import xyz.lexteam.meta.api.QueriesBase;

public final class Queries extends QueriesBase {

    // Tools
    public static final MetaQuery DURATION = of("Duration");
    public static final MetaQuery DIRECTION_TO = of("DirectionTo");
    public static final MetaQuery DIRECTION_FROM = of("DirectionFrom");
}
