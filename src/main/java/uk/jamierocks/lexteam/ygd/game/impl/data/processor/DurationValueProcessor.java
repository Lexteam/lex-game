package uk.jamierocks.lexteam.ygd.game.impl.data.processor;

import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.DataTransactionResult;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.core.data.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.ChangeDurationInfo;

import java.util.Optional;

public class DurationValueProcessor implements ValueProcessor<Integer, Value<Integer>> {

    @Override
    public Key<? extends Value<Integer>> getKey() {
        return Keys.DURATION;
    }

    @Override
    public boolean supports(DataContainer container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public DataTransactionResult offer(Integer data) {
        return DataTransactionResult.DISALLOWED;
    }

    @Override
    public Optional<Integer> getValueFromContainer(DataContainer container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo durationInfo = (ChangeDurationInfo) container;
            return Optional.of(durationInfo.getDuration());
        }
        return Optional.empty();
    }
}
