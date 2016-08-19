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
package xyz.lexteam.ygd.game.impl.meta.value.processor.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import xyz.lexteam.meta.api.value.Value;
import xyz.lexteam.meta.api.value.ValueHolder;
import xyz.lexteam.meta.impl.value.processor.AbstractValueProcessor;

import java.util.Optional;

public class ToolDirectionFromValueProcessor extends AbstractValueProcessor<Direction, Value<Direction>> {

    public ToolDirectionFromValueProcessor() {
        super(Keys.TOOL_DIRECTION_FROM);
    }

    @Override
    public boolean supports(ValueHolder container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(ValueHolder container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setFrom(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(ValueHolder container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getFrom());
        }
        return Optional.empty();
    }
}
