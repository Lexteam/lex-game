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
import xyz.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import xyz.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;
import xyz.lexteam.meta.api.value.Value;
import xyz.lexteam.meta.api.value.ValueHolder;
import xyz.lexteam.meta.impl.value.processor.AbstractValueProcessor;

import java.util.Optional;

public class ToolDurationValueProcessor extends AbstractValueProcessor<Integer, Value<Integer>> {

    public ToolDurationValueProcessor() {
        super(Keys.TOOL_DURATION);
    }

    @Override
    public boolean supports(ValueHolder container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public boolean offer(ValueHolder container, Integer value) {
        if (container instanceof AddConnectionInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            durationInfo.setDuration(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Integer> getValueFromContainer(ValueHolder container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            return Optional.of(durationInfo.getDuration());
        }
        return Optional.empty();
    }
}
