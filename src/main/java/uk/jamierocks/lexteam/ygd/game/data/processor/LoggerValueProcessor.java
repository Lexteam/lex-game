package uk.jamierocks.lexteam.ygd.game.data.processor;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.game.GameLaunch;
import uk.jamierocks.lexteam.ygd.game.data.ValueProcessor;

import java.util.Optional;

public class LoggerValueProcessor implements ValueProcessor<Logger, Value<Logger>> {

    @Override
    public Key<? extends Value<Logger>> getKey() {
        return Keys.LOGGER;
    }

    @Override
    public boolean supports(DataContainer container) {
        return container instanceof GameLaunch;
    }

    @Override
    public Optional<Logger> getValueFromContainer(DataContainer container) {
        if (supports(container)) {
            GameLaunch game = (GameLaunch) container;
            return Optional.of(game.logger);
        }
        return Optional.empty();
    }
}
