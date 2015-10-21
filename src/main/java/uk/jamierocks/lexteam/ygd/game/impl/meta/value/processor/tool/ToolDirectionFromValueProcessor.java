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
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;

import java.util.Optional;

public class ToolDirectionFromValueProcessor extends AbstractValueProcessor<Direction, Value<Direction>> {

    public ToolDirectionFromValueProcessor() {
        super(Keys.TOOL_DIRECTION_FROM);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(MetaOwner container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setFrom(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(MetaOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getFrom());
        }
        return Optional.empty();
    }
}
