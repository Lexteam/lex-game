/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.AbstractValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class ToolDirectionToValueProcessor extends AbstractValueProcessor<Direction, Value<Direction>> {

    public ToolDirectionToValueProcessor() {
        super(Keys.TOOL_DIRECTION_TO);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(MetaOwner container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setTo(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(MetaOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getTo());
        }
        return Optional.empty();
    }
}
