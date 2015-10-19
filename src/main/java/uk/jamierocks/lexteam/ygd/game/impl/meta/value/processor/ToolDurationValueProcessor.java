/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;
import uk.jamierocks.lexteam.ygd.game.impl.tool.ChangeDurationInfo;

import java.util.Optional;

public class ToolDurationValueProcessor implements ValueProcessor<Integer, Value<Integer>> {

    @Override
    public Key<? extends Value<Integer>> getKey() {
        return Keys.TOOL_DURATION;
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public boolean offer(MetaOwner container, Integer value) {
        if (container instanceof AddConnectionInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            durationInfo.setDuration(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Integer> getValueFromContainer(MetaOwner container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            return Optional.of(durationInfo.getDuration());
        }
        return Optional.empty();
    }
}
