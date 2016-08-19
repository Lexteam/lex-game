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
package xyz.lexteam.ygd.game.impl.meta.processor.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;
import xyz.lexteam.meta.api.MetaContainer;
import xyz.lexteam.meta.api.MetaHolder;
import xyz.lexteam.meta.impl.processor.AbstractMetaProcessor;

import java.util.Optional;

public class ToolChangeDurationMetaProcessor extends AbstractMetaProcessor<ToolChangeDurationMeta> {

    public ToolChangeDurationMetaProcessor() {
        super(ToolChangeDurationMeta.class);
    }

    @Override
    public boolean supports(MetaHolder container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public boolean apply(MetaHolder owner, ToolChangeDurationMeta manipulator) {
        if (owner instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) owner;

            owner.offer(Keys.TOOL_DURATION, manipulator.duration());

            return info.getDuration() == manipulator.duration();
        }
        return false;
    }

    @Override
    public void apply(MetaContainer container, ToolChangeDurationMeta manipulator) {
        // TODO: implement
    }

    @Override
    public Optional<ToolChangeDurationMeta> getMetaFromContainer(MetaHolder container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) container;
            return Optional.of(new LexToolChangeDurationMeta(info.getDuration()));
        }
        return Optional.empty();
    }
}
