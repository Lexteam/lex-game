/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueOwner;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class DirectionToValueProcessor implements ValueProcessor<Direction, Value<Direction>> {

    @Override
    public Key<? extends Value<Direction>> getKey() {
        return Keys.DIRECTION_TO;
    }

    @Override
    public boolean supports(ValueOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(ValueOwner container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setTo(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(ValueOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getTo());
        }
        return Optional.empty();
    }
}
