package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.api.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueOwner;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueProcessor;
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
    public Optional<Direction> getValueFromContainer(ValueOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getTo());
        }
        return Optional.empty();
    }
}
