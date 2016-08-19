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
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;
import xyz.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import xyz.lexteam.meta.api.MetaContainer;
import xyz.lexteam.meta.api.MetaHolder;
import xyz.lexteam.meta.impl.processor.AbstractMetaProcessor;

import java.util.Optional;

public class ToolAddConnectionMetaProcessor extends AbstractMetaProcessor<ToolAddConnectionMeta> {

    public ToolAddConnectionMetaProcessor() {
        super(ToolAddConnectionMeta.class);
    }

    @Override
    public boolean supports(MetaHolder container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean apply(MetaHolder owner, ToolAddConnectionMeta manipulator) {
        if (owner instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) owner;

            info.offer(Keys.TOOL_DIRECTION_TO, manipulator.to());
            info.offer(Keys.TOOL_DIRECTION_TO, manipulator.to());

            return info.getTo() == manipulator.to() &&
                    info.getFrom() == manipulator.from();
        }
        return false;
    }

    @Override
    public void apply(MetaContainer container, ToolAddConnectionMeta manipulator) {
        // TODO: implement
    }

    @Override
    public Optional<ToolAddConnectionMeta> getMetaFromContainer(MetaHolder container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) container;
            return Optional.of(new LexToolAddConnectionMeta(info.getTo(), info.getFrom()));
        }
        return Optional.empty();
    }
}
