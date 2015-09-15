package uk.jamierocks.lexteam.ygd.game.impl.data.processor;

import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.DataTransactionResult;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.core.data.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class DirectionFromValueProcessor implements ValueProcessor<Direction, Value<Direction>> {

    @Override
    public Key<? extends Value<Direction>> getKey() {
        return Keys.DIRECTION_FROM;
    }

    @Override
    public boolean supports(DataContainer container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public DataTransactionResult offer(Direction data) {
        return DataTransactionResult.DISALLOWED;
    }

    @Override
    public Optional<Direction> getValueFromContainer(DataContainer container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo connectionInfo = (AddConnectionInfo) container;
            return Optional.of(connectionInfo.getFrom());
        }
        return Optional.empty();
    }
}
