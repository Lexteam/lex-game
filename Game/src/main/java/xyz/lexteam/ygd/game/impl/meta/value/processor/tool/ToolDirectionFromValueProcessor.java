/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.value.processor.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import uk.jamierocks.meta.api.value.Value;
import uk.jamierocks.meta.api.value.ValueHolder;
import uk.jamierocks.meta.impl.value.processor.AbstractValueProcessor;

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
