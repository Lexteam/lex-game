/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.api.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueOwner;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.ChangeDurationInfo;

import java.util.Optional;

public class DurationValueProcessor implements ValueProcessor<Integer, Value<Integer>> {

    @Override
    public Key<? extends Value<Integer>> getKey() {
        return Keys.DURATION;
    }

    @Override
    public boolean supports(ValueOwner container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public Optional<Integer> getValueFromContainer(ValueOwner container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            return Optional.of(durationInfo.getDuration());
        }
        return Optional.empty();
    }
}
