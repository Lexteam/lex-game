/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;
import uk.jamierocks.meta.api.value.Value;
import uk.jamierocks.meta.api.value.ValueHolder;
import uk.jamierocks.meta.impl.value.processor.AbstractValueProcessor;

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
