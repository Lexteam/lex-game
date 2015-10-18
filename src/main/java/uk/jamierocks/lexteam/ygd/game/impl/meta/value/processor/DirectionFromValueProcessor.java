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
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class DirectionFromValueProcessor implements ValueProcessor<Direction, Value<Direction>> {

    @Override
    public Key<? extends Value<Direction>> getKey() {
        return Keys.DIRECTION_FROM;
    }

    @Override
    public boolean supports(ValueOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean offer(ValueOwner container, Direction value) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            connectionInfo.setFrom(value);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Direction> getValueFromContainer(ValueOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getFrom());
        }
        return Optional.empty();
    }
}
