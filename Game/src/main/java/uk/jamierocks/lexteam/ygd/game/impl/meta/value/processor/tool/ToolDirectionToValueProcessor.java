/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import uk.jamierocks.meta.api.value.Value;
import uk.jamierocks.meta.api.value.ValueHolder;
import uk.jamierocks.meta.impl.value.processor.AbstractValueProcessor;

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
