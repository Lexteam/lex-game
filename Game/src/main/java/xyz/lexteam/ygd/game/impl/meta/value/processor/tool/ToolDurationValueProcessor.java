/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
