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
import xyz.lexteam.meta.api.value.Value;
import xyz.lexteam.meta.api.value.ValueHolder;
import xyz.lexteam.meta.impl.value.processor.AbstractValueProcessor;

import java.util.Optional;

public class ToolDirectionToValueProcessor extends AbstractValueProcessor<Direction, Value<Direction>> {

    public ToolDirectionToValueProcessor() {
        super(Keys.TOOL_DIRECTION_TO);
    }

    @Override
    public boolean supports(ValueHolder container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(ValueHolder container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setTo(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(ValueHolder container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getTo());
        }
        return Optional.empty();
    }
}
