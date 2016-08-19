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
package xyz.lexteam.ygd.game.impl.meta.manipulator.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.utils.MetaConstants;
import xyz.lexteam.meta.impl.manipulator.AbstractSingularMeta;

/**
 * The meta implementation of {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolChangeDurationMeta extends AbstractSingularMeta<Integer> implements ToolChangeDurationMeta {

    public LexToolChangeDurationMeta(Integer value) {
        super(Keys.TOOL_DURATION, value);
    }

    public LexToolChangeDurationMeta() {
        this(MetaConstants.DEFAULT_TOOL_DURATION);
    }

    @Override
    public int duration() {
        return this.getValue();
    }
}
