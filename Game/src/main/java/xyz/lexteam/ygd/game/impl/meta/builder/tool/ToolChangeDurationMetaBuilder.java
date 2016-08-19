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
package xyz.lexteam.ygd.game.impl.meta.builder.tool;

import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import xyz.lexteam.meta.api.builder.MetaManipulatorBuilder;

/**
 * The builder implementation for {@link ToolChangeDurationMeta}.
 *
 * @author Jamie Mansfield
 */
public class ToolChangeDurationMetaBuilder implements MetaManipulatorBuilder<ToolChangeDurationMeta> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ToolChangeDurationMeta create() {
        return new LexToolChangeDurationMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<ToolChangeDurationMeta> getType() {
        return ToolChangeDurationMeta.class;
    }
}
