package uk.jamierocks.lexteam.ygd.game.impl.data.processor;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.DataTransactionResult;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.game.GameLaunch;
import uk.jamierocks.lexteam.ygd.core.data.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

import java.util.Optional;

public class LoggerValueProcessor implements ValueProcessor<Logger, Value<Logger>> {

    @Override
    public Key<? extends Value<Logger>> getKey() {
        return Keys.LOGGER;
    }

    @Override
    public boolean supports(DataContainer container) {
        return container instanceof LexGame;
    }

    @Override
    public DataTransactionResult offer(Logger data) {
        return DataTransactionResult.DISALLOWED;
    }

    @Override
    public Optional<Logger> getValueFromContainer(DataContainer container) {
        if (container instanceof LexGame) {
            LexGame game = (LexGame) container;
            return Optional.of(game.getLogger());
        }
        return Optional.empty();
    }
}
